import kr.or.bit.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("부모함수 Test2");
	}
}


class Test3 extends Test2{
	int x = 300; // 이런 방식은 지양
	
	@Override
	void print() {
		System.out.println("자식이 부모함수를 재정의");
	}
	
	void print(String str) {
		System.out.println("나는 오버로딩 함수"+str);
	}
}



public class Ex05_Inherit_Override {

	public static void main(String[] args) {
		Test3 t = new Test3();
		System.out.println(t.x);
		t.print();
		t.print("overload");

		
		Emp emp = new Emp(1000,"홍길동");
		System.out.println(emp);//kr.or.bit.Emp@15db9742
		System.out.println(emp.toString());//kr.or.bit.Emp@15db9742
		//고민: 사번, 이름 담긴 정보를 출력
		//누구나 같은 함수 사용하고 싶음
		//emp ... 사실은 emp.toString() 생략
		//Object 클래스가 toString()에 대해서 주소값을 출력하도록 구현해놓음
		//JAVA API가 제공하는 수많은 클래스가 Object클래스의 toString()을 재정의하고 있다.
		
		
		
	}

}
