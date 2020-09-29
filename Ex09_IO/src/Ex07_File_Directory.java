import java.io.File;

/*
 	���� ������ �ٷ�� Ŭ���� 
 	
 	java: ����, ���� �ϳ��� Ŭ����: file
 	>>a.txt ����, ����, ����, ���� read
 	>>Temp ����, ����, ����, ���� read
 	
 	C#: ����(file), ����(Directory)
 	
 	������: C:\\, D:\\ >> C:\\Temp\\a.txt
 	�����: ���� ������ �߽����� >> ../ >> /
 	
 	
 	
 	
 */
public class Ex07_File_Directory {
	public static void main(String[] args) {
		String path= "C:\\Temp\\file.txt";
		File f = new File(path);
		//File Ŭ������ file.txt ������ read�� �� ����
		//�پ��� ������ �ľ��� �� �ִ�.
		
		System.out.println("���� ��: "+f.getName());
		System.out.println("*��ü���: "+f.getPath());
		System.out.println("������: "+f.getAbsolutePath());
		System.out.println("*�� ������: "+f.isDirectory());//false
		System.out.println("*�� �����̴�: "+f.isFile());//true
		System.out.println("����ũ��: "+f.length());//byte������ return
		System.out.println("�θ���: "+f.getParent());
		System.out.println("�������翩��(����,����): "+f.exists());
		
		//f.createNewFile(); ���� ����
		//f.delete(); return true, false
		//f.canRead(); �б� �����ϴ�
		
		
		
		
	}

}
