import java.io.IOException;

/*
 	>>CD �� �� ���α׷� ��ġ
 	>>1.��ġ ���� >> C:Temp >> ����
 	>>2.������ ������ ������ ���α׷� ��ġ
 	>>3.���� ��ġ >> C:Temp >> ������ ���� ����
 	>>4.������ ��ġ >> ���� ���� >> ������ ���� ����
 
 
 
 */



public class Ex03_finally {
	
	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("FILE DELETE");
	}
	
	
	public static void main(String[] args) {
		

		//�����δ� ���ܰ� �ƴ�����
		//������ ���� �߻�: �����ڰ� ���Ƿ� ������ �߻����Ѽ� ������ ���ܸ� ó���ϴ� ���
		//�ڵ�: ���� ��ü�� ���� ����, new �߻�, ���ܿ� ���õ� �������� �˷���� ��>> throw
		//try catch finally ���� �ȿ���, throw new IOException();
		//fileDelete();

		
		try {
			copyFiles();
			startInstall();
			throw new IOException("Install �߿� ������ �߻�"); //�����ڰ� ���Ƿ� ���ܸ� �߻�
		}catch (Exception e) {
			System.out.println("���� �޽��� ���: "+ e.getMessage());
			//fileDelete();
		}finally { //���� ���� ��, ���ܰ� �߻��ص� ����, �߻����� �ʾƵ� ����
			fileDelete();
			
			//�ڿ��� �����ϴ� �ڵ��...
		}
		System.out.println("main end");
		//**************************************************************************
		//�Լ��� ��������: return�� �ִ� �ϴ��� finally ���� ���� �����(���� �����)
		
	}

}
