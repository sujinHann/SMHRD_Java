package �迭;

import java.util.Random;

public class Ex03�迭���� {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] arr = new int[10];
	
		int cnt = 0;
		

		System.out.print("array�� ����ִ� Ȧ���� " );
		
		
	      for(int j =0; j<10; j++) {
	          arr[j] = rd.nextInt(100);
	          }
			
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 1) {
//				System.out.print(arr[i]);
//				cnt++;
//			}
//		}
	      
		System.out.println("�̸� " );	
		System.out.println("�� Ȧ�� ������ " + cnt + "�Դϴ�.");
		
		}
		
	}