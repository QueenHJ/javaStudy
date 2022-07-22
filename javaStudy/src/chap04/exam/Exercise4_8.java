package chap04.exam;

/*
 * 방정식 의 모든 해를 구하시오 단 와 는 정수이고 각각의 범위는 2x+4y=10 . , x y
0<=x<=10, 0<=y<=10 
 */
public class Exercise4_8 {

	public static void main(String[] args) {
		// 중첩 반복문을 사용 X : Y
		for(int x = 0; x <= 10;x++) {		// x : 0~10
			for(int y = 0;y <= 10;y++) {	// y : 0~10
				if(2 * x + 4 * y == 10) {	// 주어진 조건을 만족
					System.out.println("x=" + x + ", y=" + y);
				}
			}
		}
	}

}
