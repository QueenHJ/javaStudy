package chap13.generic_method;

/* HashMap 사용 시 (키, 값)의 쌍으로 데이타 저장
 * 키 : 객체
 * 값 : 객체
 */
public class Pair<K, V> {	// 제네릭타입이 2개
	// 필드
	private K key;		// 객체 
	private V value;	// 객체
	
	// 생성자
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	// getter
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	// setter
	public void setKey(K key) {
		this.key = key;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
}
