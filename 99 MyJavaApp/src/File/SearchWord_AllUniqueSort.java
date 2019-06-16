package File;

import java.io.*;
import java.util.*;

public class SearchWord_AllUniqueSort {
	public static void main(String args[]) throws FileNotFoundException {
		try {
//			File tableFile = new File("D:/project/logs/T_LIST_0424.txt");
			File tableFile = new File("D:/project/temp/temp.txt");
			Scanner scnrTable = new Scanner(tableFile, "utf-8");
			SortedSet ts = new TreeSet();
			
			while(scnrTable.hasNextLine()){
				String nextTokenTable = scnrTable.next();
				System.out.println(nextTokenTable);
				ts.add(nextTokenTable);
			}
			
			System.out.println(ts);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
