package ����1;

public class ��� {
//����� ĳ���� ����
// �Ӽ�(field),�ൿ(method)
	// 1. �Ӽ�(field) : �̸� ���� ���ݷ� ����
	String name; // �̸��� �־�ߵ�
	int level;
	int power;
	
	//������ : new Ű���� ����ؼ� ��ü�� ������ ���� ȣ�� �Ǵ� �޼���
	//���������� Ŭ�����̸�(){} - ������ ����
	//�⺻������ : �Ű����� X, ��� x
	//�����ڰ� �ٸ� �����ڸ� �������� ������ �����Ϸ� �ڵ����� ��������
	public ���() {
		
	}
	
	public ���(String name, int level, int power) {
		 this.name = name;
		 this.level = level;
		 this.power = power;
	}
	
	
	
	//2. �ൿ(method) : �����Ѵ�, �ȴ´�
	public void attack() {
		System.out.println("����!");
	}
	
	public void walk() {
		System.out.println("�ȴ´�!");
	}

}
