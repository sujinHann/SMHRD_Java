package Person;

public class PersonMain {

	public static void main(String[] args) {

		Student s1 = new Student("�����");

		System.out.println(s1.getName());
		System.out.println(s1.stdId);

		s1.walk();

		// ��ĳ���� : ����Ŭ������ ��ü�� ����Ŭ������ ����ȯ(�ڵ�) �ϴ� ��
		// ��ĳ������ �Ǿ��� ���� �� �� ����(����Ŭ����)�� ��ü �ɹ�����
		// ���� �� �� ���� ��, �������̵� �� ��쿡�� ����Ŭ���� �޼��� ȣ��

		Person p = s1; // s1�� p�� ��ĳ���� �� ���� (�θ� �� ����)
		p.walk(); // ������ ������ �������� // �������̵� �� ����
		// System.out.println(p.stdId);

		Student p1 = new Student("���̾�");
		Teacher p2 = new Teacher("����ġ");
		// ���� Ÿ���� �ٸ��� ������ �迭�̳� ������ ���� �� ����
		// Student, Teacher -> ��� Person

		Person ps1 = p1;
		Person ps2 = p2;

		Person[] p_arr = new Person[2];

		p_arr[0] = ps1;
		p_arr[1] = ps2;

		for (Person person : p_arr) {
			person.walk();
		}

		// ��ĳ���� �� ���¿��� ���� � Ÿ���̾����� �˰� ���� �� ����ϴ� ������
		// ->instanceof -> true / false
		System.out.println(ps1 instanceof Student); // true
		System.out.println(ps1 instanceof Teacher); // false

		// �ٿ�ĳ���� : ��ĳ���õ� ��ü�� ���� Ÿ������ �ٽ� �ǵ����� ��
		// ����� ����ȯ
		Student p3 = (Student) ps1;
		System.out.println(p3.stdId);

	}

}
