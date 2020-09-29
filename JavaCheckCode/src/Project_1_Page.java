
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

//페이지 클래스
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
	
	void run() {//로그인 메뉴 (회원가입 지원)
		ID_PWD.put(admin.getADMINID(), admin.getADMINPWD());
		saveFile();
		int choice;
		while((choice = menu()) != 0) {
			switch(choice) {
			case 1 : login(); break;//관리자로 로그인시 
			case 2 : signUp(); break;
			default: System.out.println("잘못된 입력");break;
			}
		}System.out.println("프로그램 종료");
	}

		
	
	int menu() {
		System.out.println("1:로그인 2:회원가입 0:종료");
		int choice = scanner.nextInt();
		scanner.nextLine();
		return choice;
	}
			
	boolean login() {//로그인(관리자로 로그인시 true리턴 //고객으로 로그인시 false리턴)
		try{
			fin = new FileInputStream(file);
			bin = new BufferedInputStream(fin);
			oin = new ObjectInputStream(bin);
			
			ID_PWD = (HashMap<String, String>)oin.readObject();//역직렬화
						//여기서 역직렬화 한 이유 : 저장된 ID_PWD기반으로 ID와 PWD정보 가져오기 위함
			oin.close();
			bin.close();
			fin.close();
			
		}catch(Exception e){
			System.out.println("불러오는데 실패하였습니다.");
			e.printStackTrace();
		}	
		while(true) {
			System.out.println("ID를 입력해주세요.");
			System.out.println(">");
			String id = scanner.nextLine();//.trim();
			System.out.println("PWD를 입력해주세요.");
			System.out.println(">");
			String pwd = scanner.nextLine();//.trim();
			if(!ID_PWD.containsKey(id)) {
				System.out.println("없는 ID입니다.");
			}else {
				if(ID_PWD.get(id).equals(pwd)) {
					System.out.println("고객님 환영합니다.");
					return false;
				}else {
					System.out.println("PWD를 확인해주세요.");
				}
			}	
		}
	}
				
void signUp() {//회원가입
		
		String id; 
		while(true) {
			System.out.println("ID 입력:");
			id = scanner.nextLine();
			if(ID_PWD.containsKey(id)) {
				System.out.println("이미 있는 ID 입니다.");
				System.out.println("다른 ID를 입력해주세요.");
			}else {
				break;
			}
		}	
		System.out.println("PWD 입력:");
		String pwd = scanner.nextLine();
		System.out.println("회원가입이 완료되었습니다.");
		System.out.printf("[ID]명:%s [PWD]명:%s",id,pwd);
		System.out.println();
		
		ID_PWD.put(id,pwd);//해쉬맵에 id와 pwd 할당 
		
		saveFile();
	}
	
	void adminMenu() {//관리자 메뉴
		
	}
	void customerMenu() {//고객 메뉴
		
	}
	void saveFile() { //파일저장
		try{
			fout = new FileOutputStream(file);
			bout = new BufferedOutputStream(fout);
			oout = new ObjectOutputStream(bout);
			
			oout.writeObject(ID_PWD);//직렬화(id와 pwd저장)
			//회원가입하면 id와 pwd를 "C:\\Temp\\privateInfo.txt"에 저장
			
			oout.close();
			bout.close();
			fout.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}