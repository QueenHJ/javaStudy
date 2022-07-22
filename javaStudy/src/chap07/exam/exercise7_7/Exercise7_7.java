package chap07.exam.exercise7_7;

public class Exercise7_7 {	// 호출되는 생성자의 순서와 실행 결과를 적으시오.
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX());	// 실행 결과 : 부모의 메소드가 호출(200)
		// 부모의 x가 반환됨
		
		/* 생성자 순서
		 * 1. Child()
		 * 2. Child(int x)
		 * 3. Parent()
		 * 4. Parent(int x)
		 */
	}
}

class Parent {
	int x = 100;

	Parent() {		// (3)
		this(200);
	}

	Parent(int x) {	// (4)
		this.x = x;	// x=200
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {	// (1) super()를 호출하지 않고 this() -> this가 우선순위가 높다.
		this(1000);
	}

	Child(int x) {	// (2) : 부모 생성자를 호출 x=1000
		super();	// 생략 가능 -> 부모를 먼저 생성(초기화)
		this.x = x;	// x=1000
	}
}