package �ݺ���;

import java.util.Scanner;

public class Ex10for��_����03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//(���ǽ�)?true�ϰ��:false���
		
		int small = (num1>num2)?num2:num1;
		int big = (num1>num2)?num1:num2;
		
		for(int i = small; i<=big; i++) {
			System.out.println(i);
		}

	}

}
