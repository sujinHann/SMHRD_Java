package ��������;

import java.util.Arrays;

public class ��������_�������� {

	public static void main(String[] args) {

		int[] arr = { 7, 4, 5, 1, 3 };
//		int indexmin;
//		int temp;
		
		System.out.println("���� �� : " + Arrays.toString(arr));

		for (int q = 0; q <= 3; q++) {
			int index_ = q; // ���ϴ� ���߿� ���� ���� ���� �ִ� �ε��� ��ȣ ���
			for (int w = index_ + 1; w < arr.length; w++) {
				if (arr[index_] > arr[w]) {
					index_ = w;
				}
			}
			int tmp;
			tmp = arr[index_];
			arr[index_] = arr[q];
			arr[q] = tmp;
			System.out.println((q+1)+"��° ���� = " + Arrays.toString(arr));
		}

			System.out.println("���� �� : " + Arrays.toString(arr));

//
//		// index�� �ּڰ�
//		for (int i = 0; i < arr.length - 1; i++) {
//			indexmin = i;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[indexmin] > arr[j]) {
//					indexmin = j;
//				}
//			}
//			temp = arr[indexmin]; // �ּҰ� �ӽ�����
//			arr[indexmin] = arr[i];
//			arr[i] = temp;
//			System.out.println((i+1)+"��° ���� = " + Arrays.toString(arr));
//		}
//		System.out.println("���� �� = " + Arrays.toString(arr));
//		

//		int index = 0; // ���ϴ� ���߿� ���� ���� ���� �ִ� �ε��� ��ȣ ���
//		for (int a = index + 1; a < arr.length; a++) {
//			if (arr[index] > arr[a]) {
////				index =  index+1;
//				index = a;
//			}
//			
//		}
//			
//		int temp1;
//		temp1 = arr[0];
//		arr[0] = arr[index];
//		arr[index] = temp1;
//
//		System.out.println("1ȸ��:  " + Arrays.toString(arr));
//
//		for (int a = index + 1; a < arr.length; a++) {
//			if (arr[index] > arr[a]) {
////			index =  index+1;
//				index = a;
//			}
//		}
//		temp1 = arr[1];
//		arr[1] = arr[index];
//		arr[index] = temp1;
//
//		System.out.println("2ȸ��:  " + Arrays.toString(arr));

		}

	}
