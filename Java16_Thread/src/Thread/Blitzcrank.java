package Thread;

//���ÿ� ���� ��ų�� ����� �� ���� // �̱۽����� -> �⺻Ŭ����
public class Blitzcrank {
	private String skill; // ���� ������� ��ų ���� �ʵ�
	
	public Blitzcrank(String key) { //Ư���� ��ų�� ����� ������ü ����
		skill = key;	
	}

	//��ų ��� �޼ҵ�
	public void run() {
		System.out.println("�Է� Ű : " + skill);
		for(int i=1; i<=3; i++) {
			System.out.println(skill + "��ų ��� �� : " + i + "s");
		}
		System.out.println(skill + "��ų ��� ���� ");
	}
}
