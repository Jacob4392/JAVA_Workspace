import javax.swing.JOptionPane;

/*
 	2���� �۾��� ���ÿ� ����
 	
 */

class WordTime extends Thread{
	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			try {
				System.out.println("���� �ð�: "+i);
				sleep(1000); //cpu�� �����ϰ� sleep�� ������ 1�ʸ� ���� ����
							//1�� �������� �����ϰڴ�.
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
		
		String inputdata = JOptionPane.showInputDialog("���� �Է��ϼ���");
		System.out.println("�Է°�: "+inputdata);

	}

}
