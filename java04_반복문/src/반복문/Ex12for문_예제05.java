package �ݺ���;

import java.util.Scanner;

public class Ex12for��_����05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���: ");
		int num = sc.nextInt();
		
		System.out.println(num + "�� �����");
		
		for(int i = 1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		

	}

}
