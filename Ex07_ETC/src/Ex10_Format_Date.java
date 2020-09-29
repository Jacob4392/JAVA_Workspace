import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//https://cafe.naver.com/springbit/315

public class Ex10_Format_Date {

	public static void main(String[] args) {
		Date curdate = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println("date: "+ curdate); //��¥����
		System.out.println("cal: "+cal); //���ڿ� ����
		System.out.println("cal getTime() �Լ�: "+cal.getTime()); //getTime()���� format�ؾ�
		

		//���ϴ� ���·� ��¥�� ����� �ִ� �� URL����
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmm");
		System.out.println(dateformat.format(curdate));
		System.out.println(dateformat.format(cal.getTime()));
		
		//����Ʈ �����Է�
		//���ڿ� >> ��¥�������� ��ȯ
		String StringDate = "202008261212";
		try {
			Date stringdate = dateformat.parse(StringDate);
			System.out.println("stringdate: "+stringdate);
			
			//�ð��� longŸ������
			long datelong = stringdate.getTime();
			System.out.println(datelong);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
