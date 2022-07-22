package chap11.exam_exercise9_1;

public class Exercise9_8 {
	/*
	(1) round . 메서드를 작성하시오
	*/
	static double round(double d, int n) {
		// 주어진 값을 반올림하여, 소수점 이하 n자리의 값을 반환한다.
		// 예를 들어 n의 값이 3이면, 소수점 4째 자리에서 반올림하여 소수점 이하 3자리의
		// 수를 반환한다.
		// Math.round()와 Math.pow() 사용
	}
	
	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}

}
