package �迭;

import java.util.Scanner;

public class Ex8_�迭�ǽ�8 {

	public static void main(String[] args) {
		// �Էµ��� �ҷ�����
		Scanner sc = new Scanner(System.in);

		// id�� pw�� ����� ������ ���������
		String[] id_array = new String[3];
		String[] pw_array = new String[3];

		int cnt = 0;

		while (true) {
			System.out.print("[1]ȸ������ [2]�α��� [3] ���� >> ");
			int num = sc.nextInt();

			// 1�� �Է� �޾��� ��
			if (num == 1) {
				// 3���� ȸ������ �� �� �ֵ��� ������ ����
				// ȸ���� ���� Ƚ���� cnt�� �� �� ����
				while (cnt < 3) {
					System.out.println("==ȸ������==");
					System.out.print("���̵� �Է�: ");
					id_array[cnt] = sc.next();
					System.out.print("��й�ȣ �Է�: ");
					pw_array[cnt] = sc.next();

					cnt++;

					break;
				}

				// 2�� �Է� �޾��� ��
			} else if (num == 2) {
				System.out.println("==�α���==");
				System.out.print("���̵� �Է� : ");
				String id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pw = sc.next();

				// id�� pw�迭 �����ϱ� -> ���� �Է��� ���̵�� ��й�ȣ�� �迭�� �ִ��� Ȯ���ϱ� ����
				for (int i = 0; i < id_array.length; i++) {
					for (int j = 0; j < pw_array.length; j++) {
						// .equals() -> ���ڰ� ������
						// == -> ���� ��
						if (id.equals(id_array[i]) && pw.equals(pw_array[j])) {
							if (i == j) {
								// �ε��� ���� ���ƾ� �α��� ����
								System.out.println("�α��� ����!!");
								break;
							}
						} else {
							System.out.println("�α��� ����...");
							break;
						}
						break;
					}
					break;

				}

			} else if (num == 3) {
				// 3�Է� �޾��� ��
				System.out.println("����");
				break;
			}

			/*
			 * while (true) {
			 * 
			 * System.out.print("[1]ȸ������ [2]�α��� [3] ���� >> "); int num = sc.nextInt();
			 * 
			 * String[] id_array = new String[3]; String[] pw_array = new String[3];
			 * String[] input_id = id_array; String[] input_pw = pw_array;
			 * 
			 * 
			 * if (num == 1) { for (int i = 0; i<3; i++) { System.out.print("���̵��Է� :");
			 * id_array[i] = sc.next(); System.out.print("��й�ȣ�Է� :"); pw_array[i] =
			 * sc.next(); System.out.println("���Լ���"); } input_id[i] = id_array[i];
			 * input_pw[i] = pw_array[i];
			 * 
			 * else if () {
			 * 
			 * 
			 * }
			 * 
			 * System.out.print("���̵� �Է�"); input_id[1] = sc.next();
			 * System.out.print("��й�ȣ�Է� :"); input_pw[1]= sc.next();
			 * 
			 * else if(!input_id[1].equals(id_array[1])||!input_pw[1].equals(pw_array[1])) {
			 * System.out.println("�α��� ����");}
			 * 
			 * System.out.println("�α��μ���"); }
			 * 
			 * } else if(num==3) {
			 * 
			 * }
			 */

		}

	}
}
