package ����;

public class Ex02�ڷ��� {
	
	//ctrl+space: �ڵ��ϼ� ����Ű
	public static void main(String[] args) {
		
		//�ڷ���
		//1. primitive type(�⺻Ÿ��) : �ڹپ� ����� �⺻����
		//1-1. ����(boolean) - yes/no, true/false, on/off, 1/0 (switch)
		boolean sw = true; // false
		
		//1-2. ������(���� �ϳ��� ǥ��) - ����, �����ڵ�, �ƽ�Ű�ڵ� ǥ�� ���� 
		char c = '��';
		System.out.println(c);
		char c1 = 97;
		System.out.println(c1);
		char c2 = '\uAC00';
		System.out.println(c2);
		
		//1-3. ������(byte, short, int(�⺻), long)
		byte n1 = 1;
		short n2 = 2;
		int n3 = 3;
		
		long n4 = 4;
		
		//1-4. �Ǽ���(float, double(�⺻))
		float n5 = 10.123f;
		float n6 = (float)10.123;
		double n7 = 10.123;
		
		//Ÿ�Ժ�ȯ(����ȯ)
		float n8 = 1.23f; //��������ȯ
		//�Ǽ����� �⺻Ÿ���� double(8byte)
		//->float ��� ���ؼ���(4byte) ���������� ����ȯ ���������
		//why? �������� �ս��� �Ͼ �� �ֱ� ������ �ڵ����� �� ��ȯ �������� ����
		double n9 = n8; // �ڵ�����ȯ(ũ�Ⱑ ���� ���� �� ū Ÿ������ ��ȯ�� ��)		
		
		//2. reference type : �⺻Ÿ�� �ܿ� ��� Ÿ��
		// ex) String : ���ڿ� (�⺻ ����x)
		String s = "Hello World!";
		
		System.out.println(s.substring(0,5));
		System.out.println(s+123);
		
		
		//
	}

}
