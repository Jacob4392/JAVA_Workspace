import java.io.File;

/*
 	����â�� java Ex08_File_Directory C:\\Temp
 	Run Configuration â���� arguments C:\\Temp -> Run
 */


public class Ex08_File_Directory {

	public static void main(String[] args) {
		//System.out.println(args.length);
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		if(args.length != 1) {
			System.out.println("����: java ���ϸ�[���丮��]");
			System.exit(0); //��������
		}
		
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()) {
			//�������� �ʰų� �Ǵ� ���丮�� �ƴ϶��
			System.out.println("��ȿ���� ���� ����Դϴ�.");
			System.exit(0);
		}
		
		//���� �����ϴ� ��ο� �ִ� �������
		File[] files = f.listFiles(); 
		//C:\\Temp >> �����ȿ��� ���ϵ� �ְ�, ������ �ִ�.
		//��� �ڿ��� �迭�� �Ҵ��ϰڴ�.
		//File ��ü �ϳ���: a.txt�� ���� ����
		//File ��ü �ϳ���: Temp ������ ���� ������ ��� ����
		for(int i=0;i<files.length;i++) {
			String name = files[i].getName(); //���ϸ�, �������� �� �� ����
			System.out.println(files[i].isDirectory() ? "[DIR]"+name:name);					
		}
		
		
		
	}
}
