package kr.or.bit;
/*
Tv 설계도 요구사항 정의
Tv는 채널 정보를 가지고 있다(예를들면 1~200 값을 가질 수 있다)
Tv는 브랜드 이름을 가지고 있다(예를 들면 엘지, 삼성)
Tv는 채널 전환 기능을 가지고 있다(채널은 한 채널씩 이동이 가능하다)
-> 채널을 증가시키는 기능을 가지고 있다
-> 채널을 감소시키는 기능을 가지고 있다
*/





public class Tv {
	public int ch; //default = 0
	public String brandname; //default = null

	public void ch_Up() {
		ch++; //하나의 메소드는 하나의 기능을 담당한다
	}
	
	public void ch_Dowm() {
		ch--;
	}
	
	//요구사항에 대한 정보를 설계해보는 연습을 하자
	//채널 정보, 브랜드 이름 출력하는 기능
	public void TvInfor() {
		System.out.printf("[%s],[%d]\n",brandname, ch);
	}
	
}
