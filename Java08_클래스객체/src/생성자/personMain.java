package ������;

public class personMain {

	public static void main(String[] args) {
		// person(��ü, �ν��Ͻ�) ����
		// person ��ü�� �������� �����ϰ� �ִ� ���۷��� ���� ����
		Person p = new Person(); // Person Ÿ���� ��ü ����

		p.setName("�Ѽ���");
		p.setAge(20);

		System.out.print(p.getName());
		System.out.print(p.getAge());
		
		
		
		Person p1 = new Person("������", 23);
		System.out.print(p1.getName());
		System.out.print(p1.getAge());

	}

}
