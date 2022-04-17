package Product;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� �Է�: ");
		int count = sc.nextInt(); // �迭�� ����

		Product[] goods = new Product[count];

		for (int i = 0; i < goods.length; i++) {

			System.out.print((i + 1) + ") ���� �̸�: ");
			String name = sc.next();

			System.out.print((i + 1) + ") �ܰ�: ");
			int unitPrice = sc.nextInt();

			System.out.print((i + 1) + ") ����: ");
			int amount = sc.nextInt();

			goods[i] = new Product(name, unitPrice, amount);

			System.out.println();
		}

		System.out.println("��ǰ��\t�ܰ�\t����");
		int total = 0; // �� �ݾ�
		
		for(int i = 0; i<goods.length; i++) {
			System.out.printf("%s\t%d\t%d\n", goods[i].getName(), goods[i].getUnitPrice(), goods[i].getAmount());
			total += goods[i].getUnitPrice()*goods[i].getAmount();
			
		}
		System.out.print("�� �ݾ�: " + total + "��");
	}

}
