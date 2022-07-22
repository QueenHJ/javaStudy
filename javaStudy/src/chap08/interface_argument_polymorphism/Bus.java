package chap08.interface_argument_polymorphism;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	// 버스 요금 체크 : 
	public void checkFare() {
		System.out.println("버스요금을 받습니다.");
	}
}
