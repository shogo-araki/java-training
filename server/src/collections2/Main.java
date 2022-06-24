import java.util.*;

public class Main {

  //   public static void main(String[] args) {
  //     HashMap<String, Integer> map = new HashMap<String, Integer>();
  //     String nengo[] = { "明治", "大正", "昭和", "平成" };
  //     map.put(nengo[0], 1868);
  //     map.put(nengo[1], 1912);
  //     map.put(nengo[2], 1926);
  //     map.put(nengo[3], 1989);
  //     for (String s : nengo) {
  //       System.out.println(s + "元年は、西暦" + map.get(s) + "年");
  //     }
  //   }

  //   public static void main(String[] args) {
  //     HashSet<String> hs = new HashSet<String>();
  //     hs.add("山田太郎");
  //     hs.add("山田太郎");
  //     hs.add("太田美代子");
  //     hs.add("斉藤五郎");
  //     hs.add("斉藤五郎");
  //     for (String s : hs) {
  //       System.out.println(s);
  //     }
  //   }

  public static void main(String[] args) {
    String s1 = "ABCDEF";
    String s2 = "ABCDEF";
    String s3 = new String("ABCDEF");

    if (s1.equals(s2)) {
      System.out.println("s1とs2の文字列は等しい");
    } else {
      System.out.println("s1とs2の文字列は等しくない");
    }

    if (s1.equals(s3)) {
      System.out.println("s1とs3の文字列は等しい");
    } else {
      System.out.println("s1とs3の文字列は等しくない");
    }

    if (s1 == s2) {
      System.out.println("s1とs2のオブジェクトは等しい");
    } else {
      System.out.println("s1とs2のオブジェクトは等しくない");
    }

    if (s1 == s3) {
      System.out.println("s1とs3のオブジェクトは等しい");
    } else {
      System.out.println("s1とs3のオブジェクトは等しくない");
    }
  }
}
