import java.util.ArrayList;

/*
 	Today Point
 	Generic jdk 1.5
 	C#, java, 필수 기능
 	
 	Collection 클래스 >> 데이터 기본저장공간으로 Object를 사용함
 	1. Object 타입 저항 >> 타입 강제(객체생성시 타입을 지정) >> 제너릭
 	2. 타입의 안정성 문제(타입 강제)
 	3. 강제 형변환(casting을 막기 위해 쓰기) : (Car)object (x)
 	
 	시점: 클래스를 설계할 때 제너릭을 적용하는 코드를 만들어 놓았음 	
 	
 	
 */

class MyGen<T>{ //type parameter
	T obj;
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class Person extends Object{
	int age = 100;
}



public class Ex06_Generic {

	public static void main(String[] args) {
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("문자열");
		String str = mygen.get();
		System.out.println(str);

		ArrayList list = new ArrayList();
		//저장공간의 타입은 Object[] elements
		list.add(10);
		list.add(new Person());
		list.add("홍길동");
		
		//출력
		//개선된 for문
		for(Object obj:list) {
			//person 객체는 나이를 출력하고, 나머지는 값을 출력하세요
			//System.out.println(obj);
			//객체인 것과 아닌 것을 구분해야 함
			if(obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p.age);
			}else {
				System.out.println(obj);
			}
			
			
		}
		
		
		
		
	}

}
