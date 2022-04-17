package PlayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicList {

	public static void main(String[] args) {
		// ù ȭ��
		// �Է� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);

		// ���� ����Ʈ�� ��� ArrayList ���� �غ��� -> musicList
		ArrayList<String> musiclist = new ArrayList<String>();
		// [1]�뷡��ȸ [2]�뷡�߰� [3]�뷡���� [4]���� >>

		while (true) {
			System.out.print("[1]�뷡��ȸ [2]�뷡�߰� [3]�뷡���� [4]���� >> ");
			// 1, 2, 3, 4 �ٸ� �������� �Ǵ� -> ���ǹ�
			// 4 -> "���α׷��� ����Ǿ����ϴ�" ��� + ���α׷� ����
			// �ٸ����� -> "�߸� �Է� �ϼ̽��ϴ�." ���

			// ���ڼ���
			int select = sc.nextInt();

			if (select == 1) {
				// �뷡 ��ȸ
				// get ����ؼ� ���ݱ��� ����Ǿ� �ִ� �����͸� �ҷ��;���
				// ���� 1. �� ����Ʈ�� �����Ͱ� ���ٸ� "���� �������� �����ϴ�."
				// �����Ͱ� ����. size() == 0
				if (musiclist.size() == 0) {
					System.out.println("�������� �����ϴ�");
				} else {
					for (int i = 0; i < musiclist.size(); i++) {
						// i+1�� ����Ʈ ��������ϱ�
						System.out.println((i + 1) + "." + musiclist.get(i));
					}
				}
			} else if (select == 2) {
				// �뷡 �߰� ���
				// ������ ���� �����ְ�
//				System.out.println("=====����������=====");
//				musiclist.add("Maria");
//				musiclist.add("HowYouLikeThat");
//				musiclist.add("��");
				if (musiclist.size() == 0) {
					System.out.println("�������� �����ϴ�");
				} else {
					for (int i = 0; i < musiclist.size(); i++) {
						System.out.println((i + 1) + "." + musiclist.get(i));
					}
				}
//				System.out.println("================");

				// [1] ������ �κп� �뷡 �߰� [2] ���ϴ� ��ġ�� �뷡 �߰�
				// 1, 2 ->���ǹ�
				// 1-> add(�����Ͱ�)
				// 2-> add(�ε�����, �����Ͱ�)

				System.out.print("[1]������ ��ġ�� �߰� [2]���ϴ� ��ġ�� �߰�>> ");
				int num = sc.nextInt();
				System.out.print("�߰��� �뷡 �Է� >> ");
				String music = sc.next();

				if (num == 1) {
					musiclist.add(music);
				} else if (num == 2) {
					System.out.print("�߰��� ��ġ �Է� >> ");
					int ch = sc.nextInt();
					musiclist.add(ch - 1, music);
					// ����ڰ� ���ϴ� ��ġ�� �ε��� ���� ��ġ ch-1
					System.out.println("�߰��� �Ϸ� �Ǿ����ϴ�.");
				}

			} else if (select == 3) {

				System.out.println("=====����������=====");

				if (musiclist.size() == 0) {
					System.out.println("�������� �����ϴ�");
					System.out.println("================");
				} else {
					for (int i = 0; i < musiclist.size(); i++) {
						System.out.println((i + 1) + "." + musiclist.get(i));
					}

				}
				System.out.println("================");

				System.out.print("[1]���û��� [2]��ü���� >> ");

				int ch1 = sc.nextInt();

				if (ch1 == 1) {
					System.out.print("������ �뷡 ����>> ");
					int ch2 = sc.nextInt();
					musiclist.remove(ch2 - 1);
					System.out.println("�뷡�� ���� �Ǿ����ϴ�");
				} else if (ch1 == 2) {
					musiclist.clear();
					System.out.println("��ü ����Ʈ�� ���� �Ǿ����ϴ�.");
				}

			} else if (select == 4) {
				// ���α׷��� ����
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}

		}

	}

}
