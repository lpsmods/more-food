package dev.lpsmods.morefood.item;

import net.minecraft.world.item.Item;

public class SunflowerSeedsItem extends Item {
    public SunflowerSeedsItem(Properties settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }

        world.playSound((PlayerEntity)null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
// TODO
//        if (!world.isClient) {
//            SunflowerSeedsEntity projectile = new SunflowerSeedsEntity(world, user);
//            projectile.setItem(stack);
//            projectile.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);
//            world.spawnEntity(projectile);
//        }
        return stack;
    }
}
