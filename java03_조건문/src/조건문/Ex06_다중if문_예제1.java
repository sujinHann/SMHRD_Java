package ���ǹ�;

import java.util.Scanner;

public class Ex06_����if��_����1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է�: ");
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A�����Դϴ�.");
		}else if (score>=80) {
			System.out.println("B�����Դϴ�.");
		}else if (score>=70) {
			System.out.println("C�����Դϴ�.");
		}else{
			System.out.println("F�����Դϴ�.");
		}
			
	}

}
