package ����1;

public class ��ĸ��� {

	public static void main(String[] args){
		
		// ��� ĳ����(��ü, �ν��Ͻ�) ���� 
		new ���(); // ���Ÿ���� ��ü ����
		
		// ��� ��ü�� �������� �����ϰ� �ִ� ���۷��� ���� ����
		��� cs = new ���();
		
		// ���� �Ӽ� ���
		
		// ������ ��� �ν��Ͻ��� ������ ����
		System.out.println(cs.level);
		// ������ ��� �ν��Ͻ��� ���� ���(�޼���) ���
//		cs.attack();
		
		new ���();
		
		//��� �ν��Ͻ��� �Ӽ��� �Ҵ�
		cs.name = "��ľ�";
		cs.level = 10;
		cs.power = 999999;
		
		System.out.println();
		System.out.println("�̸�" + cs.name);
		System.out.println("����" + cs.level);
		System.out.println("���ݷ�" + cs.power);
		
		cs.attack();
		
		
		new ���("���", 10, 50);
	}

}
