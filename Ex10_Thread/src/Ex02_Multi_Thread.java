/*
 	Thread: 프로세스에서 하나의 최소 실행단위(흐름) >> method
 	>>stack 여러개 > multi thread
 	
 	Thread 생성하는 방법
 	1. Thread 클래스를 상속 -->> class Test extends Thread
 	>> 새로운 stack 만들고 올라가서 실행할 준비를 함
 	>>run() >> 새로운 stack에 가장 먼저 실행되는 함수
 	>> Thread는 일반클래스 >> 스스로 객체생성이 가능
 	
 	2. class Test extends Car implements Runnuble
 	>>Runnuble은 쓰레드가 아니다. run()함수를 구현하도록 강제만 하고 있는 역할
 	>>Thread th = new Thread(new Test());
 	
 	
 	
 */

class Thread_1 extends Thread{
	@Override
	public void run() {//이 함수는 main() 함수와 동일한 역할
						//run(); 새로운 stack에 처음 올라가서 실행되는 함수
		for(int i=0; i<10000;i++) {
			System.out.println("Thread_1: "+i+this.getName());//내부적으로 이름이 생성되어 있음
		}
		System.out.println("Thread_1 run() END");
	}
}

class Thread_2 implements Runnable{
	@Override
	public void run() {//이 함수는 main() 함수와 동일한 역할
						//run(); 새로운 stack에 처음 올라가서 실행되는 함수
		for(int i=0; i<10000;i++) {
			System.out.println("Thread_2: "+i);//내부적으로 이름이 생성되어 있음
		}
		System.out.println("Thread_2 run() END");
	}
}

public class Ex02_Multi_Thread {
	public static void main(String[] args) {
		//1번
		Thread_1 th1 = new Thread_1();
		th1.start(); //Point,start()와 동시에 memory에 call stack을 새로 생성하고
					//run() 함수를 stack에 올려놓는 것 까지 start()가 행함.
		
		//2번
//		Thread_2 th2 = new Thread_1();
//		th2.start(); //Point,start()와 동시에 memory에 call stack을 새로 생성하고
					//run() 함수를 stack에 올려놓는 것 까지 start()가 행함.
		
		//2번
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
