import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Ex09_File_Format {

	public static void main(String[] args) {
		File dir = new File("C:\\Temp");
		File[] files = dir.listFiles();
		for(int i=0;i<files.length;i++) {
			File file = files[i];
			String name = file.getName();//파일명이 될수도 폴더명이 될수도 있다
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mma");
			String attribute = "";
			String size = "";
			if(files[i].isDirectory()) {
				attribute = "<DIR>";
			}else { //a.txt, 1.jpg
				size = file.length()+"byte";
				attribute = file.canRead() ? "R": " ";
				attribute += file.canWrite()? "W":" ";
				attribute += file.isHidden()? "H":" ";
				
			}
			System.out.printf("%s   %3s   %10s   %s   \n",
					dt.format(new Date(file.lastModified())),
					attribute,
					size,
					name);
		}

	}

}
