/*
 	Thread: ���μ������� �ϳ��� �ּ� �������(�帧) >> method
 	>>stack ������ > multi thread
 	
 	Thread �����ϴ� ���
 	1. Thread Ŭ������ ��� -->> class Test extends Thread
 	>> ���ο� stack ����� �ö󰡼� ������ �غ� ��
 	>>run() >> ���ο� stack�� ���� ���� ����Ǵ� �Լ�
 	>> Thread�� �Ϲ�Ŭ���� >> ������ ��ü������ ����
 	
 	2. class Test extends Car implements Runnuble
 	>>Runnuble�� �����尡 �ƴϴ�. run()�Լ��� �����ϵ��� ������ �ϰ� �ִ� ����
 	>>Thread th = new Thread(new Test());
 	
 	
 	
 */

class Thread_1 extends Thread{
	@Override
	public void run() {//�� �Լ��� main() �Լ��� ������ ����
						//run(); ���ο� stack�� ó�� �ö󰡼� ����Ǵ� �Լ�
		for(int i=0; i<10000;i++) {
			System.out.println("Thread_1: "+i+this.getName());//���������� �̸��� �����Ǿ� ����
		}
		System.out.println("Thread_1 run() END");
	}
}

class Thread_2 implements Runnable{
	@Override
	public void run() {//�� �Լ��� main() �Լ��� ������ ����
						//run(); ���ο� stack�� ó�� �ö󰡼� ����Ǵ� �Լ�
		for(int i=0; i<10000;i++) {
			System.out.println("Thread_2: "+i);//���������� �̸��� �����Ǿ� ����
		}
		System.out.println("Thread_2 run() END");
	}
}

public class Ex02_Multi_Thread {
	public static void main(String[] args) {
		//1��
		Thread_1 th1 = new Thread_1();
		th1.start(); //Point,start()�� ���ÿ� memory�� call stack�� ���� �����ϰ�
					//run() �Լ��� stack�� �÷����� �� ���� start()�� ����.
		
		//2��
//		Thread_2 th2 = new Thread_1();
//		th2.start(); //Point,start()�� ���ÿ� memory�� call stack�� ���� �����ϰ�
					//run() �Լ��� stack�� �÷����� �� ���� start()�� ����.
		
		//2��
		//Thread_2 th2 = new Thread_2();
		//Thread thread = new Thread(th2);
		
		Thread thread = new Thread(new Thread_2());
		thread.start();
		
		
		for(int i=0; i<10000;i++) {
			System.out.println("main: "+i);
		}
		System.out.println("main END");
		
	}

}
