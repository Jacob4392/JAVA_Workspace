/*
문제 풀어 보세요 ^^
요구사항
카트 (Cart)
카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개  , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다

계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력

hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart  담는 것을 구현 )
hint) Buyer ..>> summary()  main 함수에서 계산할때

구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다
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
			System.out.println("금액이 모자랍니다. 잔액: "+this.money);
			return;
		}
		if(this.index == this.cart.length) {
			System.out.println("카트에 물건이 가득 찼습니다. 물건 담은 개수 "+this.cart.length);
			return;
		}
		
		//실구매행위
		this.cart[this.index++] = n;
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println(n + "을 구매하셨습니다.");
		
		
	}
	
	
	void Summary() {
		System.out.println("-----------------------------");
		System.out.println("\t 구매한 물건 \t가격");
		for(int i=0;i<this.index;i++) {
			this.pricesum += cart[i].price;
			System.out.println("\t+     "+this.cart[i]+"\t"+this.cart[i].price);
		}
		System.out.println("-----------------------------");
		System.out.println("총 구매개수:      " + this.index +" 총 합계: " + this.pricesum);
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
