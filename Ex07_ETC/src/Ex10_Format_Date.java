import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//https://cafe.naver.com/springbit/315

public class Ex10_Format_Date {

	public static void main(String[] args) {
		Date curdate = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println("date: "+ curdate); //날짜형식
		System.out.println("cal: "+cal); //문자열 결합
		System.out.println("cal getTime() 함수: "+cal.getTime()); //getTime()으로 format해야
		

		//원하는 형태로 날짜를 만들수 있다 위 URL참조
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmm");
		System.out.println(dateformat.format(curdate));
		System.out.println(dateformat.format(cal.getTime()));
		
		//사이트 정보입력
		//문자열 >> 날짜형식으로 변환
		String StringDate = "202008261212";
		try {
			Date stringdate = dateformat.parse(StringDate);
			System.out.println("stringdate: "+stringdate);
			
			//시간을 long타입으로
			long datelong = stringdate.getTime();
			System.out.println(datelong);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
