import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex12_PrintWriter_String_Finder {

	String baseDir = "C:\\Temp"; //�˻��� ���丮
	String word = "Hello"; //�˻��� �ܾ�
	String save = "result.txt"; //Hello �ܾ ����ִ� ������ ã�Ƽ� result.txt�� ����
	
	void Find() throws IOException {
		File dir = new File(baseDir);
		if(!dir.isDirectory()) {
			System.out.println("invalid directory");
			System.exit(0);
		}
		PrintWriter writer = new PrintWriter(new FileWriter(save));
		BufferedReader br = null;
		
		File[] files = dir.listFiles();
		for(int i=0;i<files.length;i++) {
			if(!files[i].isFile()) {
				continue; //������ �ƴѰ�쿡 �Ʒ��ڵ带 skip
			}
			//�����̶��
			br = new BufferedReader(new FileReader(files[i]));
			
			//a.txt >> �� ���徿 read
			String line = "";
			while((line = br.readLine())!=null) {
				if(line.indexOf(word)!=-1) { //a.txt ���δ����� read�ϴµ�
											//Hello�� ���ԵǾ� ������
					writer.write("word ="+files[i].getAbsolutePath()+"\n");
					
				}
			}
			writer.flush();
		}
		br.close();
		writer.close();
		
	}
	
	public static void main(String[] args) {
		Ex12_PrintWriter_String_Finder StringFinder = new Ex12_PrintWriter_String_Finder();
		try {
			StringFinder.Find();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
