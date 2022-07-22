package chap08.default_extension;

public interface MyNewInterface extends MyInterface {
	// MyInterface : 추상메소드 method1, default method2
	// MyNewInterface를 만들었을 때 기존에 있는 default method인 method2를 다시 변경
	// 3가지 방법을 지원 -> default 메소드를 사용하면 이유 중의 하나
	// 방법 1 : 그대로 사용
	// 방법 2 : 재정의
	// 방법 3 : 추상 메소드로 변경
	void method2();
}
