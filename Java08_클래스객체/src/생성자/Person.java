package ������;

public class Person {

	// �ʵ� : �̸�, ����
	private String name;
	private int age;

	public Person() { // �⺻������ ����

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	public Person(String name) {
		// super(); 
		this.name = name;
	}

	// Alt + Shift + S => Generate getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}//hello!
