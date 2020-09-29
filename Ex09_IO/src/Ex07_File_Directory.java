import java.io.File;

/*
 	파일 폴더를 다루는 클래스 
 	
 	java: 파일, 폴더 하나의 클래스: file
 	>>a.txt 생성, 수정, 삭제, 정보 read
 	>>Temp 생성, 수정, 삭제, 정보 read
 	
 	C#: 파일(file), 폴더(Directory)
 	
 	절대경로: C:\\, D:\\ >> C:\\Temp\\a.txt
 	상대경로: 현재 파일을 중심으로 >> ../ >> /
 	
 	
 	
 	
 */
public class Ex07_File_Directory {
	public static void main(String[] args) {
		String path= "C:\\Temp\\file.txt";
		File f = new File(path);
		//File 클래스가 file.txt 정보를 read할 수 있음
		//다양한 정보를 파악할 수 있다.
		
		System.out.println("파일 명: "+f.getName());
		System.out.println("*전체경로: "+f.getPath());
		System.out.println("절대경로: "+f.getAbsolutePath());
		System.out.println("*너 폴더니: "+f.isDirectory());//false
		System.out.println("*너 파일이니: "+f.isFile());//true
		System.out.println("파일크기: "+f.length());//byte단위로 return
		System.out.println("부모경로: "+f.getParent());
		System.out.println("파일존재여부(파일,폴더): "+f.exists());
		
		//f.createNewFile(); 파일 생성
		//f.delete(); return true, false
		//f.canRead(); 읽기 가능하니
		
		
		
		
	}

}
