package chap07.field_polymorphism;

public class Car {
	//필드
    Tire frontLeftTire;		// 부모 클래스를 사용 -> 자식 클래스를 대입
    Tire frontRightTire;
    Tire backLeftTire;
    Tire backRightTire;
    
    //생성자
    public Car(Tire fl, Tire fr, Tire bl, Tire br) {
        this.frontLeftTire = fl;
        this.frontRightTire = fr;
        this.backLeftTire = bl;
        this.backRightTire = br;
    }
    
    //메소드
    // 바뀌를 roll하면서 수명이 다한 바퀴를 반환
    int run() {
        System.out.println("[자동차가 달립니다.]");
        if(frontLeftTire.roll()==false) { stop(); return 1; };
        if(frontRightTire.roll()==false) { stop(); return 2; };
        if(backLeftTire.roll()==false) { stop(); return 3; };
        if(backRightTire.roll()==false) { stop(); return 4; };
        return 0;	// 펑크난 타이어가 없음
    }
    
    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
