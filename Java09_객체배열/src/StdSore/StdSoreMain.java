package StdSore;

import java.util.Scanner;

public class StdSoreMain {

	public static void main(String[] args) {
		// stdScore ��ü ���۷��� ���� ����

		StdScore[] std_arr = new StdScore[3];

		Scanner sc = new Scanner(System.in);
		
			
		for(int i=0; i < std_arr.length; i++) {
			
			System.out.print((i + 1) + "��° �л��� �̸��� �Է��ϼ���. >> ");
			String name = sc.next();
			
			System.out.print((i + 1) + "��° �л��� Java������ �Է��ϼ��� >> ");
			int scoreJava = sc.nextInt();
			
			System.out.print((i + 1) + "��° �л��� Web������ �Է��ϼ��� >> ");
			int scoreWeb = sc.nextInt();
			
			System.out.print((i + 1) + "��° �л��� Android������ �Է��ϼ��� >> ");
			int scoreAndroid = sc.nextInt();
			
			std_arr[i] = new StdScore(name, scoreJava, scoreWeb, scoreAndroid);
			
		}
		
		for(int i=0; i < std_arr.length; i++) {
			
			int total = 0;
			
			total += std_arr[i].getScoreJava();
			total += std_arr[i].getScoreWeb();
			total += std_arr[i].getScoreAndroid();
			
			System.out.println(std_arr[i].getName() + "�� ������" + total + "��," + "�����" + (total / 3) + "�Դϴ�.");
		}
		
		
		
		
		
		

//		for (int i = 0; i < std_arr.length; i++) {
//			System.out.print((i + 1) + "��° �л��� �̸��� �Է��ϼ���. >> ");
//			String name = sc.next();
//
//			System.out.print((i + 1) + "��° �л��� Java������ �Է��ϼ��� >> ");
//			int scoreJava = sc.nextInt();
//
//			System.out.print((i + 1) + "��° �л��� Web������ �Է��ϼ��� >> ");
//			int scoreWeb = sc.nextInt();
//
//			System.out.print((i + 1) + "��° �л��� Android������ �Է��ϼ��� >> ");
//			int scoreAndroid = sc.nextInt();
//
//			std_arr[i] = new StdScore(name, scoreJava, scoreWeb, scoreAndroid);
//		}
//
//		int sum = 0;
//
//		for (int i = 0; i < std_arr.length; i++) {
//
//			sum = std_arr[i].getScoreJava() + std_arr[i].getScoreWeb() + std_arr[i].getScoreAndroid();
//
//			System.out.println(std_arr[i].getName() + "�� ������" + sum + "��," + "�����" + (sum / 3) + "�Դϴ�.");
//		}

	}

}
