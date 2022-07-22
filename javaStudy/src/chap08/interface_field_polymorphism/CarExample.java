package chap08.interface_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		// 필요에 따라서 타이어를 교체 -> 교체가 타이어가 동작 -> 다형성
		// 다형성 전제조건
		// 1. 자동타입변환 : 인터페이스 = 구현객체를 대입
		// 2. 재정의 : 인터페이스의 메소드를 구현 객체에서 재정의
		// 인터페이스에 어떤 구현 객체를 대입했는가에 따라 그 구현 객체의 특성이 동작(나타난다)
		car.frontLeftTire = new KumhoTire();
		car.run();
		
		// 넥슨 타이어를 구현해서 대입을 하면 동작 : 확장성이 뛰어나다.
		// Car 클래스는 변경되는 것이 없다.
	}

}
