package chap08.interface_inherit;

// 인터페이스 상속 : 여러 개를 상속받을 수 있다.
// extends 키워드를 사용
// 상속받는 인터페이스를 나열

// 이클립스가 오동작(꼬여있을 때가 있음)
// 메뉴 : Project->clean을 사용해서
// 새로 빌드를 해주면 꼬이는 것이 해결될 때가 있음

public interface RomoteSearchable extends RemoteControl, Searchable {
	// 구현해야될 추상메소드 : RemoteControl과 Searchable 인터페이스의 추상메소드를 가지고 있음
}
