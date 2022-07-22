package chap08.default_extension;

public class NewProduct2 implements MyNewInterface {

	@Override
	public void method1() {
		System.out.println("NewProduct2: method1()");
	}

	// default -> 추상 메소드로 변경되어 구현해 주어야 한다.
	@Override
	public void method2() {
		System.out.println("NewProduct2: method2()");
	}

}
