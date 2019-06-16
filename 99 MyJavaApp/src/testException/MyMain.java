package testException;

public class MyMain {

	public MyMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println();
		try {
			MyMain mm = new MyMain();
			System.out.println("0");
			mm.m01();
			System.out.println("4");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("5");
			e.printStackTrace();
		}
		System.out.println("6");
	}
	
	void m01 () throws Exception {
		try {
			System.out.println("1");
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("2");
			e.printStackTrace();
			System.out.println("3---");
			throw e;
		}
	}
	
}
