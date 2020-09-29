package kr.or.bit;


/*
기능(행위) 만드는 방법
함수 (function, method)

method: 행위 또는 기능(최소단위): 하나의 함수는 하나의 기능만 구현

클래스: 필드 + 함수 + 생성자

ex) 인형뽑기 -> 동전넣고 인형을 받는것 (돌려주는 것(ㅇ))

함수는 호출에 의해서만 동작한다.

JAVA) 함수
1. void, parameter(o): void print(String str){실행코드}
2. void, parameter(x): void print(){실행코드}
3. return type, parameter(o): int print(int data){return 100;}
4. return type, parameter(x): int print(){return 100;}


****
void >> 돌려주는 것이 없다 >> return value가 없다
return type >> 8가지 기본타입, String, Array, *Class*(사용자가 만든 타입), Collection, Interface
parameter type >>8가지 기본타입, String, Array, *Class*, Collection, Interface
void print(int a, int b, int c, int d){} ... 인자, 인수, 매개변수, 전달값 >> parameter
ex) print(10,20,30); (X), print(1,2,3,4); (O)


Car print(){ Car c = new Car(); return c; }...단축 { return new Car(); }
boolean print(boolean bo){return true;}

함수의 이름: 관용적 표현 
의미있는 단어의 조합(길어도 상관없음)
:getChannelNumber()
:getEmpListByEmpno()

함수는 반드시 호출(call)되어야 실행된다: 

*/


public class Fclass {
	public int data;
	
	
	//void m() //컴파일러가 default void m(): 같은 패키지 내에서만 사용할 경우
	public void m() {  //다른 package에서 사용가능
		int i;
		
		System.out.println("일반함수: void, parameter(x)");
	}
	
	//void m(int ..)
	public void m2(int i) {
		System.out.println("일반함수: void, parameter(o)");
		System.out.println("parameter value: (scope가 함수내부)"+ i);
	}
	
	
	public int m3() {
		return 0; //return Type이 존재하면 반드시 return 키워드가 있어야 한다
	}
	
	
	public int m4(int data) {
		return 100+data;
	}
	//여기까지가 함수 기본...
	
	//확장
	public int sum(int i, int j, int k) {
		return i+j+k;
	}
	
	//default int subSum()...
	//설계자의 의도 : subSum() 이라는 함수는 다른 함수를 도와주는 함수 [내부]에서 호출
	//내부에서 공통적인 내용 모아서 필요할 때 불러씀
	//이런 경우는: private접근자가 더 적절하다: 클래스 내부에서만 사용할 수 있음 -> 같은  package에서 접근
	//**클래스 내부에서는: public, private, default 구분하지 않는다.
	private int subSum(int i) { //클래스 내부의 공통함수로 사용하겠다는 의지가 담긴 접근자
		return i + 100;
	}
	public void callSubSum() {
		int result = subSum(100);
		System.out.println(result);
	}
	
	private int operationMethod(int data) { //클래스 내부에서... 공통함수로 쓰겠다
		return data * 200;
	}
	
	public int opSum(int data) {
		int result = operationMethod(data);
		if(result>0) {
			return 1;
		}else {
			return -1;
		}
	}
	
	//Quiz
	//a와 b 둘 중에 큰 값을 return 하는 함수를 만드세요
	//ex) max(300,100) return 값은 300
	//public int max(int a, int b){}
	
	
	//30점 : return을 최소로 작성(반복적 사용 자제)
	/*	public int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	//60점
		public int max(int a, int b) {
		int result = 0;
			if(a>b) {
			result a;
		}else {
			result b;
		}
			return result;
	}
	
	//90점
	  public int max(int a, int b) {
	  int max = (a>b)? a : b;
	  return max;
	  }
	  
	//100점
	  public int max(int a, int b) {
	  	return (a>b)? a : b;
	  }
	  	*/	
	  public int max(int a, int b) {
		  return (a>b)? a : b;
	  }
	  
	  
	  //함수를 사용할때 기본타입(값타입)
	  //함수에 참조타입
	  //return Type에 클래스가 올 수 있다.
	  public Tv tCall() { //Tv 타입을 가지는 [***주소***]를 리턴 >> new... 
		  //return null;
		  Tv t = new Tv();//확장성 면에 있어서 유리
		  return t; //stack 에 참조변수 t는 사라지되 heap의 Tv객체는 그대로 남아있음
	  }
	  	
	  public Tv tcall2() {
		  return new Tv(); //이 기능만 놓고 보면 이것이 유리, 참조변수로 활용을 못함
	  }
	
	  public void tCall3(Tv t) { //Tv타입을 가지는 주소를 parameter로 갖는다
		  System.out.println("t 주소값: " + t);
	  }

	  //1. tCall3(new Tv()) -> Tv 타입의 주소만 보냄
	  //2. Tv t = new Tv(); 
	  //	tCall3(t);
	  
	  // 이것을 배우는 이유? 다양한 설계를 할 수 있다.
	  
}
