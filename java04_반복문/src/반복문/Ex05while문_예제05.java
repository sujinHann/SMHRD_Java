package �ݺ���;

import java.util.Scanner;

public class Ex05while��_����05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String id = "smhrd";
//		String password = "1234";
//		
//		int count = 1;
//		
//		while(count<=3) {
//			count++;
//			System.out.print("���̵�: ");
//			String id2 = sc.next();
//			
//			if(id.equals(id2)) {
//				System.out.print("��й�ȣ: ");
//				String password2 = sc.next();
//				
//				if(password.equals(password2)) {
//					System.out.println("�α��� ����");				
//				}else {
//					System.out.println("�α��� ����");							
//				}
//					
//				break;	
//				
//			} else {
//				System.out.println("�α��� ����");
//				
//			}
//			
//			
//		}
		
		String id = "";  //  String �ʱ�ȭ : null(�� - primitive type), ""
		String pw = "";
		
		String y_n = ""; // Y/N
		
		int cnt = 0; // Ʋ��Ƚ�� ī����
		
		do {
			System.out.print("���̵�: ");
			id = sc.next();
			System.out.print("��й�ȣ: ");
			pw = sc.next();
			
			if(id.equals("smhrd")&&pw.equals("1234")) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("�α��� ����");	
				
				cnt++;
				
				if(cnt==3) {
					System.out.println("���������� ���ּ���");
					break;
				}
				
				System.out.print("��� �Ͻðڽ��ϱ�? ");
				y_n = sc.next();
				
				if(y_n.equals("N")||y_n.equals("n")) {
					break;
				}
			}
			
		}while(!id.equals("smhrd")||!pw.equals("1234"));
		//string ���� �񱳽� �������� �ʴ� ��� : !(not)�� �񱳱��� �տ� �ۼ�
		
		

	}

}
