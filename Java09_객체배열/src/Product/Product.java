package Product;

public class Product {
	
	// 1. �ʵ�(�Ӽ�) ����
	private String name;
	private int unitPrice;
	private int amount;
	
	
	//�޼���(������ ����)
	public Product(String name, int unitPrice, int amount) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
		
	}
	
	public String getName() {
		return name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public int getAmount() {
		return amount;
	}
	
	

}
