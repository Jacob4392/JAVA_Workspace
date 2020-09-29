//static 변수는 객체마다 같은 값을 가지게 하겠다
//instance변수는 객체마다 다른 값을 가지게 하겠다

class InitTest{
	static int cv = 10;
	static int cv2;
	int iv = 11;
	
		static{ //static 초기자: static 자원 초기화 (항상 static은 객체생성 앞에 있다)
			
			cv = 111;
			cv2 = cv + 222;
			
		}
	
	{
		//초기자 블럭(member field 초기화)
		//객체 생성 후(int iv =1;) 변수가 메모리에 올라가고 나서 바로 호출
		//인위적 >> if(iv>10) iv=100;
		System.out.println("초기자 블럭");
		if(iv>10) iv=100;
	}
	
	public InitTest() {
		System.out.println("생성자");
	}
	
	
	

}

public class Ex08_Static_Init {

	public static void main(String[] args) {
		System.out.println(InitTest.cv);
		System.out.println(InitTest.cv2);
		//System.out.println(InitTest.iv);
		InitTest it = new InitTest();
		System.out.println(it.iv);

	}

}
