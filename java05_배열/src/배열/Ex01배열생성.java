package �迭;

public class Ex01�迭���� {

	public static void main(String[] args) {
		
		char[] c = new char[3]; // �޸� ������ �������� 3ĭ ���� �Ҵ� 
 // 2. �迭 ���۷��� ���� ���� // 1. �迭 ����
 //(�迭�� ������ ���� )
		
		//3. �迭�� �� �Ҵ�(�� �ε����� ����)
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		
		//4. �迭 ������ ���ÿ� �� �Ҵ�
		int[] i = {1, 2, 7, 8, 5}; // �ڵ����� �������� 5ĭ ���� �Ҵ�
		
		//5. �迭 ũ�� ���
		System.out.println("i �迭 ũ�� : " + i.length);
		
		System.out.println(i);
		System.out.println(c);
		
		int[] intArray = new int[5];
		int[] myArray= intArray;
		
		System.out.println("intArray ���� ��:" + intArray);
		System.out.println("myArray ���� ��:" + myArray);
		
		System.out.println(intArray[4]);  // int �������� ���� �־����� ������ 0
		
		intArray[1] = 2;
		System.out.println(intArray[1]);
		
		myArray[1] = 6;
		System.out.println(intArray[1]);

	}

}
