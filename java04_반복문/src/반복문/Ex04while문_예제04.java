package �ݺ���;

import java.util.Scanner;

public class Ex04while��_����04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;

		System.out.print("���� ������ : ");
		a = sc.nextInt(); // ���� ������
		System.out.print("��ǥ ������ : ");
		b = sc.nextInt(); // ��ǥ ������

		int week = 0;
		int c = 0;

		while (true) {
			week++;
			System.out.print(week + "���� ���� ������: ");
			c = sc.nextInt(); // ���� ������
			a = a - c;
			
			if (a <= b) {
				System.out.println("���� ������ : " + a);
				System.out.print("�����մϴ�!");
				break; // break: ������ ��� ���� ����� �ݺ��� ����
			}
		
		}
		
//		System.out.print("���� ������ : ");
//		int cur = sc.nextInt(); // ���� ������
//		System.out.print("��ǥ ������ : ");
//		int goal = sc.nextInt(); // ��ǥ ������
//		
//		int week2 = 1;
//		int weight = 0;
//		
//		
//		while(cur>goal) { //�ݺ��� �� ����
//			System.out.print(week2 + "���� ���� ������ : ");
//			weight = sc.nextInt();
//			week2++;
//			cur -= weight;			
//		}
//		
//		System.out.println("���� ������ : " + cur);
//		System.out.print("�����մϴ�!");
		
	}

}
