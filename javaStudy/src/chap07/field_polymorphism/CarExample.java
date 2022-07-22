package chap07.field_polymorphism;

/*
 * 새로 NexenTire 객체를 추가
 * CarExample 클래스를 수정
 * NexenTire가 추가되어 동작을 한다.
 * 다른 클래스(Car)는 변경되지 않음.
 * 다형성의 효과 : 유지보수가 편리하다.
 */
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(new NexenTire("앞왼쪽", 6), new HankookTire("앞오른쪽", 2), new KumhoTire("뒤왼쪽", 3),
				new KumhoTire("뒤오른쪽", 4));
		
		for (int i = 1; i <= 5; i++) {	// 5회 바뀌를 굴림
			int problemLocation = car.run();	// 차를 운행하고 고장난 바뀌 위치를 반환 받음
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 NexenTire로 교체");
				car.frontLeftTire = new NexenTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("----------------------------------------");
		}
	}

}
