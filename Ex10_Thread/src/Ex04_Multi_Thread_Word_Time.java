import javax.swing.JOptionPane;

/*
 	2개의 작업을 동시에 실행
 	
 */

class WordTime extends Thread{
	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			try {
				System.out.println("남은 시간: "+i);
				sleep(1000); //cpu를 점유하고 sleep을 만나면 1초만 쉬고 나와
							//1초 간격으로 실행하겠다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}



public class Ex04_Multi_Thread_Word_Time {
	public static void main(String[] args) {
		WordTime time = new WordTime();
		time.start();
		
		String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("입력값: "+inputdata);

	}

}
