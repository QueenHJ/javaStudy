package chap13.generic_type_used;

public class MainExample {

	public static void main(String[] args) {
		// 문자열을 저장하는 Box를 정의
		Box<String> box = new Box<String>();	// 객체 생성
		box.set("홍길동");
		String str = box.get();
		System.out.println(str);
		
		// Bus 객체를 저장
		Box<Bus> box2 = new Box<Bus>();
		box2.set(new Bus());
		Bus bus = box2.get();
		
		Box box3 = new Box();
		box3.set("홍길동");
		String str3 = (String)box3.get();
		box3.set(new Apple());
		Apple apple = (Apple)box3.get();
	}

}
