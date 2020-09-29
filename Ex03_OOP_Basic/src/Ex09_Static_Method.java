/*
 1. static method: 설계자가 static 함수를 만든다는 것은 ... 많이 사용하니까 편하게 쓰려고(객체생성없이)
 2. Math m = new Math()(X) -> Math.Random()
 
 
 
 
 */

class StaticClass{
	int iv;
	
	static int cv;
	
	void m() { //일반함수
		//일반함수
		//1. iv 값을 쓸 수 있다
		iv = 100;
		//2. cv 값을 쓸 수 있다 >> 생성시점
		//***static 자원은 항상 일반 자원보다 memory에 먼저 생성된다***
		cv = 200;
		//StaticClass.cv = 200; 가능
		
		
	}
	
	static void sm() {
		//static 함수
		//1. 일반변수 iv 값을 쓸 수 없음(x) (생성시점)
		//iv = 100;(x)
		cv = 500;
		//error를 피하려면 (static끼리)
		
		
	}
	
}


public class Ex09_Static_Method {

	public static void main(String[] args) {
		StaticClass.sm();
		System.out.println(StaticClass.cv);
		
		//일반자원(객체)
		StaticClass sc = new StaticClass();
		sc.m();
		System.out.println(sc.iv);
		System.out.println(sc.cv);
		
		//static 함수는 일반변수를 쓸 수 없고, 일반함수은 static 변수를 쓸수 있음

	}

}
