import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_ImageCopy {
	public static void main(String[] args) {
		String orifile = "C:\\Temp\\1.jpg";
		String targetfile = "copy.jpg";
		//default 경로: 프로젝트 폴더가 default
		
		
		FileInputStream fs = null;
		FileOutputStream fo = null;
		
		try {
			fs = new FileInputStream(orifile);
			fo = new FileOutputStream(targetfile,false);
			int data = 0;
			while((data = fs.read())!=-1) {
				fo.write(data); //copy.jpg에 byte값 write
			}
			
			
		}catch(Exception e) {
			
		}finally {
			try {
				fs.close();
				fo.close();
			} catch (Exception e2) {
				
			}
		}

	}

}
