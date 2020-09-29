/*
���� Ǯ�� ������ ^^
�䱸����
īƮ (Cart)
īƮ���� ���忡 �ִ� ��� ������ǰ�� ���� �� �ִ� 
īƮ�� ũ��� �����Ǿ� �ִ� (10��) : 1��  , 2�� ���� �� �ְ� �ִ� 10������ ���� �� �ִ�
���� ������ ���� �ϸ� ... īƮ�� ��´�
���뿡 ���� ��ü ���
������� �ʿ�
summary() ��� �߰��� �ּ���
����� ������ �����̸� �� �������� ����
�� �����ݾ� ��� ���
hint) īƮ ������ ��� ���� (Buy() �Լ��ȿ��� cart  ��� ���� ���� )
hint) Buyer ..>> summary()  main �Լ����� ����Ҷ�
�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�
*/

class Product2{
	int price;
	Product2(int price){
		this.price = price;
	}
}

class Aircon extends Product2{
	Aircon(){
		super(500);
	}

	@Override
	public String toString() {
		return "Aircon";
	}
	
}

class Fan extends Product2{
	Fan(){
		super(100);
	}
	@Override
	public String toString() {
		return "Fan";
	}
	
}

class DryCleaner extends Product2{
	DryCleaner(){
		super(150);
	}
	@Override
	public String toString() {
		return "DryCleaner";
	}
	
}


class Buyer2{
	

	Product2[] cart;
	int money;
	int buynumber = 0;
	int sum = 0;

	
	Buyer2(){
		this.money = 1000;
		cart = new Product2[10];
	}
	
	Buyer2(int money){
		this.money = money;
		cart = new Product2[10];
	}
	
	void Buy(Product2 n) { //�Լ��� ��ǰ ��ü�� �ּҸ� parameter�� �޾ƾ� ��ǰ�� ���ݰ� ����Ʈ�� �� �� �ִ�.
		if(this.money<n.price) {
			System.out.println("���� �ܾ��� �����մϴ� [�ܾ�]: " + this.money);
			return; //�Լ�����(�������� ����)
		}
		if(this.cart.length==this.buynumber) {
			System.out.println("���� īƮ�� ������ �����մϴ�. īƮ�� ���� �� �ִ� ��ǰ�� ����: "+this.cart.length);
			return;
		}
		//�Ǳ�������
		cart[this.buynumber++]= n;
		this.money -= n.price; //�ܾ�����

		System.out.println("������ ������: " + n);
		

		
	}
//	���뿡 ���� ��ü ���
//	������� �ʿ�
//	summary() ��� �߰��� �ּ���
//	����� ������ �����̸� �� �������� ����
//	�� �����ݾ� ��� ���
	void Summary() {
		for(int i=0;i<this.buynumber;i++) {
			System.out.println("������ �����̸�: "+cart[i]+" "+cart[i].price);
			sum += cart[i].price;			
		}
		System.out.println("�ѱ��� ����: "+ this.buynumber +" ����: "+ this.sum);
	}
	
}


public class Ex13_Inherit_KeyPoint {

	public static void main(String[] args) {

		DryCleaner dry = new DryCleaner();
		Fan fan = new Fan();
		Aircon aircon = new Aircon();
		Buyer2 buyer = new Buyer2(10000);
		
			
		buyer.Buy(dry);
		buyer.Buy(dry);
		buyer.Buy(dry);
		buyer.Buy(dry);
		buyer.Buy(dry);
		buyer.Buy(dry);
		buyer.Buy(dry);
		buyer.Buy(dry);
		buyer.Buy(dry);
		buyer.Buy(dry);
		buyer.Buy(dry);
		buyer.Buy(dry);
		
		buyer.Summary();
	}

}
