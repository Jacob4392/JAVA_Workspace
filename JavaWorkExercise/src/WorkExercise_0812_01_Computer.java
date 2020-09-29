import java.util.Scanner;


class KeyBoard{
	
	//고유속성
	public String pushbutton; //버튼
	public boolean led = true;    //LED ON으로 초기화
	public String brand;   //브랜드
	
}

class Monitor{
	
	public boolean screen = true; //액정 ON으로 초기화
	public String block;	//거치대 
	public String brand;   //브랜드
	public boolean button; //버튼
	
}


class MainBody{
	
	//고유 속성
	public static int price;	//가격
	public String brand;	//브랜드
	public static int serialno;	//시리얼넘버
	public int cpuno;	//CPU 개수
	public int memorysize; //메모리 크기
	
	//전원
	public boolean power=true; //전원 ON으로 초기화
	
}


//Main 메서드 포함한 클래스가 Computer 클래스
public class WorkExercise_0812_01_Computer {
	
	Scanner sc = new Scanner(System.in);
	
	//고유속성
	public static int price = 1234567; //가격
	public String brandname = "브랜드1"; //브랜드
	public static int serialno=12345; // 시리얼 넘버
	public String color; // 색깔
		
	//상태
	public boolean powersavingmode; //절전모드
			
	
	//부품 참조변수
	MainBody mb = new MainBody();
	KeyBoard k = new KeyBoard();
	Monitor m = new Monitor();
			
	//기능
	//입력이 가능하다
	public void input() {
		//부품 키보드의 LED의 전원이 ON이면 키보드가 연결되어 있는 것으로 보고 값을 입력받는다
		if(k.led == true) {
			System.out.println("키보드를 입력해주세요");
			k.pushbutton = sc.nextLine();
		}
	}
			
	//출력이 가능하다
	public void output() {
		//부품 모니터의 액정의 전원이 ON이면 모니터가 연결되어 있는 것으로 보고 입력한 값을 출력한다
		if(m.screen ==true) { 
			System.out.println("출력값: " + k.pushbutton);
		}return;
	}
	
	//버튼을 눌러 모니터를 ON/OFF 제어
	public void monitorOff() {
		if(m.button = true) {
			m.button = false; //버튼을 눌러서 모니터 전원을 오프 시킨 상태(false)
			m.screen = false; //액정도 따라서 OFF
		}else {
			m.button = true;  //버튼을 눌러서 모니터 전원을 ON(true)
			m.screen = true;  //액정도 따라서 ON
		}
	}
			
	//전원을 ON/OFF할 수 있다
	public void powerOff() {
		if(mb.power == false) {
			mb.power = true;
		}else {
			mb.power = false;
			System.exit(0);
		}
	}
	
