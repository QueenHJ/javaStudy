package chap13.generic_type_used;

// 제네릭 타입으로 선언한 Box 클래스
public class Box<T> {	// 객체 하나를 저장 (Object -> T)
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
