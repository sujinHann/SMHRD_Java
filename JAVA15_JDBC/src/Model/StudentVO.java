package Model;

public class StudentVO {

	// �ʵ� : �л���ȣ, �̸� , ����. ��ȭ��ȣ
	private int num;
	private String name;
	private int age;
	private String tel;
	private String email;

	// ������
	public StudentVO(int num, String name, int age, String tel, String email) {
		super(); // �θ�Ŭ������ ������ ȣ��(�⺻������)
		this.num = num;
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.email = email;
	}

	// �޼ҵ�
	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

}
