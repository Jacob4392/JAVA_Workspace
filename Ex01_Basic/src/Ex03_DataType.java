/*
  	1. 자바가 제공하는 기본 타입(시스템타입) 자료형 >>8가지
  	2. 8가지 기본타입을 [값을 저장]하는 타입
  	3. 숫자 >> 정수  >> (음의 정수, 0 , 양의 정수) >> byte(-128~127)
  										  >> char(한 문자를 표현하는 타입) >> 'A','가'
  										     >>> 한글 1자 2byte
  										     >>> 영문자, 특수문자, 공백 1byte
  										     >>> 협의 >> char(2byte) (한글, 영문, 특수문자, 공백) 상관없이 한 글자
  										     >>> 국가간 협의(unicode) >>> 아스키코드표
  										     
  										  >> short (c언어와의 호환성 2byte)
  										  >> int(-21억 ~ 21억 : 4byte)*** Java 정수의 연산의 기본 타입
  										  >> long(8byte)
 			>> 실수(부동소수점) 			  >> float(4byte)
 										  >> double(8byte) >>정밀도(표현 범위가 크다) ***Java 실수의 연산의 기본타입***
 		논리 >> 참, 거짓 (true, false)		  >> boolean (프로그램의 논리적인 흐름제어)
 		
 	*** 문자열의 표현 >> "홍길동" , "Hello"
 	String name = "홍길동"; >> String 클래스 타입(참조타입)
 	그럼에도 불구하고 다른 이야기를 하기 전까지 String 문자열을 담을 수 있는 타입
 	int, double 처럼 사용
 	
 	자바는 크게
 	1. 값 타입			: 8가지 기본타입: int i =100;     						-> value type
 	2. 참조타입 (주소값) : 클래스, 배열 : 변수에 값이 저장되는 것이 아니라 주소값 저장(참조값) -> ref type
 * 
 * 
 * 
 */



//class == 설계도 == 타입(Type)
class Car{ //Car Type 이다, Car 설계도이다 >> 구체화된 산물을 만들어야 함 > 객체(메모리)
	String color;
	int window;
	
	
}


public class Ex03_DataType {

