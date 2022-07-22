package chap13.generic_type_not_used;

public class MainExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("hello");	// 문자열을 담는다.
		String str = (String)box.get();	// 강제 타입 변환 -> 성능에 영향을 준다.
		box.set(10);		// 문자가 아닌 다른 것을 넣을 수 있다. -> 오류(실수)
		// 제네릭을 사용하지 않으면, 문자열 대신에 int를 사용하는 오류를 범할 수 있다. 
		box.set(new Bus());	// Bus 객체를 저장
		Bus bus = (Bus)box.get();
		box.set(new Apple());	// Bus 객체를 저장
		Apple apple = (Apple)box.get();
		Object object = box.get();
		if(object instanceof Apple) {	// ClassCastException을 방지하려면
			apple = (Apple)object;
		}
		// Box 클래스에 어떤 객체든지 넣을 수 있다.
		// get 메소드를 사용할 때는 Box에 어떤 객체가 들어 있는지 알아야 한다. -> ClassCastException이 발생할 수 있음
		// 그렇지만 일반적으로 보통 한가지 타입만 많이 사용 -> 그럴경우는 제네릭을 사용하는 것이 좋겠다.
	}

}
