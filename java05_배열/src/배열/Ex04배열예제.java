package �迭;

import java.util.Scanner;

public class Ex04�迭���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] aw_arr = { 1, 4, 3, 2, 1 }; // ���� ��
		int[] aw = new int[5]; // ����ڰ� �Է��� ���� ����
		char[] ox = new char[5];
		int cnt = 0; // ������ ī����

		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");

		int i = 0;

		for (i = 0; i < aw.length; i++) {
			System.out.print((i + 1) + "���� >> ");

			aw[i] = sc.nextInt();
		}

		for (i = 0; i < aw_arr.length; i++) {
			if (aw_arr[i] == aw[i]) {
				ox[i] = 'O';
				cnt++;
			} else {
				ox[i] = 'X';
			}
		}

		System.out.println("����Ȯ��");

		for (i = 0; i < ox.length; i++) {
			System.out.print(ox[i] + " ");
		}
		System.out.print("����: " + (cnt * 20));
	}
}

