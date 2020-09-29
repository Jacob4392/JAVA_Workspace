import java.util.Scanner;

public class Ex11_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1부터 20까지의  정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 프로그램을 작성하세요
			
		
		

		//2. 두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요
/*

	
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				int result = i + j;
				if(result == 6) {
					System.out.printf("(%d,%d)\n",i,j);
				}
			}
		}
		

		//3. 가위 , 바위 ,보 게임 또 제어문을 통해서 작성하세요 (IF)

		Scanner sc = new Scanner(System.in);
		System.out.println("가위, 바위, 보를 입력해주세요.");
		int user = 0;
		String RSP = sc.nextLine();
		if(RSP.equals("가위")) {
			user = 1;		
		}else if(RSP.equals("바위")) {
			user = 2;
		}else if(RSP.equals("보")) {
			user = 3;
		}else {
			System.out.println("다시 입력해 주세요.");
			return;
		}
		
		int com = (int)((Math.random()*3)+1);
		if(user == 1) {
			if(com == 1) {
				System.out.println("비겼습니다.");
			}else if(com == 2) {
				System.out.println("당신이 졌습니다.");
			}else {
				System.out.println("당신이 이겼습니다.");
			}
		}else if(user == 2) {
			if(com == 1) {
				System.out.println("당신이 이겼습니다.");
			}else if(com ==2) {
				System.out.println("비겼습니다.");
			}else {
				System.out.println("당신이 졌습니다.");
			}
		}else {
			if(com == 1) {
				System.out.println("당신이 졌습니다.");
			}else if(com == 2) {
				System.out.println("당신이 이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}
		System.out.println("user: "+ RSP);
		if(com == 1) {
			System.out.println("com: "+ "가위");
		}else if(com ==2) {
			System.out.println("com: "+ "바위");
		}else {
			System.out.println("com: "+ "보");
		}
		
		
		//컴퓨터가 자동으로 나온 가위 , 바위 , 보 에 대해서 사용자가 값을 입력 해서 처리 하세요

		//( 예를 들면 : 가위=> 1   , 바위 => 2  , 보 => 3)

*/
		
		boolean auto = true;
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(auto) {
			System.out.println("**********************");
			System.out.println("1. 예금  |  2. 출금  |  3. 잔고  |  4. 종료");
			System.out.println("**********************");
			
			System.out.println("선택");
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
				case 1: 
							System.out.println("예금 :");
							balance +=  Integer.parseInt(sc.nextLine());
							break;
				case 2:
							System.out.println("출금 :");
							balance -=  Integer.parseInt(sc.nextLine());
							break;
				case 3:
							System.out.println("잔고 : " + balance);
							break;
				case 4:
							System.out.println("종료합니다");
							auto = false;
							break;
				default: System.out.println("올바른 메뉴를 선택하세요");
					
			}
		}
	}
}
