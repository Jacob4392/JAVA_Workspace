import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	read, write ����� �޸𸮰� �ƴ� File(�������� file) >> 1.txt, data.txt
 	FileInputStream
 	FileOutputStream
 	������, Ư������, ���� � �а� ���� ����(�ѱ�x)
 	
 	
 	
 	
 */
public class Ex02_Point_FileStream {
	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;
		String path = "C:\\Temp\\a.txt";
		
		try {
			fs = new FileInputStream(path);
			fos = new FileOutputStream("C:\\Temp\\new.txt");
			//FileOutputStream
			//1.write�ϴ� ������ �������� ������ >> ������ ���� (����� �����ϰ� ����)
			//FileOutputStream("C:\\Temp\\new.txt",false);
			//false >> overwrite
			
			//new FileOutputStream("C:\\Temp\\new.txt",true);
			//true >> append
			
			int data = 0;
			while((data = fs.read())!=-1) {
				//System.out.println("����: "+data);
				
				//���ڰ�: char c = (char)data;
				//System.out.println("����: "+(char)data);
				fos.write(data); //data�� read�ؼ� >> new.txt�� write �ϰڴ�.
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//���������� ����Ǿ���, ������������ ����Ǿ���
			//�ڿ��� ������ �־�� �Ѵ�.
			//������� �ڿ��� ������ �ʿ�>> ��������� �۾��� ��쿡 ���־�� �� >>������ �÷��Ͱ� �������� �ʱ� ����
			//close >> ��������� �Ҹ��� ȣ��
			try {
				fs.close();
				fos.close();
			} catch (IOException e) { //������ �ʾҴµ� �ݴ� ���� �ƴ��� �Ͽ� try catch �䱸
				e.printStackTrace();
			}
			
		}
		
		

	}

}
