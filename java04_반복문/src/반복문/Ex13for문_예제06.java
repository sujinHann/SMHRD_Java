package �ݺ���;

import java.util.Scanner;

public class Ex13for��_����06 {

	public static void main(String[] args) {

		// 1~50���� ���߷� 369���� �����
		// 369�϶�, "�ڼ�", �����ڸ��� 5�϶���"����"
		for(int i = 1; i<=50; i++) {
			if((i%10 == 3 || i%10 == 6 || i%10 == 9)) {	
				System.out.println("�ڼ�");
					} else if(i%10 == 5) {
				System.out.println("����");
					}else {
						System.out.println(i);
					}
				
			}
		
			
	}

}




