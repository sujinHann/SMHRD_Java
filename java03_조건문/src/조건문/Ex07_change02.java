package ���ǹ�;

import java.util.Scanner;

public class Ex07_change02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ݾ� : ");
		int money = sc.nextInt();
		System.out.println("--�޴�--");
		System.out.print("1.�ݶ�(1800��) 2.�Ŀ����̵�(2000��) 3.ź���(1200��) >> ");
		int menu = sc.nextInt();
		
		int change1 = money - 1800;
		int change2 = money - 2000;
		int change3 = money - 1200;
		
		if(menu==1 && money>=1800) {
			System.out.print("�ܵ� : " + change1 + "��");
		}else if (menu==2 && money>=2000) {
			System.out.print("�ܵ� : " + change2 + "��");
		}else if (menu==3 && money>=1200) {
			System.out.print("�ܵ� : " + change3 + "��");
		}else {
			System.out.println("���� �����ؿ� ");
		}
	
	}

	}

