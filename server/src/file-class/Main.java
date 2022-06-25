import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

  public static void main(String[] args) {
    // try {
    //   File file = new File("/usr/src/file-class/test/filesample.txt");
    //   System.out.println(file.exists());
    //   System.out.println(file.createNewFile());
    // } catch (IOException e) {
    //   System.out.println("処理に失敗しました。");
    // }


    // File fi = new File("/usr/src/file-class/test");
    // File[] fiList = fi.listFiles();
    // System.out.println(
    //   "指定したディレクトリは、" + fi.getAbsolutePath() + "です。"
    // );
    // for (int i = 0; i < fiList.length; i++) {
    //   if (fiList[i].isFile() == true) {
    //     System.out.println("ファイル名は、" + fiList[i].getName() + "です。");
    //   } else if (fiList[i].isDirectory() == true) {
    //     System.out.println(
    //       "ディレクトリ名は、" + fiList[i].getName() + "です。"
    //     );
    //   }
    // }


    // try {
    //   FileWriter fw = new FileWriter("/usr/src/file-class/test/file-1.txt");
    //   for (int i = 1; i <= 5; i++) {
    //     fw.write(i + "行目¥n");
    //   }
    //   fw.close();
    // } catch (IOException e) {
    //   System.out.println("書き込みに失敗しました。");
    // }


    // FileReader fr = null;
    // try {
    //   fr = new FileReader("/usr/src/file-class/test/file-1.txt");
    //   int c;
    //   while ((c = fr.read()) != -1) {
    //     System.out.print((char) c);
    //   }
    // } catch (FileNotFoundException e1) {
    //   System.out.println("ファイルが見つかりません。");
    // } catch (IOException e2) {
    //   System.out.println("ファイルエラーです。");
    // } finally {
    //   try {
    //     if (fr != null) fr.close();
    //   } catch (IOException e) {
    //     System.out.println("ファイルクローズい失敗しました。");
    //   }
    // }

    
    FileWriter fw = null;
    FileReader fr = null;

  }
}
