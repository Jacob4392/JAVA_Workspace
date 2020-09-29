/*
 	user ����ڰ��� : provider ������ ����
 	
 	class A{}
 	class B{}
 	����: A�� B�� ����մϴ�
 	
 	1.���: A extends B
 	2.����: A��� Ŭ���� �ȿ��� Member Field�� B�� ��� >> class A{B b;}
 		2.1 �κ�
 		2.2 ��ü
	
	------------------------------------------------
	class B{}
	class A{
		int i;
		B b; //A�� B�� ����մϴ�(����)
		A(){
			b = new B();
		}
	}
	
	>> B�� ���������� ������ �Ұ��� >> A��� ��ü�� ��������� B�� �������
	>> A a = new A(); >> A��ü ������ ���ÿ� B��ü�� �����ȴ�
	>> Composition(��ü����) life cycle�� ����
	-------------------------------------------------
	class B{}
	class A{
		int i;
		B b; //A�� B�� ����մϴ�(����),(�����մϴ�)
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
	>> Aggregation(�κа���) A�� B�� life cycle�� �ٸ�(�κ�����)
 	-------------------------------------------------
 	A�� B�� �����Ѵ�(member field�μ� B�� ����Ǿ� �ִ� ��)
 	-------------------------------------------------
 	
 	��������(�Լ� �ȿ���)
 	
 	class B{}
 	class A{
 		int i;
 		//member field�� B��� Ÿ���� ���� �ʴ´�.
 		
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
		System.out.println("D Icall �������̽��� m() ������");
	}
}

class F implements Icall{

	@Override
	public void m() {
		System.out.println("F Icall �������̽��� m() ������");
		
	}
}


//�������� ���α׷��� ���(interface�� ���� ���) de-coupling ��� >> �����ϰ�(D,F��� ��ü�� �ʼ��� ������ �ʾƵ� �ǵ���, �ʿ��� �� �����ϵ���)
class C{
	void method(Icall ic) { //ic��� parameter�� Icall�� ������ ��� ��ü�� �ּҸ� ���� �� �ִ�(Ȯ�强�� �ſ� ����)
		ic.m();
	}
	
	/*
	void method2(D d) { //D �ƴϸ� ���� ���ϰ� �ϴ� ���
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
