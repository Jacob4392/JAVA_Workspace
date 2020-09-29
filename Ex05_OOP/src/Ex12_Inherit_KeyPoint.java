/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은  제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다
 
시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원  , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은  감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다




*/

class Product{
	int price;
	int bonuspoint;
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price / 10.0);
	}
}

class KtTv extends Product{
	KtTv(){
		super(500);
	}
//	KtTv(int price){
//		super(price);
//	}
	
	@Override
	public String toString() {
		return "KtTv";
	}
	
}

//KtTv tv = new KtTv();

class Audio extends Product{
	Audio(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio";
	}
	
}


class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
	
}


//구매자
class Buyer{
	int money = 1000;
	int bonuspoint;
	
	//구매자는 구매행위를 할 수 있다.
	//구매행위(잔액-제품의 가격, 포인트 정보 갱신)
	//***구매자는 매장에 있는 모든 물건을 구매할 수 있다***
	
	//1차코드
	//물건이 3개, 구매할 수 있는 함수도 3개
	
	
	//1차 오픈
	
	//공식오픈
	//매장에 제품이 1000개 다른 제품이 추가(마우스, 토스트기...)(제품등록은 POS등록 자동화 된다고 가정)
	//매장에 제품이 전시(1000개...)
	//1. 매장에서 구매자가 3개밖에 구매를 못함, 나머지 997개의 제품을 살 수 없음
	//997개의 제품을 구매하는 기능이 없음
	
	// 개발서버 접속 >> 997개의 함수를 만듬...
	//변화에 대응하는 코드를 만들지 않았음
	
	//즐거운 휴가를 보내기 위한 방법을 제시
	//1. 사는 기능을 하나로 통합
	//2.
	//3. 하나의 함수로 모든 구매행위를 할 수 있도록 parameter 설정
	//4.
	//중복제거
	
	
	
	/*
	void KtTvBuy(KtTv n) { //함수가 제품 객체의 주소를 parameter로 받아야 제품의 가격과 포인트를 알 수 있다.
		if(this.money<n.price) {
			System.out.println("고객님 잔액이 부족합니다" + this.money);
			return; //함수종료(구매행위 종료)
		}
		//실구매행위
		this.money -= n.price; //잔액정보
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건은: " + n.toString());
	}
	
	void AudioBuy(Audio n) { //함수가 제품 객체의 주소를 parameter로 받아야 제품의 가격과 포인트를 알 수 있다.
		if(this.money<n.price) {
			System.out.println("고객님 잔액이 부족합니다" + this.money);
			return; //함수종료(구매행위 종료)
		}
		//실구매행위
		this.money -= n.price; //잔액정보
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건은: " + n.toString());
	}
	
	void NoteBookBuy(NoteBook n) { //함수가 제품 객체의 주소를 parameter로 받아야 제품의 가격과 포인트를 알 수 있다.
		if(this.money<n.price) {
			System.out.println("고객님 잔액이 부족합니다" + this.money);
			return; //함수종료(구매행위 종료)
		}
		//실구매행위
		this.money -= n.price; //잔액정보
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건은: " + n.toString());
	}
	*/
	
	
	//2차개선 (리팩토링 refactoring)
	//하나의 이름으로 여러가지 기능(method overloading) >> Buy()
	//2차구매
	
	//3차개선
	//제품이 추가되더라도 구매행위 계속할 수 있다
	//하나의 이름을 사용할 수 있고, 중복코드 제거됨
	//모든 제품이 Product를 상속하고 있기 때문에 (부모)
	//Product p;
	//Audio audio = new Audio;
	//p = audio;
	
	
	void Buy(Product n
			) { //함수가 제품 객체의 주소를 parameter로 받아야 제품의 가격과 포인트를 알 수 있다.
		if(this.money<n.price) {
			System.out.println("고객님 잔액이 부족합니다" + this.money);
			return; //함수종료(구매행위 종료)
		}
		//실구매행위
		this.money -= n.price; //잔액정보
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건은: " + n.toString());
	}
	
	
	
}




public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {
		KtTv tv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		
		Buyer buyer = new Buyer();
		buyer.Buy(tv);
		buyer.Buy(notebook);
		buyer.Buy(audio);
		buyer.Buy(tv);

	}

}
