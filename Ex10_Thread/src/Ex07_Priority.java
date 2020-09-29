/*
 	�������� Thread ���� ��
 	�⺻������ �켱���� : 5 �⺻��(������ ����) ������(cpu)
 	
 	Min(1) ~ Max(10)
 	
 	
 	
 */

class Pth1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("-----------------------");
		}
	}
}

class Pth2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("|||||||||||||||||||||||");
		}
	}
}

class Pth3 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("**********************");
		}
	}
}

public class Ex07_Priority {
	public static void main(String[] args) {
		Pth1 pth1 = new Pth1();
		Pth2 pth2 = new Pth2();
		Pth3 pth3 = new Pth3();
		
		pth1.setPriority(10);
		pth2.setPriority(1);
		pth3.setPriority(1);
		
		System.out.println(pth1.getPriority());
		System.out.println(pth2.getPriority());
		System.out.println(pth3.getPriority());
		
		pth1.start(); //------- 10 CPU ���� Ȯ���� ����, ���� �� ���� ������ ��
		pth2.start(); //||||||| 1
		pth3.start(); //******* 1

	}

}
