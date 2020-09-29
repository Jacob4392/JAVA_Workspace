/*
 * 클래스는 설계도이다, 타입이다.
 * 클래스 == 설계도 == 타입
 * 클래스는 구체화를 통해서 사용가능하다(집을 짓는 행위)
 * 프로그램 세계에서는 new라는 연산자를 통해서 memory를 만든다 >> 만든 것을 (객체 : 인스턴스)라고 한다.
 * 
 * 설계도 2가지로 구별됨
 * 
 * 1. main 함수를 가지는 설계도 >> 독자적인 실행이 가능한 클래스
 * >> java Ex04_Ref_Type >> 실행 된다는 의미
 * 2. main 함수가 없는 설계도 >> 도움을 주는 역할 >> 라이브러리(lib)
 * 
 * 
 * 
 * 
 */


class Apt2{
	int door = 10; //member field, instance variable ...
	int window = 20;
	
}



public class Ex04_Ref_Type {

	public static void main(String[] args) {
		//Apt2 -> 설계도 >> 구체화 >> 메모리에 올려야 >> new 연산자 이용(유일한 방법)
		//클래스의 초기화(주소값을 갖게 하는 것) >>메모리에 올리는 것
		Apt2 lgapt = new Apt2(); // Apt2 참조타입
		//lgapt(참조변수, 객체변수(주소를 가지고 있는 변수))
		System.out.println("lgapt: "+ lgapt); //Apt2 + @ + 15db9742
		
		Apt2 ssapt = lgapt; //할당도 주소를 가지게 하는 방법(초기화하는 방법 중에 하나)
		ssapt.door = 1000;
		
		System.out.println(lgapt.door);
		

	}

}
