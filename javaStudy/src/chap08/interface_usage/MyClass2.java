package chap08.interface_usage;

// MyClass와 Television, Audio가 의존성이 심하다.
// Television -> Audio로 변경할 떄 MyClass를 수정을 해야 한다. 
public class MyClass2 {
	// 필드
	Audio tv;	// Television -> Audio로 수정
	
	// 생성자
	public MyClass2() { }
	
	// 매소드
	public void method() {
		// TV를 사용
		tv = new Audio();	// Television -> Audio로 수정
		tv.turnOn();
		tv.listen();		// watch -> listen
		tv.turnOff();
	}
}
