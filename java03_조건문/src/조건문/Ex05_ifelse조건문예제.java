package ���ǹ�;

import java.util.Scanner;

public class Ex05_ifelse���ǹ����� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("����Ʈ���� ���� : ");
		int sw = sc.nextInt();
		System.out.print("����Ʈ���� ���� : ");
		int sw2 = sc.nextInt();
		System.out.print("�����ͺ��̽� ���� �Է� : ");
		int db = sc.nextInt();
		System.out.print("���α׷��� ��� Ȱ�� : ");
		int pro = sc.nextInt();
		System.out.print("�����ý��� ���� ���� : ");
		int info = sc.nextInt();
		
		int sum = sw+sw2+db+pro+info;
	
		if(sw<8||sw2<8||db<8||pro<8||info<8||sum<60) {
			System.out.println("���հ��Դϴ�."); 
		} else {
			System.out.println("�հ��Դϴ�.");
			}
			
		}
	}

