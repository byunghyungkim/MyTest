package ValidateNumber;

import java.util.regex.*;

public class Split {
	public Split() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s01="1234-5";
		String s02="4849";
		String s03="8889s-A";
		
		System.out.println(s01.split("[-]")[0]);
		System.out.println(s02.split("[-]")[0]);
		
		System.out.println(isStringDouble(s03.split("[-]")[0]));
		System.out.println(isStringDouble(s02.split("[-]")[0]));
		
		System.out.println(Pattern.matches("^[0-9]{5}", s03.split("[-]")[0]));
	}
	
	public static boolean isStringDouble(String s) {
    try {
        Double.parseDouble(s);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
  }
}
