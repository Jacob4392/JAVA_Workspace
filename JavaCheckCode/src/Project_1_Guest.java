import java.util.Scanner;//스캐너
import java.util.*;


class mainmanu {
	 private String id;//아이디
	 private String pw;//패스워드
	 private String name;//이름
	 private String ph;//연락처
	/*get-set(ID)-----------------------------------------------*/
	 public String getId() {
	  return id;
	 }
	 public void setId(String id) {
	  this.id = id;
	 }
	/*get-set(Pw)----------------------------------------------*/
	public String getPw() {
		return pw;
		}
		public void setPw(String pw) {
		this.pw = pw;
		}
	/*get-set(Name)--------------------------------------------*/
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name = name;
		}
	/*get-set(Name)--------------------------------------------*/
	public String getPh() {
		return ph;
		}
		public void setPh(String ph) {
		this.ph = ph;
		}
	/*----------------------------------------------------------*/
	 public void printInfo() {
	  System.out.println("아이디:" + id);
	  System.out.println("패스워드:" + pw);
	  System.out.println("이름:" + name);
	  System.out.println("연락처:" + ph);
	 }
	}

/*----------------------------------------------------------*/
public class Project_1_Guest {
	public static void main(String[] args) {
	 int count = 0;
	 //**String name;
	 Project_1_Guest[] guest = new Project_1_Guest[30]; //회원수 30명
	 boolean stop = true;
	 while (stop) {//stop=true 이기 때문에 무한 반복!
/*스크린 화면---------------------------------------------------*/
	 System.out.println("-----------------------------");
	 System.out.println("|1|회원가입 |2|회원정보 확인 |3|종료");
	 System.out.println("-----------------------------");
	 System.out.println("ㄴ>항목의 번호를 선택하세요");
	 Scanner scan = new Scanner(System.in);
/*메뉴숫자입력--------------------------------------------------*/
	 int a = scan.nextInt(); //a 입력받음
	 switch (a) {
/*----------------------------------------------------------*/	
	 case 1:
	 if (guest.length - count == 0) {
	 System.out.println("회원 추가를 원할시 기존 회원을 삭제하여 용량을 비워주세요");
	 break;
/*----------------------------------------------------------*/	
/*
	 case 1:
 if (!guest.get(id).equals(id)) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("입력하신 ID가 중복입니다. 다시 입력 부탁드립니다.");
		 String id = scanner.nextLine().trim();
	     break;
*/
/*----------------------------------------------------------*/
	 } else {
		 guest[count] = new Project_1_Guest(); //사람 추가
		 Scanner scanner = new Scanner(System.in);
		 
	     System.out.print("ID를 입력하세요:");
		 String id = scanner.nextLine().trim();
		
	     System.out.print("PW를 입력하세요:");
		 String pw = scanner.nextLine().trim();
	     //Scanner input2 = new Scanner(System.in);
	     //String pw = input2.nextLine(); //pw 입력
	    
	     System.out.print("이름을 입력하세요:");
		 String name = scanner.nextLine().trim();
	    
	     System.out.print("-를제외한 핸드폰번호를 입력하세요:");
		 String ph = scanner.next().trim();
		 //guest[count].setId(id);
		 //guest[count].setPw(pw);
		
	     count++; //한 명 추가시마다 count 수 늘어남
		 System.out.println();
	     System.out.println("회원가입을 환영합니다.");
	     System.out.println("총회원의 수: " + (count));
	     break;
		 }
/*----------------------------------------------------------*/
	   	 case 2:{
	     System.out.println("회원님의 이름을 입력 부탁드립니다.");
//	     name = scan.nextLine();	    
//	     if(guest.containsKey(name)){
//         Guest guest = guest.get(name);
//         System.out.println("검색 결과>>"+guest.toString());
//	     }else{
//         System.out.println("존재하지 않습니다.");
	     }break;
/*3.종료-----------------------------------------------------*/
	     case 3:
	     stop = false; //stop 값을 false로 바꿈->while의 무한반복 끝냄
	     System.out.println("이용해주셔서 감사합니다.");
	     break;
/*4.예외범위---------------------------------------------------*/
	     default: //다른 숫자 입력했을 경우
	     System.out.println("오류:재선택 부탁드립니다.");
	   }
	  }
	}
}