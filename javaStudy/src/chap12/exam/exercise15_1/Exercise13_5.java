package chap12.exam.exercise15_1;

public class Exercise13_5 {

	public static void main(String[] args) throws Exception {
		Thread3 th1 = new Thread3();
		th1.start();
		try {
			Thread.sleep(5 * 1000);
		} catch (Exception e) {
		}
		throw new Exception(" ~!!!");	// 예외 발생 -> JVM이 예외 처리를 하도록
		// 예상 결과 : Thread3은 계속 출력을 한다. -> main() 스레드와 별개로 Thread3이 동작
		// 병렬 처리(여러 스레드가 동작)될 때는 모든 스레드가 종료되어야 프로그램이 종료된다.
	}

}

class Thread3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	} // run()
}
