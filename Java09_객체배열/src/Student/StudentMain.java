package Student;

public class StudentMain {

	public static void main(String[] args) {

		// 1. Student ��ü �迭 ���۷��� ���� ����, �������� ����
		Student[] std_arr;

		// 2. 2���� Student ��ü�� �������� ������ �� �ִ� ���۷��� �迭 ����
		std_arr = new Student[2];

		// 3. �� �ε����� ��ü ������ ����
		// 3-1. ������ Student ��ü�� �������� �ٷ� 0�� �ε����� �Ҵ�
		std_arr[0] = new Student();

		// 3-2. ��ü ���� �� ������ ����� �������� 1�� �ε����� �Ҵ�
		Student std2 = new Student();
		std_arr[1] = std2;

		// => ���� ������ ������ ����

		// 4. ������ �� ��ü�� �� �ʱ�ȭ
		// std_arr[0] : std_arr ������ ������ �ִ� ������ ������
		// ���۷��� �迭�� ã�ư��� ���߿��� 0�� �ε����� ����Ǿ� �ִ� Student
		// ��ü �������� ������ �ش� ��ü�� ã�ư�
		std_arr[0].setName("�����");
		std_arr[0].setBan(1);
		std_arr[0].setNum(10);

		std_arr[1].setName("�ں���");
		std_arr[1].setBan(2);
		std_arr[1].setNum(20);

		System.out.println(std_arr[0].getName());
		System.out.println(std_arr[0].getBan() + "��");
		System.out.println(std_arr[0].getNum() + "��");

		for (int i = 0; i < std_arr.length; i++) {
			System.out.println(std_arr[i].toString());
		}

	}

}
