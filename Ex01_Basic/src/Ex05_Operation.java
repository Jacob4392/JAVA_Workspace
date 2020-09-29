
public class Ex05_Operation { //연산자

	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);
		
		result = 13/2; //몫
		System.out.println(result);
		
		//나머지 구하는 연산자(%)
		result = 13%2;
		System.out.println(result);
		
		//증가, 감소(증가감 연산자 : ++, --) 1씩 증가, 1씩 감소
		int i = 10;
		++i; //전치증가
		System.out.println("전치: "+ i);
		i++; //후치증가
		System.out.println("후치: "+ i);
		//위 코드는 전치, 후치가 의미가 없음.
		
		//Point (연산자가 결합되면 전치, 후치 구분됨)
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println("result2: " + result2 + " j2: " + j2 );
		
		result2 = i2 + j2++;
		System.out.println("result2: " + result2 + " j2: " + j2);
		
		byte b = 100;
		byte c = 1;
		//byte d = b+c; >> 형변환 필요
		
		//Today point
		//자바의 연산규칙
		//정수의 모든 연산은 int라는 타입으로 변환 후에 처리한다 (int는 4byte)
		
		//byte + short => 컴파일러가 int + int
		//char + char => 컴파일러가 int + int
		//연산처리시 정수연산에서 int보다 작은 타입 int 변환(long 제외)
		//byte, char, short >> int 변환
		
		//byte + short -> int + int
		//char + int -> int + int
		//int + long -> long + long
		
		//정수 + 실수 > 타입의 크기와 상관없이 > 실수가 승자
		
		long ln = 10000000000L;
		float fl = 1.2f;
		long lnresult = (long)(fl + ln);
		System.out.println("lnresult: " + lnresult);
		
		//소수부가 손실발생
		//float로 받으면 됨
		
		float num2 = 10.45f;
		int num3 = 20;
		//num2 + num3
		//float + int >> float + float
		float result5 = num2 + num3;
		System.out.println(result5);
		
		//int result5 >> 30
		
		char c2 = '!';
		char c3 = '!';
		//c2 + c3
		int result6 = c2 + c3;
		System.out.println(result6);
		System.out.println((char)result6);
		
		//제어문
		//중소기업 시험문제(구구단 출력) >> 별찍기 응용 >> 삼각형(제어적인 능력이 있는지 보는 것)
		
		int sum = 0;
		for(int j=1;j<=100;j++) {
			//System.out.println("j: "+ j);
			//sum = sum + j;
			//sum+=j;
			if(j%2 == 0) {
				sum+=j; //짝수의 합
			}
		}
		System.out.println(sum);
		
		// == 연산자(값을 비교하는 연산자)
		if(10==10.0f) { //타입을 비교하지 않아요 값으로 비교함
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// !부정 연산자
		if('A'!=65) {
			System.out.println("같지 않음");
		}else {
			System.out.println("같은 값");
		}
		
		//암기하자(Today Point)
		int p = 10;
		int k =-10;
		int result8 = (p==k)? p : k;
		System.out.println("result8 = " + result8);

		if(p==k) {
			result8=p;
		}else {
			result8=k;
		}
		System.out.println("result8: " + result8);
		
		//진리표
		//논리연산
		// 0 : false, 1 : true
		
		//0,1 조합(순서
		
		
		
		/*
		       OR    AND
		 0 0   0	  0
		 0 1   1	  0
		 1 0   1	  0
		 1 1   1	  1
		 
		 
		 Oracle(sql)
		 select*
		 from emp
		 where job ='IT' and sal>2000 //그리고(둘 다 참인 경우)
		 
		 select*
		 from emp
		 where job ='IT' or sal>2000 //또는(둘 중에 하나만 참이어도 만족)
		 	
		 	연산자(비트연산)
		 	| or 연산자
		 	& and 연산자
		 	
		 	|| 논리연산(OR)
		 	&& 논리연산(AND) 
		 	
		 	
		 */
		
			int x = 3;
			int y = 5;
			System.out.println("x|y: " + (x|y)); //7
			
			//십진수 -> 2진수(0,1)
			// 128  64  32  16  8  4  2  1
			//                  0  0  1  1 >> 십진수 3은 2진수 0011
			//                  0  1  0  1 >> 십진수 5는 2진수 0101
			// OR			    0  1  1  1 >> 4 + 2 + 1 = 7
			// AND			    0  0  0  1 >> 1
			
			System.out.println("x&y: " + (x&y));
			
			//Today Point(&&(and), ||(or)) 논리연산 short circuit
			//if(10>0 && -1>1 && 100>2 && 1>-1 ... 10개){실행문}
			//if(10>0 || -1>1 || 100>2 || 1>-1 ... 10개){실행문}
			
			
		int data = 90;
		switch(data) {
			case 100 : System.out.println("100입니다");
				//break; //조건에 맞으면 탈출합니다. 필요에 따라 break를 걸수도 있고 안 걸수도 있다.
			case 90 : System.out.println("90입니다");
				//break;
			case 80 : System.out.println("80입니다");
				//break;
			default: System.out.println("default");
		}
		
		//break는 강제사항입니까 (필요에 따라서 선택적으로)
		
		int month = 4;
		String res = ""; //빈 문자열로 초기화
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:res="31";
				break;
			case 4:
			case 6:
			case 9:
			case 11:res="30";
				break;
			case 2:res="29";
				break;
			default : res = "월 데이터가 아닙니다";
		}
			System.out.println(month + " 달의 일수는 " + res);		
		
			
			//난수(랜덤값 : 임의의 추출값)
			//https://docs.oracle.com/javase/8/docs/api/index.html
			//폴더(package)
			//java.lang.Math (Math 클래스)
			//java 페이지는 default로 열려있는 폴더 java.lang 있음
			//생략>import java.lang.*
			//Math 클래스가 가지고 있는 자원에 (static)이 붙으면 객체 생성 없이도 사용 가능한 자원
			//Math.random() -> a pseudorandom double greater than or equal to 0.0 and less than 1.0.
			//결과 : double타입의 실수가 return되고 0.0<= random <1.0
			System.out.println("Math.random(): " + Math.random());
			System.out.println("Math.random()*10: " + (Math.random()*10));
			//0~9
			System.out.println("Math.random()*10: " + (int)(Math.random()*10));
			//1~10
			System.out.println("Math.random()*10+1: " + ((int)(Math.random()*10)+1));
			//100~1000
			System.out.println("Math.random()*10+1: " + ((int)((Math.random()*10)+1)*100));
			
			
			
			
			
			
			
			int num = ((int)((Math.random()*10)+1)*100);
			String item = "";
			switch(num) {
			case 600: item ="휴지";
					break;
			case 700: item ="한우세트, 휴지";
					break;
			case 800: item ="냉장고, 한우세트, 휴지";
					break;
			case 900: item ="NoteBook, 냉장고, 한우세트, 휴지";
					break;
			case 1000: item="TV, NoteBook, 냉장고, 한우세트, 휴지";
					break;
			default : item = "칫솔";
			}
			System.out.println("축하드립니다! 당신의 점수는 " + num + "점이므로, 경품은 " + item + " 입니다!");
				
		
			
			
			int jumsu = ((int)((Math.random()*10)+1)*100);
			String msg=""; //초기화
			msg+="고객님의 점수는: " + jumsu + "이고 상품은";
			switch(jumsu) {
			case 1000: msg+=", TV";
			case 900: msg+=", NoteBook";
			case 800: msg+=", 냉장고";
			case 700: msg+=", 한우";
			case 600: msg+=", 휴지";
				break;
			default : msg+=", 칫솔";
			}
			System.out.println(msg);
			
			
			String m = "F";
			String r = "";
			switch(m) { //조건식에 문자열 또는 문자 사용가능
				case "A":
				case "B":
				case "C":
				case "D":
				case "E":
				case "F":
				case "G":r="OK";
					break;
				case "H":
				case "K":r="NO";
					break;
				default:r="데이터가 아닙니다.";
			}
			System.out.println(r);
			
		}
	
			
			
			
			
	}


