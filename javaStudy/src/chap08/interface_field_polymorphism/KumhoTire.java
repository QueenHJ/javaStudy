package chap08.interface_field_polymorphism;

// 표준 규격 : Tire
public class KumhoTire implements Tire {

	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	}

}
