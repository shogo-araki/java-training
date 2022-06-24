public class Main {

  public static void main(String[] args) {
    Car c = new Car();
    c.supply(10);
    c.move();
    c.move();

    System.out.println("@@@@@@@@@@@@@");

    Ambulance a = new Ambulance();
    a.supply(10);
    a.move();
    a.savePeople();
  }
}
