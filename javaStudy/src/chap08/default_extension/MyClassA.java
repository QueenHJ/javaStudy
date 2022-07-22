package chap08.default_extension;

public class MyClassA implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassA-method1() 실행됨");
	}

	// 새로운 기능을 추가를 해서 새로운 제품을 만들었는데
	// 기존 제품을 유지보수할 수가 없음 -> 에러가 발생
	// 새로운 추가된 추상메소드를 재정의하라고 한다.
	// 기존 제품은 소스 코드를 유지해야 된다. -> 수정 불가 -< 어떻게 해야하는가?
	
	// 새로운 기능을 MyInterface에 default 메소드로 추가하면 MyClassA가 수정하지 않아도 된다.
	// method2()는 존재
}
