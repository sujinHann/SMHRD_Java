package ���ǹ�;

import java.util.Scanner;

public class Ex06_����if��_����2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ĺ��� �Է��Ͻÿ�: ");
		String str = sc.next();
		
		//�񱳿����� -> �⺻Ÿ�� ���� �� ���
		//���ڿ����� �� �� �� equals ���
		if(str.equals("A")) {
			System.out.println("A�Է�");
		}else if(str.equals("B")) {
			System.out.println("B�Է�");
		}else if(str.equals("C")) {
			System.out.println("C�Է�");
		}else{
			System.out.println("A,B,C �� �Է�");
			}
		
	}
}


