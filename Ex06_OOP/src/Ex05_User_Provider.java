/*
 	user 사용자관점 : provider 제공자 관점
 	
 	class A{}
 	class B{}
 	관계: A는 B를 사용합니다
 	
 	1.상속: A extends B
 	2.포함: A라는 클래스 안에서 Member Field로 B를 사용 >> class A{B b;}
 		2.1 부분
 		2.2 전체
	
	------------------------------------------------
	class B{}
	class A{
		int i;
		B b; //A는 B를 사용합니다(포함)
		A(){
			b = new B();
		}
	}
	
	>> B는 독자적으로 생성이 불가능 >> A라는 객체가 만들어져야 B도 만들어짐
	>> A a = new A(); >> A객체 생성과 동시에 B객체도 생성된다
	>> Composition(전체관계) life cycle이 같음
	-------------------------------------------------
	class B{}
	class A{
		int i;
		B b; //A는 B를 사용합니다(포함),(참조합니다)
		A(){}
		A(B b){
			this.b = b;
		}
		
		void m(B b){
			this.b = b;
		}
		
	}
	
	>> B b = new B();
	>> A a = new A(b);
	>> Aggregation(부분관계) A와 B는 life cycle이 다름(부분집합)
 	-------------------------------------------------
 	A는 B를 참조한다(member field로서 B가 선언되어 있는 것)
 	-------------------------------------------------
 	
 	의존관계(함수 안에서)
 	
 	class B{}
 	class A{
 		int i;
 		//member field로 B라는 타입을 갖지 않는다.
 		
 		void print(B b){}
 		
 		B print(){
 			B b = new B();
 			return b;
 		}
 	}
 	
 	>> B b = new B();
 	>> A a = new A();
 	>> a.print(b);
 	>> B b2 = a.print();
 	
 */


interface Icall{
	void m();
}

class D implements Icall{
	
	@Override
	public void m() {
		System.out.println("D Icall 인터페이스의 m() 재정의");
	}
}

class F implements Icall{

	@Override
	public void m() {
		System.out.println("F Icall 인터페이스의 m() 재정의");
		
	}
}


//현대적인 프로그래밍 방식(interface를 쓰는 방식) de-coupling 방식 >> 유연하게(D,F라는 객체를 필수로 만들지 않아도 되도록, 필요할 때 생성하도록)
class C{
	void method(Icall ic) { //ic라는 parameter는 Icall을 구현한 모든 객체의 주소를 받을 수 있다(확장성이 매우 좋음)
		ic.m();
	}
	
	/*
	void method2(D d) { //D 아니면 오지 못하게 하는 방식
		d.m();
	}
	void method3(F f) {
		f.m();
	}
	*/
	
}






public class Ex05_User_Provider {

	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		F f = new F();
		
		c.method(d);
		c.method(f);

	}

}
