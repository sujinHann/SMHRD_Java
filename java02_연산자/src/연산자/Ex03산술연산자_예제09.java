package ������;

import java.util.Scanner;

public class Ex03���������_����09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA ���� �Է� : ");
		int scorejava = sc.nextInt();
		System.out.print("WEB ���� �Է� : ");
		int scoreweb = sc.nextInt(); 
		System.out.print("ANDROID ���� �Է� : ");
		int scoreandroid = sc.nextInt(); 
		
		int sum = scorejava + scoreweb + scoreandroid;
		double div = (double)sum/3;
		
		System.out.println("�հ� : " + sum );
		System.out.printf("��� : %.2f", div);
		System.out.printf("��� : %.2f", sum/3.0);


		

	}

}
