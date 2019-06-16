package File.SearchIPPattern;

import java.io.*;

public class SP01 {

	public SP01() {
		// TODO Auto-generated constructor stub
	}
	
	static int spc_count=-1;

	  static void Process(File aFile) {
	    spc_count++;
	    String spcs = "";
	    for (int i = 0; i < spc_count; i++)
	      spcs += " ";
	    if(aFile.isFile())
	      System.out.println(spcs + "[FILE] " + aFile.getName());
	    else if (aFile.isDirectory()) {
	      System.out.println(spcs + "[DIR] " + aFile.getName());
	      File[] listOfFiles = aFile.listFiles();
	      if(listOfFiles!=null) {
	        for (int i = 0; i < listOfFiles.length; i++)
	          Process(listOfFiles[i]);
	      } else {
	        System.out.println(spcs + " [ACCESS DENIED]");
	      }
	    }
	    spc_count--;
	  }

	  public static void main(String[] args) {
	    String nam = "C:/Temp";
	    File aFile = new File(nam);
	    Process(aFile);
	  }

}
