package �ݺ���;

import java.util.Scanner;

public class Ex01while�� {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
	
		
		
//		System.out.print("�����Է� : ");
//		int num = sc.nextInt();
//		
//		//2. �ݺ��� ���� 
//		while(num < 10) {			
//			// 1. �ݺ��Ǵ� ���� ã��
//			System.out.print("�����Է� : ");
//			num = sc.nextInt();		
//		}
//		
//		System.out.println("����!");

		
		
//		int num = 0;
//		// ������ while�ȿ� ���� ����(���ѹݺ�)
//		while(true) {
//			System.out.print("�����Է� : ");
//			num = sc.nextInt();	
//			
//			// �ݺ����� �������� ����
//			if(num>=10) {
//				break; // break Ű���带 ������ ��� 
//				//���� ��ġ���� ���� ����� �ݺ����� ��������
//			}
//		}
		
		// do~while��
		
		int num = 0;
		do {
			System.out.print("�����Է� : ");
			num = sc.nextInt();	
		}while(num<10);
		
		System.out.println("����!");

	}

}
