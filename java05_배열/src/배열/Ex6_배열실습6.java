package �迭;

import java.util.Scanner;

public class Ex6_�迭�ǽ�6 {

	public static void main(String[] args) {
		
		//���� �Է� �޴� �Լ�
		Scanner sc = new Scanner(System.in);
		
		// ���� �Է�	
		int [] score = new int[5];
					
		for(int i = 0; i<score.length; i++) {				
			System.out.print((i+1) + "��° �Է�>>");
			score[i] = sc.nextInt();		
		} 
				
		//�Էµ� ���� ����ϱ�
		System.out.print("�Էµ� ���� >> ");
		for(int i = 0; i<score.length; i++) {
			System.out.print(score[i]+ "\t");
		}
		
		// �ְ�����, ��������, ����, ��� 
		// �迭 �����Ͱ��� �Էµ� �� �ʱ�ȭ �ؾ��� 
		int max = score[0]; 
		int min = score[0];
		
		int sum = 0;
		int avg = 0;
		
		// �ְ�����, �������� ���ϱ�
		for(int i = 0; i<score.length; i++) {
			if(max>score[i]) {
				//�ƽ����� ū ������ �� ����
				max = score[i];
			}
			if(min<score[i]) {
				//�κ��� ���� ������ �� ���� 
				min = score[i];
			}
		// ���հ� ��� ���ϱ�	
			sum += score[i];
			avg = sum/score.length;
		}
		
		System.out.println("");
		System.out.println("��������" + max);
		System.out.println("�ְ�����" + min);	
		System.out.println("����" + sum);	
		System.out.println("���" + avg);	
		
//		System.out.print("1��° �Է�>>");
//		int score1 = sc.nextInt();
//		System.out.print("2��° �Է�>>");
//		int score2 = sc.nextInt();
//		System.out.print("3��° �Է�>>");
//		int score3 = sc.nextInt();
//		System.out.print("4��° �Է�>>");
//		int score4 = sc.nextInt();
//		System.out.print("5��° �Է�>>");
//		int score5 = sc.nextInt();
		
		//�Էµ� ������ �ְ� ������ ���� ���� ���
//		int min = 0;
//		int max = 0;
//		if(min > )
//	
		
		
		

	}

}
