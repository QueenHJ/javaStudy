package chap04.exam;

public class Exercise4_11 {

	public static void main(String[] args) {
		// Fibonnaci 1, 1 . 수열의 시작의 첫 두 숫자를 로 한다
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1+","+num2);
		for (int i = 0 ; i < 8 ; i++ ) {	// 3번째 수부터 출력해서 10번째 수를 출력
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print("," + num3);
		}
		System.out.println();
	}

}
