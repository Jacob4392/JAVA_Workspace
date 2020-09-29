import kr.or.bit.Pclass;

/*
 	접근제어자
 	public, private, default, (상속관계에서)>>protected
 	
 	protected: 양면성 >> 어떤 때에는 default, 어떤때는 public의 성격을 가지고 있다
 	>> 상속이 없는 클래스 안에서 protected 접근자는 default와 같다
 	>> 결국 상속관계에서만 의미를 가진다
  
 */

class Dclass{
	public int i;
	private int p;
	int s; //default
	protected int k; // default (일반 클래스에서는 사용할 이유가 없다)
	
}

class Child2 extends Pclass{
	void method() {
//		this.j
		this.k = 1000; //상속관계에서 자식은 부모의 protected 자원에 접근 가능하다(public처럼 사용할 수 있다)
		System.out.println(this.k);
		
	}
}




public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Pclass p = new Pclass();
		//p.j  참조변수 입장에서는 public에서만 접근 가능
		//p.k //default
		
		Child2 ch = new Child2();
		ch.method();
		
		
	}

}
