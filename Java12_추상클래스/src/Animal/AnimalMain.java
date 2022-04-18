package Animal;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		
		Lion lion = new Lion(); // ���̾� ��ü ����
		Rabbit rabbit = new Rabbit(); // �䳢 ��ü ����
		
		//�߻�Ŭ������ ��ü ���� �Ұ���
		//�߻�Ŭ������ ��� �����޾� ����ϰ� ������ �Ǵ�
		//�߻�޼��带 ������ �������ؾߵȴٰ� ������ �ο� �� �� ���
		//new Animal(); << �ȵ�
		
		lion.attack();
		rabbit.attack();
		
		Animal a1 = lion; // ��ĳ����: ����(��) -> ����(ū) => �ڵ�����ȯ
		Animal a2 = new Lion();
		Animal a3 = rabbit;
		
		ArrayList<Animal> al = new ArrayList<Animal>();
		al.add(a1);
		al.add(new Lion());
		al.add(a3);
		
		for(Animal a:al) {
			a.move();
		}
		
		//��ĳ������ �� ��쿡�� ��� ����� ������ �� ����
		//����Ŭ������ �ɹ����� ���ٰ���
		//��, ����Ŭ�������� �������̵� �� ��쿡�� ����Ŭ���� �޼��� ȣ��
		//a1.sleep();
		//��ĳ���õ� ��ü�� �������·� �����ִ°� -> �ٿ�ĳ����(���������ȯ)
		Lion l  = (Lion)a1;
		l.sleep();
		

	}

}
