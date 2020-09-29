import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex13_HashMap {
	public static void main(String[] args) {
		//일상 생활
		//지역번호, 우편번호, 회원가입ID/PW 정보
		HashMap loginmap = new HashMap();
		loginmap.put("kim","kim1004");
		loginmap.put("scott","tiger");
		loginmap.put("lee","kim1004");
		
		
		
		//우리 시스템에 회원가입한 회원의 ID,PW 정보
		//로그인
		//id(o), pwd(o) >> 회원(방가)
		//id(o), pwd(x) >> 비밀번호 입력 >> 3회 시 제한
		
		//id(x), pwd(o)
		//id(x), pwd(x)
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id,pwd 입력해주세요");
			System.out.print("ID: ");
			String id = sc.nextLine().trim().toLowerCase();
			System.out.print("PWD: ");
			String pwd = sc.nextLine().trim();
			
			if(!loginmap.containsKey(id)){
				System.out.println("아이디를 다시 입력해주세요");
			}else if(loginmap.containsValue(pwd)) {
				System.out.println("방가방가");
				break;
			}else {
				System.out.println("비밀번호를 확인하세요");
			}
		}
		
		

	}

}
