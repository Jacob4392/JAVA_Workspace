import java.util.Properties;

/*
 	Properties
 	Map 인터페이스를 구현한 클래스
 	특수한 목적: <String,String>(key,value)을 위해 고정
 	
 	사용목적
 	Application 전체에 사용되는 자원 관리
 	환경변수
 	프로그램 버전
 	파일경로
 	공통변수
 
 */
public class Ex16_Properties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("admin","bit@bit.or.kr");
		prop.setProperty("version", "1.0");
		prop.setProperty("downpath", "C:\\Temp\\images");
		//각각의 개발 페이지에서 
		System.out.println(prop.getProperty("admin"));
		System.out.println(prop.getProperty("downpath"));

	}

}
