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
	
	void Buy(Product2 n) { //함수가 제품 객체의 주소를 parameter로 받아야 제품의 가격과 포인트를 알 수 있다.
		if(this.money<n.price) {
			System.out.println("고객님 잔액이 부족합니다 [잔액]: " + this.money);
			return; //함수종료(구매행위 종료)
		}
		if(this.cart.length==this.buynumber) {
			System.out.println("고객님 카트의 공간이 부족합니다. 카트에 담을 수 있는 물품의 개수: "+this.cart.length);
			return;
		}
		//실구매행위
		cart[this.buynumber++]= n;
		this.money -= n.price; //잔액정보

		System.out.println("구매한 물건은: " + n);
		

		
	}
//	계산대에 가면 전체 계산
//	계산기능이 필요
//	summary() 기능 추가해 주세요
//	당신이 구매한 물건이름 과 가격정보 나열
//	총 누적금액 계산 출력
	void Summary() {
		for(int i=0;i<this.buynumber;i++) {
			System.out.println("구매한 물건이름: "+cart[i]+" "+cart[i].price);
			sum += cart[i].price;			
		}
		System.out.println("총구매 개수: "+ this.buynumber +" 총합: "+ this.sum);
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
