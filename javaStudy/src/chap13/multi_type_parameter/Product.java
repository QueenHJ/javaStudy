package chap13.multi_type_parameter;

public class Product<T, M> {	// 두가지 객체 형태를 저장
	// 필드
	private T kind;		// 어떠한 형태의 객체든지 담겠다.
	private M model;	// 객체
	
	// getter
	public T getKind() {
		return kind;
	}
	
	public M getModel() {
		return model;
	}
	
	// setter
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
}
