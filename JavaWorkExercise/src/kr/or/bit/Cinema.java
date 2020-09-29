/*
package kr.or.bit;

import java.util.Scanner;

public class Cinema{
    
    private String[][] seat;
    private Scanner scanner;
    private int[][] reservedNumber;
    private int temp1 = 0; //값을 임시로 저장할 변수
    private int temp2 = 0; //값을 임시로 저장할 변수
    private int[] tempArray1 = new int[4]; //값을 임시로 저장할 배열
    private int[] tempArray2 = new int[5]; //값을 임시로 저장할 배열
    
        public Cinema() { 
        scanner = new Scanner(System.in);
        seat = new String[4][5];
        reservedNumber = new int[4][5];
    }
    
    public void selectSeatStart(){
        loop_1: while(true) {
            String selectnum = showMenu();
            switch (selectnum) {
            case "1": selectSeat();
                break;
            case "2": reserveCheck();
                break;
            case "3": cancleReserve();
                break;
            case "4": System.out.println("Good Luck");
                break loop_1;
            default: 
                break;
            }
        }
    }
            
                
    
    public void seatInit() {        //좌석 초기화
        for(int i=0;i<seat.length;i++) { //기능1
            for(int j=0;j<seat[i].length;j++) {
                seat[i][j] = (i+1)+"-"+(j+1); //좌석
            }
        }
    }
    
    private String showMenu() {
        System.out.println("************************");
        System.out.println("*1. 예매하기*");
        System.out.println("*2. 예매조회*");
        System.out.println("*3. 예매취소*");
        System.out.println("*4. 프로그램 종료*");
        System.out.println("************************");
        String selectnum = scanner.nextLine();
        return selectnum;
    }
    
        
    private void selectSeat(){      //1. 예매하기
        
        System.out.println("좌석을 선택해주세요 예)1-1");
        seatInfo();
        System.out.println("이미 예매된 좌석은 \"예매\"라고 표시됩니다");
        String select1 = scanner.nextLine();
        System.out.println("예매 가능합니다. 예매 하시겠습니까?");
        System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
        int select2 = Integer.parseInt(scanner.nextLine());
        switch(select2) {
        
        case 1:
            for(int i=0;i<seat.length;i++) { 
                for(int j=0;j<seat[i].length;j++) {
                    if(select1.equals(seat[i][j])){
                        seat[i][j] = "예 매";
                        reservedNumber[i][j] = (int)(Math.random()*100000000);
                        
                        tempArray1[temp1] = i; //tempArray1에 i 값을 임시로 저장해놓는다(temp1은 tempArray1의 
                        tempArray2[temp2] = j; //크기를 담당하는 변수로 i 값이 하나씩 저장될 때마다 temp1의 값도 하나씩 커지며  
                        temp1++;               //tempArray1의 배열의 크기가 같이  커진다.
                        temp2++;			   //배열의 
                    
                        System.out.println("예매가 완료되었습니다.");
                        System.out.printf("예매한 좌석번호:[%d-%d] / 예매번호:[%d]\n",i+1,j+1,reservedNumber[i][j]);
                    }
                    	else if(seat[i][j] == "예 매" && select1.equals((i+1)+"-"+(j+1))) {
                    		System.out.println("이미 예약된 좌석입니다.");
                    }
                }               
            }
            break;
        case 2:
            System.out.println("다시 선택해주세요.");
            break;
        default:
            break;
        }
    }
    
    private void reserveCheck() { //2 예매조회
        System.out.println("예매번호를 입력해주세요.");  //reserveNum으로 예약번호를 입력받고 reservedNumber이 for문에서 하나씩 돌면서 
        int reserveNum = scanner.nextInt();        //저장된 랜덤값을 찾는다 그러면서 입력된 값과 일치하는 랜덤값이 있으면
        for(int i=0;i<reservedNumber.length;i++) { //tempArray1과 tempArray2에 저장된 i와 j값으로 저장되어있던 좌석을 알려준다.
            for(int j=0;j<reservedNumber[i].length;j++) {
                if(reserveNum == reservedNumber[i][j]) {
                    System.out.println("고객님이 예약한 번호는"+(tempArray1[i]+1)+"-"+(tempArray2[j]+1)+"입니다.");
                }
            }
        }
    }
    
                
                        
                    
    
    
    private void cancleReserve(){       //3. 예매취소
        System.out.println("예매번호를 입력해주세요.");
        int select1 = Integer.parseInt(scanner.nextLine());
        
        for(int i=0;i<seat.length;i++) { 
            for(int j=0;j<seat[i].length;j++) {
                if(select1==reservedNumber[i][j]){
                System.out.printf("고객님이 예매하신 좌석은 [%d-%d]입니다.\n",i+1,j+1);
                }               
            }
        }
        
        System.out.println("예매를 취소하시겠습니까?");
        System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
        int select2 = Integer.parseInt(scanner.nextLine());
        switch(select2) {
        case 1:
            for(int i=0;i<reservedNumber.length;i++) {
                for(int j=0;j<reservedNumber[i].length;j++) {
                    if(reservedNumber[i][j]==select1) {
                        seat[i][j] = (i+1)+"-"+(j+1);
                        reservedNumber[i][j] = 0;
                        System.out.println("예매가 취소되었습니다.");
                    }
                }
            }
            break;
        case 2:
            System.out.println("다시 선택해주세요.");
            break;
        default:
            break;
        }
    }
    
    
    private void seatInfo(){            //자리정보
        for(int i=0;i<seat.length;i++) { 
            for(int j=0;j<seat[i].length;j++) {
                System.out.printf("[%s]",seat[i][j]);
            }
            System.out.println();
        }
    }
    
}
*/

