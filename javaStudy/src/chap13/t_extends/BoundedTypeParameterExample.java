package chap13.t_extends;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		// 제네릭 메소드의 매개변수로 사용 가능한 것은 Number 클래스를 상속한 것으로 제한을 걸었음.
		// 불가능 : Util.compare("a", "b");	// 에러 발생 -> T extends Number
		int result1 = Util.compare(10, 20);	// int
		System.out.println(result1);	// 10-20 -> -1
		int result2 = Util.compare(20.0, 20.0);	// double -> Number 클래스를 상속
		System.out.println(result2);	// 20.0 - 20.0 = 0
	}

}
