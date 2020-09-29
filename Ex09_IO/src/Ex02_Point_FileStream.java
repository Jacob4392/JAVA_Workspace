import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	read, write 대상이 메모리가 아닌 File(물리적인 file) >> 1.txt, data.txt
 	FileInputStream
 	FileOutputStream
 	영문자, 특수문자, 공백 등만 읽고 쓸수 있음(한글x)
 	
 	
 	
 	
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
			//1.write하는 파일이 존재하지 않으면 >> 파일을 생성 (기능을 내장하고 있음)
			//FileOutputStream("C:\\Temp\\new.txt",false);
			//false >> overwrite
			
			//new FileOutputStream("C:\\Temp\\new.txt",true);
			//true >> append
			
			int data = 0;
			while((data = fs.read())!=-1) {
				//System.out.println("정수: "+data);
				
				//문자값: char c = (char)data;
				//System.out.println("정수: "+(char)data);
				fos.write(data); //data를 read해서 >> new.txt에 write 하겠다.
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//정상적으로 수행되었던, 비정상적으로 수행되었던
			//자원을 해제해 주어야 한다.
			//명시적인 자원의 해제가 필요>> 여러사람이 작업할 경우에 해주어야 함 >>가비지 컬렉터가 관리하지 않기 때문
			//close >> 명시적으로 소멸자 호출
			try {
				fs.close();
				fos.close();
			} catch (IOException e) { //열지도 않았는데 닫는 것은 아닌지 하여 try catch 요구
				e.printStackTrace();
			}
			
		}
		
		

	}

}
