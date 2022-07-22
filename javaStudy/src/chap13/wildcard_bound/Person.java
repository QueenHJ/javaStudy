package chap13.wildcard_bound;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	// 객체 정보를 출력하기 위해 toString 메소드를 재정의
	public String toString() {
		return name;
	}
}
