package generic;

public class ClassGenericType<T> {
	private T t;
	public ClassGenericType() {
		// TODO Auto-generated constructor stub
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "ClassGenericType [t=" + t + "]";
	}
	
}
