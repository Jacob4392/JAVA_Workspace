/*
	OOP(객체지향 프로그래밍)
	1. 상속(재사용성)
	2. 캡슐화(은닉화) : private, getter, setter(직접할당을 막고 간접할당을 통해서 데이터를 보호하겠다)
	3. 다형성: 하나의 타입으로 여러개의 객체를 가질 수 있음

// >> method overloading
// 하나의 이름으로 여러가지 기능을 하는 함수(편하게 쓰려고 하는 함수) 성능과 연관성이 없음
	System.out.println(); >> println() 오버로딩을 구현하고 있는 함수
	1. 오버로딩은 성능향상에 영향을 주지 않는다
	2. 편하게 사용하라고 설계자가 배려한 것(개발자)
	3. 오버로딩 모르면 20개 다른 이름 만들면 그뿐임...
	
	문법) 함수 이름은 같고, parameter [개수]와 [타입]을 다르게 하면 됨
	1. 함수 이름은 같아야 한다.
	2. parameter 개수 또는 타입은 달라야 한다.
	3. return type은 오버로딩의 판단기준이 아니다.
	4. parameter 순서가 다름을 인정한다(주의)
	
 */


class Human{
	String name;
	int age;
	
}

class OverTest{
	int add(int i) {
		return 100+i;
	}
	
	int add(int i,int j) {
		System.out.println("오버로딩: "+ i +","+j);
		return i+j;
	}
	
	String add(String s) {
		System.out.println("오버로딩: "+ s);
		return "hello " + s;
	}
	
	String add(String s, int i) { //parameter 순서가 다름을 인정
		return null;
	}
	
	String add(int i, String s) {
		return null;
	}
	
	void add(Human human) { //오버로딩
		human.name="홍길동";
		human.age=100;
		System.out.println(human.name + ","+human.age);
	}
}



public class Ex14_Method_Overloading {

	public static void main(String[] args) {
		OverTest ot = new OverTest();
		int result = ot.add(100,200);
		System.out.println(result);
		
		String return2 = ot.add("world");
		System.out.println(return2);

		Human h = new Human();
		ot.add(h);
		System.out.println(h.name);
		
	}

}
