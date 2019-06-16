package File;

import java.io.*;
import java.util.*;
 
public class SearchWord04 {
 
  private static void readFile(String fileName) {
    try {
      File file = new File(fileName);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNext()) {
        System.out.println(scanner.next());
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
 
  public static void main(String[] args) {
//    if (args.length != 1) {
//      System.err.println("usage: java TextScanner1"
//        + "file location");
//      System.exit(0);
//    }
//    readFile(args[0]);
    readFile("D:/temp/T_LIST.txt");
  }
}