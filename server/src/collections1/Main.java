import java.util.*;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> sl = new ArrayList<String>();
    sl.add("ONE");
    sl.add("TWO");
    sl.add("THREE");

    for (String s : sl) {
      System.out.println(s + " ");
    }
    System.out.println();

    ArrayList<Integer> il = new ArrayList<Integer>();
    il.add(1);
    il.add(2);
    il.add(3);
    for (Integer i : il) {
      System.out.println(i + " ");
    }
    System.out.println();
  }
}
