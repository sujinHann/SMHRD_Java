package �޼���;

public class Ex06_fibonacci {

	public static void main(String[] args) {

		// �ڿ��� �����ϴ� �Ǻ���ġ ����
		// ����? 1 2 3 4 5
		// 2 4 6 8 10 ���̰� �����ϰ� �����ϴ� ���� -> ��ġ����
		// 2 4 8 16 32 -> ������
		// ���ڵ��� ��Ģ������ ����
		// �Ǻ���ġ
		// fibonacci ����
		// 1 1 2 3 5 8 13 21 34 55


		int num4 = 5;
		int result4 = fibonacci(num4);
		System.out.println("�Ǻ���ġ ������ " + num4 + "��° ���� " + result4 + "�Դϴ�.");

	}

	public static int fibonacci(int num4) {		
		int result4 = 0;
		// ����Լ�
		// �ڱ� �ڽ��� ȣ���ϴ� �Լ�

		// hint. 1��°�� 2��° ���� 1�� ����
		if (num4 == 1) {
			return 1;
		} else if (num4 == 2) {
			return 1;
		} else {
			return fibonacci(num4 - 2) + fibonacci(num4 - 1);
		} 
		// else if ����ϰ� �ȴٸ� else�� ���� return�� �� �־����

		// num° ���� ���ϰ� �ʹٸ�
		// num-2��°�� num-1��°

//		for(int i = 1; i<=num4; i++) {
//			if(i==1||i==2) {
//				result4 = 1;
//			}else if(i==(i-2)+(i-1)) {				
//			} result4 += i;
//		}
//		System.out.println(result4);
		
		

	}
}
				
		
		
		
		
//		if (num4 == 1) {
//			result4 = 1;
//		} else if(num4==2) {
//			result4 = 1;
//		}
//		1���� 1
//		2���� 1
//		3���� 2 (1��+2��)
//		4���� 3 (2��+3��)

//		if (num4 == 1) {
//			result4 = 1;
//		} else {		
//			for(int i = 1; i<=num4; i++)
//			{
				
				
				
			
		

		
		

		
		

