package ���ǹ�;

import java.util.Scanner;

public class Ex07_switch��_����2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��(1~12) �Է� : ");
		int season = sc.nextInt();

		switch(season) {
			case 12,1,2 :
				System.out.println(season+"���� �ܿ��Դϴ�.");
				break;				
			case 3,4,5 :
				System.out.println(season+"���� ���Դϴ�.");
				break;
			case 6,7,8 :
				System.out.println(season+"���� �����Դϴ�.");
				break;
			case 9,10,11 :
				System.out.println(season+"���� �����Դϴ�.");
				break;					
		}
		
	}

}
