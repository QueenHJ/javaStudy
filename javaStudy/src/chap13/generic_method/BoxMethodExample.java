package chap13.generic_method;

/* 제네릭 메소드를 정의하고, 사용하는 방법
 * 
 */

public class BoxMethodExample {

	public static void main(String[] args) {
		// 두가지 방법으로 제네릭 메소드를 사용
		// 방법 1. : 매개변수에서 주어진 값으로 유추할 수 있다.
		Box<Integer> box1 = Util.boxing(100);	// 100을 담은 Box를 생성해 준다.
		int value = box1.get();
		System.out.println("value = " + value);
		
		box1 = Util.boxing("홍길동");	// 에러 발생 -> Integer 타입을 사용해야 하는데, 문자열을 사용해서
		
		// 방법 2 : 명시적으로 표현하는 방법
		Box<Integer> box2 = Util.<Integer>boxing(200);	// 명시적으로 기술
		int value2 = box2.get();
		System.out.println("value2 = " + value2);
	}

}
