package File.SearchIPPattern;

import java.io.*;
import java.util.*;

public class SP {

	public SP() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)throws IOException {

        try{

            //C:\Users\MD\Desktop\Test1

            System.out.println("Enter Your FilePath:");

            Scanner sc = new Scanner(System.in);

            Map<Character,Integer> hm = new TreeMap<Character, Integer>();

            String s1 = sc.nextLine();

            File file = new File(s1);

            File[] filearr = file.listFiles();

            for (File file2 : filearr) {
                System.out.println(file2.getName());
                FileReader fr = new FileReader(file2);
                BufferedReader br = new BufferedReader(fr);
                String s2 = br.readLine();
                for (int i = 0; i < s2.length(); i++) {
                    if(!hm.containsKey(s2.charAt(i))){
                        hm.put(s2.charAt(i), 1);
                    }//if
                    else{
                        hm.put(s2.charAt(i), hm.get(s2.charAt(i))+1);
                    }//else

                }//for2

                System.out.println("The Char Count: "+hm);
            }//for1

        }//try
        catch(Exception e){
            System.out.println("Please Give Correct File Path:");
        }//catch
    }
}
