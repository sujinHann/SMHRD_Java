package �ݺ���;

import java.util.Scanner;

public class Ex06while��_����06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("����1: ");
//		int num1 = sc.nextInt() ; 
//		System.out.print("����2: ");
//		int num2 = sc.nextInt();		
//		System.out.print("������(+/-) : ");		
//		String a = sc.next();
//		
//		int sum = num1 + num2;
//		int minus = num1 - num2;
//		String y_n = "";
//			
//		while(true)
//			
//		if(a.equals("+")) {
//			System.out.println(num1 + "+" + num2 + "=" + sum);
//		} else if(a.equals("-")) {
//			System.out.println(num1 + "-" + num2 + "=" + minus);			
//		} 
//		System.out.print("��� �Ͻðڽ��ϱ�? ");		 
//		y_n = sc.next();
//		
//		if(y_n.equals("N")||y_n.equals("n")) {
//			break;
//		}
		
		int num1 = 0;
		int num2 = 0;
		String op = "";
		
		while(true) {
		
		System.out.print("����1: ");
		num1 = sc.nextInt() ; 
		System.out.print("����2: ");
		num2 = sc.nextInt();		
		System.out.print("������(+/-) : ");		
		op = sc.next();
		
		if(op.equals("+")) {
			System.out.printf("%d %s %d = %d", num1, op, num2, num1+num2);
		} else if(op.equals("-")) {
			System.out.printf("%d %s %d = %d", num1, op, num2, num1-num2);					
		} 
		
		System.out.print("\n����Ͻðڽ��ϱ�? (Y/N) ");
		String con = sc.next();
		
		if(con.equals("N")||con.equals("n")) {
			System.out.println("����!");
		break;
		
		}
		}

	}
}
	


