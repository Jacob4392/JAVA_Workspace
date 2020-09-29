/*
 	OOP 특징
 	1. 상속
 	2. 캡슐화(은닉화) >> private
 	3. 다형성
 	
 	
 	1. 상속
 	java: child extends Base
 	C#: child : Base
 	
 	2. 특징 
 	2.1 다중 상속은 불가
 	2.2 단일 상속(계층적 상속 : 통해서 여러개의 클래스를 상속할 수 있음)
 	2.3 다중상속을 지원(유일: interface)
 	
 	3. 상속
 	3.1 진정한 의미: 재사용성
 	3.2 단점: 초기의 설계비용이 많이 든다
 	3.3 재사용성 >> 설계 >> 비용 (시간... 공통자원(분모, 추상화작업))
 	
 	4. 상속관계 Memory? (메모리에 올라가는 순서)
 		GrandFather >> Father >> Child
 
 	사용자(개발자)가 만드는 모든 클래스는 default(쓰지 않아도, 명시하지 않아도)로 Object 클래스 상속
 	class Car extends Object ..생략...
 	Object 모든 클래스의 root(최상위): 모든 클래스의 부모클래스
 	
 	
 
 */

//class Car extends Object{}	

class Car{
	
}


class GrandFather extends Object{
	public GrandFather(){
		System.out.println("GrandFather"); 
	}
	public int gmoney = 5000;
	private int pmoney = 10000; //접근 불가(객체, 상속관계)
}

class Father extends GrandFather {
	public Father() {
		System.out.println("Father");
	}
	public int fmoney = 3000;
}

class Child extends Father {
	public Child() {
		System.out.println("Child");
	}
	public int cmoney = 1000;
}


public class Ex01_Inherit {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney); // 할아버지
		System.out.println(child.fmoney); // 아버지
		System.out.println(child.cmoney); // 자녀
		
		
		Car car = new Car();

	}

}
