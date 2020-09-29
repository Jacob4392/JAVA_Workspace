import javax.swing.JOptionPane;

/*
 	단어 맞추기
 	구구단
 	
 	문제가 나오고, 시간이 흘러감, 일정 시간이 지나면 종료되게끔
 	
 	swing, awt 윈도우 프로그램 만들때 이용
 	
 */



public class Ex03_Single_Word_Time {
	public static void main(String[] args) {
		String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("입력값: "+inputdata);
		//게임이 실행되면 구구단 값을 입력받아서 확인, 처리
		timer();
		
	}
	static void timer() {
		for(int i=10;i>0;i--) {
			try {
				System.out.println("남은 시간: "+i);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	

}
