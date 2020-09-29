import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 	File ó�� (Disk) : �� Byte������ read, write
 	��Ƹ�Ƽ� �ѹ��� read,write �ϰ���� 
 	��������� ����: buffer
 	1.I/O�� ���ɰ��� ����
 	2.Line ������ ó���� ����(����)
 	
 	BufferedInputStream >> ������Ʈ��(���������� ���� �Ұ���) (��Ŭ���� ���� FileInputStream...) 	
 	�����ڸ� ���ؼ� �����ϴ� ����� �������
 	
 */
public class Ex04_Stream_Buffer {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null; 
		
		try {
			fos = new FileOutputStream("data.txt"); //������ ������ �ڵ����� ���� ����
			bos = new BufferedOutputStream(fos);
			
			for(int i=0;i<10;i++) {
				bos.write('A'); //10���� A write
			}
			
			
			//JAVA Buffer�� ������ ũ�⸦ ���� ����: 8kbyte: 8192byte
			//1. buffer �ȿ� ������ ä������ client�� ����, ������ ���: ���������� flush�� ���ư�
			//2. buffer �ȿ� ������ �� ä������ �ʾƵ� ������ ���� ����(flush() ����� ȣ��, close() ->�ڵ����� ���)
			//3. bos.close() -> �ڿ� ������ �� >> ���������� flush() ȣ��
			//bos.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {

			}
		}

	}

}