	public static void main(String[] args) {
		String str = "홍길동";
		int age = 100;
		
		Car c; //c는 main 함수 안에 있는 지역 변수
		//System.out.println(c); 지역변수 초기화 x
		//c라는 변수의 초기화 >> 주소를 가지게 하는 것 >> new 연산자
		c = new Car();
		
		
		//선언과 초기화
		//참조타입의 초기화 : 주소값 갖는다
		Car c2 = new Car();
		System.out.println(c2.window);
		System.out.println(c2.color);
		c2.color = "blue";
		c2.window = 100;
		System.out.println(c2.window);
		System.out.println(c2.color);
		System.out.println(c.window);
		System.out.println(c.color);
		
		
		int i = 10;
		int j;
		j = 20;
		
		int k;
		k = j; //point [값 할당]
		System.out.println("k:" +k);
		k = 300;
		System.out.println("k:" +k);
		System.out.println("j:" +j);
		
		int p,g,q;
		//이런 경우라면 배열을 쓰는 것이 낫다.
		
		//int(-21 ~ 21)
		//Today Point
		//literal >> 있는 그대로 >> 소스 코드에서 개발자가 직접 입력한 값
		//정수 리터럴: [기본값 defalut: int범위]
		//int P = 1000000000;
		long I = 1000000000L;	//가능
		long l2 = 100;			//가능
		
		//int p2 = 1000000000L; 
		
		//char : 2byte 정수값
		//한 문자를 표현하는 자료형
		//Today Point
		//문자열 : "가", "홍길동" >> String str = "가나다라마바"
		//문자 : 'A' '가' 		 >> char ch = 'A';
		
		char single = '가';
		System.out.println(single);
		char ch = 'A';
		//char 문자를 저장하지만 내부적으로 정수값을 가지고 있다(아스키코드표)
		//casting(타입 변환)
		int intch= 'A'; //내부적으로 자동(암시적) 형 변환
		System.out.println("intch:" +intch);
		System.out.println((int)ch);
		
		char ch2 ='a';
		System.out.println(ch2);
		int intch2 = (int)ch2;
		System.out.println(intch2);
		
		int intch3 = 65;
		char ch3 = (char)intch3;
		System.out.println(intch);
		//속지말자 [값을 보지 말고 값이 가지는 타입을 보자]
		//강제적 형변환 (명시적 형변환)
		//Key Point : 65라는 숫자가 char 타입 속하는 경우 (데이터 손실 없이 할당)
		//int intch3 = 99999999;
		// 큰 것을 작은 것으로 강제[데이터 손실]
		
		int intch4 =  ch3; //형변환 .. 자동으로 컴파일러
		System.out.println(intch4);
		//자동형변환
		//int intch4 = (int)ch3 컴파일러가 코드 재생산
		
		
		/*
		 * Today Point
		 * 1. 할당에서 변수가 가지고 있는 값을 보지 말고 변수의 타입을 보자
		 * 2. 변수의 타입 크기를 확인하자.
		 * 3. 큰 타입에는 작은 타입을 넣을 수 있다.
		 * 4. 작은 타입에는 큰타입을 넣을 수 없다.(casting)
		 * 		char <- int >>>> char <- (char)int 
		 * 		int  <- char>>>> int  <- char 실행하면 내부적으로 컴파일러가 int <- (int)char로 변환 실행한다.
		 */
		
		//int intvalue = 1490594;
		//byte bytevalue = (byte)intvalue;
		//System.out.println("bytevalue: " + bytevalue); //원하지 않는 값 발생
		
		int intvalue = 101; //OK
		byte bytevalue = (byte)intvalue;
		System.out.println("bytevalue: " + bytevalue); //손실되지 않았어요(100%가 아니다)
		
		//String(문자열을 표현하는 자료형) 
		String name = "hello world";
		System.out.println(name);
		//syso ctrl + space
		
		String name2 = name + " 방가방가"; // + >> 숫자가 오면 산술, 문자가 오면 결합
		System.out.println(name2);
		//DB(oracle) >> + 연산자(산술) , 결합 연산자 || '안녕' || '방가'
		
		//Tip) Java에서는 특수문자를 사용
		//이스케이프 문자 >> 특정문자 앞에 \
		char sing = '\'';
		// 나는 ' 하나를 표현하고 싶어 >> 역슬러시라는 문자와 결합해서 사용하면 문자로 인정해줄게!
		System.out.println(sing);
		
		//홍"길"동 이라는 문자를 String 변수에 저장하고 화면에 출력하고 싶음
		String name3 = "홍\"길\"동";
		System.out.println(name3);
		
		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4;//"100010"
		System.out.println(result);
		
		//C:\temp 문자열을 String 변수에 넣고 화면에 출력하세요.
		String temp = "C:\\temp"; //C:	emp >>  \t >>tab	\n >> new line
		System.out.println(temp);
		
		//실수형(부동소수점) (표현할 범위가 넓어지기 때문에, but 정확하지는 않음)
		//float(4byte)
		//double(8byte) **실수 리터럴의 기본타입**
		
		float f = 3.14F; //3.14 리터럴 값은 Double 그릇에 있기 때문에 >> float으로 그릇을 교체>>접미사(F,f)
		//float f2 = (float)3.14;
		
		float f2 = 1.123456789f;
		System.out.println("f2: " + f2);
		//1.1234568 >> 대략 7자리 소수표현
		//반올림이 default
		
		double d = 1.123456789123456789;
		System.out.println("d :" + d);
		//1.1234567891234568 >> 대략 16자리 소수표현
		//반올림이 default
		
		System.out.println((byte)129);
		//byte -128 ~ 127  //overflow 시 순환
		byte q2 = (byte)128;
		System.out.println(q2);
		
		double d2 = 100; // 암시적 형변환
		System.out.println(d2); //100.0
		
		//컴파일러
		//double d2 = (double)100;
		
		//Quiz
		double d3 = 100;
		int i5 = 100;
		//아래 코드가 error 없이 처리되려면?
		// int result2 = d3 + i5;
		//1. int result2 = (int) (d3 + i5);
		//  만약에 d3 = 3.145 >> int >> 3.0  이 경우 손실이 발생
		//2. double result2 = d3 + i5; // 손실이 없음
		//System.out.println(result2);
		//3. int result2 = (int)d3 +i5;
		//System.out.println(result2);
		
		//Today Point
		//1. 작은 타입 + 큰 타입 >> 큰 타입
		//2. 타입 간 변환 >> 변수가 가지는 값을 보지 말고 변수의 타입을 보고 판단하자
		//3. 필요하다면 명시적 형변환을 활용하여 작업(Casting) : 손실분에 대한 고민 해보기
		
		int i6 = 100;
		byte b2 = (byte)i6; //명시적 형변환
		System.out.println(b2);
		
		byte b3 = 20;
		int i7 = b3;
		//컴파일러가 내부적으로 (int)b3로 암시적 형변환을 함
		
	}

}
