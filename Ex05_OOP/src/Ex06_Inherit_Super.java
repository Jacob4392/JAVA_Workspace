/*
 	this: ��ü �ڽ��� ����Ű�� this (this.empno, this.ename)
 	this: �����ڸ� ȣ���ϴ� this   (this(100,"red"))
 	
 	���
 	�θ�, �ڽ�
 	
 	super (���� �ڽ��� �θ��� ���� �ּҰ��� ������) : ��Ӱ��迡���� �θ� ���� ������ �ϴ� ���(super: �θ�ü�� �ּҰ�)
 	
 	1. super >> ��Ӱ��迡�� �θ��ڿ��� �����Ҷ�
 	2. super >> ��Ӱ��迡�� �θ��� �����ڸ� ȣ���� ��(���������)***
 	
 	tip) C# >> base()
 		 java>>super()
 	
 */


class Base{
	String basename;
	Base(){
		System.out.println("Base �⺻ ������ �Լ�");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename: "+this.basename);
	}
	
	void method() {
		System.out.println("�θ�: method");
	}
	
}


class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("Derived �⺻ ������ �Լ�");
	}
	
	Derived(String dname){
		//�θ��� �����ڵ� overloading�� �����ڸ� �θ��� ���� ��
		super(dname);//�θ� ������ ȣ��
		this.dname = dname;
		System.out.println("dname: "+this.dname);
	}
	@Override
	void method() {
		System.out.println("�ڽ�: method");
	}
	
	//����� �θ�� �ڿ��� �׸�����(method ������ ��...
	//������ ��� super�� ���ؼ� �ڽ��� ���(�Լ�) �ȿ����� ��밡��
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
