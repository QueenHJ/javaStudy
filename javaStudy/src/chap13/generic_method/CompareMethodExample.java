package chap13.generic_method;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Utils.compare(p1, p2);	// true
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");	// 내용이 같을 때
		} else {
			System.out.println("논리적으로 다른 객체입니다.");
		}
		
		// (아이디, 이름)의 쌍
		Pair<String, String> p3 = new Pair<String, String>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<String, String>("user2", "홍길동");
		boolean result2 = Utils.compare(p3, p4);
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
	}

}
