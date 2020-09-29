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



class Product{
	int price;
	int bonuspoint;	
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price /10);;
	}
	
}

class Tv extends Product{
	Tv(){
		super(500);
	}
	
	@Override
	public String toString() {
		return "Tv";
	}
	
	
	
}

class Audio extends Product{
	Audio(){
		super(300);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
	
}

class Oven extends Product{
	Oven(){
		super(250);
	}
	
	@Override
	public String toString() {
		return "Oven";
	}
	
}


class Buyer2{
	int money;
	int bonuspoint;
	Product[] cart;
	int index = 0;
	int pricesum;
	
	Buyer2(){
		this(1000);
	}
	
	Buyer2(int money){
		cart = new Product[10];
		this.money = money;
	}
	
	void Buy(Product n){
		if(this.money < n.price) {
			System.out.println("�ݾ��� ���ڶ��ϴ�. �ܾ�: "+this.money);
			return;
		}
		if(this.index == this.cart.length) {
			System.out.println("īƮ�� ������ ���� á���ϴ�. ���� ���� ���� "+this.cart.length);
			return;
		}
		
		//�Ǳ�������
		this.cart[this.index++] = n;
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println(n + "�� �����ϼ̽��ϴ�.");
		
		
	}
	
	
	void Summary() {
		System.out.println("-----------------------------");
		System.out.println("\t ������ ���� \t����");
		for(int i=0;i<this.index;i++) {
			this.pricesum += cart[i].price;
			System.out.println("\t+     "+this.cart[i]+"\t"+this.cart[i].price);
		}
		System.out.println("-----------------------------");
		System.out.println("�� ���Ű���:      " + this.index +" �� �հ�: " + this.pricesum);
	}
	
}



public class WorkExercise_0824_01_Inherit_Poly {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Audio audio = new Audio();
		Oven oven = new Oven();
		Buyer2 buyer = new Buyer2();
		
		buyer.Buy(tv);
		buyer.Buy(tv);
		buyer.Buy(tv);
		buyer.Buy(tv);
		buyer.Buy(tv);
		
		buyer.Summary();

	}

}
