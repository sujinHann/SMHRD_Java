package View_Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.StudentDAO;
import Model.StudentVO;

public class Main {

	public static void main(String[] args) {

		// ctrl+shif+o -> ��ü import
		// ctrl+space ->Ư�� Ŭ���� import
		StudentDAO dao = new StudentDAO();
		Scanner sc = new Scanner(System.in);

		System.out.println("========================SMHRD�л��������α׷�========================");

		while (true) {

			System.out.println("1.�л��߰� 2.��ü�����ȸ 3.Ư���л���ȸ 4.�л��������� 5.�л����� 6.���α׷����� ");
			System.out.print("�޴����� >> ");
			System.out.println();
			int meun = sc.nextInt();

			if (meun == 1) {
				System.out.println("����� �л��� ������ �Է��Ͻÿ�");
				System.out.print("�̸�:");
				String name = sc.next();
				System.out.print("����:");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ:");
				String tel = sc.next();
				System.out.print("�̸���:");
				String email = sc.next();

				boolean check = dao.insertStd(name, age, tel, email);

				if (check == true) {
					System.out.println("�л� ���� �߰� �����߽��ϴ�.");
				} else {
					System.out.println("�л� ���� �߰� �����߽��ϴ�.");
				}

			} else if (meun == 2) {

				ArrayList<StudentVO> al = dao.selectStds(); // ȣ��

				for (StudentVO vo : al) {
					System.out.println("===========================");
					System.out.println("�л���ȣ : " + vo.getNum());
					System.out.println("�л��̸� : " + vo.getName());
					System.out.println("�л����� : " + vo.getAge());
					System.out.println("�л���ȭ��ȣ : " + vo.getTel());
					System.out.println("�л��̸��� : " + vo.getEmail());

				}

//				for(int i=0; i<al.size(); i++) {
//					
//					System.out.println("===========================");
//					System.out.println("�л���ȣ : " + al.get(i).getNum());
//					System.out.println("�л��̸� : " + al.get(i).getName());
//					System.out.println("�л����� : " + al.get(i).getAge());
//					System.out.println("�л���ȭ��ȣ : " + al.get(i).getTel());
//					System.out.println("�л��̸��� : " + al.get(i).getEmail());
//				}

			} else if (meun == 3) {
				// 1. �л���ȣ �˻�(�Է�)
				System.out.print("�л� ��ȣ �Է�: ");
				int num = sc.nextInt();
				// 2. DAO��ü�� ������ �ִ� selectOneStd() ȣ�� -> StuentVO ��ȯ
				StudentVO vo = dao.selectOnestd(num);
				// �Էµ� �л���ȣ�� Student table�� num �÷������� �����ϴ� ��쿡��
				// StudentVO ��ü�� ������
				// �������� �ʴ� ��쿡�� ��ü�� ������ ���� �ʰ� �ʱ�ȭ���� null�� ��ȯ��

				if (vo != null) {
					System.out.println("===========================");
					System.out.println("�л���ȣ : " + vo.getNum());
					System.out.println("�л��̸� : " + vo.getName());
					System.out.println("�л����� : " + vo.getAge());
					System.out.println("�л���ȭ��ȣ : " + vo.getTel());
					System.out.println("�л��̸��� : " + vo.getEmail());
				} else {
					// vo�� null�ΰ��
					System.out.println("�ش� �л��� �츮 �б����� �ƴմϴ�. �ٽ� �Է����ּ���.");
				}

			} else if (meun == 4) {

				System.out.print("������ �л��� ��ȣ �Է� : ");
				int num = sc.nextInt();

				StudentVO vo = dao.selectOnestd(num);

				// �Էµ� �л���ȣ�� Student table�� num �÷������� �����ϴ� ��쿡��
				// StudentVO ��ü�� ������
				// �������� �ʴ� ��쿡�� ��ü�� ������ ���� �ʰ� �ʱ�ȭ���� null�� ��ȯ��

				if (vo != null) {
					System.out.println("===========================");
					System.out.println("�л���ȣ : " + vo.getNum());
					System.out.println("�л��̸� : " + vo.getName());
					System.out.println("�л����� : " + vo.getAge());
					System.out.println("�л���ȭ��ȣ : " + vo.getTel());
					System.out.println("�л��̸��� : " + vo.getEmail());

					System.out.println();
					System.out.print("������ ���� ����(1.��ȭ��ȣ, 2.�̸���) : ");
					int select_num = sc.nextInt();
					if (select_num == 1) {
						System.out.print("������ ��ȣ: ");
						String update_phone = sc.next();

						boolean check = dao.updatePhone(num, update_phone);

						if (check == true) {
							System.out.println("�л� ��ȣ ���� �����߽��ϴ�.");
						} else {
							System.out.println("�л� ��ȣ ���� �����߽��ϴ�.");
						}

					} else if (select_num == 2) {
						System.out.print("������ �̸���: ");
						String update_email = sc.next();

						boolean check = dao.updatemail(num, update_email);

						if (check == true) {
							System.out.println("�л� ���� ���� �����߽��ϴ�.");
						} else {
							System.out.println("�л� ���� ���� �����߽��ϴ�.");
						}

					}

				} else {
					// vo�� null�ΰ��
					System.out.println("�ش� �л��� �츮 �б����� �ƴմϴ�. �ٽ� �Է����ּ���.");
				}
			} else if (meun == 5) {

				System.out.print("������ �л� ��ȣ �Է�: ");
				int num = sc.nextInt();

				boolean check = dao.deleteStd(num);

				if (check == true) {
					System.out.println("�л� ���� �����߽��ϴ�.");
				} else {
					System.out.println("�л� ���� �����߽��ϴ�.");
				}

			} else if (meun == 6) {
				System.out.println("����");
				break;
			}

		}
	}
}
