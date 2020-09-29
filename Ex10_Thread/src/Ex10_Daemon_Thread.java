/*
 	���� ������ : ���� Thread
 	�� thread�� ����Ǹ� ���� thread�� ����ȴ�.
 	
 	�ѱ� >> �۾�(�۾���) >> 3�ʰ������� ����ɼ�
 	�ѱ��۾� ���� �� >> ���� ����
 	
 	
 */
public class Ex10_Daemon_Thread implements Runnable{
	static boolean autosave = false;
	public static void main(String[] args) {
		//JVM ������ ����(stack) >> main �Լ� >> �� ������
		
		Thread daemonthread = new Thread(new Ex10_Daemon_Thread());
		//daemonthread�� main��������  ���� ������(Daemon)
		//main ������(non-daemon)
		//daemonthread�� main�� daemon������(main�� ������ ���� ��)
		//Point
		daemonthread.setDaemon(true);//�ɼ�
		daemonthread.start();
		
		//�� �۾�(�ѱ� �۾�)
		for(int i=0;i<=30;i++) {
			try {
				Thread.sleep(1000); //1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main Thread �ѱ� �۾� ����: "+i);
			if(i == 3) { //i�� 3 �Ǵ� ��������
				System.out.println("i: "+i);
				autosave = true;
				
			}
		}
		
	}
	
	public void autoSave() {
		System.out.println("�ѱ� �۾��� 5�� �������� �ڵ� ����");
	}
	//�����۾�(Daemon)
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(autosave) { //static boolean autosave = false;
				autoSave(); //�����۾� ����
			}
		}
	}

}
