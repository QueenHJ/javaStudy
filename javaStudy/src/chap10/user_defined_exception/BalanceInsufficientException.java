package chap10.user_defined_exception;

// 사용자 정의 예외 클래스
public class BalanceInsufficientException extends Exception {
	// default 생성자
	public BalanceInsufficientException() { }
	public BalanceInsufficientException(String message) {	// message : 에러의 원인
		super(message);	// 부모인 Exception 클래스에게 전달
	}
}
