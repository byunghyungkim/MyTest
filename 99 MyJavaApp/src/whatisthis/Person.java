package whatisthis;

public class Person {
	String name;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setName2(String name) {
		Person.this.name = name;
	}
	
	public String getName() {
		return Person.this.name;
	}
	
	public String getName2() {
		return this.name;
	}
	
	public static void main(String args[]){
		Person p = new Person();
		
		p.setName("only this");
		
		System.out.println(p.getName());
		
		p.setName2("class name this");
		
		System.out.println(p.getName());
	}
}
