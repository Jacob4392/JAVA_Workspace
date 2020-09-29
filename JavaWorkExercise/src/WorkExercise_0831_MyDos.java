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
    	
    	System.out.println("HELP �Է°����� ��ɾ �����ݴϴ�. ex)help");
    	WorkExercise_0831_MyDos mydos = new WorkExercise_0831_MyDos();
    	while(true) {
    		mydos.run();
    	}
    }//main ��
    
    
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
                	System.out.println("���α׷��� �����մϴ�");
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
                                        + "'��(��) ���� �Ǵ� �ܺ� ���, ������ �� �ִ� ���α׷�, �Ǵ� ��ġ ������ �ƴմϴ�");
                    }
                    System.out.println();
                    
                    
                }//if��
            }//while��
    		
		}catch (Exception e) {
			SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd  a HH:mm");
			File tempFile = File.createTempFile("Exception_loglist",".tmp");
			
			System.out.println("Exception log ������: "+ tempFile);
			System.out.println();
			
			FileWriter fw = new FileWriter(tempFile,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw,true);
			
			String currDir = System.getProperty("user.dir");
			pw.write(df2.format(new Date(tempFile.lastModified()))+"\n");
			pw.write(currDir + File.separator +"WorkExercise_0831_MyDos.java"+"\n");
			pw.write("����: "+e.getMessage()+"\n");
			
			pw.close();
			
		}finally {
			
		}
    	
    		
    }//run() ��
    
	void directoryList(ArrayList<String> alist) {
		
		if(alist.size() != 1) {
			System.out.println("�ٽ� �Է����ּ���.");
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
			}//for�� ��
			
			int dirnum = subdir.size(); //��������
			int filenum = files.length - dirnum; //��ü���Ͽ��� -�������� = ���ϰ���
			
			System.out.println("[Current dirNum]: "+dirnum);
			System.out.println("[Current fileNum]: "+filenum);
			System.out.println("*******************************");
		}//if-else�� ��
	}//directoryList ��
	
	void changeDirectory(ArrayList<String> alist) {
        if (alist.size() < 1 || alist.size() > 2) { //1,2�� �޴´�
        	System.out.println("��ɱ����� �ùٸ��� �ʽ��ϴ�.");
        	
        	
        }else if(alist.get(0).equalsIgnoreCase("cd") && alist.size() == 1) {
        	System.out.println("�ٽ� �Է����ּ���");
        }else if(alist.get(0).equalsIgnoreCase("cd") && alist.size()== 2 && !alist.get(1).equals("..")){
        	
			for(int i=0;i<alist.get(1).length();i++) {
	        	if(alist.get(1).length() > 2 && alist.get(1).substring(i, i+1).equalsIgnoreCase(".")) {
	        		System.out.println("�ٽ� �Է����ּ���.");
	        		return;
	        		
	        	}else if(alist.get(1).length() == 1 && alist.get(1).substring(i, i+1).equalsIgnoreCase(".")) {
	        		System.out.println("�ٽ� �Է����ּ���.");
	        		return;
	        	}
			}

        	f = new File(defaultPath + File.separator + alist.get(1));
			if(!f.exists() || !f.isDirectory()) {
				System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			}else {
				defaultPath += File.separator + alist.get(1);
			}
			
        }else if(alist.get(0).equalsIgnoreCase("cd..") || alist.get(0).concat(alist.get(1)).equalsIgnoreCase("cd..")) {
        
			if(defaultPath.lastIndexOf(File.separator) > 2) {
				defaultPath = defaultPath.substring(0, defaultPath.lastIndexOf(File.separator));
				return;
			}
    	}
    }//changeDirectory() ��   
	
	void makeDirectory(ArrayList<String> alist) throws IOException {
        if (alist.size() != 2) {
        	System.out.println("��� ������ �ùٸ��� �ʽ��ϴ�.");
        	
        }else {
    		f = new File(defaultPath+File.separator+alist.get(1));
    		if(alist.get(1).lastIndexOf('.') != -1) {
    			if(f.createNewFile()) System.out.println(alist.get(1)+ " ������ �����Ǿ����ϴ�.");
    		}else {
    			if(f.mkdir()) System.out.println(alist.get(1)+" ���丮�� �����Ǿ����ϴ�.");
    		}
		}
    }//makeDirectory() ��
	
	void deleteDirectory(ArrayList<String> alist) {
		
        if (alist.size() != 2) {
            System.out.println("��� ������ �ùٸ��� �ʽ��ϴ�.");
            
        }else {
        	f = new File(defaultPath +File.separator + alist.get(1));
	        if (!f.exists()) {
	            System.out.println("������ ���� �Ǵ� ���丮�� ã�� �� �����ϴ�.");
	        }else if(f.isDirectory()) {
	        	if(f.delete()) System.out.println(alist.get(1)+" ���丮�� �����Ǿ����ϴ�.");
			}else if(f.isFile()) {
				if(f.delete()) System.out.println(alist.get(1)+" ������ �����Ǿ����ϴ�.");
			}
        }
	}//deleteDirectory() ��
	
	void renameDirectory(ArrayList<String> alist) {
		
		String extension1 = alist.get(1).substring(alist.get(1).lastIndexOf('.')+1);
		String extension2 = alist.get(2).substring(alist.get(2).lastIndexOf('.')+1);
		
		if (alist.size() != 3) {
			System.out.println("��� ������ �ùٸ��� �ʽ��ϴ�.");
		}else {
			f = new File(defaultPath + File.separator + alist.get(1));
			if(!f.exists()) {
				System.out.println("������ ������ ã�� �� �����ϴ�.");
			}else if(f.isDirectory() && alist.get(1).indexOf('.') == -1 && alist.get(2).indexOf('.') == -1){
				if(f.renameTo(new File(defaultPath + File.separator + alist.get(2))))
					System.out.println(alist.get(1)+" ���丮���� "+alist.get(2)+"���� ����Ǿ����ϴ�.");
			}else if(f.isFile() && alist.get(1).lastIndexOf('.') != -1 && alist.get(2).lastIndexOf('.') != -1 
					&& extension1.equals(extension2)) {
				if(f.renameTo(new File(defaultPath + File.separator + alist.get(2))))
					System.out.println(alist.get(1)+" ���ϸ��� "+alist.get(2)+"���� ����Ǿ����ϴ�.");
			}else if(f.isFile() && alist.get(1).lastIndexOf('.') != -1 && alist.get(2).lastIndexOf('.') != -1 
					&& !extension1.equals(extension2)) {
				System.out.println("������ Ȯ����� �����ϸ� ����� �� ���Ե� ���� �ֽ��ϴ�. �����Ͻðڽ��ϱ�?(Y/N)");
				while(true) {
					String str = sc.nextLine();
					if(str.equalsIgnoreCase("Y")) {
						if(f.renameTo(new File(defaultPath + File.separator + alist.get(2))))
							System.out.println(alist.get(1)+" ���ϸ��� "+alist.get(2)+"���� ����Ǿ����ϴ�.");
						return;
					}else if(str.equalsIgnoreCase("N")) {
						return;
					}else {
						System.out.println("�ٽ� �Է����ּ���.(Y/N)");
					}
				}

					
				
			}
		}
	}//renameDirectory() ��
	
	void readTextFile(ArrayList<String> alist) throws IOException {
		
		if(alist.size() != 2) {
			System.out.println("��� ������ �ùٸ��� �ʽ��ϴ�.");
		}else {
			
			try {
				f = new File(defaultPath + File.separator + alist.get(1));
				
				if(!f.exists() || !f.isFile()) {
					System.out.println("������ ������ ã�� �� �����ϴ�.");
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
	}//readTextFile() ��
   
	void displayHelp(ArrayList<String> alist) {

			System.out.println("CD          ���� ���丮 �̸��� �����ְų� �ٲߴϴ�.             ex)cd [���丮��]");
			System.out.println("CD..        ���� ���丮�� ���ư��ϴ�.                      ex)cd ..");
			System.out.println("DIR         ���� ���丮�� �ִ� ���ϰ� ���� ���丮 ����� �����ݴϴ�. ex)dir");
			System.out.println("MD(MKDIR)   ���� �Ǵ� ���丮�� ����ϴ�.                    ex)md [���ϸ� �Ǵ� ���丮��]");
			System.out.println("RD(RMDIR)   ���� �Ǵ� ���丮�� ����ϴ�.                    ex)rd [���ϸ� �Ǵ� ���丮��]");
			System.out.println("REN(RENAME) ���� �̸��� �ٲߴϴ�.                          ex)ren [���ϸ� �Ǵ� ���丮��]");
			System.out.println("TYPE        �ؽ�Ʈ ������ ������ �����ݴϴ�.                   ex)type [���ϸ�]");
			System.out.println("HELP        �Է°����� ��ɾ �����ݴϴ�.                    ex)help");
			System.out.println("EXIT        ���α׷��� �����մϴ�                                                           ex)exit");
	}//displayHelp() ��
	
}