/*
 	OOP Ư¡
 	1. ���
 	2. ĸ��ȭ(����ȭ) >> private
 	3. ������
 	
 	
 	1. ���
 	java: child extends Base
 	C#: child : Base
 	
 	2. Ư¡ 
 	2.1 ���� ����� �Ұ�
 	2.2 ���� ���(������ ��� : ���ؼ� �������� Ŭ������ ����� �� ����)
 	2.3 ���߻���� ����(����: interface)
 	
 	3. ���
 	3.1 ������ �ǹ�: ���뼺
 	3.2 ����: �ʱ��� �������� ���� ���
 	3.3 ���뼺 >> ���� >> ��� (�ð�... �����ڿ�(�и�, �߻�ȭ�۾�))
 	
 	4. ��Ӱ��� Memory? (�޸𸮿� �ö󰡴� ����)
 		GrandFather >> Father >> Child
 
 	�����(������)�� ����� ��� Ŭ������ default(���� �ʾƵ�, ������� �ʾƵ�)�� Object Ŭ���� ���
 	class Car extends Object ..����...
 	Object ��� Ŭ������ root(�ֻ���): ��� Ŭ������ �θ�Ŭ����
 	
 	
 
 */

//class Car extends Object{}	

class Car{
	
}


class GrandFather extends Object{
	public GrandFather(){
		System.out.println("GrandFather"); 
	}
	public int gmoney = 5000;
	private int pmoney = 10000; //���� �Ұ�(��ü, ��Ӱ���)
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
		System.out.println(child.gmoney); // �Ҿƹ���
		System.out.println(child.fmoney); // �ƹ���
		System.out.println(child.cmoney); // �ڳ�
		
		
		Car car = new Car();

	}

}
