package �޼���;

import java.util.Scanner;

public class Ex01_�޼ҵ�ǽ� {

	public static void main(String[] args) {
		
//		Q1. Ű����� �Է� ���� �ΰ��� ������ ����(�Ű�����)�� 
//		    �Ѱܹ޾� ù��° ������ �ι�° ���� �� ���� ����ϴ� �޼ҵ�
//		    getMinusVal()�� �ۼ��Ͻÿ�
		
//		�Ű����� - int(2��)
//		��ȯ�� : ����ϰ� �����Ÿ� ��� ��, ����ϰ� ��ȯ���ٰž�-> ��ȯ��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ��: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ��: ");
		int num2 = sc.nextInt();
		
		//static �޼��� ������ non-static ȣ��-> �Ұ���
		//non-static �޼��带 ȣ���Ϸ��� -> ��ü, �ν��Ͻ� ������ ȣ��
		getMinusVal(num1, num2);
	}
	
	//static�� ����� non-static
	//���������� ����(static) ��ȯŸ�� �޼����̸�(){}
	private static void getMinusVal(int a, int b) {

		System.out.println("��� : " + (a-b));
		
	}

}
