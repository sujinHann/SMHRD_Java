package ������;

import java.util.Scanner;

public class Ex06���׿�����_����03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int minus1 = num1-num2;
		int minus2 = num2-num1;
		
		int result = (num1>num2? minus1 : minus2);
		
		System.out.println("�� ���� �� : " + result);
		
		
		
	}

}
