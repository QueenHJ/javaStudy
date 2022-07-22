package chap06.exam.exercise6_24;

public class Exercise6_24 {
	/* abs() 메소드 정의 */
	static int abs(int value) {
		if(value < 0)
			return -value;
		else
			return value;
	}

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대값 :"+abs(value)); 	// 5
		value = -10;
		System.out.println(value+"의 절대값 :"+abs(value));		// 10
	}

}
