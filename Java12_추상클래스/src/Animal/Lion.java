package Animal;

public class Lion extends Animal {
	//�ʵ�: ��, ��, ����
	// �޼��� : �����̴�, �����ϴ�, �ڴ�
	boolean tail;
	// ����Ŭ������ �߻�Ŭ������ �߻�޼��带 ������ �������ϵ��� ������ �ο�
	// �ϱ����ؼ� �߻�޼��� ���!
	public void sleep(){
		System.out.println("�����ڴ�");
	}
	
	@Override
	public void move() {
		System.out.println("���ڿ�����");

	}
	//�ּ�(annotation) : Ư���� ���(�������� �� �ش� �޼��尡
	// ����Ŭ������ �޼��带 �������� �޼������� Ȯ��)�� ���� �ּ� 
	@Override
	public void attack() {
		System.out.println("���ڰ���");


	}

}
