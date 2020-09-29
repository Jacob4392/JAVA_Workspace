import java.util.Scanner;

public class Ex09_Statement {

	public static void main(String[] args) {
		System.out.println("입력");
		Scanner sc = new Scanner(System.in);
		//if(sc.hasNextInt()) {                //리턴하는 값이 정수니? (true, false)
		//정수가 입력 되었음
		//}else {
		//
		//}
		//암기
		//조건문 : if문 3가지, switch(조건){case 값 ... break}
		//반복문 : for(반복횟수가 명확하다), while(true, false) {}, do{} ~ while()
		//분기문 : break(블럭을 탈출), continue(그 아래 구문을 skip)
		
		int count = 0;
		if(count < 1)System.out.println("true");
		if(count < 1) {
			System.out.println("true");
		}
		
		char data = 'A';
		switch (data) {
			case 'A': System.out.println("문자비교");
				break; //switch 블럭 탈출
			default: System.out.println("나머지 모든 것");
		}
		//--------------------------------------------------------
		//1~100까지의 합 출력 (for문 이용)
		//sum이라는 변수에 누적값을 담아서 출력
		
		int sum = 0;
		for(int i = 1; i<=100;i++) {
			//sum = sum + i;
			sum+=i;
		}
		System.out.println("sum: " + sum);
		
		//1~5까지의 합
		//n * (a + l) / 2
		//개수 * (시작 + 끝) / 2
		sum = 5 *(1 + 5) / 2;
		System.out.println("sum: " + sum);
		
		//for문을 사용해서 1~10까지의 홀수의 합을 구하세요.
		//단, for문만 사용할 것.(if, switch) 금지
		
		int sum2 = 0;
		for(int i=1;i<=10;i+=2) { // i = i + 2
			sum2+=i;
		}
		System.out.println("sum2: "+ sum2);
		
		//1~100까지의 합(짝수) ... if문 사용
		int sum3 = 0;
		for(int i=1;i<=100;i++) {
			if(i % 2 == 0) {
				sum3+=i;
			}
		}
		System.out.println("1~100까지 짝수: " + sum3);
		
		
		//입사시험(중소)
		//구구단 출력하기(중첩 for문)
		//2~9 ...
		//2 >> 1~9
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				//System.out.println(i + "*" + j + "=" + i*j);
				//System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
				System.out.print("*\t");
			}
			System.out.println();
		}
		//분기문(continue, break)
		//Today Point : continue(아래 구문 skip), break(블럭  for, while)
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i==j) {
					break;
				}
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i==j) {
					continue;
				}
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<i;j++) { //j<=9 , j < i
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=100; i>=0 ;i--) {
			System.out.println(i);
		}
		
		//피보나치 수열  (최대공약수, 최소공배수, 하노이탑...)
		int a = 0, b=1,c=0;
		for(int i=0;i<10;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(" " +c);
		}
		/*
		   	1
 			1
 			2
 			3
 			5
 			8
 			13
 			21
 			34
 			55
		*/
		
		
		
		
	}
}
