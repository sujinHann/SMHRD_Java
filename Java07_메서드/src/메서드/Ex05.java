package �޼���;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;

		// is�޼��� -> ��ȯ�ϴ� Ÿ���� boolean

		boolean result = isDivisor(num1, num2);
//		System.out.println(result);

		// ����ϴ� ����� ���ִ� �޼��带 ������ -> void
		getDivisor(24);

		// getSumofDivisor()�޼���
		int num = 10;
		int result2 = getSumofDivisor(num);
		// ����Ÿ�� -> int
		System.out.println("����� �� : " + result2);

		// isPerfectNumber
		// ������
		// �ڱ� �ڽ��� ������ ������� ���� �ڱ� �ڽŰ� ���� ��
		// 6-> 1 2 3 == 6
		// 9 -> 1 + 3 != X

		int num3 = 496;
		boolean result3 = isPerfectNumber(num3);
		System.out.println("������? >> " + result3);
		
		// �ڹٴ� ������ ��Ģ -> camal
		int startNumber = 2;
		int endNumber = 1000;
		// 2~1000������ �������� ������
		getperfectNumber(startNumber, endNumber);
		
	}

	public static boolean isDivisor(int num1, int num2) {
		boolean result = false;

		// ����, ������ ������ �����Ѵٸ�
		// num1�� num2�� ������ �� ������ ��������? or
		// num2�� num1�� �����? or
		// num1�� num2�� �����
		// result�� true��

		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void getDivisor(int num) {

		String result = "";
		result += num + "�� ��� : ";
		// �� result�� 24�� ����� �޾��ּ���
		// 24�� ����� ã���ּ���

//		System.out.println("24�� ��� :");

		for (int i = 1; i <= num; i++) {
			// i�� ������� �ƴ���
			// num%i == 0 -> isDivisor �����ϴ� ��ɰ� ����
			if (isDivisor(num, i)) {
				result += i + " ";
			}
		}
		System.out.println(result);

//		for (int i = 1; i <= 24; i++) {
//			if (num % (i) == 0) {
//				System.out.print(i + " ");

//			}
//		}

//		System.out.print(result);

	}

	public static int getSumofDivisor(int num) {
		int result2 = 0;

		// ���� num�� 10�� ���Դٸ�
		// ����� �� �ΰ���? 1,2,5,10
		// ����� ����?

		// ����, 1�� 10�� ������
		// result2�� ������

		// intŸ��
		// 4byte
		// 1byte = 8bit
		// 1bit 2^1
		// 1byte 2^8 => 256

		// 10 -> 1 2 5 10
		// 36 -> 1 2 3 4 9 12 18 36

		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				result2 += i;
			}
		} // System.out.println(result2);

//		if (num % 1 == 0) {
//			result2 += 1;
//		}

		return result2;
	}

	public static boolean isPerfectNumber(int num) {

//		boolean result3 = false;
		// ����, num�� ��������� true�� ����
		// ��������?
		// �ڱ��ڽ��� ������ ����� ���� �ڱ� �ڱ��ڽŰ� ������
		// ������ ���θ� �Ǵ��ϴ� �޼��带 ����� �ּ���
		// hint1. 6�� 28�� ������
		// hint2. �ڱ� �ڽ��� ������ ����� ���� getSumofDivisor
		// hint3. getSumofDivisor(6) 12,
		// getSumofDivisor(28) 56
		// �������� ���ϱ� ���ؼ��� ���� /2���� ���ؾ���

		for (int i = 1; i < num; i++) {
			if (getSumofDivisor(num) / 2 == num) {
				return true;
			}
		}

		return false;

	}
	
	public static void getperfectNumber(int startNumber, int endNumber) {
		
		String result = "";
		result += startNumber+"~"+endNumber+"������ ������ : ";
		
		// ����, 2�� ���������
		// result�� 2�� �߰�
		
		// ����, 3�� ���������
		// result�� 3�� �߰�
		
		// ...
		
		// ����, 1000�� ���������
		// result 1000�� �߰�!
		
		for (int i = startNumber; i <= endNumber; i++) {
			if (getSumofDivisor(i) / 2 == i) {
				result += i + " ";
			}
		}
		System.out.println(result);
				
		
	}
}


