package chap13.generic_method;

public class Box<T> {	// 제네릭 표현
	// 필드
	private T t;
	
	// getter
	public T get() {
		return t;
	}
	
	// setter
	public void set(T t) {
		this.t = t;
	}
}
