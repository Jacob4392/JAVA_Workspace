/*
 * Ŭ������ ���赵�̴�, Ÿ���̴�.
 * Ŭ���� == ���赵 == Ÿ��
 * Ŭ������ ��üȭ�� ���ؼ� ��밡���ϴ�(���� ���� ����)
 * ���α׷� ���迡���� new��� �����ڸ� ���ؼ� memory�� ����� >> ���� ���� (��ü : �ν��Ͻ�)��� �Ѵ�.
 * 
 * ���赵 2������ ������
 * 
 * 1. main �Լ��� ������ ���赵 >> �������� ������ ������ Ŭ����
 * >> java Ex04_Ref_Type >> ���� �ȴٴ� �ǹ�
 * 2. main �Լ��� ���� ���赵 >> ������ �ִ� ���� >> ���̺귯��(lib)
 * 
 * 
 * 
 * 
 */


class Apt2{
	int door = 10; //member field, instance variable ...
	int window = 20;
	
}



public class Ex04_Ref_Type {

	public static void main(String[] args) {
		//Apt2 -> ���赵 >> ��üȭ >> �޸𸮿� �÷��� >> new ������ �̿�(������ ���)
		//Ŭ������ �ʱ�ȭ(�ּҰ��� ���� �ϴ� ��) >>�޸𸮿� �ø��� ��
		Apt2 lgapt = new Apt2(); // Apt2 ����Ÿ��
		//lgapt(��������, ��ü����(�ּҸ� ������ �ִ� ����))
		System.out.println("lgapt: "+ lgapt); //Apt2 + @ + 15db9742
		
		Apt2 ssapt = lgapt; //�Ҵ絵 �ּҸ� ������ �ϴ� ���(�ʱ�ȭ�ϴ� ��� �߿� �ϳ�)
		ssapt.door = 1000;
		
		System.out.println(lgapt.door);
		

	}

}
