package File;

import java.io.*;
 
 public class SearchWord06 {
  private static void readFile(String fileName) {
    try {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(fileName), "utf-8"));
	
     // File file = new File(fileName);
      File fileLog = new File("D:/project/logs/eclipse_console.log");
     // FileReader reader = new FileReader(file);
      BufferedReader in = new BufferedReader(reader);
      FileReader readerLog = new FileReader(fileLog);
      BufferedReader inLog = new BufferedReader(readerLog);
      String string;
      String stringLog;
      while ((string = in.readLine()) != null) {
        System.out.println(string);
//        while ((stringLog = inLog.readLine()) != null) {
//        	System.out.println(stringLog);
//        }
      }
      in.close();
      inLog.close();
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