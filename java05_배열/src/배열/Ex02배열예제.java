package �迭;

public class Ex02�迭���� {

	public static void main(String[] args) {
		
		//1. ������ �迭 ������ ������ ���� ����
		int[] arr;  
		
		//2. ũ�Ⱑ 10�� �迭 ����
		arr = new int[10];  
		
		//2-1. ���࿡ �迭 ������ ���� �ϴ� ���� �˰� �ִ�
		//arr = {1,3,5,79,12,38};
		
		//3. �迭 �ʱ�ȭ(�� �Ҵ�)
		//�ٸ������� �ʱ�ȭ �������� ������ �⺻������ 0�� ������ ����(int)
		arr[0] = 10;
		arr[1] = 1;
		arr[2] = 20;
		arr[3] = 12;
		arr[4] = 20;
		arr[5] = 14;
		arr[6] = 32;
		arr[7] = 40;
		arr[8] = 23;
		arr[9] = 90;
		
		//4. �迭�� ���
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		// length(�Ӽ�) : �迭�� ����(ũ��)
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		//5. �� �ε����� ���� ��� ���Ͽ� ��� ���� ���
		
		int sum = 0; // �������� ������ ����
		
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		} System.out.println(sum);
		
		
		//6. �迭�� ���� ���
		System.out.println(sum/arr.length); 
		
	}

}
