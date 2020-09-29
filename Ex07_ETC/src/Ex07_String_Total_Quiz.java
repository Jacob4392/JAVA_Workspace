import java.util.Scanner;

//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제

//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리     뒷:7자리
//입력값 : 123456-1234567 
//1. 자리수 체크 (기능)함수 (14 ok)  return true , false 
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수  return true, false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수  void  출력

//3개의 함수 static 

public class Ex07_String_Total_Quiz {


	
	static boolean juminCheck(String jumin) {
		return jumin.length() == 14;
	}
	
	static boolean juminCheck2(String jumin) {
		int index = jumin.indexOf("-");
		return jumin.substring(0,index).length()==6 &&
				jumin.substring(index+1,jumin.length()).length()==7;
	}
	
	
	static boolean limitNumber(String jumin) {
		if(Integer.parseInt(jumin.substring(7,8)) >=1 && Integer.parseInt(jumin.substring(7,8)) <=4) {
			return true;
		}else {
			return false;
		}
		//return (Integer.parseInt(jumin.substring(7,8)) >=1 && Integer.parseInt(jumin.substring(7,8)) <=4) ? true:false;
	}
	static void outPutGender(String jumin) {
		int num = Integer.parseInt(jumin.substring(7,8));
		if(num == 1 || num == 3) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
	
	
	
	public static void main(String[] args) {
		//주민번호를 입력받아서
		System.out.println("주민번호를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String juminnumber = scanner.nextLine();
		if(juminCheck(juminnumber) && limitNumber(juminnumber) && juminCheck2(juminnumber)) {
			outPutGender(juminnumber);
		}else {
			System.out.println("다시 입력해주세요");
		}

	}

}
