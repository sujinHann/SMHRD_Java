package �迭;

public class Ex5_�迭�ǽ�5 {

	public static void main(String[] args) {
		// �迭�� �����ؾ��Ѵ�.
		
		int arr[] = {23,45,95,17,6,89,47,56,68,81};
		
		// �迭���� ����
		
		int min = arr[0];
		int max = arr[0];
		
		 for(int i = 0; i<arr.length; i++) {
			 
			if(min > arr[i]) {
				min = arr[i];
				
				} else if(max < arr[i]){
					max = arr[i];
				}
			} 
			System.out.println("�ּҰ� : " + min );
			System.out.println("�ִ밪 : " + max );
				
		}
		
		// �ּҰ�(min) -> arr[0] > arr[1]
		// min = arr[1]
		
		// �ִ밪(max) -> arr[0] > arr[1]
		// max[0]

	}


