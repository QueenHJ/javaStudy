package chap07.exam.exercise7_2;

public class Exercise7_2 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}
}

class SutdaDeck { // 화투통
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	// 생성자
	SutdaDeck() {
		/* (1) 배열 SutdaCard를 적절히 초기화 하시오. */
		// SutdaCard를 20장을 만들어서 SutdaDeck에 넣어야 한다.
		for (int i = 0; i < cards.length; i++) { // 20장 반복
			// i : 0~19 -> i를 이용해서 num을 만들어야 한다.
			// 0 ~ 9 : 1, 3, 8 -> 광
			// 10 ~ 19 : 1, 3, 8 -> 알맹이 (5끗, 10끗)
			int num = i % 10 + 1; // 1~10 (0->1, 10->1)
			boolean isKwang = (i < 10 && (num == 1 || num == 3 || num == 8)); // 1, 3, 8 : 광
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	// 메소드
	void shuffle() {
		// 카드를 골고루 섞는다. -> Math.random()을 사용
		for(int i = 0;i < CARD_NUM;i++) {	// card 0~19
			// 교환할 카드의 인덱스를 구한다.
			int index = generateIndex();
			// 임시로 card를 저장하기 위한 변수
			// 카드 교환
			SutdaCard tmp = cards[i];	// 복사
			cards[i] = cards[index];
			cards[index] = tmp;
		}
	}

	// 규칙을 정한다.
	// 방법 1. index : 0~19
	// 방법 2. 범위안에의 값은 값을 반환. 범위를 벗어나면 null
	SutdaCard pick(int index) {
		// 배열 cards에서 index 위치의 SutdaCard를 반환
		// index가 잘못 입력될 경우를 고려해야 하는가? 0~19
		if(index >= 0 && index < CARD_NUM) {	// 허용된 카드 위치
			return cards[index];
		} else {
			return null;
		}
	}

	SutdaCard pick() {
		// 임의의 위치의 SutdaCard를 반환 : Math.Random()을 사용
		int index = generateIndex();
		return pick(index);	// 재사용
	}
	
	// 0~19안의 임의의 인덱스를 반환하는 메소드 : 공통으로 사용되는 메소드
	int generateIndex() {
		return (int)(Math.random() * CARD_NUM);
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	// default 생성자 : 1K
	SutdaCard() {
		this(1, true);
	}

	// 생성자
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// 모든 클래스는 Object 클래스를 상속
	// Object에는 toString() 메소드가 존재
	// info() 대신 Object 클래스의 toString() 오버라이딩했다
	// System.out.println(dog); dog.toString()을 출력한다.
	public String toString() { // 클래스의 정보 출력하는 메소드
		return num + (isKwang ? "K" : "");
	}
}