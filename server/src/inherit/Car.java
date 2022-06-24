public class Car {
  private int fuel = 0;
  private int migration = 0;

  public Car() {
    System.out.println("Generate Car Object");
  }

  public void move() {
    if (fuel >= 0) {
      migration++;
      fuel--;
    }
    System.out.println("migration:" + migration);
    System.out.println("fuel:" + fuel);
  }

  public void supply(int fuel) {
    if (fuel > 0) {
      this.fuel += fuel;
    }
    System.out.println("fuel:" + fuel);
  }
}
