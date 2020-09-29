import java.util.ArrayList;

/*
 	자바 8가지 기본타입(값타입) : Java API 제공
 	
 	8가지 기본 타입에 대해서 객체 형태로 사용가능하도록 만든 것이 Wrapper class이다.
 	
 	기본타입 대신에 객체 형태 타입을 사용해야 할 때가 있다. >> 제너릭, static자원(문자를 -> 정수, 실수로 바꿀 때)
 	1. 매개변수로 객체가 요구될 때
 	2. 기본형 값이 아닌 객체형태로 저장
 	3. 객체간 값 비교
 	4. 타입 변환시 처리
 */
public class Ex08_Wrapper_Class {
	public static void main(String[] args) {
		int i = 100;
		Integer n = new Integer(500);
		System.out.println("n: "+n); //toString() 재정의, 주소가 아닌 값이 나오도록
		System.out.println(n.MAX_VALUE);
		System.out.println(n.MIN_VALUE);
		
		//Point
		//parameter로 사용될 때
		//제너릭(generic)
		//객체를 생성할 때 타입을 강제하는 방법(Object를 막고 타입을 강제함으로써 캐스팅하는 번거로움을 막기위해)
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(100);
		//li.add("A");
		li.add(200);
		for(int value : li) {
			System.out.println(value);
		}
		
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2==i3); //false 주소값 비교
		System.out.println(i2.equals(i3)); //true
		
		//equals는 Object것
		//String 클래스 equals 재정의
		//Interger 클래스 equals 재정의 (실제 값을 비교하도록)
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4==i5); //true
		
		Integer t = new Integer(500);
		integerMethod(t); //t라는 참조변수의 [주소값]을 받음
		intMethod(t); //t라는 참조변수가 가지고 있는 [값]을 받음
		
		
		
		
	}
	static void integerMethod(Integer i) {
		System.out.println("integer param: "+ i);//toString() 재정의
		System.out.println(i.MAX_VALUE);
	}
	
	static void intMethod(int i) {
		System.out.println("int param: "+i);
	}

}
