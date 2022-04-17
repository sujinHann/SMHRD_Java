package BookData;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		// �Է� ����
		Scanner sc = new Scanner(System.in);

		// book data �� ��� ArrayList ���� �غ��� -> bd
		ArrayList<BookData> bd = new ArrayList<BookData>();

		int select = 0;

		while (true) {
			System.out.print("1)å �߰� 2)å ���� 3)���� �� �� �ִ� å 4)���� >> ");

			select = sc.nextInt();

			if (select == 1) {

				System.out.print("å �̸�: ");
				String title = sc.next();
				System.out.print("����: ");
				int price = sc.nextInt();
				System.out.print("�۰�: ");
				String writer = sc.next();

				bd.add(new BookData(title, price, writer));

			} else if (select == 2) {
				for (int i = 0; i < bd.size(); i++) {
					System.out.printf("%d. %s\t%d\t%s\n", (i + 1), bd.get(i).getTitle(), bd.get(i).getPrice(),
							bd.get(i).getWriter());
				}
				System.out.print("���� �ϰ� ���� å>>");
				int del_select = sc.nextInt();

				bd.remove(del_select - 1);

			} else if (select == 3) {
				System.out.print("�ݾ��� �Է��Ͻÿ�: ");
				int money = sc.nextInt();

				for (int i = 0; i < bd.size(); i++) {
					if (money >= bd.get(i).getPrice()) {
						System.out.printf("%d. %s\\t%d\\t%s\\n", (i + 1), bd.get(i).getTitle(), bd.get(i).getPrice(),
								bd.get(i).getWriter());
					}
				}

			} else if (select == 4) {
				// ���α׷��� ����
				System.out.println("����");
				break;

			}

		}

	}

}

