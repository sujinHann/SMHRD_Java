package �ݺ���;

import java.util.Scanner;

public class Ex02while��_����02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0; //  Ư���� ���� �������Ѽ� ����ؾ��Ѵ� -> 0���� �ʱ�ȭ�� ���� ����
		int num = 0;
		
		while(num!=-1) {
		sum += num; // sum = sum+sum; // sum�� num���� ����(������)	
		System.out.print("�����Է�: ");
		num = sc.nextInt();
		}
		System.out.print("�������: " + sum);
		
		
		while(true) {
			sum += num; // sum = sum+sum; // sum�� num���� ����(������)	
			System.out.print("�����Է�: ");
			num = sc.nextInt();			
			
			if(num==-1) {
				break;
			}
		}
		
	}

}
