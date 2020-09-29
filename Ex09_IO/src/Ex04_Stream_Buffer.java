import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 	File 처리 (Disk) : 한 Byte단위로 read, write
 	모아모아서 한번에 read,write 하고싶음 
 	여행버스의 역할: buffer
 	1.I/O의 성능개선 가능
 	2.Line 단위의 처리가 가능(엔터)
 	
 	BufferedInputStream >> 보조스트림(독자적으로 생성 불가능) (주클래스 의존 FileInputStream...) 	
 	생성자를 통해서 강제하는 방법을 사용했음
 	
 */
public class Ex04_Stream_Buffer {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null; 
		
		try {
			fos = new FileOutputStream("data.txt"); //파일이 없으면 자동으로 파일 생성
			bos = new BufferedOutputStream(fos);
			
			for(int i=0;i<10;i++) {
				bos.write('A'); //10개의 A write
			}
			
			
			//JAVA Buffer에 일정한 크기를 갖고 있음: 8kbyte: 8192byte
			//1. buffer 안에 내용이 채워지면 client에 전송, 스스로 비움: 내부적으로 flush가 돌아감
			//2. buffer 안에 내용이 다 채워지지 않아도 강제로 비우기 가능(flush() 명시적 호출, close() ->자동으로 비움)
			//3. bos.close() -> 자원 해제할 때 >> 내부적으로 flush() 호출
			//bos.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {

			}
		}

	}

}
