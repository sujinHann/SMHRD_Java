package ��������;

import java.util.Arrays;

public class ��������_�������� {

	public static void main(String[] args) {

		int[] arr = { 7, 4, 5, 1, 3 };

		System.out.println("���� �� : " + Arrays.toString(arr));
		
		for (int j = 1; j <= 4; j++) { // 4�� ��ȯ �ؾ��ϹǷ� 
			int cnt = 0; // ���� ȸ������ ��ȯ�� Ƚ��
			
			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					cnt++;
				}
			}
			
			if(cnt==0) {
				System.out.println("�̹� ���� �Ϸ�");
				break;
			}
			
			System.out.println(j + "ȸ�� : " + Arrays.toString(arr));
		} 
	
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] > arr[i + 1]) { // ������(i��°)ũ�� �ٲ����, ���� �ʿ�
//				int temp; // �ӽð���
//				temp = arr[i]; // i��° ���� �ӽð������� �ű�
//				arr[i] = arr[i + 1]; // i+1��° ���� i�� �ű�
//				arr[i + 1] = temp; // �ӽð����� ���� i+1��°�� �ű�
//
//			}
//
//		}
//		System.out.println("1ȸ�� : " + Arrays.toString(arr));
//
//		for (int i = 0; i < arr.length - 2; i++) {
//			if (arr[i] > arr[i + 1]) { // ��ȯ
//				int temp; // �ӽð���
//				temp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = temp;
//
//			}
//
//		}
//
//		System.out.println("2ȸ�� : " + Arrays.toString(arr));
//
//		for (int i = 0; i < arr.length - 3; i++) {
//			if (arr[i] > arr[i + 1]) { // ��ȯ
//				int temp; // �ӽð���
//				temp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = temp;
//
//			}
//
//		}
//
//		System.out.println("3ȸ�� : " + Arrays.toString(arr));

		
		
		
	}

}
