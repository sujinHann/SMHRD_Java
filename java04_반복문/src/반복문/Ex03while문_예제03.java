package �ݺ���;

import java.util.Scanner;

public class Ex03while��_����03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int odd = 0; // Ȧ������ ī����
		int even = 0; // ¦������ ī����
		
		while(true) {
			
		System.out.print("�����Է�: ");
		num = sc.nextInt();		
		
		if(num==-1) {
			break; // break: ������ ��� ���� ����� �ݺ��� ����
		}
		
		if(num%2==1){
			odd++; // Ȧ��
		}else 
			even++; // ¦��
		}
		
		System.out.println("Ȧ������: " + odd);
		System.out.println("¦������: " + even);
		
	}

	}

//int num = 0;
//int count = 0;
//int cnt = 0;
//
//while(num!=-1){
// System.out.print("���� �Է� : ");
// num = sc.nextInt();   
// 
// if(num%2==0)
//    count++; 
// else if(num%2==1) {
//    cnt++;
// }         
//} 
//System.out.println("¦�� ���� : " + count);
//System.out.println("Ȧ�� ���� : " + cnt);

//int num = 0;
//int count = 0;
//int cnt = 0;
//
//while(true){
// System.out.print("���� �Է� : ");
// num = sc.nextInt();   
// 
// if (num % 2 == 0)
//    count++;
// else if (num % 2 == 1) {
//    cnt++;
// }   
//          
// if(num==-1) {
//    System.out.println("¦�� ���� : " + count);
//    System.out.println("Ȧ�� ���� : " + cnt);
//    break;
// }
// 
//}

//int num = 0;
//int count = 0;
//int cnt = 0;
//
//do {
// System.out.print("���� �Է� : ");
// num = sc.nextInt();   
// 
// if (num % 2 == 0) {
//    count++;
// } else if (num % 2 == 1) {
//    cnt++;
// }   
//                   
//}while(num!=-1);
//
//System.out.println("¦�� ���� : " + count);
//System.out.println("Ȧ�� ���� : " + cnt);




