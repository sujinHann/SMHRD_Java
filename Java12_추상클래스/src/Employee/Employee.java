package Employee;

//abstract : �߻� Ű����
//�߻�Ŭ������ Ŭ�������� �߻�޼ҵ尡 �ϳ��� �ְų� Ŭ���� ����� abstract Ű���带 
//���̸� �߻� Ŭ������ �� -> ��ü ���� �Ұ���
public abstract class Employee {
	//�ʵ� : ���, �̸�, ����(�ϴ�/����)
	//�޼��� : ���� ����ϴ�, �������(���, �̸�, ����)
	
	String empno;
	String name;
	int pay;
	
	//�߻�޼��� : ���Ǵ� �Ǿ� ������ ����� ���� �޼���
	//�߻�޼��尡 �ִ� �߻� Ŭ���� ��ӹ��� ����Ŭ�������� �ʼ��� �������̵� �������(�������ο�)
	public abstract int getPay();
	
	public String print() {
		return empno+" : "+name+" : "+getPay();
		
	}

}
