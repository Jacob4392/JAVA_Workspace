import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 	IO
 	Stream (Byte가 통과할 수 있는 통로)
 	JAVA API에서 추상클래스를 제공해줌
 	
 	InputStream, OutputStream
 	두 개의 추상 클래스를 구현해서 사용하라고 기본적으로 제공해줌
 	(재정의)
 	
 	대상에 따라서
 	1.Memory: ByteArrayInputStream 	:ByteArray ...
 	2.File	:File...	:File...
 	
 */
public class Ex01_Stream {
	public static void main(String[] args) {
		//Byte(-128 ~ 127) 정수를 저장 타입
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null; //현재 메모리(heap)를 갖고 있지 않다(초기화가 안되어 있다)
		
		//데이터를 read, write 하는 대상을 memory로 하고 싶다면 아래 클래스를 사용
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc); //inSrc로부터 data를 read하겠다
		output = new ByteArrayOutputStream(); //write 할 수 있는 stream
		
		System.out.println("outSrc before: "+Arrays.toString(outSrc));
		
		//공식같은 로직(외우기!)
		int data = 0;
		while((data = input.read()) != -1) { //더이상 read할 Data가 없으면 -1을 리턴
			System.out.println("data: "+data);
			//System.out.println("input.read(): "+input.read()); //1,3,5,7,9
			//read() 함수는 내부적으로 next()를 포함하고 있기 때문에 read를 2번 부르면 홀수 것만 읽게 됨
			//그래서 data라는 변수에 담아서 read()는 한 번만 호출되도록 함
			
			output.write(data); //Stream 안에 데이터를 갖고 있는 상태, 자기자신에게 write함
			//write 대상이 data가 아니고 ByteArrayOutputStream 자신의 통로에 data값을 가지고 있음
			
		}
		
		outSrc = output.toByteArray(); //Byte[]의 주소값을 리턴함, 그값을 outSrc가 받음
		
		System.out.println("outSrc after: "+Arrays.toString(outSrc));
		

	}

}
