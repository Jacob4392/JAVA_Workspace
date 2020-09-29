import java.io.File;
import java.util.ArrayList;

public class Ex10_File_SubList {

	static int totalfiles = 0;
	static int totaldirs = 0;
	
	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("사용법: java [실행할 파일명] [경로명]");
			System.out.println("예시   : java Ex10_File_SubList C:\\Temp");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		if(!f.exists()||!f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리");
			System.exit(0);
		}
		//정상적인 경로, 폴더 존재
		
		printFileList(f); //재귀호출
		System.out.println("누적 총 파일수: "+totalfiles);
		System.out.println("누적 총 폴더수: "+totaldirs);

		
	}
	
	
	
	static void printFileList(File dir) {
		System.out.println("[full path: "+dir.getAbsolutePath()+"]");
	
		ArrayList<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();
		//[0] a.txt
		//[1] aaa
		//[2] bbb
		//[3] file.jpg
		for(int i=0;i<files.length;i++) {
			String filename = files[i].getName();//폴더명 or 파일명
			if(files[i].isDirectory()) { //폴더
				filename = "<DIR> [" +filename + "]";
				//Point
				subdir.add(i); //Why?
				//[0] a.txt
				//[1] aaa
				//[2] bbb
				//[3] file.jpg
			}else {
				filename = filename + " / "+files[i].length()+"Byte";
			}
			System.out.println("   "+filename);
		}
		int dirnum = subdir.size(); //폴더개수
		int filenum = files.length - dirnum; //전체파일에서 -폴더개수
		
		//누적(폴더개수, 파일개수)
		//static 자원에다가
		totaldirs += dirnum; //총 누적(하위폴더) 개수
		totalfiles += filenum; //총 누적(하위파일) 개수
		
		
		System.out.println("[Current dirNum]: "+dirnum);
		System.out.println("[Current fileNum]: "+filenum);
		System.out.println("*******************************");
		
		//Point(하위폴더에 있는 자원도 보고 싶을 때는 어떻게?)
		
		for(int j=0;j<subdir.size();j++) {
			int index = subdir.get(j);//[1],[2]
			printFileList(files[index]); //내가 내 자신을 또 호출(재귀호출)
			
		}
		
	}

}
