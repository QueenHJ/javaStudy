package chap04.exam;

public class Exercise4_12 {

	public static void main(String[] args) {
		/*
		for(int i = 1;i <= 3;i++) {
			for(int j = 2;j < 5;j++) {
				System.out.print(j + "*" + i + "=" + j * i + '\t');
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1;i <= 3;i++) {
			for(int j = 5;j < 8;j++) {
				System.out.print(j + "*" + i + "=" + j * i + '\t');
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1;i <= 3;i++) {
			for(int j = 8;j < 10;j++) {
				System.out.print(j + "*" + i + "=" + j * i + '\t');
			}
			System.out.println();
		}
		*/
		/*
		// 이호준씨가 푼 방법
		for(int i=2;i<=9;i+=3) {
			for(int j=1;j<=3;j++) {
				int y=i;
				for(int x=1;x<=3;x++) {
					if(y>=10) continue;
					System.out.print(y+"*"+j+"="+y*j+"\t");
					y++;
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
		/* 생각 중
		*/
		for(int i = 1; i < 10;i++) {	// 단
			for(int j = 1;j <= 3;j++) {	// 단 * 1~3
				int x = 3*((i-1)/3)+j+1;
				if(x == 10) {
					break;
				}
				int y = (i % 3 == 0)? 3 : i % 3;
				System.out.print(x + "*" + y + "=" + x * y + "\t");
			}
			System.out.println();
			if(i % 3 == 0) {
				System.out.println();
			}
		}
	}
}