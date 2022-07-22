package chap15.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> msgQ = new LinkedList<Message>();
		msgQ.offer(new Message("sendMail", "홍길동"));
		msgQ.offer(new Message("sendSMS", "신용권"));
		msgQ.offer(new Message("sendKakaotalk", "홍두께"));
		
		while(!msgQ.isEmpty()) {
			Message message = msgQ.poll();	// 하나씩 꺼내서
			// 꺼내지 않고 내용만 확인 : peek()
			switch(message.command) {	// 메시지 처리
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk": 
					System.out.println(message.to + "님에게 카카오톡를 보냅니다.");
					break;
			}
		}
	}

}
