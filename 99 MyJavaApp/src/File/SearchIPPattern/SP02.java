package File.SearchIPPattern;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class SP02 {
	private static final String IPADDRESS_PATTERN = "";
	private static final Pattern ptn = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
	final static Charset ENCODING = StandardCharsets.UTF_8;

	public SP02() {
		// TODO Auto-generated constructor stub
	}

	static int spc_count = -1;

	static void Process(File aFile) throws FileNotFoundException {
		spc_count++;
		String spcs = "";

		for (int i = 0; i < spc_count; i++)
			spcs += " ";

		Scanner scnr;
		if (aFile.isFile()) {
			System.out.println(spcs + "[FILE] " + aFile.getName());
			scnr = new Scanner(aFile, "utf-8");

		} else if (aFile.isDirectory()) {
			System.out.println(spcs + "[DIR] " + aFile.getName());
			File[] listOfFiles = aFile.listFiles();
			if (listOfFiles != null) {
				for (int i = 0; i < listOfFiles.length; i++)
					Process(listOfFiles[i]);
			} else {
				System.out.println(spcs + " [ACCESS DENIED]");
			}
		}
		spc_count--;
	}

	public void findBadLines(String aFileName) {
		// Pattern and Matcher are used here, not String.matches(regexp),
		// since String.matches(regexp) would repeatedly compile the same
		// regular expression
		Pattern regexp = Pattern.compile("^\\\\N\\t(\\d)+\\t(\\w)+");
		Matcher matcher = regexp.matcher("");

		Path path = Paths.get(aFileName);
		try (BufferedReader reader = Files.newBufferedReader(path, ENCODING); LineNumberReader lineReader = new LineNumberReader(reader);) {
			String line = null;
			while ((line = lineReader.readLine()) != null) {
				matcher.reset(line); // reset the input
				if (!matcher.find()) {
					String msg = "Line " + lineReader.getLineNumber() + " is bad: " + line;
					throw new IllegalStateException(msg);
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		String nam = "C:/Temp";
		File aFile = new File(nam);
		Process(aFile);
	}

}
