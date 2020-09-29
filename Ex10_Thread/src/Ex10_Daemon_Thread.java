/*
 	데몬 스레드 : 보조 Thread
 	주 thread가 종료되면 보조 thread도 종료된다.
 	
 	한글 >> 작업(글쓰기) >> 3초간격으로 저장옵션
 	한글작업 종료 시 >> 보조 종료
 	
 	
 */
public class Ex10_Daemon_Thread implements Runnable{
	static boolean autosave = false;
	public static void main(String[] args) {
		//JVM 스레드 생성(stack) >> main 함수 >> 주 스레드
		
		Thread daemonthread = new Thread(new Ex10_Daemon_Thread());
		//daemonthread는 main스레드의  보조 스레드(Daemon)
		//main 스레드(non-daemon)
		//daemonthread는 main의 daemon스레드(main과 생명을 같이 함)
		//Point
		daemonthread.setDaemon(true);//옵션
		daemonthread.start();
		
		//주 작업(한글 작업)
		for(int i=0;i<=30;i++) {
			try {
				Thread.sleep(1000); //1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main Thread 한글 작업 진행: "+i);
			if(i == 3) { //i가 3 되는 시점부터
				System.out.println("i: "+i);
				autosave = true;
				
			}
		}
		
	}
	
	public void autoSave() {
		System.out.println("한글 작업이 5초 간격으로 자동 저장");
	}
	//보조작업(Daemon)
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(autosave) { //static boolean autosave = false;
				autoSave(); //저장작업 진행
			}
		}
	}

}
