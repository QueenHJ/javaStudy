package chap08.interface_definion;

public class InterfaceUsageExample2 {

	public static void main(String[] args) {
		// Television 작업
		MyClass mc = new MyClass(new Television());
		mc.method3();
		
		// Audio 작업
		mc = new MyClass(new Audio());
		mc.method3();
		
		// 필요하면 다른 구현객체를 생성해서 추가할 수 있다.
		// 다른 구현 객체에 대한 작업을 할 수 있다.
	}

}
