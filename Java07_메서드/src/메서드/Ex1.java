package �޼���;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// �Է¹޴� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int result = largerNumber(num1, num2);
		System.out.print("�� ū ����?");
		
	}
	
	//largerNumber�޼���
	public static int largerNumber(int num1, int num2) {

		// num1�� num2���� ū�� ������ �Ǵ�
		// ���ǹ����� ���ų� 
		// �ڵ带 ���ٷ� ���̸� ���׿����ڷ� ����
				
		int result = (num1 > num2)? num1 : num2;
		
//		int result = 0;
		
//		if(num1>num2) {
//			result =  num1;
//		}else {
//			result = num2;
//		}
		
		return result;
	}

}
