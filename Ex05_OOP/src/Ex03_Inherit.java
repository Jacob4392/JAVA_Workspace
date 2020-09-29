//두개의 설계도
class Tv{ //
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
	
	
}

class Vcr{ //
	boolean power;
	void power() {
		this.power = !this.power;
	}
	
	void play() {
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정지하기");
	}
	
	void rew() {}
	void ff() {}
	
}

//Tv 설계도
//Vcr 설계도

//TvVcr 라는 제품을 만들기
//상속, 포함

//class TvVcr extends Tv,Vcr 다중상속 금지
//계층적 Vcr extends Tv, TvVcr extends Vcr(자원들의 이름이 충돌발생)

//class TvVcr{Tv t; Vcr v;}
//class TvVcr extends Tv{Vcr v;}
//기준: 주기능: 메인기능: 비중이 높은 클래스 >> 상속, >> 나머지 포함


class TvVcr extends Tv{ //일체형
	Vcr vcr;
	TvVcr(){
		vcr = new Vcr();
	}
}



public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println("tv전원: "+t.power);
		t.chUp();
		System.out.println("tv채널정보: "+t.ch);
		t.vcr.power();
		System.out.println("vcr전원: "+t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power();
		t.power();
		System.out.println("tv전원: "+t.power);
		System.out.println("vcr전원: "+t.vcr.power);
		
	}

}
