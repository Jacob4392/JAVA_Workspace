import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex12_PrintWriter_String_Finder {

	String baseDir = "C:\\Temp"; //검색할 디렉토리
	String word = "Hello"; //검색할 단어
	String save = "result.txt"; //Hello 단어가 들어있는 파일을 찾아서 result.txt에 저장
	
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
				continue; //파일이 아닌경우에 아래코드를 skip
			}
			//파일이라면
			br = new BufferedReader(new FileReader(files[i]));
			
			//a.txt >> 한 문장씩 read
			String line = "";
			while((line = br.readLine())!=null) {
				if(line.indexOf(word)!=-1) { //a.txt 라인단위로 read하는데
											//Hello가 포함되어 있으면
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
