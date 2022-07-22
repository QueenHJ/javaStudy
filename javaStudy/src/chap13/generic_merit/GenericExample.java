package chap13.generic_merit;

import java.util.ArrayList;
import java.util.List;

/*
 * 제네릭 : 컬렉션, NIO, 람다식에서 많이 사용
 * 컬렉션 : 어떤 객체(Object)든지 저장할 수 있음. String, int, Car, Member
 * 어떤 객체든지 담을 수 있다. -> 그런 기능도 제공을 한다.
 * 그렇지만 보통은 특정 객체를 다르는 것이 일반적이다. String을 저장한다든지, int를 저장한다든지 보통 하나로 한정된다.
 * 그것을 제넥 타입으로 한정을 하면 다른 객체를 대입하거나 사용하는 오류를 범하지 않을 수 있다. -> 컴파일러가 체크
 * 특정 타입으로 한정을 했으므로 강제 타입변환을 하지 않아도 된다. 
 */
public class GenericExample {

	public static void main(String[] args) {
		// 제네릭을 사용하지 않는 경우
		// List는 컬렉션의 일종이고 인터페이스, 어떤 객체든지 저장할 수 있다.
		List list = new ArrayList();
		list.add("홍길동");	// ArrayList에 문자열을 저장 : add
		list.add(10);		// int를 저장할 수 있음
		// 얻는 방법
		String str = (String)list.get(0);	// get 메소드를 사용해서 꺼낼 수 있다. -> Object를 반환
		// 인덱스 0에 있는 것이 String이라는 것을 알아야 한다.
//		str = (String)list.get(1);	// ClassCastException 발생 -> 어떤 형태로 넣었는지를 알아야 한다.
		System.out.println(str);
		
		// 일반적으로는 한 가지 유형만 저장하는 것이 일반적이다.
		// 제네릭을 사용하는 방법 -> 문자열을 다루겠다로 한정
		// 제네릭을 사용하면 장점 -> 컴파일러가 체크, 강제타입변환을 할 필요가 없음
		List<String> list2 = new ArrayList<String>();
		list2.add("홍길동");
//		list2.add(10);		// 에러 발생 : String을 다루기로 했는데 10(int)를 저장하려고 하면
			// 컴파일러가 에러가 발생시킴 -> 방지
		String str2 = list2.get(0);	// 강제 타입 변환이 필요하지 않다. -> get메소드는 문자열을 반환
		System.out.println(str2);
	}

}
