package chap08.exam.exercise2;

public class AirConExample {

	public static void main(String[] args) {
		AirCon room = new AirCon();
        room.turnOn();
        room.setTemperature(-10);
        room.setTemperature(35);
        room.setTemperature(24);
        room.turnOff();
	}

}
