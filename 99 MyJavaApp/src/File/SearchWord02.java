package File;

import java.io.*;
import java.util.*;

public class SearchWord02 {
	public static void manin(String args[]){
		SearchWord02 s = new SearchWord02();
		//s.countWord()
	}
	public int countWord(String word, File file) throws FileNotFoundException {
		int count = 0;
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String nextToken = scanner.next();
			if (nextToken.equalsIgnoreCase(word))
				count++;
		}
		return count;
	}
}
