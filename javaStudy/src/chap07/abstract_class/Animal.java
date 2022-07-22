package chap07.abstract_class;

public abstract class Animal {
	public String kind;	// 종류 : 포유류, 양서류, ...
	
	// 상속받은 여러 클래스에서 공통으로 사용할 수 있다. -> 재정의없이 사용 가능
	public void breathe() {	// 기본 동작을 정의 -> 상속받은 클래스에서 재정의없이 사용 가능
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();	// 소리를 낸다. -> 추상메소드
	// 소리를 내는 것이 추상클래스에서는 구체적으로 정의하기가 어려울 때 : 멍멍?, 야옹?, 꽥꽥?
	// 상속받은 클래스에서 구체화를 하면 되기 때문에
}
