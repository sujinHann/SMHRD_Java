package MusicPlayer;

import java.util.ArrayList;
import java.util.Scanner;
import javazoom.jl.player.MP3Player;

public class Main {
	
	//view

	public static void main(String[] args) {
		// �����÷��̾� �����

		// �Է¹޴� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);

		// Scanner, Random -> �ٸ� Ŭ�������� ��� �����ͼ� ���
		// MP3Player ����ϱ� ���� import
		MP3Player mp3 = new MP3Player();
		// Controller �ȿ� ����� ����ϱ� ���� Ŭ���� ��������
		Controller con = new Controller();
		// Music Ŭ�����ȿ� �ִ� �����鿡�� �����͸� ���������
//		System.out.println(music1.getTitle());
//		System.out.println(music1.getSinger());
//		System.out.println(music1.getPlayTime());		

		// �뷡 5���� ���� �����ϱ�
		Music music1 = new Music("��", "Rain", 59, "C:\\Users\\smhrd\\Desktop\\music\\��.mp3");
		Music music2 = new Music("Maria", "ȭ��", 59, "C:\\Users\\smhrd\\Desktop\\music\\Maria.mp3");
		Music music3 = new Music("MAGO", "����ģ��", 59, "C:\\Users\\smhrd\\Desktop\\music\\MAGO.mp3");
		Music music4 = new Music("How you like that", "����ũ", 59,
				"C:\\Users\\smhrd\\Desktop\\music\\How you like that.mp3");
		Music music5 = new Music("��¦������", "�����̰�", 59, "C:\\Users\\smhrd\\Desktop\\music\\��¦������.mp3");

		// �뷡�� ���� ������ �����ϱ� ���ؼ� ArrayList
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(music1);
		list.add(music2);
		list.add(music3);
		list.add(music4);
		list.add(music5);

		// "��" music.getTitle();
		// System.out.println(list.get(0).getTitle());

		int index = 0;

		while (true) {
			// [1]��� [2]���� [3]������ [4]������ [5]���� >>
			System.out.print("[1]��� [2]���� [3]������ [4]������ [5]���� >> ");
			// ����ڿ��� �Է¹��� ���� ����
			int menu = sc.nextInt();

			if (menu == 1) {
				// ���
				// mp3.play(String path);
				// getPath
				System.out.print(list.get(index).getTitle() + "\t");
				System.out.print(list.get(index).getSinger() + "\t");
				System.out.println(list.get(index).getPlayTime());

				// �뷡�� �����Ű�� ���
				// mp3.play(list.get(index).getPath());
				// Controller ����� �ҷ���
				con.play(list, index);

			} else if (menu == 2) {
				// ����
				// �뷡�� ���ߴ� ���
				// �뷡�� ������϶��� ���ߴ� ��� ��밡��
//				if (mp3.isPlaying() == true) {
//					mp3.stop();
//				}
				con.stop();

			} else if (menu == 3) {
				// ������
				// 1. �ε���
				// 2. �̹� �뷡�� ������̶�� �뷡�� ����
				// 3. �ε��� ���� 0���� ������ index ����(list.size()-1)���ư���.

				index--;

				con.stop();

//				if (mp3.isPlaying()) {
//					mp3.stop();
//				}
				// ����2. list ũ�⸦ �Ѿ�� ó���뷡�� �ٽ� ���ƿͼ� ���
				if (index <= 0) {
					index = list.size() - 1;
				}

				System.out.print(list.get(index).getTitle() + "\t");
				System.out.print(list.get(index).getSinger() + "\t");
				System.out.println(list.get(index).getPlayTime());

				con.play(list, index);
				// mp3.play(list.get(index).getPath());

			} else if (menu == 4) {
				// ������
				// �ε��� +1
				// ������ �ε��� ���ȿ� ����ִ� �뷡�� �����Ű��
				// �뷡 �̹� ������̶�� �뷡�� ���߰�
				// �� ���� �뷡 ���

				index++;

				con.stop();

//				if (mp3.isPlaying() == true) {
//					mp3.stop();
//				}
				// ����2. list ũ�⸦ �Ѿ�� ó���뷡�� �ٽ� ���ƿͼ� ���
				if (index > list.size() - 1) {
					index = 0;
				}

				System.out.print(list.get(index).getTitle() + "\t");
				System.out.print(list.get(index).getSinger() + "\t");
				System.out.println(list.get(index).getPlayTime());

				con.play(list, index);
				// mp3.play(list.get(index).getPath());

			} else if (menu == 5) {
				// ���α׷��� ����
				con.stop();
				System.out.println("����");
				break;
			} else {
				System.out.print("�߸� �Է� �ϼ̽��ϴ�.");
			}

			// 1,2,3,4�� �Է� �޾��� ���� �ݺ�
			// 5�� �Է� �޾��� ���� ����
			// while;

		}

	}

}
