package chap08.exam.exercise2;

public class AirCon implements RemoteControl {
	// 필드
	int temperature;
	
	@Override
	public void turnOn() {
		System.out.println("에어컨의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("에어컨의 전원을 끕니다.");
	}

	@Override
	public void setTemperature(int temperature) {
		if(temperature < RemoteControl.MIN_TEMPERATURE) {
			this.temperature = RemoteControl.MIN_TEMPERATURE;
		} else if(temperature > RemoteControl.MAX_TEMPERATURE) {
			this.temperature = RemoteControl.MAX_TEMPERATURE;
		} else {
			this.temperature = temperature;
		}
		System.out.println("에어컨의 온도를 " + this.temperature + "도로 설정합니다.");
	}

}
