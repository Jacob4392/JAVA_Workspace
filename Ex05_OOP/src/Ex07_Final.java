/*
 	변수 <-> 상수
 	상수: 한 번 값이 정해지면(초기화되면) 변경불가하다
 	상수자원: 고유값(주민번호), 수학:PI=3.14..., 버전번호, 시스템 관리번호
 	상수는 관용적으로 [대문자]를 쓴다
 
 	java: final int NUM = 10;
 	C#: const integer NUM = 10;
 	
 	final 키워드
 	클래스 앞에>>final class Car{} >> final Math >> 상속 금지
 	함수앞에>> public final void print(){} >> 상속관계에서 >> 재정의 금지(오버라이드 금지)
 			 public static final void print() >> 객체간 공유함수
 
 */

class Vcard{
	final String KIND = "heart";
	final int NUM = 10;
	void method() {
		System.out.println(Math.PI);
	}
}


class Vcard2{ //설계도를 제작할 때 상수에 대해서는 초기화를 보장시켜주어야 함(주로 생성자 쪽에서)
	final String KIND;
	final int NUM;
	
	/*
	Vcard2(){
		this.KIND = "heart";
		this.NUM = 10;
	}
	*/
	
	Vcard2(String kind, int num){ //카드 53장의 모양과 숫자는 다르다(한번 정해지면 변경불가)
		this.KIND = kind;
		this.NUM = num;
	}

	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
	
	
	
}


public class Ex07_Final {
	public static void main(String[] args) {
		Vcard v = new Vcard();
		//v.KIND = "AAA";
		v.method();
		
		Vcard2 v1 = new Vcard2("spade",1);
		System.out.println(v1.toString());
		
		Vcard2 v2 = new Vcard2("spade",2);
		System.out.println(v2.toString());
		
		Vcard2 v3 = new Vcard2("spade",3);
		System.out.println(v3.toString());
		
		//v3.KIND = "aaa";(x)
		
	}

}
