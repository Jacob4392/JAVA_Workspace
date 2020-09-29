
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

//������ Ŭ����
public class Project_1_Page {
	FileOutputStream fout = null;
	BufferedOutputStream bout = null;
	ObjectOutputStream oout = null;
	
	FileInputStream fin = null;
	BufferedInputStream bin = null;
	ObjectInputStream oin = null;
	
	Scanner scanner = new Scanner(System.in);
	HashMap<String, String> ID_PWD = new HashMap<String, String>();
	File file = new File("C:\\Temp\\privateInfo.txt");
	
	Admin admin = new Admin();
	
	void run() {//�α��� �޴� (ȸ������ ����)
		ID_PWD.put(admin.getADMINID(), admin.getADMINPWD());
		saveFile();
		int choice;
		while((choice = menu()) != 0) {
			switch(choice) {
			case 1 : login(); break;//�����ڷ� �α��ν� 
			case 2 : signUp(); break;
			default: System.out.println("�߸��� �Է�");break;
			}
		}System.out.println("���α׷� ����");
	}

		
	
	int menu() {
		System.out.println("1:�α��� 2:ȸ������ 0:����");
		int choice = scanner.nextInt();
		scanner.nextLine();
		return choice;
	}
			
	boolean login() {//�α���(�����ڷ� �α��ν� true���� //������ �α��ν� false����)
		try{
			fin = new FileInputStream(file);
			bin = new BufferedInputStream(fin);
			oin = new ObjectInputStream(bin);
			
			ID_PWD = (HashMap<String, String>)oin.readObject();//������ȭ
						//���⼭ ������ȭ �� ���� : ����� ID_PWD������� ID�� PWD���� �������� ����
			oin.close();
			bin.close();
			fin.close();
			
		}catch(Exception e){
			System.out.println("�ҷ����µ� �����Ͽ����ϴ�.");
			e.printStackTrace();
		}	
		while(true) {
			System.out.println("ID�� �Է����ּ���.");
			System.out.println(">");
			String id = scanner.nextLine();//.trim();
			System.out.println("PWD�� �Է����ּ���.");
			System.out.println(">");
			String pwd = scanner.nextLine();//.trim();
			if(!ID_PWD.containsKey(id)) {
				System.out.println("���� ID�Դϴ�.");
			}else {
				if(ID_PWD.get(id).equals(pwd)) {
					System.out.println("���� ȯ���մϴ�.");
					return false;
				}else {
					System.out.println("PWD�� Ȯ�����ּ���.");
				}
			}	
		}
	}
				
void signUp() {//ȸ������
		
		String id; 
		while(true) {
			System.out.println("ID �Է�:");
			id = scanner.nextLine();
			if(ID_PWD.containsKey(id)) {
				System.out.println("�̹� �ִ� ID �Դϴ�.");
				System.out.println("�ٸ� ID�� �Է����ּ���.");
			}else {
				break;
			}
		}	
		System.out.println("PWD �Է�:");
		String pwd = scanner.nextLine();
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		System.out.printf("[ID]��:%s [PWD]��:%s",id,pwd);
		System.out.println();
		
		ID_PWD.put(id,pwd);//�ؽ��ʿ� id�� pwd �Ҵ� 
		
		saveFile();
	}
	
	void adminMenu() {//������ �޴�
		
	}
	void customerMenu() {//�� �޴�
		
	}
	void saveFile() { //��������
		try{
			fout = new FileOutputStream(file);
			bout = new BufferedOutputStream(fout);
			oout = new ObjectOutputStream(bout);
			
			oout.writeObject(ID_PWD);//����ȭ(id�� pwd����)
			//ȸ�������ϸ� id�� pwd�� "C:\\Temp\\privateInfo.txt"�� ����
			
			oout.close();
			bout.close();
			fout.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}