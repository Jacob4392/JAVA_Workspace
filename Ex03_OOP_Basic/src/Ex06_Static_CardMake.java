import kr.or.bit.Card;

public class Ex06_Static_CardMake {

	public static void main(String[] args) {
		//Card 53장 제작
		//메모리에 올리는 작업
		/*
		Card c = new Card();
		c.number = 1;
		c.kind="heart";
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind="heart";
		c2.cardInfo();
		*/
		//53 카드를 new를 통해서 만들었어요
		//클라이언트 .. 크기 변경 요구..
		//현실세계 다시 찍어야 합니다
		//프로그램 세계 변경가능 h=70, w=50
		
		//1. 한 장씩 수정한다
		//c.h=70;
		//c.w=50; (x53)
		
		//2. 설계도 변경(기존 것 버리는 것)
		//다시 제작
		
		//3. static
		//높이와 너비를 따로 관리
		Card c = new Card();
		c.number = 1;
		c.kind="heart";
		c.h=70;
		c.w=50;
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind="heart";
		c2.cardInfo();

	}

}
