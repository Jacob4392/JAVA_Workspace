/*
 	프로그램 >> 실행 >> 프로세스 >> 최소 하나의 스레드(하나의 stack)
 	>>JVM이 하나의 main thread(stack) 생성
 	
 	지금까지 : 싱글 프로세스>> 싱글 스레드 >> main 위에 올라가서 하나씩 실행
 	JVM > call stack 생성 > main 함수 동작
 	
 	
 	stack 1개 함수가 10개라도 순차적으로, 한번에 1개의 함수 실행
 */
public class Ex01_Single_Thread {

	public static void main(String[] args) {
		System.out.println("main 일꾼");
		worker1();
		worker2();
		System.out.println("main 일꾼 종료");

	}
	
	static void worker1() {
		System.out.println("1번 일꾼");
	}
	
	static void worker2() {
		System.out.println("2번 일꾼");
	}

}
