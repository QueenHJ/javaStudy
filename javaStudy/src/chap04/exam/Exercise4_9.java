package chap04.exam;

/*
 * 
 */
public class Exercise4_9 {

	public static void main(String[] args) {
		String str = "12345";	// 문자열이 숫자라는 가정하에
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
//			char ch = str.charAt(i);	// 하나의 문자를 구한다.
//			int number = ch - '0';
//			sum += number;
			sum += str.charAt(i) - '0';
		}
		System.out.println("sum="+sum);

	}

}
