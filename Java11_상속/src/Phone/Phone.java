package Phone;

public class Phone {

	// field(�Ӽ�) : ����Ŀ, ���콺
	// method(���) : ��ȭ�ϴ�, �����ϴ�

	private String speaker = "�Ｚ";
	private boolean mic;

	public void call() {
		System.out.println("������");
	}

	// ������
	public Phone(String speaker) {
		this.speaker = speaker;
	}

	public Phone() {
		
	}

	public void message() {
		System.out.println("����");
	}

	public String getSpeaker() {
		return speaker;
	}

}




