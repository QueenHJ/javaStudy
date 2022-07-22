package chap13.generic_method;

public class Utils {
	// 두개의 Pair 객체를 비교하는 제네릭 메소드를 추가
	// 제네릭 메소드 타입 <K, V>
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
