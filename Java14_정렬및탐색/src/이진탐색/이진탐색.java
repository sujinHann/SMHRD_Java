package ����Ž��;

public class ����Ž�� {

	public static void main(String[] args) {
		int[] arr = {1, 7, 16, 25, 30, 33, 41, 66, 78, 90};
		
		int num = 78; // �츮�� ã�� ���� ����
		
		int lowIndex = 0;
		int highIndex = arr.length-1;
		
		while(true) {
			int centerIndex = (lowIndex+highIndex)/2;
			
			if(arr[centerIndex]==num) {
				System.out.println(num+"�� "+centerIndex+"��° �����Դϴ�");
				break;
			} else if(arr[centerIndex]<num) {
				lowIndex = centerIndex+1;
			} else {
				highIndex = centerIndex-1;
			}
		}

	}

}
