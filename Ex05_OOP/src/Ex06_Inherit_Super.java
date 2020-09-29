/*
 	this: 객체 자신을 가리키는 this (this.empno, this.ename)
 	this: 생성자를 호출하는 this   (this(100,"red"))
 	
 	상속
 	부모, 자식
 	
 	super (현재 자식이 부모의 접근 주소값을 갖게함) : 상속관계에서의 부모에 대한 접근을 하는 방법(super: 부모객체의 주소값)
 	
 	1. super >> 상속관계에서 부모자원에 접근할때
 	2. super >> 상속관계에서 부모의 생성자를 호출할 때(명시적으로)***
 	
 	tip) C# >> base()
 		 java>>super()
 	
 */


class Base{
	String basename;
	Base(){
		System.out.println("Base 기본 생성자 함수");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename: "+this.basename);
	}
	
	void method() {
		System.out.println("부모: method");
	}
	
}


class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("Derived 기본 생성자 함수");
	}
	
	Derived(String dname){
		//부모쪽 생성자도 overloading된 생성자를 부르고 싶을 때
		super(dname);//부모 생성자 호출
		this.dname = dname;
		System.out.println("dname: "+this.dname);
	}
	@Override
	void method() {
		System.out.println("자식: method");
	}
	
	//어느날 부모님 자원이 그리워요(method 재정의 함...
	//유일한 방법 super를 통해서 자식의 기능(함수) 안에서만 사용가능
	void parent_method() {
		super.method();
	}
	
	
}


public class Ex06_Inherit_Super {
	public static void main(String[] args) {
		/*
		Derived d = new Derived();
		System.out.println(d.basename);
		System.out.println(d.dname);
		d.method();
		d.parent_method();
		*/
		
		Derived d = new Derived("hello");
		
		
	}

}
