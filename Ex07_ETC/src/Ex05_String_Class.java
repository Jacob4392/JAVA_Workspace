
/*
 	String Class(���ڿ�)
 	String Ŭ������ ������ �Լ��� ������ ����(���ڿ��� �����ϴ�(�ڸ���, ��ġ�� �ϴ� ��))
 	String >> static �Լ�(���� ���� �Լ�) + �Ϲ��Լ�(new�ؼ� �ҷ����� �Լ�)
 	15�� ~ 20�� �Լ� �ܿ�� ��
 
 
 */


public class Ex05_String_Class {

	public static void main(String[] args) {
		String str = ""; //���ڿ��� �ʱ�ȭ >> null, ""
		// ������� int,double ó�� ������
		
		String[] strarr = {"aaa","bbb","ccc"};
		for(String s:strarr) {
			System.out.println(s);
		}

		///////////////////////////////////////////
		String stri = "ȫ�浿";
		System.out.println(stri.length());
		System.out.println(stri.toString());
		System.out.println(stri); //�ּҰ��� ���;� �ϴ� �ڵ��ε�, �������� ����.. (toString�� �������̵� �Ǿ� ����)
								  //(�ڿ� toString()����)
		//Object���� ������ �ִ� toString()�� String���� ������ >> ���� ����ϵ���
		
		String stra = new String("ȫ�浿");
		System.out.println(stra);
		
		//1.String name = "�����ٶ�"; >>
		//String ���������� Char[] �޸𸮸� ����Ѵ� >> char[] >> [��][��][��][��][��] String�� ���ο� char�迭�� �ֱ� ������ length()�� �� �� �ִ� ��
		//												   0   1  2   3  4
		//class String extends Object{ char[] 	@override toString(){...} length()}
		
		String str1 = "AAA";
		String str2 = "AAA";
		
		System.out.println(str1);
		System.out.println(str2.toString());
		System.out.println(str1==str2);
		//==�����ڴ� ���� ����(str1(�ּҰ�), str2(�ּҰ�))
		//���� �ּҷ� �Ǹ�� ������?
		//�޸𸮿� ������ ���� ���ڿ��� ������ ������. str1�� "AAA"�� ������
		System.out.println(str1.equals(str2)); //�ּҸ� ã�ư��� �� �ȿ� �ִ� ���� ��
				
		//�׷��� ����
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3==str4); //false^^ //�̶��� �ּҰ��� ���ϱ� ������ �ٸ��ٰ� ������ ��
		System.out.println(str3.equals(str4)); //�̰��� �ּҸ� ã�ư��� ��ü �ȿ� �ִ� ���� ���ϱ� ������ ���ٰ� ������ ��
		//new�� �ǹ��ϴ� ����, ���ο� �޸𸮸� �����϶�� ��
		
		//�ͼ���
		String s = "A";
		s+="B";
		s+="C";
		System.out.println(s);
		
		s = "A";
		
	}

}
