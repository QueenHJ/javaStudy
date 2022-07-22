package chap08.default_extension;

public interface MyInterface {
	void method1();	// 추상 메소드
	// 기능 추가
//	void method2();	// 추상 메소드로 만들지 말고 default 메소드로 추가
	default void method2() {	// 기본 기능이 있어야 하므로 기능 추가
		System.out.println("MyInterface:method2()");
	}
}
