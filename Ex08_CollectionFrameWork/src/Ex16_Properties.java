import java.util.Properties;

/*
 	Properties
 	Map �������̽��� ������ Ŭ����
 	Ư���� ����: <String,String>(key,value)�� ���� ����
 	
 	������
 	Application ��ü�� ���Ǵ� �ڿ� ����
 	ȯ�溯��
 	���α׷� ����
 	���ϰ��
 	���뺯��
 
 */
public class Ex16_Properties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("admin","bit@bit.or.kr");
		prop.setProperty("version", "1.0");
		prop.setProperty("downpath", "C:\\Temp\\images");
		//������ ���� ���������� 
		System.out.println(prop.getProperty("admin"));
		System.out.println(prop.getProperty("downpath"));

	}

}
