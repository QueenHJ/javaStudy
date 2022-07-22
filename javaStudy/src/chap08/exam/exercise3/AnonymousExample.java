package chap08.exam.exercise3;

public class AnonymousExample {

	public static void main(String[] args) {
		// 생성자를 이용해서 익명구현 객체를 대입
		Apartment apartment = new Apartment(new RemoteControl() { // TV
			// 작성 위치 (2)
			// 필드
			int volume;

			// 익명 구현 객체(Audio)
			// 작성 위치 (1)
			@Override
			public void turnOn() {
				System.out.println("TV 전원을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV 전원을 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else if (volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("TV 볼륨 : " + this.volume);
			}

			@Override
			public int getVolume() {
				return volume;
			}
		});
		apartment.rc.turnOn();
		apartment.rc.setVolume(15);
		apartment.rc.getVolume();
		apartment.rc.setMute(false);
		apartment.rc.turnOff();

		apartment.method1();
		apartment.method2(new RemoteControl() { // 전축
			// 작성 위치 (3)
			// 필드
			int volume;

			// 익명 구현 객체(Audio)
			// 작성 위치 (1)
			@Override
			public void turnOn() {
				System.out.println("전축의 전원을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("전축의 전원을 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else if (volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("전축 볼륨 : " + this.volume);
			}

			@Override
			public int getVolume() {
				return volume;
			}
		});
	}

	/*
	 * 실행 결과 TV를 켭니다. TV 볼륨 : 15 TV를 무음 해제합니다. TV를 끕니다. Audio 전원을 켭니다. Audio 볼륨 : 20
	 * Audio 전원을 끕니다. 전축을 켭니다. 전축 볼륨 : 30 무음 처리합니다. 전축을 끕니다.
	 */

}
