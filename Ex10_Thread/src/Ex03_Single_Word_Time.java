import javax.swing.JOptionPane;

/*
 	�ܾ� ���߱�
 	������
 	
 	������ ������, �ð��� �귯��, ���� �ð��� ������ ����ǰԲ�
 	
 	swing, awt ������ ���α׷� ���鶧 �̿�
 	
 */



public class Ex03_Single_Word_Time {
	public static void main(String[] args) {
		String inputdata = JOptionPane.showInputDialog("���� �Է��ϼ���");
		System.out.println("�Է°�: "+inputdata);
		//������ ����Ǹ� ������ ���� �Է¹޾Ƽ� Ȯ��, ó��
		timer();
		
	}
	static void timer() {
		for(int i=10;i>0;i--) {
			try {
				System.out.println("���� �ð�: "+i);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	

}
