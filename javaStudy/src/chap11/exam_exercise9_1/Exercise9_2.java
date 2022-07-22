package chap11.exam_exercise9_1;

public class Exercise9_2 {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D(1, 2, 3);
		System.out.println(p1);	// [1,2,3]
		System.out.println(p2);
		System.out.println("p1==p2?" + (p1 == p2));	// false
		// 논리적 동등 비교
		System.out.println("p1.equals(p2)?" + (p1.equals(p2)));	// true
	}

}

class Point3D {
	int x, y, z;

	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Point3D() {
		this(0, 0, 0);
	}

	public boolean equals(Object obj) {
		/*
		 * (1) 인스턴스변수 x, y, z를 비교하도록 오버라이딩하시오.
		 */
		if(obj instanceof Point3D) {
			Point3D td = (Point3D) obj;
			return x == td.x && y == td.y && z == td.z;
		}
		return false;
	}

	public String toString() {
		/*
		 * (2) 인스턴스변수 x, y, z의 내용을 출력하도록 오버라이딩하시오.[1,2,3]
		 */
		return "[" + x + "," + y + "," + z + "]";
	}
}
