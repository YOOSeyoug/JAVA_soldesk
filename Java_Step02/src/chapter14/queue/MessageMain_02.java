package chapter14.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain_02 {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		Message lee = new Message("sendMail", "��ȣ��");
		messageQueue.offer(lee);
		messageQueue.offer(new Message("sendSNS", "������"));
		messageQueue.offer(new Message("sendKakaotalk", "�����"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); //poll() Queue�� ���(���Լ���)
			
			switch (message.command) {
			case "sendMail": {
				System.out.println(message.to+"�Կ��� ������ ���½��ϴ�.");
				break;
			}
			
			case "sendSNS": {
				System.out.println(message.to+"�Կ��� SNS�� ���½��ϴ�.");
				break;
			}
			
			case "sendKakaotalk": {
				System.out.println(message.to+"�Կ��� īī������ ���½��ϴ�.");
				break;
			}
			}//switch
		}//while
		
		
		

	}

}
