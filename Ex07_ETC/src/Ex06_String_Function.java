import java.util.StringTokenizer;

public class Ex06_String_Function {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat(" world");
		System.out.println(concatstr);
		
		boolean bo = str.contains("ell");
		System.out.println(bo);
		
		String str2 = "a b c d"; //[a][][b][][c][][d]
		System.out.println(str2.length()); //빈문자도 char문자 하나
		
		String filename = "hello java world"; //[h][e][l][l][o][][j] ...
		System.out.println(filename.indexOf("h"));
		System.out.println(filename.indexOf("java")); //시작위치 j의 값이 나옴
		System.out.println(filename.indexOf("안녕하세요")); //-1은 배열에 없다는 뜻 //-1이 아니라는 것은 문자에 원하는 글자가 하나라도 있다는 뜻
		//신문 사설 검색 ... 이런 단어가 하나라도 있다면 -1값이 안나옴
		//indexOf의 목적은 내가 원하는 문자열이 포함되어 있는지를 확인하는 것이 목적(0보다 큰값이면 1개는 포함되어 있을 것이다라고 유추할 수 있다)
		
		if(filename.indexOf("wo") != -1) {
			System.out.println("wo를 하나라도 가지고 있네요");
		}
		
		System.out.println(filename.lastIndexOf("a"));
		System.out.println("뒤에서 처음 만나는 a의 index를 뽑아내는 함수");
		
		//length(), indexOf(), substring(), replace(), split()
		
		String result = "superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(1,2)); //자기자신 //u endindex-1
		System.out.println(result.substring(0,0)); //안나옴
		System.out.println(result.substring(0,1)); //s
		//beginIndex - the beginning index, inclusive.
		//endIndex - the ending index, exclusive.
		//endindex - 1로 처리함(exclusive) 자바에서만 적용
		
		
		//Quiz
		String filename2="aaaa.zip"; //또는 hong.png 또는 h.jpeg
		//여기서 파일명과 확장자를 분리해서 출력하세요.
		//1. 파일명 >> aaaa
		//2. 확장자 >> zip
		//위에서 배운 함수만 가지고 문제를 풀어보세요.
		
		if(filename2.indexOf(".") != -1) {
			int index = filename2.indexOf(".");
			
			System.out.println("1.파일명: "+filename2.substring(0,index));
			System.out.println("2.확장자: "+filename2.substring(index+1,filename2.length()));
		}
		
		
		//replace(치환함수)
		
		String str3 = "ABCDADDDDDA";
		String result3 = str3.replace("DDDDD", "오늘은 목요일");
		System.out.println(result3);
		
		result3 = str3.replace("A","a");
		System.out.println(result3);
		
		//ETC
		System.out.println(str3.charAt(0)); //index에 해당하는 char값 하나를 출력한다
		System.out.println(str3.endsWith("DDDA")); //뒤에서부터 문자 묶음을 찾아준다 //뒤에 이 문자묶음이 있으면 True
		System.out.println(str3.equalsIgnoreCase("abcdADDDDDA")); //대소문자 구별하지 않고 같으면 True
		
		//Today Point(Split)
		//String str4 = "슈퍼맨,팬티,노란색,우하하,우하하";
		//String[] namearray = str4.split(",");
		
		String str4 = "슈퍼맨.팬티.노란색.우하하.우하하";
		String[] namearray = str4.split("\\.");
		for(String s :namearray) {
			System.out.println(s);
		}
		
