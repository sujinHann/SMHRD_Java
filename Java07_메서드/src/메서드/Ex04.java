package �޼���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		// �Ű�����:
		// ��ȯŸ��:

		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� ���� : ");
		int len = sc.nextInt();
		int [] arr = getArr(len);
		
		System.out.println(Arrays.toString(arr));
		
		boolean sw = isDuplicate(arr);
		System.out.println("��� : " + sw);

	}

	private static int[] getArr(int len) {
	
		Random rd = new Random();
		// ����ڰ� �Է��� ���̸�ŭ �迭 ����
		int[] arr = new int[len];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(20)+1;			
		}
		return arr;
				
	}
	
	private static boolean isDuplicate(int[] arr) {
		
		// boolean sw = false;
		
		for(int i= 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					return true; 
					//return  Ű����� ������ �Ǹ�
					//�ش� ���� ��ȯ�ϰ� �޼ҵ带 ����
				}
			}
		}
		
		return false;
	}

}
