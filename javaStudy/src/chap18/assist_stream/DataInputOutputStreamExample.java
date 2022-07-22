package chap18.assist_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamExample {
	public static void main(String[] args) {
		// Data로 출력 -> 파일 졍태로 저장
		try (FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeUTF("홍길동");
			dos.writeDouble(95.5);
			dos.writeInt(1);

			dos.writeUTF("감자바");
			dos.writeDouble(90.3);
			dos.writeInt(2);

			dos.flush();
		} catch (IOException e) {
			System.out.println("예외 발생 : " + e.getMessage());
			return;
		}
		
		// 읽기
		try (FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat");
				DataInputStream dis = new DataInputStream(fis)) {
			for (int i = 0; i < 2; i++) {
				// 쓸때 사용했던 순서대로 읽어야 한다.
//				String name = dis.readUTF();
//				double score = dis.readDouble();
//				int order = dis.readInt();
				
				// 순서를 다르게 할 경우 어떻게 될 것인가? 예외가 발생됨
				int order = dis.readInt();	// 문자열로 쓴 것을 int형으로 읽을 경우 예외가 발생
				String name = dis.readUTF();
				double score = dis.readDouble();
				
				System.out.println(name + " : " + score + " : " + order);
			}
		} catch (IOException e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}
}
