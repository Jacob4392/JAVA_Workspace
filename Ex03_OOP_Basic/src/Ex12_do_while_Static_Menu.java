import java.util.Scanner;

public class Ex12_do_while_Static_Menu {
	//상단 ... 일반 ... 변수 (고유, 상태 , 부품(참조:클래스))
	static Scanner sc = new Scanner(System.in); //부품(참조:클래스)
	
	//static 활용한 점심메뉴 선택하기 프로그램 작성
	
	static int food;
	static String total="";

	
	//기능
	static void inputRecord() {
		System.out.println("점심메뉴 입력(1번세트,2번세트,3번세트): ");
		food = Integer.parseInt(sc.nextLine());
		total+= food;
		switch(food) {
		case 1: total+= ","; break;
		case 2: total+= ","; break;
		case 3: total+= ","; break;
		}
		System.out.println("점심메뉴: " + food+"번 세트");
	}
	static void deleteRecord() {
		total ="";
		System.out.println("점심메뉴: ");
	}
	static void sortRecord() {
		System.out.println("점심메뉴 확인: "+ total + "번 메뉴");
	}
	
	
	static int displayMenu() {
		System.out.println("**************************");
		System.out.println("****점심메뉴 선택하기 프로그램****");
		System.out.println("1. 점심메뉴 입력하기");
		System.out.println();
		System.out.println("2. 점심메뉴 삭제하기");
		System.out.println();
		System.out.println("3. 점심메뉴 확인하기");
		System.out.println();
		System.out.println("4. 프로그램 종료");
		System.out.println();
		
		
		int menu = 0;
		do {
			  try {
					    menu = Integer.parseInt(sc.nextLine());
						if(menu >= 1 && menu <= 4) {
							break; //while 탈출 (1<= menu <=4)
						}else {
							//1보다 작거나 4보다 큰 값값 .. 프로그램적인 오류 (x)
							//나는 오류 보겠다 (오류 사용자 강제)
							//System.out.println("잘못 입력 하셨습니다");
							throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
						}
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("메뉴 선택 문제 발생");
				  System.out.println("메뉴 1~4번까지 입력");
			  }
		}while(true);
		//실행 : 사용자가 1 ~ 4까지 번호중에서 하나를 선택
		return menu;
	}
	
	public static void main(String[] args) {
		//Ex11_do_while_Menu ex11 = new Ex11_do_while_Menu();
		
		while(true) {
			switch (displayMenu()) {
			case 1 : inputRecord();
				break;
			case 2 : deleteRecord();
				break;
			case 3 : sortRecord();
				break;
			case 4 : System.out.println("프로그램 종료");
					 //return;  //main 종료
					 System.exit(0); //프로그램 강제 종료
			}
		}
	}

}









