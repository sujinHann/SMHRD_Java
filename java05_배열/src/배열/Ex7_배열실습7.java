package �迭;

import java.util.Random;

public class Ex7_�迭�ǽ�7 {

	public static void main(String[] args) {

		// ���� ���ڸ� �ҷ����� ����
		Random rd = new Random();

		System.out.println("====�ζ�Ÿ��=====");
		System.out.println("�̹��ֿ� ��¹�ȣ�¿�...! �α��α�");

		// 5ĭ¥�� ������ �迭�� �����
		int[] num = new int[5];

		// ���ǰ����� �ʱ�ȭ(1~10����)
		for (int i = 0; i<num.length; i++) {
			// 0���� 10���� ����
			// 1���� 10���� ���� ->nextInt(9)+1
			num[i] = rd.nextInt(9)+1;

			// �Է��� i���� �˻� // �ߺ��Ȱ� ����...
			for (int j = 0; j < num.length; i++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}

		}

		// �迭 ����ϱ�
		for(int i = 0 ; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}

	

}


