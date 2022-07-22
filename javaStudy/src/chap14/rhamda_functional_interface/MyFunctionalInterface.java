package chap14.rhamda_functional_interface;

// 람다식을 대입받는 인터페이스 -> 람다식을 정의한다.
// 람다식 : 추상 메소드가 하나만 존재

@FunctionalInterface	// 함수적인터페이스에는 @FunctionalInterface 어노테이션 붙여준다.
public interface MyFunctionalInterface {
	// 추상 메소드를 하나만 정의 -> 형식을 정의한다.
	// - 반환형?
	// - 매개변수로 어떤 파라미터를 사용할 것인가? 
	public void method();
}
