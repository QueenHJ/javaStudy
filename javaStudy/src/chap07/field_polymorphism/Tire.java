package chap07.field_polymorphism;

public class Tire {
	//필드
    public int maxRotation;	     	// 최대 회전수(타이어 수명)
    public int accumulatedRotation; // 누적 회전수
    public String location;	     	// 타이어의 위치

    //생성자
    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    // 매소드
    // 누적회전수, 수명 체크, 결과 반환 -> 수명이 다하면 바퀴를 교체
    public boolean roll() {	// 바뀌가 돌아가는 메소드
        ++accumulatedRotation;		
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " Tire 펑크 ***");
            return false;
        }
    }
}
