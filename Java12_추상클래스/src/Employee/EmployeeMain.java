package Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		TempEmployee te = new TempEmployee("SMHRD001", "��������Ű", 3000);
		RegularEmployee re = new RegularEmployee("SMHRD002", "�����", 4000, 400);
		PartTimeEmployee pe = new PartTimeEmployee("SMHRD003", "��ġ������", 10, 20);

		System.out.println(te.print());
		System.out.println(re.print());
		System.out.println(pe.print());
		
		//��ĳ����(�ڵ�����ȯ)
		Employee e1 = te;
		Employee e2 = re;
		Employee e3 = pe;
		
		Employee[] emp_arr = new Employee[3];
		emp_arr[0] = te; // TempEmployee�� Employee Ÿ������ �ڵ�����ȯ(��ĳ����) �Ȼ��·� �������� �Ҵ�
		emp_arr[1] = re;
		emp_arr[2] = pe;
		
		
		
		
		
	}

}