	//절전모드를 할 수 있다
	public void powerSavingOn() {
			if(powersavingmode == false) {
				powersavingmode = true;
				System.out.println("절전모드를 실행합니다.");
				k.led = false;
				m.screen = false;
			}else {
				powersavingmode = false;
				System.out.println("절전모드를 종료합니다.");
				k.led = true;
				m.screen = true;
			}
		}

	
 	//기능
 	void inputRecord() {
 		System.out.println("기기선택 :1.Computer 2.키보드 3.모니터  4.돌아가기");
 		int value=Integer.parseInt(sc.nextLine());
 		if(value == 1) {
 			System.out.println("색상변경:1.white 2.black");
 			int select=Integer.parseInt(sc.nextLine());
 			if(select == 1) {	
 				color = "white";
 			}else if (select == 2) {
 				color = "black";
 			}
 			else System.out.println("잘못입력하셨습니다");
 			computerInfo();
 			return;
 		}else if(value == 2) {
 			System.out.println("브랜드:1.삼성 2.LG");
 			int select=Integer.parseInt(sc.nextLine());
 			if(select == 1) {
 				k.brand = "삼성";
 			}else if(select == 2){
 				k.brand = "LG";
 			}else System.out.println("잘못입력하셨습니다");
 			keyBoardInfo();
 			return;
 		}else if(value == 3) {
 			System.out.println("브랜드:1.삼성 2.LG");
 			int select=Integer.parseInt(sc.nextLine());
 			if(select == 1) {
 				m.brand = "삼성";
 			}else if(select == 2){
 				m.brand = "LG";
 			}else System.out.println("잘못입력하셨습니다");
 			monitorInfo();
 			return;
 		}else return;
 		
 		
 	}
 	void powerMode() {
 		System.out.println("1.전원ON/OFF 2.절전모드ON/OFF 3.돌아가기");
 		int select = Integer.parseInt(sc.nextLine());
 		if(select == 1) {
 			powerOff();
 		}else if(select == 2) {
 			powerSavingOn();
 		}else {
 			return;
 		}
 			
 	}	 	
 	int displayMenu() {
 		System.out.println("****기능****");
 		System.out.println("1.입출력");	 	
 		System.out.println("2.기기정보입력");	 
 		System.out.println("3.전원관리");	
 		System.out.println("4.계산기");
 		System.out.println("5.프로그램 종료");
 		
 		int menu = 0;
 		do {
 			  try {
 					    menu = Integer.parseInt(sc.nextLine());
 						if(menu >= 1 && menu <= 5) {
 							break; //while 탈출 (1<= menu <=5)
 						}else {
 							//1보다 작거나 5보다 큰 값값 .. 프로그램적인 오류 (x)
 							//나는 오류 보겠다 (오류 사용자 강제)
 							//System.out.println("잘못 입력 하셨습니다");
 							throw new Exception("선택 번호가 잘못 되었습니다");
 						}
 			  }catch (Exception e) {
 				  System.out.println(e.getMessage());
 				  System.out.println("번호 입력 문제 발생");
 				  System.out.println("1~5번까지 입력");
 			  }
 		}while(true);
 		//실행 : 사용자가 1 ~ 5까지 번호중에서 하나를 선택
 		return menu;
 	}


	//사칙연산을 할 수 있다.
	public void Calculator() {
		
		
		System.out.print("숫자입력(정수): ");

		int num = Integer.parseInt(sc.nextLine());
		
		System.out.print("기호입력(+,-,*,/): ");
		String num2 = sc.nextLine();
		
		System.out.print("숫자입력(정수): ");
		int num3 = Integer.parseInt(sc.nextLine());
		
		double result = 0;
		
		if(num2.equals("+")) {
			result = num + num3;
		}else if(num2.equals("-")) {
			result = num - num3;
		}else if(num2.equals("*")) {
			result = num * num3;
		}else if(num2.equals("/")) {
			if(num3 != 0) {
				result = (double)num / num3;
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
		}
		System.out.println("연산결과: " + result);
		return; 

	}
	
	
	public void keyBoardInfo() {
		System.out.printf("키보드 연결상태 ON/OFF: %b, 브랜드명: %s\n",k.led,k.brand);
	}
	
	public void monitorInfo() {
		System.out.printf("모니터 연결상태 ON/OFF: %b, 브랜드명: %s, 거치대  유무: %s \n",m.screen,m.brand,m.block);
	}
	
	public void mainBodyInfo() {
		System.out.printf("mainBody 가격: %d, 브랜드명: %s, serial number: %d, CPU개수: %d, 메모리 크기: %d \n"
				,mb.price,mb.brand,mb.serialno,mb.cpuno,mb.memorysize);
	}
	
	public void computerInfo() {
		System.out.printf("컴퓨터 가격: %d, 브랜드명: %s, serial number: %d, 색깔: %s, 전원ON/OFF: %b \n"
				,price,brandname,serialno,color,mb.power);
	}
	
	public static void main(String[] args) {
		
		WorkExercise_0812_01_Computer com = new WorkExercise_0812_01_Computer();
		
 		while(true) {
 			switch (com.displayMenu()) {
 			case 1 : com.input();
 					 com.output();
 				break;	 
 			case 2 : com.inputRecord();
				break;
 			case 3 : com.powerMode();
				break; 				
 			case 4 : com.Calculator();
 				break;
 			case 5 : System.out.println("프로그램 종료");
 					 //return;  //main 종료
 					 System.exit(0); //프로그램 강제 종료
 			}
 		}
	}
}