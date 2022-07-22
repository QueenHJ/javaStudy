package chap08.interface_definion;

// 구현 객체는 여러 개의 인터페이스를 구현할 수 있다.
// 필요한 만큼...

public class SmartTelevision implements RemoteControl, Searchable {
	// 필드
	int volume;
	
	// Searchable 추상 메소드를 재정의
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	// RemoteControl의 추상 메소드를 재정의
	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else {
			this.volume = volume; 
		}
		System.out.println("현재 스마트TV 볼륨 : " + volume);
	}
}