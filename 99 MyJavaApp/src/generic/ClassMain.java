package generic;

public class ClassMain {
	public ClassMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassGenericType<String> g = new ClassGenericType<String>();
		System.out.println("g :" + g);
		
		if(null != g){
			System.out.println("g is not null.");
		}
		
		ClassC01 c01 = new ClassC01();
		c01.metheodM01("300", g);
		
		System.out.println("g :" + g.toString());
		System.out.println("g.t :" + g.getT());
	}
}
