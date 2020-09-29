import java.io.File;

/*
 	도스창에 java Ex08_File_Directory C:\\Temp
 	Run Configuration 창에서 arguments C:\\Temp -> Run
 */


public class Ex08_File_Directory {

	public static void main(String[] args) {
		//System.out.println(args.length);
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		if(args.length != 1) {
			System.out.println("사용법: java 파일명[디렉토리명]");
			System.exit(0); //강제종료
		}
		
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()) {
			//존재하지 않거나 또는 디렉토리가 아니라면
			System.out.println("유효하지 않은 경로입니다.");
			System.exit(0);
		}
		
		//실제 존재하는 경로에 있는 폴더라면
		File[] files = f.listFiles(); 
		//C:\\Temp >> 폴더안에는 파일도 있고, 폴더도 있다.
		//모든 자원을 배열에 할당하겠다.
		//File 객체 하나가: a.txt에 대한 정보
		//File 객체 하나가: Temp 폴더에 대한 정보를 담고 있음
		for(int i=0;i<files.length;i++) {
			String name = files[i].getName(); //파일명, 폴더명이 될 수 있음
			System.out.println(files[i].isDirectory() ? "[DIR]"+name:name);					
		}
		
		
		
	}
}
