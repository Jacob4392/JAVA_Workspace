import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ex11_PrintWriter {

	public static void main(String[] args) {
		//��������� ����
		//ģ��ô : printf(), String.format()
		//������(��¹�)
		//����, ũ����Ż ����Ʈ ����Ʈ����
		//�ζ� ��� 
		try {
			
			//write
			PrintWriter pw = new PrintWriter("C:\\Temp\\homework.txt");
			pw.println("********************************");
			pw.println("*           HOMEWORK           *");
			pw.println("********************************");
			pw.printf("%3s : %5d  %5d  %5d  %5.1f","�ƹ���",100,90,50,(float)((100+90+50)/3));
			pw.println();
			pw.close();
			
			//read(line ������ ���� �� ����) ���ʹ����� ���� �� ����
			FileReader fr = new FileReader("C:\\Temp\\homework.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
			br.close();
			fr.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			//����^^
		}
			
		
		
		
	}

}
