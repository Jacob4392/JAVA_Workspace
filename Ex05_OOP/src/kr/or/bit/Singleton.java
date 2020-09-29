package kr.or.bit;

/*
 	디자인패턴(생성과 관련된 패턴) >> new >> 
 	객체 1개를 만들어서 공유하겠다.
 	의도: 하나의 객체를 공유하는 것을 보장하겠다(하나의 객체만 만들겠다)
 	활용:
 	공유프린터
 	DB 연결작업
 	활용 > JDBC 수업할 때
 	
 */




public class Singleton {
	
	private static Singleton p;
	private Singleton() {
		//직접 객체를 생성하지 못하게 막음(private) new(x) ->heap메모리에 객체생성을 못하게 막음
		
	}
	
	public static Singleton getInstance() {
		if(p == null) {
			p = new Singleton(); //heap 메모리에 Singleton 객체가 올라감, 이 객체의 주소를 p라는 변수가 참조한다.
		}
		return p;
	}
	
	
}
