package ���ǹ�;

import java.util.Scanner;

public class Ex01���ǹ�_����02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if((num%3==0) || (num%5==0)) {		
			System.out.println("3 �Ǵ� 5�� ����Դϴ�.");
		}
		System.out.println("3 �Ǵ� 5�� ����� �ƴմϴ�.");

	}

}
