package �������迭;

public class ����01 {

	public static void main(String[] args) {

	    // 5*5 �迭�� ���� ����
	      int[][] num = new int[5][5];

	      // ������ �Էº�
	      int cnt = 1;

	      // �ι�° �� ��������°���� 1
	      for (int i = 0; i < num.length; i++) {
	         for (int j = 0; j < num[i].length; j++) {
	            num[i][4-j] = cnt;
	            cnt++;
	         }
	      }

	      for (int i = 0; i < num.length; i++) {
	         for (int j = 0; j < num[i].length; j++) {
	            System.out.print(num[i][j] + "\t");
	         }
	         System.out.println();
	      }
	   }
	}
