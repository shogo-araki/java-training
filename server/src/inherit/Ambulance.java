public class Ambulance extends Car {
  private int number = 119;

  public Ambulance() {
    System.out.println("Generete Ambulance object");
  }

  public void savePeople() {
    System.out.println("save people");
    System.out.println(number);
  }
}
