package chap12.exam.exercise15_1;

// Thread 상속해서 만든 것 -> Runnable을 구현해서 만들어라.

public class Exercise13_1 {

	public static void main(String[] args) {
		/* 방법 1
		Thread1 th1 = new Thread1();
		th1.start();
		*/
		// 방법 2
		Thread thread = new Thread(new Runnable1());
		thread.start();
	}

}

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print('-');
		}
	}
}

// Runnable 구현 객체
class Runnable1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print('-');
		}
	}
}