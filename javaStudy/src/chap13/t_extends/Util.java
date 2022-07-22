package chap13.t_extends;

public class Util {
	// 제네릭 메소드로 두 개의 숫자를 비교하는 compare
	// Number : 부모 클래스
	// Byte, Short, Integer, Long : 자식 클래스 -> Number 클래스를 상속받아 만듦
	// 매개변수에는 Number 클래스만 상속받은 객체를 사용하도록 제한 -> T extends Number
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}
