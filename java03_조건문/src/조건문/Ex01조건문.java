package ���ǹ�;

import java.util.Scanner;

public class Ex01���ǹ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int age = sc.nextInt();

		if (age >= 20) { // (���ǽ�) : ������� true�̸� if�� ����
			// ���ǽĿ��� boolean ���� ����(��,�� or true/flase)
			System.out.println("�����Դϴ� ");
		}
		System.out.println("�����̾ƴմϴ�");
	}

}
