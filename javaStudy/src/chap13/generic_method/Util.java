package chap13.generic_method;

// 공통 메소드를 가지고 있는 클래스
// static 메소드를 가지므로 어디서든지 클래스 이름으로 접근 

public class Util {
	// 객체를 박스로 싸는 메소드를 정의 -> 제네릭 메소드
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();	// Box 객체를 생성
		box.set(t);					// Box에 t를 담는다.
		return box;
	}
}
