
/*
 	String Class(문자열)
 	String 클래스는 수많은 함수를 가지고 있음(문자열을 조작하는(자르고, 합치고 하는 등))
 	String >> static 함수(많이 쓰는 함수) + 일반함수(new해서 불러오는 함수)
 	15개 ~ 20개 함수 외우면 됨
 
 
 */


public class Ex05_String_Class {

	public static void main(String[] args) {
		String str = ""; //문자열의 초기화 >> null, ""
		// 사용방법은 int,double 처럼 쓰세요
		
		String[] strarr = {"aaa","bbb","ccc"};
		for(String s:strarr) {
			System.out.println(s);
		}

		///////////////////////////////////////////
		String stri = "홍길동";
		System.out.println(stri.length());
		System.out.println(stri.toString());
		System.out.println(stri); //주소값이 나와야 하는 코드인데, 실제값이 나옴.. (toString이 오버라이딩 되어 있음)
								  //(뒤에 toString()생략)
		//Object에서 가지고 있는 toString()을 String에서 재정의 >> 값을 출력하도록
		
		String stra = new String("홍길동");
		System.out.println(stra);
		
		//1.String name = "가나다라마"; >>
		//String 내부적으로 Char[] 메모리를 사용한다 >> char[] >> [가][나][다][라][마] String은 내부에 char배열이 있기 때문에 length()를 쓸 수 있는 것
		//												   0   1  2   3  4
		//class String extends Object{ char[] 	@override toString(){...} length()}
		
		String str1 = "AAA";
		String str2 = "AAA";
		
		System.out.println(str1);
		System.out.println(str2.toString());
		System.out.println(str1==str2);
		//==연산자는 값을 비교함(str1(주소값), str2(주소값))
		//같은 주소로 판명된 이유는?
		//메모리에 실제로 같은 문자열이 있으면 재사용함. str1의 "AAA"를 재사용함
		System.out.println(str1.equals(str2)); //주소를 찾아가서 그 안에 있는 값을 비교
				
		//그런데 반전
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3==str4); //false^^ //이때는 주소값을 비교하기 때문에 다르다고 나오는 것
		System.out.println(str3.equals(str4)); //이것은 주소를 찾아가서 객체 안에 있는 값을 비교하기 때문에 같다고 나오는 것
		//new가 의미하는 것은, 새로운 메모리를 생성하라는 것
		
		//넌센스
		String s = "A";
		s+="B";
		s+="C";
		System.out.println(s);
		
		s = "A";
		
	}

}
