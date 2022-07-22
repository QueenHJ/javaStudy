package chap07.inherit_introduction;

public class SuperSonicAirplaneExample {

	public static void main(String[] args) {
		SuperSonicAirPlane superPlane = new SuperSonicAirPlane();
		superPlane.takeOff();
		superPlane.fly();
		superPlane.flyMode = SuperSonicAirPlane.SUPERSONIC;
		superPlane.fly();	// 비행 모드에 따라서 다른 비행을 적용
		superPlane.flyMode = SuperSonicAirPlane.NORMAL;
		superPlane.fly();
		superPlane.land();
	}

}
