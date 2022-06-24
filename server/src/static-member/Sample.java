public class Sample {
  private int value = 0;
  private static int num = 0;

  public Sample(int value) {
    this.value = value;
    num++;
  }

  // this(¬)で引数付きのSample()↑が呼び出され100が設定される
  public Sample() {
    this(100);
  }

  public static int getNumberOfInstance() {
    return num;
  }

  public int getValue() {
    return this.value;
  }
}
