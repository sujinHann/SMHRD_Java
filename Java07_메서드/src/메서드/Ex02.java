package �޼���;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ��: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ��: ");
		int num2 = sc.nextInt();

		int result = getAbsoluteVal(num1, num2);

		System.out.println("���: " + result);
	}

	// �Ű�����, ��ȯ�� ���� �ʿ����� Ȯ��
	// �Ű����� : �ΰ��� ���� (int 2��)
	// ��ȯŸ�� : ����(int)

	private static int getAbsoluteVal(int a, int b) {

//		int result = a + b;

		int result = (a >= b) ? a - b : (a - b) * -1; //
		// System.out.println("���: " + (a-b));

		return result;
//		return Math.abs(a-b);

	}

}
