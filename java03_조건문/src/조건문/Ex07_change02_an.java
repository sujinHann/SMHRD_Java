package ���ǹ�;

import java.util.Scanner;

public class Ex07_change02_an {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ݾ� : ");
		int money = sc.nextInt();
		System.out.println("--�޴�--");
		System.out.print("1.�ݶ�(1800��) 2.�Ŀ����̵�(2000��) 3.ź���(1200��) >> ");
		int menu = sc.nextInt();

		// ��������
		int change = 0; // ��������
		// ���� �ʱ�ȭ : int -> 0 // String -> ""

		if (menu == 1) {
			change = money - 1800;
		} else if (menu == 2) {
			change = money - 2000;
		} else if (menu == 3) {
			change = money - 1200;
		}

		if (change >= 0) {
			System.out.println("�ܵ� : " + change + "��");

			int a = change / 1000;
			int b = (change % 1000) / 500;
			int c = (change % 500) / 100;

			System.out.println("õ�� : " + a);
			System.out.println("����� : " + b);
			System.out.println("��� : " + c);

		} else {
			System.out.print("���� �����ؿ� �Ф�");
		}

	}

}
