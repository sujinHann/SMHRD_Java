package Thread;
// ���ÿ� �������� ��ų�� ����� �� ���� -> ��Ƽ�½�ŷ -> ��Ƽ���μ��� / ��Ƽ������(�ڹ�)

// ��Ƽ������ �ۼ� ��� 1.Thread Ŭ������ ��� 

public class Ari extends Thread {
	private String skill;

	public Ari(String key) {
		skill = key;
	}

	//Thread Ŭ������ run() �޼��� �������̵�(������)
	//run() -> ������(�����۾�) �ڵ�
	//������� run() �޼��忡������ ������ �����ϰ� run() ����Ǹ� �����嵵 ����
	//�̶� run()�� �ƹ��ϵ� ���� ���� 
	public void run() {
		System.out.println("�Է� Ű : " + skill);

		for (int i = 1; i <= 3; i++) {
			System.out.println(skill + "��ų ��� �� :" + i + "s");
		}
		System.out.println(skill + "��ų ��� ����  ");
	}

}
