import java.io.File;
import java.util.ArrayList;

public class Ex10_File_SubList {

	static int totalfiles = 0;
	static int totaldirs = 0;
	
	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("����: java [������ ���ϸ�] [��θ�]");
			System.out.println("����   : java Ex10_File_SubList C:\\Temp");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		if(!f.exists()||!f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮");
			System.exit(0);
		}
		//�������� ���, ���� ����
		
		printFileList(f); //���ȣ��
		System.out.println("���� �� ���ϼ�: "+totalfiles);
		System.out.println("���� �� ������: "+totaldirs);

		
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
			String filename = files[i].getName();//������ or ���ϸ�
			if(files[i].isDirectory()) { //����
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
		int dirnum = subdir.size(); //��������
		int filenum = files.length - dirnum; //��ü���Ͽ��� -��������
		
		//����(��������, ���ϰ���)
		//static �ڿ����ٰ�
		totaldirs += dirnum; //�� ����(��������) ����
		totalfiles += filenum; //�� ����(��������) ����
		
		
		System.out.println("[Current dirNum]: "+dirnum);
		System.out.println("[Current fileNum]: "+filenum);
		System.out.println("*******************************");
		
		//Point(���������� �ִ� �ڿ��� ���� ���� ���� ���?)
		
		for(int j=0;j<subdir.size();j++) {
			int index = subdir.get(j);//[1],[2]
			printFileList(files[index]); //���� �� �ڽ��� �� ȣ��(���ȣ��)
			
		}
		
	}

}
