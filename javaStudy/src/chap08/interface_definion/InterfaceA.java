package chap08.interface_definion;

/*
 * interface : 객체와 객체 사이에 표준화된 인터페이스(메소드)를 제공
 * 구성멤버 : 상수, 추상메소드, default 메소드, 정적 메소드
 * 	- 클래스와 비교해서 없는 것 : 필드, 생성자
 *  - 객체화 할 수 없음
 *  - 구현 객체가 구현하여 메소드를 구체화한다.
 *  - 접근 제한자 : public (접근 제한이 없고, 생략 가능)
 *  - 인터페이스 이름은 클래스 이름과 같은 형식을 따른다. 파일이름을 생성하는 것도 같다.
 * 인퍼페이스는 상속할 수 있고, 여러 개를 상속할 수 있다. (클래스는 하나만 상속할 수 있지만)
 * 구현 객체는 여러 개의 인터페이스를 구현할 수 있다.
 * 객체-인터페이스-구현객체의 관계를 사용
 * 인터페이스를 통해서 구현객체와 의존성을 줄일 수 있다.
 * 다형성을 제공 : 인터페이스에 어떤 구현 객체를 대입하느냐에 따라서 객체는 대입된 구현 객체와 통신
 * 객체는 구현 객체가 어떤 것인지 모르고, 인터페이스 규격만 맞추면 된다.
 * 확장성을 제공해 준다. (구현 객체 A -> 구현 객체 B로 변경 가능)
 */
public interface InterfaceA {
	// 상수
	
	// 추상 메소드
	void method1();	// 정의만 되어 있고, 실행부가 없는 메소드
		// -> 구현 객체에서 구체화 (재정의 : 필수적 -> 재정의하지 않으면 추상클래스가 된다.)
	
	// default 메소드
	default void method2() {	// 실행부가 존재 -> 기본적인 동작을 정의
		// 구현 객체가 재정의없이 사용 가능
		// 인터페이스의 확장성을 제공(Java 8부터 추가된 기능)
	}
	
	// 정적(static) 메소드
	static void method3() {		// 실행부가 존재 -> 인터페이스 이름으로 접근 -> 공통으로 사용
		// 구현 객체 없이 사용 가능 -> 공통 기능 제공
	}
}
