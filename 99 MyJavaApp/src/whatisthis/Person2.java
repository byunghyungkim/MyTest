package whatisthis;

public class Person2 {
	String name;

	public Person2() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	class Displayer {
		String getPersonName() {
			return Person2.this.name;
		}

	}

}
