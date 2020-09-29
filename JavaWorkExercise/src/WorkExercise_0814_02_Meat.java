import java.util.Scanner;



/*
 요구사항
정육점(현금결제)

​
1.정육점에 소고기, 양고기, 돼지고기가 있습니다
2.고기종류당 가격이 책정되어있습니다. 할인은 불가하다. 
3.근당 소고기 10000원 ,돼지고기 5000원, 양고기 3000원
4.판매자는 당일 판매하는 고기의 양을 사입해왔습니다. 
(소고기 20근 ,양고기 10근 , 돼지고기 5근)
5.판매자가 가게를 오픈하며 보유한 예산은 50만원이다. 
6.판매자는 고기를 팔고나면 매출을 산한다. 
7.구매자는 총예산이 10만원입니다. 
8.구매자는 고기를 선택하고 몇근 살지 주문한다. 
9.구매자는 고기를 사고 남은 예산을 계산한다.

*/


class Buyer{
	Scanner scan = new Scanner(System.in);
	
	private int sellermoney = 500000; //판매자 잔액
	
	private int beefprice = 10000; //소고기 가격
	private int lambprice = 3000; //양고기 가격
	private int porkprice = 5000; //돼지고기 가격
	
	private int beefset; //소고기 근수
	private int lambset; //양고기 근수
	private int porkset; //돼지고기 근수
	
	private int buyermoney = 100000; //구매자 잔액
	
	
	
	public int getBeefprice() {return beefprice;}

	public int getLambprice() {return lambprice;}

	public int getPorkprice() {return porkprice;}


	public int getBeefset() {return beefset;}

	public int getLambset() {return lambset;}

	public int getPorkset() {return porkset;}
	
	
	public int getSellermoney() {return sellermoney;}
	public void setSellermoney(int sellermoney) {
		if(sellermoney < 0) return;
		this.sellermoney += sellermoney;
	}
	public int getBuyermoney() {return buyermoney;}
	public void setBuyermoney(int buyermoney) {
		if(buyermoney < 0) return;
		this.buyermoney += buyermoney;
	}
	
	
	
	public void buyMeet() {
		
		System.out.println("고기종류 선택: 1.beef 2.lamb 3.pork"); //고기종류 입력
		int meatname = Integer.parseInt(scan.nextLine());
		System.out.println("근수: ");							//근수입력
		int set = Integer.parseInt(scan.nextLine());
		
		if(meatname == 1 && beefprice * set <= buyermoney) { //소고기
			if(set<=20 && set>=0) {
					sellermoney -= beefprice * set;
					buyermoney -= beefprice * set;
					beefset += set;
			}else System.out.println("재고가 모자랍니다.");
			
		}else if(meatname == 2 && lambprice * set <= buyermoney) { //양고기
			if(set<=10 && set >=0) {
					sellermoney -= lambprice * set;
					buyermoney -= lambprice * set;
					lambset += set;
			}else System.out.println("재고가 모자랍니다.");
			
		}else if(meatname == 3 && porkprice * set <= buyermoney) { //돼지고기
			if(set<=5 && set >=0) {
					sellermoney -= porkprice * set;
					buyermoney -= porkprice * set;
					porkset += set;
			}else System.out.println("재고가 모자랍니다.");
		}else {
			System.out.println("금액이 모자랍니다.");
		}
	}
	
	
	public void sellerInfo() { //구매정보 //잔액정보
		System.out.println("구매자의 돈: "+buyermoney);
		System.out.println("판매자의 돈: "+sellermoney);
		System.out.printf("소고기 가격: %d, 양고기 가격: %d, 돼지고기 가격: %d \n",beefprice,lambprice,porkprice);
		System.out.printf("구매한 beef근수: %d, sheep근수: %d, pork근수: %d \n",beefset,lambset,porkset);
	}
	
}


public class WorkExercise_0814_02_Meat {
	public static void main(String[] args) {
		Buyer buy = new Buyer();
		buy.sellerInfo();

		while(buy.getBuyermoney()>=3000) { 
			 buy.buyMeet();
			 buy.sellerInfo();
		}
		System.out.println("프로그램 종료");
	}

}
