package Person;

public class Student extends Person{
	
	String stdId = "123";
	String grage;
	
	//Student ��ü ������ �� String Ÿ���� �Ű����� �ϳ� �ްڴ�.
	public Student(String name) {
		//�Ű������� ���� ���� ����Ŭ����(�θ�Ŭ����)�� ������ ȣ��� ���
		super(name);
	}
	
	public void walk() {
		System.out.println("�ɾ ������");
	}
	

}
