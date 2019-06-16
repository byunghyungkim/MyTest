package File;

import java.io.*;

public class CountFile {
	private static final String ENCD = "utf-8";
	static int count=0;
	public static void main(String args[]) throws FileNotFoundException {
		try {
//			getFile("C:/Temp");
			getFile("D:/samsung_06");
			// File tableFile = new File("D:/project/logs/T_LIST_0424.txt");
			//// File logFile = new File("D:/project/logs/eclipse_console_00.log"); // admin 이외의 메뉴
			//
			//// 아래부터는 admin 메뉴
			//// File logFile = new File("D:/project/logs/admin menu/admin01_게시판관리.log");
			//// File logFile = new File("D:/project/logs/admin menu/admin02_기타관리자기능.log");
			//// File logFile = new File("D:/project/logs/admin menu/admin03_기준관리.log");
			//// File logFile = new File("D:/project/logs/admin menu/admin04_결재관리.log");
			//// File logFile = new File("D:/project/logs/admin menu/admin05_조직관리.log");
			//// File logFile = new File("D:/project/logs/admin menu/admin06_메뉴관리.log");
			// File logFile = new File("D:/project/logs/admin menu/admin07_모듈별담당자관리.log");
			// Scanner scnrTable = new Scanner(tableFile, ENCD);
			// Scanner scnrLog = new Scanner(logFile, ENCD);
			// ArrayList<String> myArray = new ArrayList<>();
			// SortedSet ts = new TreeSet();
			//
			// while(scnrTable.hasNextLine()){
			// String nextTokenTable = scnrTable.next();
			//// System.out.println(nextTokenTable);
			// while (scnrLog.hasNext()) {
			// String nextTokenLog = scnrLog.next();
			//// System.out.println(nextTokenLog);
			//
			//// if(nextTokenTable.equals(nextTokenLog))
			//// System.out.println(nextTokenTable);
			// if(nextTokenTable.equalsIgnoreCase(nextTokenLog)){
			//// System.out.println(nextTokenTable);
			//// if(!myArray.contains(nextTokenTable)) {
			// //myArray.remove(nextTokenTable);
			// //myArray.add(nextTokenTable);
			//// }
			//
			// ts.add(nextTokenTable);
			// break;
			//
			// }
			// }
			// scnrLog = new Scanner(logFile, ENCD);
			//
			// }
			//
			// System.out.println(ts);
			//
			//// while (scnrLog.hasNext()) {
			//// String nextToken = scnrLog.next();
			//// //System.out.println(nextToken);
			//// if (nextToken.equalsIgnoreCase(nextToken))
			//// System.out.println("AAAAAAAAAAAA");
			//// }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void getFile(String dirPath) {
		File f = new File(dirPath);
		File[] files = f.listFiles();
//		int count = 0;
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				File file = files[i];
				String fileName = file.getName().toUpperCase();
				System.out.println(i + "   " + fileName);
				
				if (file.isDirectory()) {
					getFile(file.getAbsolutePath());
				}
				if (fileName.endsWith(".JAVA"))
					count++;
			}
		}
		System.out.println("Count : "+count);
	}
}