		/*
		  	.(점) >> 정규표현식 문법 >>문자그대로 인지하려면? \. ?? 이것도 정규표현식임,, >> \\. (2개 붙임)
		 
		 	정규표현식 표준(java, javascript, Oracle, C#) 공통적인 규칙
		 	어떠한 문자를 만들때 [규칙]을 부여하는 것 >> 유효한 판단 근거
		 	
		 	주민번호: 숫자 6자리 - 숫자 7자리 {\d6}-{\d7} 규칙에 맞는지 맞지 않는지 비교
		 	12345-1234567 >> false
		 	핸드폰번호
		 	차량번호
		 	우편번호
		 	도메인주소
		 	이메일주소 등을 검증할 수 있는 정규표현식을 미리 개발자가 만들어 놓음
		 	
		 	위키피디아:  https://ko.wikipedia.org/wiki/%EC%A0%95%EA%B7%9C_%ED%91%9C%ED%98%84%EC%8B%9D
		 	조별과제 (사이트에서 찾되 해석은 직접하기) 5개하기
		 	
		 	휴대폰번호 - 문자 발송등의 작업할경우 휴대폰 번호만 입력받을경우 유용합니다.
		 	01[01789]-\d{3,4}-\d{4}
		 	
		 	우편번호 - 총6자리 숫자로 가운데 -(하이픈)이 있는경우와 없는경우 둘다 허용합니다.
			"/^\d{3}-?\d{3}$/u"

			아이디 - 아이디는 영문/숫자만 허용하며, 첫글자는 영문자로 시작하여야 하며, 3자리에서 8자리 이내로 입력받음
			"/^[a-zA-Z]\w{2,7}$/u"
			
			
			주민번호 - 숫자 13자리를 받으며, 가운데 -(하이픈)은 있어도 없어도 되며, 일부 자리수에 대하여 나올수 있는 숫자에 제한을 두었음
			"/^\d{2}[0-1]\d[0-3]\d-?[1-6]\d{6}$/u"
			
			
			날짜 - 일반 -(하이픈)형태의 날짜를 받으며, 자리수 별로 올수 없는 숫자의 경우 일부 제한을 두어 너무 엉뚱한 날짜 입력을 일부 막음
			"/^[1-2][9|0]\d{2}-[0-1]\d-[0-3]\d/u"


		 	
		 */
		
		String filename3 = "bit.hwp";
		//split 사용해서 파일명과 확장명을 출력해보세요.
		String[] filearray = filename3.split("\\.");
		for(String s : filearray) {
			System.out.println(s);
		}
		//ex) 중복파일명 처리할 때 주로 사용
		
		
		String str5 = "a/b,c-d.f";
		StringTokenizer sto = new StringTokenizer(str5,"/,-.");
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		
		//넌센스
		String str6 = "홍             길            동";
		//저장 >> 공백제거 >> "홍길동"으로 저장하고 싶다면?
		StringTokenizer sto2 = new StringTokenizer(str6,"                                      ");
		while(sto2.hasMoreElements()) {
			System.out.print(sto2.nextToken());
		}
		System.out.println(str6.replace(" ",""));
		
		String str7 = "              홍길동                   ";
		System.out.println(">"+str7+"<");
		//공백제거후 "홍길동"
		System.out.println(">"+str7.trim()+"<");
		System.out.println(">"+str7.replace(" ", "")+"<");
		
		String str8 = "      홍    길         동       ";
		//"홍길동"
		System.out.println(str8.replace(" ",""));
		
		//여러개의 함수를 적용할 때는 (method chain 기법)
		System.out.println(str8.trim().replace(" ","").substring(2));
		
		//Quiz-1
		int sum = 0;
		String[] numarr = {"1","2","3","4","5"};
		//문제: 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 : 결과 15
		
		for(String s : numarr) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
		
		/*
		String s = numarr[0].concat(numarr[1]).concat(numarr[2]).concat(numarr[3]).concat(numarr[4]);
		System.out.println(s);
		for(int i=0;i<numarr.length;i++) {
			sum += Integer.parseInt(s.charAt(i));
		}
		System.out.println(sum);
		*/
		
		
		//Quiz-2
		String jumin = "123456-1234567";
		//위 주민번호의 합을 구하세요
		int sum2 = 0;
		String numbers = jumin.replace("-","");
		for(int i=0;i<numbers.length();i++) {
			String num = numbers.substring(i,i+1);
			sum2+= Integer.parseInt(num);
		}
		System.out.println(sum2);
		
		
		
		 //Quiz-2
		   String jumin2="123456-1234567";
		   //위 주민번호의 합을 구하세요_1
		   int sum3=0;
		   for(int i = 0 ; i < jumin.length() ; i++) {
			   String numstr =jumin.substring(i, i+1);
			   if(numstr.equals("-")) continue;
			   sum3+= Integer.parseInt(numstr);
		   } 
		   System.out.println("주민번호 합:" + sum2);
		   
		 //위 주민번호의 합을 구하세요_2
		 //String jumin="123456-1234567";
		   String[] numarr2 = jumin.replace("-","").split("");
		   int sum4=0;
		   for(String i : numarr2) {
			   sum4+= Integer.parseInt(i);
		   }
		   System.out.println("주민번호 합2:" + sum3);
		   
		 //위 주민번호의 합을 구하세요_3
		   String jumin4 = jumin.replace("-", "");
		   int sum5=0;
		   for(int i = 0 ; i < jumin4.length() ;i++) {
			   sum5+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
		   }
		   System.out.println("주민번호 합4:" + sum5);
		   
		}
	}


