import kr.or.bit.common.Car;

/*
 Ŭ���� == ���赵 == Ÿ��
 
 Ŭ���� ���� ��� : [�ʵ� + �Լ�] + �������Լ�
 *�ʵ�(field) >> ��������(��ȣ��..., ��������(�ӵ� ..., ����(��ǰ) ���� �ڿ� >> ����
 *�Լ� (function) >> ���, ���� 
 *�߰������� ������ >> �ʵ��� �ʱ�ȭ�� �������� �ϴ� �Լ�
 
 
 Ŭ����, �ʵ�, ������, �Լ�: ����(����) >> ������, ������, ������(modifier)
 >>public, private, default, protected
 
 1. public class Car{} //�ڵ��� ���赵 (kr.or.bit.common)
 2. class AirPlane{}  // �����Ϸ��� �ڵ����� (����������) ������ default�� ���δ�.
 	>> default class Air .....
 	>>** default �����ڴ�: [���� ���������� ���ٰ���][�ٸ� ������ ������ ���� ���� �Ұ�]
 	>>** default �����ڴ�: ���� ����(package) ������ [������ �������θ� ����� ����](���)
 3. class Air >> src ����
 4. ������ ��: public class Ex02_Scope_Location ���� �ȿ��� Ŭ���� ���� ����
 
 �ϳ��� �������� �ڹ������� �������� Ŭ������ ���� �� �ֳ�?
 Ex01_main.java >> class Test{}
 �� ������ �ϳ� >> public �����ڴ� �� ���� >> �������� default 
 
 */

class Test{ //���� //default
	int data; //default
	public int p_iv;
	private int pri_iv; //�����, ���ߴ�, ĸ��ȭ
}


public class Ex01_Main {

	public static void main(String[] args) {
		Car c = new Car();
		c.window =10;
		//AirPlane air = new AirPlane();
		Air air = new Air();
		
		Test t = new Test();
		t.data = 100;
		t.p_iv = 200;
		
	}

}
