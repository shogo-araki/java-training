public class Main {

  public static void main(String[] args) {
    Sample s1, s2;
    System.out.println(Sample.getNumberOfInstance());

    s1 = new Sample(50);
    s2 = new Sample();

    System.out.println(s1.getValue());
    System.out.println(s2.getValue());

    System.out.println(Sample.getNumberOfInstance());
  }
}
