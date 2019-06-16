package File;

import java.io.*;
 
 public class SearchWord05 {
  private static void readFile(String fileName) {
    try {
      File file = new File(fileName);
      FileReader reader = new FileReader(file);
      BufferedReader in = new BufferedReader(reader);
      String string;
      while ((string = in.readLine()) != null) {
        System.out.println(string);
      }
      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
 
  public static void main(String[] args) {
//    if (args.length != 1) {
//      System.err.println("usage: java TextReader "
//        + "file location");
//      System.exit(0);
//    }
//    readFile(args[0]);
	  readFile("D:/temp/T_LIST.txt");
  }
}