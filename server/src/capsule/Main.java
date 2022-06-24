public class Main {

  public static void main(String[] args) {
    Sample s = new Sample("Hello world");

    s.setNumber(100);
    System.out.println(s.getNumber());
    System.out.println(s.getStr());
  }
}
