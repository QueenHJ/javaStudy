package chap13.generic_type_not_used;

public class Box {
	private Object object;	// 어떤 객체던지 담을 수 있다.
	// setter
	public void set(Object object) {
		this.object = object;
	}
	// getter
	public Object get() {
		return object;
	}
}
