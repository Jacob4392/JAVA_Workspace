import java.io.IOException;

/*
 	>>CD 한 장 프로그램 설치
 	>>1.설치 파일 >> C:Temp >> 복사
 	>>2.복사한 파일을 가지고 프로그램 설치
 	>>3.정상 설치 >> C:Temp >> 복사한 파일 삭제
 	>>4.비정상 설치 >> 강제 종료 >> 복사한 파일 삭제
 
 
 
 */



public class Ex03_finally {
	
	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("FILE DELETE");
	}
	
	
	public static void main(String[] args) {
		

		//실제로는 예외가 아니지만
		//강제로 예외 발생: 개발자가 임의로 문제를 발생시켜서 강제로 예외를 처리하는 방법
		//코드: 예외 객체를 직접 생산, new 발생, 예외에 관련된 문제임을 알려줘야 함>> throw
		//try catch finally 구문 안에서, throw new IOException();
		//fileDelete();

		
		try {
			copyFiles();
			startInstall();
			throw new IOException("Install 중에 문제가 발생"); //개발자가 임의로 예외를 발생
		}catch (Exception e) {
			System.out.println("예외 메시지 출력: "+ e.getMessage());
			//fileDelete();
		}finally { //강제 실행 블럭, 예외가 발생해도 실행, 발생하지 않아도 실행
			fileDelete();
			
			//자원을 해제하는 코드들...
		}
		System.out.println("main end");
		//**************************************************************************
		//함수의 강제종료: return이 있다 하더라도 finally 블럭은 강제 실행됨(먼저 실행됨)
		
	}

}
