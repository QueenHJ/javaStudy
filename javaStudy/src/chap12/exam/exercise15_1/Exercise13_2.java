package chap12.exam.exercise15_1;

public class Exercise13_2 {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("수행되는 스레드(main) : " + thread.getName());
		
		Thread2 t1 = new Thread2();
//		t1.run();		// 동일한 스레드에서 실행됨
		t1.start();		// 새로운 스레드에서 실행됨
		// 스레드를 시작하려면 start() 메소드를 호출해야 함.
		// 자식의 run()메소드를 호출 -> run() 메소드가 실행되고, 그 이후에 밑으로 실행이 됨
		for (int i = 0; i < 10; i++)
			System.out.print(i);
	}

}

class Thread2 extends Thread {
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println("수행되는 스레드(run) : " + thread.getName());
		
		for (int i = 0; i < 10; i++)
			System.out.print(i);
	}
}
