package EPoketmon;

public interface EPoketmon {

	// �������̽� ������ ����� ���� ����(final)
	// ����� ������ ���� �� �� �ʱ�ȭ ���������
	final String type = "����";
	int level = 1; // ���
	// �������̽� ������ ���������� �Ұ����ϱ� ������ final Ű���� �Ⱥٿ���
	// ����� ���� (�ʱ�ȭ�� ���������)

	// �������̽� �������� �߻�޼ҵ常 ���𰡴�
	public abstract void attack();

	public void moving();
	// abstract Ű���带 ������ �ʾƵ� �߻�޼ҵ�� �����

	// Java8���� �̻���ʹ� �Ϲݸ޼ҵ�� ���𰡴�
	// (default, static)
	// default : ���������ڰ� �ƴ϶� �������̽������� �Ϲݸ޼ҵ带 ������ �� �ְ� ���ִ� Ű����
	public default void hello() {
		System.out.println("�ȳ�");
	}

	public static void hello1() {
		System.out.println("�ȳ�1");
	}

}
