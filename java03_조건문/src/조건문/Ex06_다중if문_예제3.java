package ���ǹ�;

import java.util.Scanner;

public class Ex06_����if��_����3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ�: ");
		int num = sc.nextInt();
		System.out.print("����/û�ҳ�/���: ");
		String str = sc.next();
		
				
		if(str.equals("����") && num>=1800) {
			System.out.println("�����մϴ�");
		}else if(str.equals("û�ҳ�") && num>=1500) {
			System.out.println("�ݰ����ϴ�");			
		}else if(str.equals("���") && num>=1000) {
			System.out.println("�ȳ��ϼ���");
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		
	}

}
