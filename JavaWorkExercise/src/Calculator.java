//문자열의 비교는 ==을 쓰지 않는다. 주소값 비교를 하게 됨 >> equals(String) >> String 클래스에서 배움

//opr == "+"
//if(opr.equals("+"))







import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력: ");
		//String value = sc.nextLine();
		//int num = Integer.parseInt(value);
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.print("기호입력: ");
		String num2 = sc.nextLine();
		
		System.out.print("숫자입력: ");
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
				return; //[함수단위]의 종결자 > main 함수 탈출 > 종료
			}
		}sc.close();
		System.out.println("연산결과: " + result);
		
		
	}
}