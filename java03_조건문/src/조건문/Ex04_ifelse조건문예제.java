package ���ǹ�;

import java.util.Scanner;

public class Ex04_ifelse���ǹ����� {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("JAVA ���� �Է�: ");
		int java = sc.nextInt();
		System.out.print("Python ���� �Է�: ");
		int python = sc.nextInt();
		System.out.print("Android ���� �Է�: ");
		int android = sc.nextInt();
		
		int result = (java+python+android)/3;
		
		if(result>=80) {
			System.out.println("�հ�");
			}else {
				System.out.println("���հ�");	
			}	
		}

	}


