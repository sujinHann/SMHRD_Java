package Thread;

public class Ari2 extends Thread {
	private String skill;

	public Ari2(String key) {
		skill = key;
	}

	public void run() {
		System.out.println("�Է� Ű : " + skill);

		for (int i = 1; i <= 3; i++) {
			System.out.println(skill + "��ų ��� �� :" + i + "s");
		}
		System.out.println(skill + "��ų ��� ����  ");
	}

}
