package chap08.default_extension;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}

	// default 메소드를 재정의하거나 그대로 사용할 수 있음
//	@Override
//	public void method2() {
//		System.out.println("MyClassB-method2() 실행");
//	}

}
