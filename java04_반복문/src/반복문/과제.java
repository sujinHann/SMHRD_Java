package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int num1 = rd.nextInt(10);
		int num2 = rd.nextInt(10);
		int sum = 0;
		int correct = 0;
		int incorrect = 0;

		while (true) {
			System.out.print(num1 + "+" + num2 + "=");
			sum = sc.nextInt();

			if (num1 + num2 == sum) {
				System.out.println("Success!");
				correct++;
				num1 = rd.nextInt(10);
				num2 = rd.nextInt(10);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
			} else {
				System.out.println("Fail!");
				incorrect++;
			}
			System.out.print("��� �Ͻðڽ��ϱ�? : ");
			String y_n = sc.next();

			if (y_n.equals("n") || y_n.equals("N")) {
				System.out.println("����!");
				
				System.out.println("���ᰳ�� : " + correct);
				System.out.println("Ʋ������ : " + incorrect);
				
				break;
			} 
			
		}
		
		

		

//		do {
//			System.out.print(num1 + "+" + num2 + "=");
//			sum = sc.nextInt();
//
//			if (num1 + num2 == sum) {
//				System.out.println("Success!");
//				correct++;
//				num1 = rd.nextInt(10);
//				num2 = rd.nextInt(10);
//			} else {
//				System.out.println("Fail!");
//				incorrect++;
//
//			}
//			System.out.print("��� �Ͻðڽ��ϱ�? : ");
//			String y_n = sc.next();
//
//			if (y_n.equals("n") || y_n.equals("N")) {
//				System.out.println("����!");
//				break;
//			}
//
//		} while (true);
//
//		System.out.println("���ᰳ�� : " + correct);
//		System.out.println("Ʋ������ : " + incorrect);
	}

}