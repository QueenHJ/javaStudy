package chap13.generic_type_inherit;

public interface Storage<T> {	// 제네릭 타입 인터페이스
	public void add(T t, int index);	// index 위치에 객체 t를 저장
	public T get(int index);			// index 위치에 저장된 객체 t를 가져온다.
}
