package �ݺ���;

public class Ex16����for��_����_������ {

	public static void main(String[] args) {

		// 1. �� �ﰢ��
		for (int i = 1; i <= 5; i++) { // �� �� 1~5���� ��ȭ�� ����
			for (int j = 4; j >= i; j--) { // ������ ��ȭ
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) { // *�� ��ȭ
				System.out.print("**");
			}
			System.out.println("");
		}

		// 2. �Ʒ� �ﰢ��
		for (int i = 1; i <= 5; i++) { // 5�� �ݺ�
			for (int j = 0; j < i-1; j++) { 
				System.out.print(" ");
			} for (int k = 5; k >= i; k--) {
				System.out.print("**");
			} System.out.println("");

		}
	}
}

		