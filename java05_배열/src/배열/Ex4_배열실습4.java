package �迭;

public class Ex4_�迭�ǽ�4 {

	public static void main(String[] args) {
		// �迭 ����
		// ũ�� 9�� ���� ���������͸� ���� �� �ִ� �迭 ����
		int arr[] = {10,20,30,40,50,60,70,80,90};
		
		int sum = 0; //�ʱ�ȭ 

		//2. ����(�迭�ȿ� �� �ִ� ������ ������ ��)
		for(int i = 0; i < arr.length ; i++)
		{ // �迭 �����Ͱ��� ���� ���ϱ�
			sum = sum + arr[i];
		} 
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum/arr.length);

	}

}
