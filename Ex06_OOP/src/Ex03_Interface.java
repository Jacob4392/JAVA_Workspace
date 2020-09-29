/*
 	�߻�Ŭ���� : �������̽� ��
 	
 	*�������̽�: ǥ��, ���, ��Ģ, �Ծ� ���� ����� ����
 	
 	�߻�Ŭ����:�������̽� ������
 	1. ������ ��ü ���� �Ұ��� (new ������ ��� �Ұ���)
 	1.1 �ణ�� ������: �߻� Ŭ������(�ϼ�+�̿ϼ�), �������̽�(��� ���� �̿ϼ�)
 	
 	2. ���
 	�߻�Ŭ���� extends (Ȯ���� ����)
 	�������̽� implements (����) ��밡��
 	
 	class Car extends abclass{}
 	class Car implement Ia{}
 	������ �ִ� �ڿ�(�߻��ڿ�) >> extends, implements �ϴ� Ŭ������ ���� �����ϵ��� �ϴ� ���� >> (������)
 	
 	�߻�Ŭ����:�������̽� �ٸ���
 	1.�������̽��� ���� ���� ����
 	����� ����� ����>> ����� �ʹ� ũ�� ����� ��뼺�� ������ (�������̽��� ���� ������ �������� ���� ���� �� ū ����� ����)
 	class Test extends Object implements Ia, Ib, Ic{}
 	--�������̽��� �������̽��� extends�� �����ϴ�
 	
 	2.�߻�Ŭ������ ���ϻ�� ��Ģ(���������)
 	
 	3.�߻�Ŭ����(�ϼ��� �ڵ� + �̿ϼ� �ڵ�)
 	
 	4.�������̽� (����� ������ �������� �̿ϼ�(�߻�) �ڿ� >> JDK8 (Default ��, static ��)
 	
 	
 	�������̽��� ����Ʈ���� ������ �ֻ��� �ܰ�
 	� ������Ʈ�� ������ �� ����� �����ϱ� ����
 	
 	**������(�ʱ�)**
 	1.�������̽��� [������] �������� ����(�������̽��� �θ�Ÿ������ ���� �� ����)
 	2.���� �������� ���� Ŭ������ �ϳ��� �����ִ� ����� �Ѵ�(���� �θ� ������ �Ѵ�)
 	3.JAVA API�� �� ���� Interface�� ����� ������ >> ���� �������� �ʾƵ� �ɸ�ŭ, ������� ���� ��
 	4.�������̽�(~able): �� �� �ִ�, ������ �� �ִ�(����)
 	5.��ü�� �����(��ü�� ������ ���ҷ� ���) >> ����(������)
 	
 	
 */

/*
interface Ia{
	String print(); //��Ӹ� ����(����� ���� print ����ϰ�, return�� ���ڷ� �ض�)
}


class Test implements Ia{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


 	����ǥ�� >> ���� >> ������
 	
 	Interface
 	1. ���� �����θ� ������ ���� �ʴ�: ������� ����:���(����)
 	      �ý��ۿ��� �̵��ϴ� ���� move��� �̸��� ����ϰ� �̵��ÿ��� ��ǥ���� �޾ƾ� �Ѵ�
 	   >>���� >> void move(int x,int y); (x){} >> �����ڰ� �޾Ƽ� ������ �ϵ��� ���� >> �߻�޼���
 	   >>Ȱ�� : Collection(�����迭) �ڷᱸ�� >> Vector, [ArrayList], HashSet, [HashMap]
 	   >>Vector, [ArrayList], HashSet, [HashMap] -> �������� �������̽��� �����ϰ� �ִ�.
 	   
 	2. �������
 		2.1 ���(final): public static final int VERSION=1; >> [public static final] int VERSION=1;
 		   	����: [public static final] �����Ϸ��� �˾Ƽ� �ٿ���
 		   	
 		2.2 �Լ�(method): public abstract void run(); >>[public abstract] void run();
 		   	
 		Interface{
 			int VERSION=1; //[public static final] default
 			void run();	   //[public abstract] default
 			String move(int x,int y); //[public abstract] String move(int x,int y);
 		}
 	
 	interface lable{ }
 	interface lable{ int NUM=0; }
 	interface lable{ void run();}
 	
 	class Test extends Object implements Ia,Ib,Ic{
 		
 	}
 	
 */

interface Ia{
	int AGE = 100;
	String GENDER = "��";
	String print();
	void message(String str);
}

interface Ib{
	int AGE = 10;
	void info();
	String val(String s);
}

class Test extends Object implements Ia,Ib{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}
	
}



public class Ex03_Interface {

	public static void main(String[] args) {
		Test t = new Test();
		Ia ia = t; //�θ�� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�(������)
		ia.message("AA");
		System.out.println(ia.AGE);
		Ib ib = t;
		System.out.println(ib.AGE);
		
	}

}
