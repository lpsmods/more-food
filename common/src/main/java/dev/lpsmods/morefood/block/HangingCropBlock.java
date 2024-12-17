package dev.lpsmods.morefood.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class HangingCropBlock extends BushBlock implements BonemealableBlock {
    public static final MapCodec<HangingCropBlock> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
        return instance.group(
                Codec.NON_EMPTY_STRING.fieldOf("crop").forGetter((block) -> {return block.cropItem;}),
                BuiltInRegistries.BLOCK.byNameCodec().fieldOf("sapling").forGetter((block) -> {return block.saplingBlock;}),
                createSettingsCodec()
        ).apply(instance, HangingCropBlock::new);
    });
    public static final int MAX_AGE = 7;
    public static final IntProperty AGE = Properties.AGE_7;
    private static final VoxelShape SMALL_SHAPE = Block.createCuboidShape(3.0,8.0,3.0,13.0,16.0,13.0);
    private static final VoxelShape LARGE_SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
    private final Block saplingBlock;
    private final String cropItem;

    public HangingCropBlock(String cropItem, Block saplingBlock, BlockBehaviour.Properties settings) {
        super(settings);
        CropBlock
        this.saplingBlock = saplingBlock;
        this.cropItem = cropItem;
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(AGE, 0));
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int i = (Integer)state.get(AGE);
        boolean bl = i == MAX_AGE;
        if (!bl && player.getStackInHand(hand).isOf(Items.BONE_MEAL)) {
            return ActionResult.PASS;
        } else if (i > 1) {
            dropStack(world, pos, new ItemStack(this.getCropItem(), 1));
            world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            BlockState blockState = (BlockState)state.with(AGE, 1);
            world.setBlockState(pos, blockState, 2);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
            return ActionResult.success(world.isClient);
        } else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int i;
        if (world.getBaseLightLevel(pos, 0) >= 9 && (i = this.getAge(state)) < this.getMaxAge()) {
            world.setBlockState(pos, this.withAge(i + 1), Block.NOTIFY_LISTENERS);
        }
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof RavagerEntity && world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) {
            world.breakBlock(pos, true, entity);
        }
        super.onEntityCollision(state, world, pos, entity);
    }

    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return CODEC;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        return (world.getBaseLightLevel(pos, 0) >= 8 || world.isSkyVisible(pos)) && this.canPlantBelow(world.getBlockState(blockPos), world, blockPos);
    }

    protected boolean canPlantBelow(BlockState ceiling, BlockView world, BlockPos pos) {
        return ceiling.isIn(BlockTags.LEAVES);
    }

    protected Item getCropItem() {
        Item item = Registries.ITEM.get(Identifier.tryParse(this.cropItem));
        if (item == null) {return Items.APPLE;}
        return item;
    }
    protected ItemConvertible getSaplingItem() {
        return this.saplingBlock.asItem();
    }
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    public int getMaxAge() {
        return MAX_AGE;
    }

    public int getAge(BlockState state) {
        return state.get(this.getAgeProperty());
    }

    public BlockState withAge(int age) {
        return (BlockState)this.getDefaultState().with(this.getAgeProperty(), age);
    }

    public final boolean isMature(BlockState blockState) {
        return this.getAge(blockState) >= this.getMaxAge();
    }
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(AGE) == 0) {
            return SMALL_SHAPE;
        }
        if (state.get(AGE) < MAX_AGE) {
            return LARGE_SHAPE;
        }
        return super.getOutlineShape(state, world, pos, context);
    }

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        return new ItemStack(this.getSaplingItem());
    }

    protected int getGrowthAmount(World world) {
        return MathHelper.nextInt(world.random, 2, 5);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return !this.isMature(state);
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    public void applyGrowth(World world, BlockPos pos, BlockState state) {
        int j;
        int i = this.getAge(state) + this.getGrowthAmount(world);
        if (i > (j = this.getMaxAge())) {
            i = j;
        }
        world.setBlockState(pos, this.withAge(i), Block.NOTIFY_LISTENERS);
    }
    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        this.applyGrowth(world, pos, state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
