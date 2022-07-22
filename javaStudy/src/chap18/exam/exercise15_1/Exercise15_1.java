package chap18.exam.exercise15_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise15_1 {

	public static void main(String[] args) {
		// 사용법 : java FileHead 10 FileHead.java
		// hint : BufferedReader의 readLine()을 사용
		if(args.length != 2) {
			System.out.println("USAGE: java FileHead 10 FILENAME");
			System.exit(-1);
		}
		File file = new File(args[1]);
		if(!file.exists() || file.isDirectory()) {
			System.out.println(args[1] + "은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
			System.exit(-2);
		}
		
		int count = 0;
		try {
			count = Integer.parseInt(args[0]);
		} catch(NumberFormatException e) {
			System.out.println("올바른 라인 수를 입력하세요.");
			System.exit(-3);
		}

		// try-with-resources를 사용
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			for(int i = 0;i < count;i++) {
				String data = br.readLine();
				System.out.println(i+1 + ":" + data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
