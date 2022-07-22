package chap13.wildcard_bound;

// 교육과정
public class Course<T> {
	private String name;	// 교육과정 이름
	private T[] students;	// 수강생
	
	public Course(String name, int capacity) {	// capacity: 정원
		this.name = name;
		// 제네릭 타입을 객체로 만들 때 Object 객체를 사용한다. : 주의사항 (규칙)
		students = (T[]) (new Object[capacity]);	// Object[] -> T[] 형변환
	}
	
	// getter
	public String getName() { return name; }
	public T[] getStudents() { return students; }
	// 수강생을 추가하는 메소드
	public void add(T t) {
		for(int i=0; i<students.length; i++) {	// 전체 수강 정원 중에서
			if(students[i] == null) {	// 비어 있는 자리에 넣는다.
				students[i] = t;
				break;
			}
		}
	}

}
