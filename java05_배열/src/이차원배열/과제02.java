package �������迭;

public class ����02 {

	public static void main(String[] args) {
		// 1. 5*5 �迭�� ���� ����
		int[][] num = new int[5][5];
		int cnt = 1;

//		1	2	3	4	5	
//		10	9	8	7	6	
//		11	12	13	14	15	
//		20	19	18	17	16	
//		21	22	23	24	25	


		// 0��, 2��, 4���� ����������
		// 1��, 3���� �������� ���

		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < num[i].length; j++) {
					num[i][j] = cnt;
					cnt++;
				}

			} else {
				for (int j = 0; j < num[i].length; j++) {
					num[i][4 - j] = cnt;
					cnt++;
				}
			}
		}

		// ���
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}

}