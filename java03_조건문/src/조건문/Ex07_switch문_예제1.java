package ���ǹ�;

import java.util.Scanner;

public class Ex07_switch��_����1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String data = sc.next();
		
		switch(data) {
		case "�ѱ���" :
			System.out.println("�ȳ��ϼ���");
			break;
		case "����" :
			System.out.println("���");
			break;
		case "�߱���" :
			System.out.println("���Ͽ�");
			break;
		case "�Ϻ���" :
			System.out.println("������");
			break;
		default :
			System.out.println("�ٸ��� �Է��ϼ���");			
		} 

	}

}
