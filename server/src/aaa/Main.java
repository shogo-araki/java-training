import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

  public static void main(String[] args) {
    try {
      FileWriter file = new FileWriter("java.txt");
      PrintWriter pw = new PrintWriter(new BufferedWriter(file));

      for (int i = 5001; i <= 80420; i++) {
        String mail = "k_dhs+dev4-20221003-" + i + "@forbis.jp";
        String pass = "Dpro2022";
        pw.println(mail + "," + pass);
      }
      pw.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
