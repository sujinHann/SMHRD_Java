package EPoketmon;

public class Main {

	public static void main(String[] args) {
		// ��ü ����
		
		//EPoketmon e = new Epoketmon(); -> �������̽��� ��ü ���� �Ұ��� 
		
		Pikachu p = new Pikachu();
		Coil c = new Coil();
		
		EPoketmon e1 = p; // ��ĳ����(�ڵ�����ȯ)
		EPoketmon e2 = c; // ��ĳ����
		
		EPoketmon[] e_arr = new EPoketmon[2];
		
		e_arr[0] = p; // ��ī�� -> �������ϸ����� ��ĳ����(�ڵ�����ȯ)
		e_arr[1] = c;
		
		
		
		
	}

}
