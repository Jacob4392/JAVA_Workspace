/*
 	추상클래스 : 인터페이스 비교
 	
 	*인터페이스: 표준, 약속, 규칙, 규약 등을 만드는 행위
 	
 	추상클래스:인터페이스 공통점
 	1. 스스로 객체 생성 불가능 (new 연산자 사용 불가능)
 	1.1 약간의 차이점: 추상 클래스는(완성+미완성), 인터페이스(모든 것이 미완성)
 	
 	2. 사용
 	추상클래스 extends (확장의 개념)
 	인터페이스 implements (구현) 사용가능
 	
 	class Car extends abclass{}
 	class Car implement Ia{}
 	가지고 있는 자원(추상자원) >> extends, implements 하는 클래스가 강제 구현하도록 하는 목적 >> (재정의)
 	
 	추상클래스:인터페이스 다른점
 	1.인터페이스는 다중 구현 가능
 	약속을 만드는 행위>> 약속을 너무 크게 만들면 사용성이 떨어짐 (인터페이스는 작은 단위로 여러개를 만들어서 모은 후 큰 약속을 만듬)
 	class Test extends Object implements Ia, Ib, Ic{}
 	--인터페이스와 인터페이스는 extends가 가능하다
 	
 	2.추상클래스는 단일상속 원칙(계층적상속)
 	
 	3.추상클래스(완성된 코드 + 미완성 코드)
 	
 	4.인터페이스 (상수를 제외한 나머지는 미완성(추상) 자원 >> JDK8 (Default 값, static 값)
 	
 	
 	인터페이스는 소프트웨어 설계의 최상위 단계
 	어떤 프로젝트를 진행할 때 약속을 정의하기 때문
 	
 	**개발자(초급)**
 	1.인터페이스를 [다형성] 입장으로 접근(인터페이스가 부모타입으로 쓰일 수 있음)
 	2.서로 연관성이 없는 클래스를 하나로 묶어주는 기능을 한다(같은 부모를 가지게 한다)
 	3.JAVA API가 수 많은 Interface를 만들어 놓았음 >> 직접 설계하지 않아도 될만큼, 사용방법만 익힐 것
 	4.인터페이스(~able): 날 수 있는, 수리할 수 있는(설계)
 	5.객체간 연결고리(객체간 소통의 역할로 사용) >> 소통(다형성)
 	
 	
 */

/*
interface Ia{
	String print(); //약속만 있음(출력할 때는 print 사용하고, return은 문자로 해라)
}


class Test implements Ia{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


 	설계표준 >> 구현 >> 재정의
 	
 	Interface
 	1. 실제 구현부를 가지고 있지 않다: 실행블럭이 없다:약속(설명)
 	      시스템에서 이동하는 것이 move라는 이름을 사용하고 이동시에는 좌표값을 받아야 한다
 	   >>합의 >> void move(int x,int y); (x){} >> 구현자가 받아서 재정의 하도록 강제 >> 추상메서드
 	   >>활용 : Collection(동적배열) 자료구조 >> Vector, [ArrayList], HashSet, [HashMap]
 	   >>Vector, [ArrayList], HashSet, [HashMap] -> 여러개의 인터페이스를 구현하고 있다.
 	   
 	2. 생성방법
 		2.1 상수(final): public static final int VERSION=1; >> [public static final] int VERSION=1;
 		   	생략: [public static final] 컴파일러가 알아서 붙여줌
 		   	
 		2.2 함수(method): public abstract void run(); >>[public abstract] void run();
 		   	
 		Interface{
 			int VERSION=1; //[public static final] default
 			void run();	   //[public abstract] default
 			String move(int x,int y); //[public abstract] String move(int x,int y);
 		}
 	
 	interface lable{ }
 	interface lable{ int NUM=0; }
 	interface lable{ void run();}
 	
 	class Test extends Object implements Ia,Ib,Ic{
 		
 	}
 	
 */

interface Ia{
	int AGE = 100;
	String GENDER = "남";
	String print();
	void message(String str);
}

interface Ib{
	int AGE = 10;
	void info();
	String val(String s);
}

class Test extends Object implements Ia,Ib{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}
	
}



public class Ex03_Interface {

	public static void main(String[] args) {
		Test t = new Test();
		Ia ia = t; //부모는 자식타입의 주소를 가질 수 있다(다형성)
		ia.message("AA");
		System.out.println(ia.AGE);
		Ib ib = t;
		System.out.println(ib.AGE);
		
	}

}
