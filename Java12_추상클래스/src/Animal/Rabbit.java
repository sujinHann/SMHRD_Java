package Animal;

public class Rabbit extends Animal {
	//�ʵ� : ��, ��
	//�޼��� : �����̴�, �����ϴ�, �ٴ�
	
	public void jump() {
		System.out.println("�䳢�ٴ�");
	}
	
	
	@Override
	public void move() {
		System.out.println("�䳢������");
		
	}

	@Override
	public void attack() {
		System.out.println("�䳢����");
		
	}
	

}
