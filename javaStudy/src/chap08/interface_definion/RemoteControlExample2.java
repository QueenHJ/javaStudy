package chap08.interface_definion;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();	// 표준화된 인터페이스만 호출하면
		rc.setMute(false);
		rc.turnOff();	// 인터페이스에 어떤 구현객체를 대입했느냐에 따라 그 구현객체의 재정의된 메소드가 동작
		
		// 새로운 구현 객체를 대입하면 그 구현 객체가 동작하게 된다.
	}

}
