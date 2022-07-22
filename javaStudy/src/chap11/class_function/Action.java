package chap11.class_function;

public interface Action {
	// 브라우저로부터 오는 url 요청에 대하여 처리를 하는 Handler 인터페이스를 정의
	// 구현 객체가 url에 대하여 처리를 한다.
	public void execute();	// 표준화된 규격(반환형, 메소드이름, 매개변수)
}
