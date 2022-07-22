package chap13.generic_type_inherit;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;	// 저장소 : 배열
	
	// 생성자
	public StorageImpl(int capacity) {	// 저장소의 크기를 매개변수로 받는다.
		array = (T[]) (new Object[capacity]);	// 저장소 배열을 생성
	}
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}

}
