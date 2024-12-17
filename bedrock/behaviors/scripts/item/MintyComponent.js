export class MintyComponent {
  static typeId = "morefood:minty";

  constructor() {
    // this.onConsume = this.onConsume.bind(this);
  }

  onConsume(e) {
    console.warn(e);
  }
}
