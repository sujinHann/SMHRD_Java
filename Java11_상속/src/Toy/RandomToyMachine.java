package Toy;

import java.util.ArrayList;
import java.util.Random;

public class RandomToyMachine {
	
	//�ʵ� : arraylist, random
	//�޼��� : �峭�� �߰�, ���� �̱�
	
	ArrayList<Toy> al = new ArrayList<Toy>();
	Random rd = new Random();
	
	public void addToy(Toy toy) {
		al.add(toy); // ������ �ӽ� �ν��Ͻ��� al �ʵ忡 �峭�� �߰�
	}
	
	public Toy getToy() {
		//0~2 �ε��� �� �������� �ϳ� ����
		// int ran = rd.nextInt(al.size());
		// return al.get(ran); 
		
		return al.get(rd.nextInt(al.size()));
	}

}
