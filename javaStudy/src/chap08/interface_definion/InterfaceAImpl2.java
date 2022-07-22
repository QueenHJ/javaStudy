package chap08.interface_definion;

// 구현객체에서 추상메소드를 구현하지 않으면 추상메소드가 된다.
// 추상메소드를 가지고 있으면 추상 클래스가 된다.

public abstract class InterfaceAImpl2 implements InterfaceA {

	@Override
	public abstract void method1();	// 재정의하지 않을 수 있다.

}
