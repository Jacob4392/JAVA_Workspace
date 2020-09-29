import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class WorkExercise_0831_MyDos  {
	
    static String defaultPath = "C:"+File.separator+"Temp";
    Scanner sc;
    File f;
    
    public static void main(String[] args) throws IOException {
    	
    	System.out.println("HELP 입력가능한 명령어를 보여줍니다. ex)help");
    	WorkExercise_0831_MyDos mydos = new WorkExercise_0831_MyDos();
    	while(true) {
    		mydos.run();
    	}
    }//main 끝
    
    
    void run() throws IOException {
    		
    	try {
			
    		f = new File(defaultPath);
        	
            String input = null;
     
            while (true) {

                System.out.print(defaultPath.toUpperCase() + ">");
                sc = new Scanner(System.in);
                StringTokenizer st = new StringTokenizer(sc.nextLine().trim()," ");
                ArrayList<String> alist = new ArrayList<String>();
                while(st.hasMoreTokens()) {
                	input = st.nextToken();
                	alist.add(input);
                }
                System.out.println();
            	if(!f.exists()) f.mkdir();
                
                if (alist.get(0).equalsIgnoreCase("exit")) {
                	System.out.println("프로그램을 종료합니다");
                    System.exit(0);
                }
                if (!alist.get(0).equals("")) {
                    if (alist.get(0).equalsIgnoreCase("dir")) {
                    	directoryList(alist);
                    }else if (alist.get(0).equalsIgnoreCase("type")) {
                        readTextFile(alist); 
                    }else if (alist.get(0).equalsIgnoreCase("help")) {
                        displayHelp(alist);
                    }else if (alist.get(0).equalsIgnoreCase("md") || alist.get(0).equalsIgnoreCase("mkdir")) {
                        makeDirectory(alist);
                    }else if (alist.get(0).equalsIgnoreCase("rd") || alist.get(0).equalsIgnoreCase("rmdir")) {
                    	deleteDirectory(alist);
                    }else if (alist.get(0).equalsIgnoreCase("cd") || alist.get(0).equalsIgnoreCase("cd..")) {
                        changeDirectory(alist);
                    }else if (alist.get(0).equalsIgnoreCase("ren") || alist.get(0).equalsIgnoreCase("rename")) {
                        renameDirectory(alist);
                        
                    }else {
                        System.out.println("'"
                                        + alist.get(0)
                                        + "'은(는) 내부 또는 외부 명령, 실행할 수 있는 프로그램, 또는 배치 파일이 아닙니다");
                    }
                    System.out.println();
                    
                    
                }//if문
            }//while문
    		
		}catch (Exception e) {
			SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd  a HH:mm");
			File tempFile = File.createTempFile("Exception_loglist",".tmp");
			
			System.out.println("Exception log 저장경로: "+ tempFile);
			System.out.println();
			
			FileWriter fw = new FileWriter(tempFile,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw,true);
			
			String currDir = System.getProperty("user.dir");
			pw.write(df2.format(new Date(tempFile.lastModified()))+"\n");
			pw.write(currDir + File.separator +"WorkExercise_0831_MyDos.java"+"\n");
			pw.write("원인: "+e.getMessage()+"\n");
			
			pw.close();
			
		}finally {
			
		}
    	
    		
    }//run() 끝
    
	void directoryList(ArrayList<String> alist) {
		
		if(alist.size() != 1) {
			System.out.println("다시 입력해주세요.");
		}else {
			System.out.println("[full path: "+defaultPath.toUpperCase()+"]");
			f = new File(defaultPath);
			File[] files = f.listFiles();
			ArrayList<File> subdir = new ArrayList<File>();

			
			for(int i=0;i<files.length;i++) {
				String filename = files[i].getName();
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd  a HH:mm");
				String attribute = "";
				String size = "";
				
				if(files[i].isDirectory()) {
					attribute = "<DIR>";
					subdir.add(files[i]); 
				}else {
					size = files[i].length() + "Byte";
					attribute  = f.canRead( ) ? "R" : " ";
					attribute += f.canWrite() ? "W" : " ";
					attribute += f.isHidden() ? "H" : " ";
				}	
				
				System.out.printf("%s	%3s	%6s	%s\n",
								df.format(new Date(files[i].lastModified())),
								attribute,
								size,
								filename);
			}//for문 끝
			
			int dirnum = subdir.size(); //폴더개수
			int filenum = files.length - dirnum; //전체파일에서 -폴더개수 = 파일갯수
			
			System.out.println("[Current dirNum]: "+dirnum);
			System.out.println("[Current fileNum]: "+filenum);
			System.out.println("*******************************");
		}//if-else문 끝
	}//directoryList 끝
	
	void changeDirectory(ArrayList<String> alist) {
        if (alist.size() < 1 || alist.size() > 2) { //1,2만 받는다
        	System.out.println("명령구문이 올바르지 않습니다.");
        	
        	
        }else if(alist.get(0).equalsIgnoreCase("cd") && alist.size() == 1) {
        	System.out.println("다시 입력해주세요");
        }else if(alist.get(0).equalsIgnoreCase("cd") && alist.size()== 2 && !alist.get(1).equals("..")){
        	
			for(int i=0;i<alist.get(1).length();i++) {
	        	if(alist.get(1).length() > 2 && alist.get(1).substring(i, i+1).equalsIgnoreCase(".")) {
	        		System.out.println("다시 입력해주세요.");
	        		return;
	        		
	        	}else if(alist.get(1).length() == 1 && alist.get(1).substring(i, i+1).equalsIgnoreCase(".")) {
	        		System.out.println("다시 입력해주세요.");
	        		return;
	        	}
			}

        	f = new File(defaultPath + File.separator + alist.get(1));
			if(!f.exists() || !f.isDirectory()) {
				System.out.println("유효하지 않은 디렉토리입니다.");
			}else {
				defaultPath += File.separator + alist.get(1);
			}
			
        }else if(alist.get(0).equalsIgnoreCase("cd..") || alist.get(0).concat(alist.get(1)).equalsIgnoreCase("cd..")) {
        
			if(defaultPath.lastIndexOf(File.separator) > 2) {
				defaultPath = defaultPath.substring(0, defaultPath.lastIndexOf(File.separator));
				return;
			}
    	}
    }//changeDirectory() 끝   
	
	void makeDirectory(ArrayList<String> alist) throws IOException {
        if (alist.size() != 2) {
        	System.out.println("명령 구문이 올바르지 않습니다.");
        	
        }else {
    		f = new File(defaultPath+File.separator+alist.get(1));
    		if(alist.get(1).lastIndexOf('.') != -1) {
    			if(f.createNewFile()) System.out.println(alist.get(1)+ " 파일이 생성되었습니다.");
    		}else {
    			if(f.mkdir()) System.out.println(alist.get(1)+" 디렉토리가 생성되었습니다.");
    		}
		}
    }//makeDirectory() 끝
	
	void deleteDirectory(ArrayList<String> alist) {
		
        if (alist.size() != 2) {
            System.out.println("명령 구문이 올바르지 않습니다.");
            
        }else {
        	f = new File(defaultPath +File.separator + alist.get(1));
	        if (!f.exists()) {
	            System.out.println("지정된 파일 또는 디렉토리를 찾을 수 없습니다.");
	        }else if(f.isDirectory()) {
	        	if(f.delete()) System.out.println(alist.get(1)+" 디렉토리가 삭제되었습니다.");
			}else if(f.isFile()) {
				if(f.delete()) System.out.println(alist.get(1)+" 파일이 삭제되었습니다.");
			}
        }
	}//deleteDirectory() 끝
	
	void renameDirectory(ArrayList<String> alist) {
		
		String extension1 = alist.get(1).substring(alist.get(1).lastIndexOf('.')+1);
		String extension2 = alist.get(2).substring(alist.get(2).lastIndexOf('.')+1);
		
		if (alist.size() != 3) {
			System.out.println("명령 구문이 올바르지 않습니다.");
		}else {
			f = new File(defaultPath + File.separator + alist.get(1));
			if(!f.exists()) {
				System.out.println("지정된 파일을 찾을 수 없습니다.");
			}else if(f.isDirectory() && alist.get(1).indexOf('.') == -1 && alist.get(2).indexOf('.') == -1){
				if(f.renameTo(new File(defaultPath + File.separator + alist.get(2))))
					System.out.println(alist.get(1)+" 디렉토리명이 "+alist.get(2)+"으로 변경되었습니다.");
			}else if(f.isFile() && alist.get(1).lastIndexOf('.') != -1 && alist.get(2).lastIndexOf('.') != -1 
					&& extension1.equals(extension2)) {
				if(f.renameTo(new File(defaultPath + File.separator + alist.get(2))))
					System.out.println(alist.get(1)+" 파일명이 "+alist.get(2)+"으로 변경되었습니다.");
			}else if(f.isFile() && alist.get(1).lastIndexOf('.') != -1 && alist.get(2).lastIndexOf('.') != -1 
					&& !extension1.equals(extension2)) {
				System.out.println("파일의 확장명을 변경하면 사용할 수 없게될 수도 있습니다. 변경하시겠습니까?(Y/N)");
				while(true) {
					String str = sc.nextLine();
					if(str.equalsIgnoreCase("Y")) {
						if(f.renameTo(new File(defaultPath + File.separator + alist.get(2))))
							System.out.println(alist.get(1)+" 파일명이 "+alist.get(2)+"으로 변경되었습니다.");
						return;
					}else if(str.equalsIgnoreCase("N")) {
						return;
					}else {
						System.out.println("다시 입력해주세요.(Y/N)");
					}
				}

					
				
			}
		}
	}//renameDirectory() 끝
	
	void readTextFile(ArrayList<String> alist) throws IOException {
		
		if(alist.size() != 2) {
			System.out.println("명령 구문이 올바르지 않습니다.");
		}else {
			
			try {
				f = new File(defaultPath + File.separator + alist.get(1));
				
				if(!f.exists() || !f.isFile()) {
					System.out.println("지정된 파일을 찾을 수 없습니다.");
				}else {
					FileReader fr = new FileReader(defaultPath + File.separator + alist.get(1));
					BufferedReader br = new BufferedReader(fr);
					
					int data = 0;
					while((data = br.read()) != -1) {
						System.out.print((char)data);
					}
					System.out.println();
					br.close();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally {
				
			}
		}
	}//readTextFile() 끝
   
	void displayHelp(ArrayList<String> alist) {

			System.out.println("CD          현재 디렉토리 이름을 보여주거나 바꿉니다.             ex)cd [디렉토리명]");
			System.out.println("CD..        이전 디렉토리로 돌아갑니다.                      ex)cd ..");
			System.out.println("DIR         현재 디렉토리에 있는 파일과 하위 디렉토리 목록을 보여줍니다. ex)dir");
			System.out.println("MD(MKDIR)   파일 또는 디렉토리를 만듭니다.                    ex)md [파일명 또는 디렉토리명]");
			System.out.println("RD(RMDIR)   파일 또는 디렉토리를 지웁니다.                    ex)rd [파일명 또는 디렉토리명]");
			System.out.println("REN(RENAME) 파일 이름을 바꿉니다.                          ex)ren [파일명 또는 디렉토리명]");
			System.out.println("TYPE        텍스트 파일의 내용을 보여줍니다.                   ex)type [파일명]");
			System.out.println("HELP        입력가능한 명령어를 보여줍니다.                    ex)help");
			System.out.println("EXIT        프로그램을 종료합니다                                                           ex)exit");
	}//displayHelp() 끝
	
}