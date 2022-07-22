package chap04.exam;

/*
 * int num , 타입의 변수 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를
완성하라 만일 변수 의 값이 라면 . num 12345 , ‘1+2+3+4+5’ 15 의 결과인 를 출력하라. (1)
에 알맞은 코드를 넣으시오.

 */
public class Exercise4_10 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		// 10으로 나누었을 때 나머지를 구한다.
		// 나머지 5
		// 12345 / 10 = 1234
		// 나머지를 구하면 4를 구한다.
		do {
			sum += num % 10;
			num /= 10;
		} while(num != 0);
		System.out.println("sum="+sum);

	}

}
