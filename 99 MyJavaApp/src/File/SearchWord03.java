package File;

import java.io.*;
import java.util.*;

public class SearchWord03 {
	public static void main(String args[]) throws FileNotFoundException {
		try {
			File tableFile = new File("D:/temp/T_LIST.txt");
			File logFile = new File("D:/project/logs/eclipse_console.log");
			Scanner scnrTable = new Scanner(tableFile, "utf-8");
			Scanner scnrLog = new Scanner(logFile, "utf-8");
//			System.out.println("qqqq");
			while (scnrLog.hasNext()) {
				//System.out.println("qq");
				String nextToken = scnrLog.next();
				//System.out.println(nextToken);
				if (nextToken.equalsIgnoreCase(nextToken))
					System.out.println("AAAAAAAAAAAA");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
