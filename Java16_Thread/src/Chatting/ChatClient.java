package Chatting;

import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {

	    try {
	         //������ ������ �� �ִ� ���� ����
	         Socket socket = new Socket("59.0.129.77",1234);
	         System.out.println("ä�����α׷� ���� ���� ����!");
	         
	         //�������� ���� �޼��� �д� Thread
	         ListeningThread lt = new ListeningThread(socket);
	         //������ �޼��� ������ Thread
	         WritingThread wt = new WritingThread(socket);
	         
	         lt.start();
	         wt.start();
	         
	      }catch(Exception e) {
	         e.printStackTrace();
	      }

	   }

	}
