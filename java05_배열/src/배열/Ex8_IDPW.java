package �迭;

import java.util.Scanner;

public class Ex8_IDPW {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu = 0;

		// 1.ȸ������/�α���/���� �޴� ��� �� ����ڰ� ����
		// 2.���� �����ϱ� ������ ��� �޴� ����, ���� ���� ���α׷� ����
		// 3. ȸ������ ���
		// 3-1. ����ڰ� ���̵�/��й�ȣ �Է� -> ���(����) 3����� ���� ����
		// ���� / �迭(�ڷ� ����, ���� 2���̻�)

		String[] id_arr = new String[3]; // ���̵� ���� �迭
		int[] pw_arr = new int[3]; // ��й�ȣ ���� �迭
		int cnt = 0; // ȸ�� ������ ����� ���� ī����

		while (true) {
			System.out.print("[1]ȸ������ [2]�α��� [3]���� >> ");
			menu = sc.nextInt(); // ����ڰ� �޴� ����
			
			while (cnt < 3) {				
			if (menu == 1) {
				// System.out.println("ȸ������");
				System.out.println("==ȸ������==");
				System.out.print("���̵�: ");
				String id = sc.next();
				System.out.print("��й�ȣ: ");
				int pw = sc.nextInt();

				id_arr[cnt] = id;
				pw_arr[cnt] = pw;

				cnt++; // �ι�° ȸ������ �ϴ� ����� �� �迭�� 1�� �ε����� ����
				
			} else if (menu == 2) {
				//System.out.println("�α���");
				System.out.println("==�α���==");				
				System.out.print("���̵�: ");
				String id = sc.next();
				System.out.print("��й�ȣ: ");
				int pw = sc.nextInt();
				//�Է°� - �迭�� ����� ���� ��
				
				int i = 0; // �α��� ���и� �˼� �ִ� ����(3�̵Ǹ� ->����)
				for (i = 0; i < id_arr.length; i++) {
					if (id_arr[i] != null) {
						if (id_arr[i].equals(id) && pw_arr[i] == pw) {
							System.out.print("�α��� ����");
							break;
						}
					}
				}
				if(i==3) {
					System.out.println("�α��ν���");
				}
//				if(id_arr[1].equals(id)&&pw_arr[1]==pw) {
//					System.out.print("�α��� ����");					
//				}
//				
//				if(id_arr[2].equals(id)&&pw_arr[2]==pw) {
//					System.out.print("�α��� ����");					
//				}
				
								
			} else if (menu == 3) {
				System.out.println("����");
				break;
			} else {
				System.out.println("1,2,3�߿� �Է����ּ���");
			}

		}
		
		//ȸ�� ���Ե� ȸ�� ���� Ȯ��(�迭�� ���� ���) 
//		for(int i=0; i<id_arr.length; i++) {
//			System.out.println(id_arr[i]);
//			System.out.println(pw_arr[i]);
//		}
//		
//		//Ȯ��for��(�迭/arraylist ��� �� �� Ȯ���� �� ����ϱ� ���� ����)
//		//(for~each��)
//		for(String s:id_arr) {
//			System.out.println(s);			
//		}

	}

}
}
