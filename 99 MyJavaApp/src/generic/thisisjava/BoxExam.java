package generic.thisisjava;

public class BoxExam {
	public BoxExam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> stringBox =  new Box<String>();
		stringBox.setT("Hello");
		
		System.out.println(stringBox.getT());
		
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.setT(34);
		
		System.out.println(integerBox.getT());
	}
}
