package etc;

public class RefClass {

	public RefClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RefClass rc = new RefClass();
		
		rc.getName();
	}
	
	void getName() {
		System.out.println("");
		String name = this.getClass().getEnclosingMethod().getName();
		System.out.println(name);
	}

}
