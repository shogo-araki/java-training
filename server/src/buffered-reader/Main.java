import java.io.*;

public class Main {

  public static void main(String[] args) {
    // BufferedReader br = null;
    // BufferedWriter bw = null;
    // String FileName = "filesample2.txt";

    // try {
    //   bw = new BufferedWriter(new FileWriter(FileName));
    //   bw.write("もも\n");
    //   bw.write("うめ\n");
    //   bw.write("さくら\n");
    //   bw.flush();
    //   br = new BufferedReader(new FileReader(FileName));
    //   String s;
    //   while ((s = br.readLine()) != null) {
    //     System.out.println(s);
    //   }
    // } catch (FileNotFoundException e1) {
    //   System.out.println("ファイルエラーです。");
    // } catch (IOException e2) {
    //   System.out.println("IOエラーです。");
    // } finally {
    //   try {
    //     if (bw != null) bw.close();
    //     if (br != null) br.close();
    //   } catch (IOException e) {
    //     System.out.println("クローズ失敗");
    //   }
    // }

    BufferedReader br = null;
    try {
      br = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        String s;
        System.out.print("InputData（q : finish） ： ");
        s = br.readLine();
        if (s.equals("q")) {
          break;
        }
        System.out.println("Input Data:" + s);
        System.out.println();
      }
    } catch (IOException e) {
      System.out.println("IO error");
    } finally {
      try {
        if (br != null) br.close();
      } catch (IOException e1) {
        System.out.println("IO error");
      }
    }
  }
}
