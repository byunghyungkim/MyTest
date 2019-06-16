package File;

import java.io.*;
import java.util.*;

public class SearchWord08 {
	public static void main(String args[]) throws FileNotFoundException {
		try {
			File tableFile = new File("D:/temp/T_LIST.txt");
			File logFile = new File("D:/project/logs/eclipse_console.txt");
			Scanner scnrTable = new Scanner(tableFile, "utf-8");
			Scanner scnrLog = new Scanner(logFile, "utf-8");
			ArrayList<String> myArray = new ArrayList<>();
			
			
			while(scnrTable.hasNextLine()){
				String nextTokenTable = scnrTable.next();
//				System.out.println(nextTokenTable);
				while (scnrLog.hasNext()) {
					String nextTokenLog = scnrLog.next();
//					System.out.println(nextTokenLog);
					
//					if(nextTokenTable.equals(nextTokenLog)) 
//						System.out.println(nextTokenTable);
					if(nextTokenTable.equalsIgnoreCase(nextTokenLog)){
						System.out.println(nextTokenTable);
						if(!myArray.contains(nextTokenTable)) {
						    //myArray.remove(nextTokenTable);
						    myArray.add(nextTokenTable);
						}

						
					}	
				}
				scnrLog = new Scanner(logFile, "utf-8");
				
			}
			
//			while (scnrLog.hasNext()) {
//				String nextToken = scnrLog.next();
//				//System.out.println(nextToken);
//				if (nextToken.equalsIgnoreCase(nextToken))
//					System.out.println("AAAAAAAAAAAA");
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
