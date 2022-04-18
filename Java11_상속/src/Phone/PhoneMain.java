package Phone;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		FolderPhone p2 = new FolderPhone();
		SmartPhone p3 = new SmartPhone();
		
		p1.call();
		p2.call();
		
		// SmartPhone Ŭ������ call() ���� �������� �ʾ�����
		// Phone Ŭ������ ��ӹ޴� �͸����ε� Call()�� ��� �� ���� ����
		// SmartPhone call() -> "�Ƿη�" -> �������̵� // �θ��� ����� ���� �ٸ��� ����ϰ� ������
		p3.call();
		
		// ����Ŭ���� �ۼ��� �޼���� ����Ŭ�������� ��� �Ұ���
		//p1.internet();
		
		System.out.println(p1.getSpeaker());
		System.out.println(p3.getSpeaker());
		
	}

}
