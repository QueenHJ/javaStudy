package chap14.rhamda;

public class MainExample {

	public static void main(String[] args) {
		// Runnable 인터페이스로 구현 객체를 생성
		// 람다식 -> 익명 구현 객체를 만드는 것과 같다.
		Runnable runnable = new Runnable() {
			// Runnable 인터페이스의 추상 메소드를 재정의
			// 전제 조건 : 추상 메소드가 한 개만 존재해야 한다.
			@Override
			public void run() {
				// 실행 부분
				int sum = 0;
				for(int i = 1;i <= 10;i++) {
					sum += i;
				}
				System.out.println("합 : " + sum);
			}
		};
		runnable.run();	// 익명구현 객체를 실행
		
		// 람다식을 이용해서 작성
		// 함수 y = f(x) 
		// 형식 : 매개변수 () -> { 실행 부분 }
		Runnable runnable2 = () -> {	// 실행부
			// 실행 부분
			int sum = 0;
			for(int i = 1;i <= 10;i++) {
				sum += i;
			}
			System.out.println("합 : " + sum);
		};
		runnable2.run();
	}

}
