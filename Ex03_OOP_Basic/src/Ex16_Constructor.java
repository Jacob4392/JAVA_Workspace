/*

**생성자 함수** (Constructor)
1. 함수(특수한 목적)
2. 특수한 목적(member field 초기화)

객체가 만들어질 때 만들어지는 함수다

Tip) {일반 초기자 함수} / static{초기화 함수}

3. 일반함수와 다른점
3.1 함수 이름이 고정되어 있음(class 이름 동일)
3.2 실행시점: 객체 생성(new) >> heap 공간 만들고 >> 변수(member field) 올라간 이후 >> 자동으로 호출되는 함수
3.3 실행시점으로 인해 return type이 없음 >> void(x) >> public (void) 클래스이름 >> public 클래스이름 (이렇게 써도 무방)

4.목적: 생성되는 객체마다 [강제적]으로 다른 member field의 값을 초기화 할 수 있다
class Car { String color; }
자동차를 만들면 자동차는 무조건 색상을 하나 가져야 한다.
>> class Car{String color="blue";}
자동차를 만들면 자동차는 하나의 색상을 가지는데 다른 색을 가질 수도 있다.
>> class Car{String color="blue";} >> new >> c.color="red";
.. .. .. class Car{String color; public Car(String color){this.color=color;}}

5. 생성자 함수(overloading) 가능

6. 당신이 만약 overloading 생성자 함수를 하나라도 구현했다면
	default 생성자 함수는 반드시 구현을 통해서만 사용가능하다.


지역변수는 초기값을 갖지 않는다.
인스턴스 변수는 초기값을 갖는다.

 */


//당신이 만약 자동차를 만들면 반드시 자동차의 이름을 부여하세요.
class Car{
	String carname;
	//컴파일러가 알아서 함수를 만들어요
	//개발자가 직접 생성자를 만들지 않으면 컴파일러가 자동으로 아래 코드를 생성합니다.
	//public Car() {}
	//public Car() {System.out.println("생성자 강제구현");}
}

class Car2{
	String carname;
	public Car2() {//default constructor
		carname = "포니";
		
	}
}

class Car3{
	String carname;
	public Car3() {
		carname = "포니";
	}
	public Car3(String name) { //생성자 overloading
		carname = name;
	}
}

class Car4{
	String carname;
	//default constructor 코드가 없어요
	//예외적으로, overloading 생성자를 구현했다면 default생성자는 자동으로 만들어지지 않아요 
	//설계자의 의도: 자동차 생산시 무조건 이름을 넣으세요.
	public Car4(String name) {
		carname = name;
	}
}


public class Ex16_Constructor {

	public static void main(String[] args) {
		Car c = new Car(); //Car(); (생성자)함수를 호출하라는 코드, 
		//c.carname = "현대"; //반드시 해야한다는 보장이 없음
		Car2 c2 = new Car2();
		System.out.println(c2.carname);
		
		Car3 c3 = new Car3("카니발");
		System.out.println(c3.carname);
		
		Car4 c4 = new Car4("k7");
		System.out.println(c4.carname);
		
	}

	
	
	//this는 자신의 참조번지를 가지고 있는 키워드
	// 이 변수가 클래스의 변수인지 parameter의 변수인지 구분하기 위해서 사용
	
	
	
}
