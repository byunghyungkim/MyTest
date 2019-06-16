package ExecOrder;

public class Order_01 {
	static {
        System.out.println("This is first static block");
    }
	public Order_01() {
		System.out.println("This is Constructor.");
	}

	public static void main(String[] args) {
			
		System.out.println("This is main.");
		Order_01 ord = new Order_01();
	}

}
