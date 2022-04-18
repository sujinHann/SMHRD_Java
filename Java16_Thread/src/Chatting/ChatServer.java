package Chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

//���� ������� ���Ӱ� ä���� ���ÿ� �����ϵ��� �ؾ���
public class ChatServer extends Thread {
	// ������ Ŭ���̾�Ʈ�� ���� ����
	ArrayList<Socket> clientList = new ArrayList<Socket>();
	Socket socket = null; // ���� ���������� �Ҵ���� �ʵ�

	public ChatServer(Socket socket) { // ���� ���� ������
		this.socket = socket; // ������ �������� �Ҵ�
		clientList.add(socket);
	}

	public void run() {

		try {
			// 1. ������ Ŭ���̾�Ʈ�� ip �ּ� ����ϱ�
			// getInetAddress() : ������ Ŭ���̾�Ʈ �������� �� ip �ּ� ��� �޼ҵ�
			System.out.println(socket.getInetAddress() + "IP Ŭ���̾�Ʈ ����!");

			// 2. Ŭ���̾�Ʈ���� ������ �� ����Ǿ��ٴ� �޼��� ������
			// OutputStream : �ܺη� �޼��� ������ ���� ���
			OutputStream out = socket.getOutputStream();
			// PrintWriter: ��±�� ����
			PrintWriter writer = new PrintWriter(out, true);
			writer.println("ä�� ���α׷��� ����Ǿ����ϴ�! ����� �г����� �ۼ��� �ּ���!");

			// 3. Ŭ���̾�Ʈ�� ���� �޼��� �б�
			// InputStream : �ܺηκ��� �޼����� �ޱ� ���� ���
			InputStream in = socket.getInputStream();
			// InputStreamReader : �Է½�Ʈ������ ���� �����͸� ������ ���ڵ� �������
			// BufferedReader : InputStreamReader�� ���� �������� ���� �� ��ŭ �迭�� ���� ���־����
			// �̸� �ذ��ϱ� ���ؼ� �ӽ�������� ���
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));

			String message; // client�� ���� �޼��� ����
			String nick = null; // client�� �г��� ����
			boolean conn = false; // client�� ó�� ����ÿ��ÿ��� false->true, �� ���� ��û�ÿ��� ��� true

			while ((message = reader.readLine()) != null) { // Ŭ���̾�Ʈ�� �޼����� �Է��� ������ ����
				if (!conn) { // ��ó�� �������� ���� ������ �κ�
					nick = message;
					conn = true;
					writer.println(nick + "���� �����ϼ̽��ϴ�!"); // ����-> Ŭ���̾�Ʈ
				} else {
					// 5. �� Ŭ���̾�Ʈ�� �Է��� �޼����� �ٸ� Ŭ���̾�Ʈ���׵� �˷��ֱ�!
					for (int i = 0; i < clientList.size(); i++) {
						out = clientList.get(i).getOutputStream();
						new PrintWriter(out, true);
						writer.println(nick + ":" + message);
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			int socketPort = 1234; // ���� ���� ��Ʈ ����
			ServerSocket serverSocket = new ServerSocket(socketPort);
			// ���� ����Ȯ��
			System.out.println(socketPort + "���� ���� ����!");
			
			//������ ����� ������ Ŭ���̾�Ʈ�� ������ �޾��ְ� ä�ñ���� ����(������ ����)
			while(true) {
				Socket socketUser = serverSocket.accept();
				ChatServer server = new ChatServer(socketUser);
				server.start(); // Thread Ŭ������ ���ǵǾ��ִ� �޼ҵ�
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

