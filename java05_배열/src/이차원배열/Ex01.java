package �������迭;

public class Ex01 {

	public static void main(String[] args) {

		// 2���� �迭 ����
		int[][] a = new int[5][5];

		int num = 1; // �迭�� �� ���� 

		// �迭�� �Է�
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
//			System.out.printf("(%d, %d) ", i , j);
				a[i][j] = num;
				num++;
			}
		}

		// ���
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
