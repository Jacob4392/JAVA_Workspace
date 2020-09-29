import java.io.FileReader;
import java.io.FileWriter;

/*
 	문자기반의 데이터 처리 (char[]로 데이터를 처리)
 	String 클래스 : String Str = "ABC"; -> 내부적으로 char[]로 관리  [A][B][C]
 	
 	한글 1자, 영문1자, ... >> 2byte처리 >> Stream의 크기가 커짐(2byte)
 	
 	Reader, Writer 추상 클래스를 제공
 	
 	대상 파일이면,
 	FileReader, FileWriter
 	
 	
 	
 	
 */
public class Ex05_Reader_Writer {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java"); //read
			fw = new FileWriter("copy_stream.txt"); //파일을 생성해서, 그 파일에 같은 내용을 write하겠다
			
			int data = 0;
			while((data = fr.read())!=-1) {
				//System.out.println(data);

				if(data !='\n' && data !='\r' && data != '\t' && data != ' ') {
					fw.write(data);
					//배포버전(엔터, 공백 제거) >> 압축버전 >> 크기를 줄일 수 있음
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
