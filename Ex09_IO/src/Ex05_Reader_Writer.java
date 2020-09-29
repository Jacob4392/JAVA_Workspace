import java.io.FileReader;
import java.io.FileWriter;

/*
 	���ڱ���� ������ ó�� (char[]�� �����͸� ó��)
 	String Ŭ���� : String Str = "ABC"; -> ���������� char[]�� ����  [A][B][C]
 	
 	�ѱ� 1��, ����1��, ... >> 2byteó�� >> Stream�� ũ�Ⱑ Ŀ��(2byte)
 	
 	Reader, Writer �߻� Ŭ������ ����
 	
 	��� �����̸�,
 	FileReader, FileWriter
 	
 	
 	
 	
 */
public class Ex05_Reader_Writer {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java"); //read
			fw = new FileWriter("copy_stream.txt"); //������ �����ؼ�, �� ���Ͽ� ���� ������ write�ϰڴ�
			
			int data = 0;
			while((data = fr.read())!=-1) {
				//System.out.println(data);

				if(data !='\n' && data !='\r' && data != '\t' && data != ' ') {
					fw.write(data);
					//��������(����, ���� ����) >> ������� >> ũ�⸦ ���� �� ����
				}
			}
		} catch (Exception e) {
			
		}finally {
			try {
				fw.close();
				fr.close();
			} catch (Exception e2) {

			}
		}
		

	}

}
