package Phone;

// ��� : class Ŭ���� �̸� extends ���� Ŭ���� �̸�
// -> ����Ŭ������ ��ӹ޾Ƽ� ���ο� Ŭ���� �ۼ�
// -> ����Ŭ������ �ʵ�/�޼��带 ���� Ŭ������ ���� �������� �ʾƵ� ����� �� ����
public class SmartPhone extends Phone {
	// field(�Ӽ�) : (����Ŀ, ����ũ) -> Phone, ī�޶�
	// method(���) : (��ȭ�ϴ�, �����ϴ�) -> Phone, ���ͳ��ϴ�

	String camera;
	
	// SmartPhone�� ������ �� �� speaker �ʵ� ���� �ʱ�ȭ(LG)
	public SmartPhone() {
		super("LG"); // ����Ŭ������ ������ ȣ��
		//���Ǿ��ϸ� ����Ŭ������ �⺻������ ȣ��
		//super.mic
		
		//super.message(); // �θ� �ν��Ͻ��� ����
		//this.message(); // ���� ������ �ν��Ͻ��� ���� / this�� �� ū ���� 
	}

	public void internet() {
		System.out.println("���ͳ� ����!");
	}

	public String getSpeaker() {
		//super: �θ� �ɹ�(�ʵ�,�޼���) ȣ�� 
		return super.getSpeaker() ;
	}
}