package kr.or.bit;

import java.util.Scanner;


public class Cinema{
	
	private String[][] seat;
	private Scanner scanner;
	private int[][] reservedNumber;
	
	public Cinema() { //초기화 (member field)
		scanner = new Scanner(System.in);
		seat = new String[4][5];
		reservedNumber = new int[4][5];
	}
	
	public void selectSeatStart(){

	loop_1:	while(true) {
			String selectnum = showMenu();
			switch (selectnum) {
			case "1": selectSeat();
				break;
			case "2": seatInfo();
				break;
			case "3": reserveConfirm();
				break;
			case "4": cancleReserve();
				break;		
			case "5":  
				System.out.println("Good Luck");
				break loop_1; 
			default: System.out.println("다시 입력해주세요(1,2,3,4,5)");
				break;
			}
		}
	}
	
	public void seatInit() {		//좌석 초기화
		for(int i=0;i<seat.length;i++) { //기능1
			for(int j=0;j<seat[i].length;j++) {
				seat[i][j] = (i+1)+"-"+(j+1); //좌석
			}
		}
	}
	
	private String showMenu() {
		System.out.println("************************");
		System.out.println("*1. 예매하기*");
		System.out.println("*2. 좌석조회*");
		System.out.println("*3. 예매조회*");
		System.out.println("*4. 예매취소*");
		System.out.println("*5. 프로그램 종료*");
		System.out.println("************************");
		String selectnum = scanner.nextLine();
		return selectnum;
	}
	
		
	private void selectSeat(){		//1번 메뉴 좌석 선택 실행코드
		
		System.out.println("좌석을 선택해주세요 예)1-1");
		System.out.println("이미 예매된 좌석은 \"예매\"라고 표시됩니다");
		String select1 = scanner.nextLine();
		
		System.out.println("예매 가능합니다. 예매 하시겠습니까?");
		System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
		String select2 = scanner.nextLine();
		switch(select2) {
		case "1":
			for(int i=0;i<seat.length;i++) { 
				for(int j=0;j<seat[i].length;j++) {
					if(select1.equals(seat[i][j])){
						seat[i][j] = "예 매";
						reservedNumber[i][j] = (int)(Math.random()*100000000);
						System.out.println("예매가 완료되었습니다.");
						System.out.printf("예매한 좌석번호:[%d-%d] / 예매번호:[%d]\n",i+1,j+1,reservedNumber[i][j]);
					}else if(seat[i][j] == "예 매" && select1.equals((i+1)+"-"+(j+1))) {
						System.out.println("이미 예약중입니다.");
					}
				}				
			}
			break;
		case "2":
			System.out.println("다시 선택해주세요.");
			break;
		default: 
			break;
		}
	}

	
	private void seatInfo(){			//2번메뉴 실행코드
		for(int i=0;i<seat.length;i++) { 
			for(int j=0;j<seat[i].length;j++) {
				System.out.printf("[%s]",seat[i][j]);
			}
			System.out.println();
		}
	}
	
	
	private void reserveConfirm(){		//3번 메뉴 실행코드
		System.out.println("예매번호를 입력해주세요.");
		String select = scanner.nextLine();
		
		for(int i=0;i<seat.length;i++) { 
			for(int j=0;j<seat[i].length;j++) {
				if(Integer.parseInt(select)==reservedNumber[i][j]){
				System.out.printf("고객님이 예매하신 좌석은 [%d-%d]입니다.\n",i+1,j+1);
				}				
			}
		}
	}
	
	private void cancleReserve(){		//4번 메뉴 실행코드
		System.out.println("예매번호를 입력해주세요.");
		int select1 = Integer.parseInt(scanner.nextLine());
		
		for(int i=0;i<seat.length;i++) { 
			for(int j=0;j<seat[i].length;j++) {
				if(select1==reservedNumber[i][j]){
				System.out.printf("고객님이 예매하신 좌석은 [%d-%d]입니다.\n",i+1,j+1);
				}				
			}
		}
		
		System.out.println("예매를 취소하시겠습니까?");
		System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
		int select2 = Integer.parseInt(scanner.nextLine());
		switch(select2) {
		case 1:
			for(int i=0;i<reservedNumber.length;i++) {
				for(int j=0;j<reservedNumber[i].length;j++) {
					if(reservedNumber[i][j]==select1) {
						seat[i][j] = (i+1)+"-"+(j+1);
						reservedNumber[i][j] = 0;
						System.out.println("예매가 취소되었습니다.");
					}
				}
			}
			break;
		case 2:
			System.out.println("다시 선택해주세요.");
			break;
		default:
			break;
		}
	}
}
