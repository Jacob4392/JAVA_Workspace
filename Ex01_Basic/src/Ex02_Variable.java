//라인주석
/*
	블럭주석(해석되지 않는 자원)
	1.Ex02_Variable 클래스 >> 설계도 >> 타입이다(여러개의 작은 타입을 모아놓은 의미있는 집합)
	
	-클래스의 종류
		-- class Test{} >> 독자적인 실행이 불가능 : 다른 클래스(설계도)가 참조하는 클래스 : main 함수가 없음>> lib
		-- class Test{public static void main(String[] args){}   } >> 실행가능한 클래스
		-- static void main(String[] args) >> main 이름을 가지는 함수 >> 프로그램 진입점, 시작점 >>약속
	C# : static void Main(){}
	
	변수 : variable
	:데이터(자료) 담을 수 있는 공간의 이름
	공간(크기): 타입(자료형)
	데이터타입 변수명 >> int i = 100;

	변수가 선언되는 위치에 따라서 (scope: 유효범위)
	1. instance variable: 객체변수 >> class Person{int age;} 클래스 안에서 선언되는 변수
	2. local variable : 지역변수(지역 : 함수안) >> class Person{public void run(){int speed}} 함수안에서만 유효
	3. 함수안에 if 블럭, for 블럭 안에 있는 블럭변수 (블럭 안에서만 유효)
	4. static variable: 공유자원(객체간)
	
*/


//class는 설계도이다 == class는 타입(Type)이다(여러개의 의미있는 작은 타입을 가지는 큰 타입이다) == 사용자 정의 타입
class Test{
	int iv=100; // 초기화>100
	//instance variable
	//이 변수는 초기화를 하지 않아도 된다.(내부적으로 기본값을 갖고 있음:default)
	int window; // 기본값>0
	//초기화 : 변수가 처음 값을 갖는 것(할당을 통해서)
	//질문 : why window 변수는 초기화를 하지 않아도 사용가능할까요
	//window 아파트의 창문의 갯수를 갖는 변수
	//설계도는 하나 ...설계도를 기반으로 아파트 여러개...아파트마다 창문의 갯수는 다를 수 있다.
	//아파트마다(객체) 창문의 갯수를 다르게 하겠다.
	
	//Test 삼성아파트 = new Test();
	//삼성아파트.window=4;
	
	//Test 현대아파트 = new Test();
	//현대아파트.window=2;
	
	Test(){ //생성자 함수(특수한 함수) 객체가 생성될때 자동으로 호출되는 함수:객체 생성과 동시에:constructor(초기자, 생성자)
		System.out.println("나는 생성자");
	}
	Test(int data){ //오버로딩 :overloading : 하나의 이름으로 여러가지 기능을 수행
					//자동으로 호출되는 함수 : 아파트가 지어질 때 같이
		window = data;//창문의 갯수 강제 초기화
	}
	
	void write() {//기능, 행위 method
		int num=100; 
		//local variable
		//당신이 만약 지역변수를 사용하고 싶다면 전에 반드시 초기화를 해라.
		//write 함수가 호출되면 생성되고, 함수가 종료되면 메모리에서 사라진다
		
		System.out.println(num);
		int age = 15;
		//지역변수는 사용(출력, 더하거나 빼거나)하기 전에 반드시 초기화(값을 할당하는 행위)해야 한다(선행)
	}

	void print() {
		//안에서 age 변수 사용 (사용불가) 다른함수... 접근불가
		//System.out.println(age);
		System.out.println(window);
	}

}
public class Ex02_Variable {

	public static void main(String[] args) {
		Test t = new Test(); //설계도를 구체화...객체생성...아파트를 짓는 것(t: 아파트이름)
		t.print();
		
		int lv = 100;
		System.out.println("lv 지역변수:"+lv);
		
		class Apt{
			int window;
		}
		
		//Ex02_Variable
		//javac Ex02_Variable.java >> Ex02_Variable.class 생성
		//java Ex02_Variable 실행
		//JVM 동작 >> OS >> app 메모리 구성 >> 자원할당... >> 프로그램종료 >> 사용했던 공간은 반환 OS
		//이클립스 통합 개발툴 (Ctrl + F11 컴파일>>실행)
		
		//1. 지역변수는 반드시 초기화를 하고 사용(변수에 처음 값을 할당하는 것)
		//2. 약속! >> main 도 함수다 >> 초기화
		
		int number = 0; //선언과 동시에
		number = 100;
		number = 200;
		System.out.println("number: "+number);
		
		int a; // 선언
		int b;
		
		a=100; // 초기화
		b=200;
		
		int c,d; //선호하지 않음 >> 배열을 사용한다
		
		Apt ssung = new Apt();
		System.out.println(ssung.window);
		Apt ppark = ssung;
		ppark.window = 100;
		System.out.println(ssung.window);
		System.out.println(ssung);
		System.out.println(ppark);
		
	}

}
