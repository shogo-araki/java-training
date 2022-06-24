public class Main {

  public static void main(String[] args) {
    Crow c = new Crow();
    Sparrow s = new Sparrow();

    System.out.println(c.getName());
    c.sing();

    System.out.println(s.getName());
    s.sing();
  }
}
