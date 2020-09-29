package kr.or.bit;

/*


[모든 카드의 높이와 너비는 동일]

 */


public class Card {
	public int number;
	public String kind;
	
	//public int h = 50;
	//public int w = 20;
	public static int h = 50;
	public static int w = 20;
	
	//기능(카드의 정보 확인)
	public void cardInfo() {
		System.out.printf("번호: %d, 모양: %s. h:%d, w:%d, \n",number, kind, h,w);
	}
}
