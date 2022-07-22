package chap11.random;

import java.util.Random;

public class RandomExampl2 {

	public static void main(String[] args) {
		// 10~20까지의 난수를 발생
		Random rand = new Random();
		int value = rand.nextInt(11) + 10;	// 10~20
		System.out.println(value);
	}

}
