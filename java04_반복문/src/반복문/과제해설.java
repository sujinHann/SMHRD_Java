package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class �����ؼ� {

	public static void main(String[] args) {
		// �������� ���� �� �ְ� �����ִ� ����
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		// rd.nextInt(10); : 0~9 ���� �������� �̾���
		// rd.nextInt(10)+1; : 0->1 1->2 9->10
		int num1 = rd.nextInt(10) + 1;
		int num2 = rd.nextInt(10) + 1;

		int o = 0; // ���ᰳ��
		int x = 0; // Ʋ������

		while (true) {
			System.out.printf("%d + %d =", num1, num2); // ���� �� �������� Ȯ��
			int input = sc.nextInt(); // ����ڰ� ���� �Է��ϴ� �κ�

			if (input == num1 + num2) { // �´´��� �Է��� ���
				System.out.println("Success!");
				o++;
				num1 = rd.nextInt(10) + 1;
				num2 = rd.nextInt(10) + 1;
			} else { // Ʋ������ �Է��� ���
				System.out.println("Fail");
				x++;
			}
			System.out.print("������ðڽ��ϱ�?");
			String con = sc.next();

			if (con.equals("N")) {
				System.out.println("����!");
				break; // ���� ����� �ݺ����� ������ �ϴ� Ű����
			}
		}
		System.out.println("���ᰳ�� : " + o);
		System.out.println("Ʋ������ : " + x);
	}
}