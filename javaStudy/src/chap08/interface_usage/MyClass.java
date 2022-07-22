package chap08.interface_usage;

public class MyClass {
	// 필드
	Television tv;	// Television -> Audio로 수정
	
	// 생성자
	public MyClass() { }
	
	// 매소드
	public void method() {
		// TV를 사용
		tv = new Television();	// Television -> Audio로 수정
		tv.turnOn();
		tv.watch();
		tv.turnOff();
	}
}
