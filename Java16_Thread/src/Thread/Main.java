package Thread;

public class Main {

	public static void main(String[] args) {
	
		
		String[] key = {"Q", "W", "E"};
		
		for(int i=0; i<key.length; i++) {
			Blitzcrank b = new Blitzcrank(key[i]);
			b.run();
		}
		
		System.out.println("=========================");
		for(int i=0; i<key.length; i++) {
			Ari a = new Ari(key[i]);
			//start()�޼ҵ带 ȣ���ϸ� �����带 ���۽�Ŵ
			//�����尡 ������ �����ϵ��� �ϱ� ���ؼ��� �� start() �޼��带 ȣ���ؾ���!
			//start()�޼ҵ�� ����� �������̵� �ϸ�ȵ�
			
			//start() : ������ ������ ��ü�� �����ٸ��� ������ ���·� ��ȯ�ϵ��� JVM���� ����
			// �����ٸ� : �޸𸮿� ����� ���α׷��� CPU(������ġ)�� ������ �� �ֵ��� �ü���� �����忡�� CPU�Ҵ�
			//�����ٸ��� ���ؼ� �ش� �����尡 �����̵Ǹ� JVM�� ���ؼ� run() �޼��尡 ȣ��Ǿ� ������ �� 
			a.start();
		}
		
		System.out.println("=========================");
		for(int i=0; i<key.length; i++) {
			Thread thread = new Thread(new Ari2(key[i]));
			thread.start();
		}
		

	}

}
