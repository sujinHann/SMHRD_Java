package Animal;

public class Cat extends Animal {

	public void groom() {
		System.out.println("�׷����!");
	}

	// �ּ�(annotation) : Ư���� ����� ���� �ּ�
	// �������� �� ������ Ȯ���� �� �ְ�
	@Override
	public void cry() {
		System.out.println("�̾߿�!");
	}

}
