package ����;

import java.util.Scanner;

public class Ex05�Է°���� {

	public static void main(String[] args) {
	
//		 Scanner sc = new Scanner(System.in);
//		  
//		 System.out.printf("�̸� : "); 
//		 String name = sc.next();
//		 
//		 System.out.printf("���� : "); 
//		 String age = sc.next();
//		
//		 System.out.println("�̸��� "+name+"�̰� "+"���̴� "+age+"�Դϴ�.");


		Scanner sc = new Scanner(System.in); // �Էµ��� ����

		System.out.print("�̸� : ");
		String name = sc.next(); // ���ڿ������� ������
		System.out.print("���� : ");
		int age = sc.nextInt(); // ���������� ������
		
		System.out.println("�̸��� " + name + "�̰� ���̴� " + age + "�Դϴ�.");
		System.out.printf("�̸��� %s�̰� ���̴� %d�Դϴ�.", name, age);
		
	

	}

}
