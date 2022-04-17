package ArrayList;

import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		// �������� �迭�� ���� ���¸� ������ �ִ� Ŭ���� ArrayList
		// Collection å���� �о�� 390p
		
		// 1. ArrayList �����ϱ�	
		// ArrayList<������ ������ �ڷ���> + ������
		// Stringn s = new String";
		// int[] arr = {} -> new int[5]
		// ArrayList<> ��ü ������ �����͸� ���� �� �� �ִ�.
		// int , floast, double
		// <> : ���׸� ���
		// :ArrayList�� �����ϴ� ������ ������ �ڷ����� �����ϴ� ���
				
		ArrayList<String> list = new ArrayList<String>();
		// ���۷��� ���� ����, ��ü ���¸� ������ �� �ִ�. (�⺻ �ڷ��� ����X)��
		
		// 2. �� �߰��ϱ�
		// ���� �߰��ϴ� �޼��尡 ���������� ���谡 �Ǿ�����
		// �����Ͱ� �ڷ� ���ϴ�.
		list.add("����ȸ");
		list.add("�ٻ���");
		
		// 2-1 �� ���ϴ� ��ġ�� �����͸� �߰��ϱ�		
		list.add("���ȸ");	
		list.add("��������");
		list.add(2, "�δ��");
			
		// 3. �� ��������
//		list.get(1);
		System.out.println(list.get(1));
		
		// 4. �� �����ϱ�
//		list.remove(0);
		
		// 5. ����Ǿ��ִ� �������� �� ũ�� ��������
		System.out.println(list.size());
		
		//ArrayList�� ����ִ� ��� �����͸� ��½����ְ�
		// ���â ����		
		for(int i =0; i<list.size(); i++){
			System.out.println(list.get(i));	
		}		
		
		// 6. ��� ������ ���� �ѹ��� ���� �ϴ� ���
		list.clear();
		// �����Ͱ� �� ��������� ũ��� Ȯ�� ����
		System.out.println(list.size());
	}

}
