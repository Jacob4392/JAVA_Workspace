/*
  	1. �ڹٰ� �����ϴ� �⺻ Ÿ��(�ý���Ÿ��) �ڷ��� >>8����
  	2. 8���� �⺻Ÿ���� [���� ����]�ϴ� Ÿ��
  	3. ���� >> ����  >> (���� ����, 0 , ���� ����) >> byte(-128~127)
  										  >> char(�� ���ڸ� ǥ���ϴ� Ÿ��) >> 'A','��'
  										     >>> �ѱ� 1�� 2byte
  										     >>> ������, Ư������, ���� 1byte
  										     >>> ���� >> char(2byte) (�ѱ�, ����, Ư������, ����) ������� �� ����
  										     >>> ������ ����(unicode) >>> �ƽ�Ű�ڵ�ǥ
  										     
  										  >> short (c������ ȣȯ�� 2byte)
  										  >> int(-21�� ~ 21�� : 4byte)*** Java ������ ������ �⺻ Ÿ��
  										  >> long(8byte)
 			>> �Ǽ�(�ε��Ҽ���) 			  >> float(4byte)
 										  >> double(8byte) >>���е�(ǥ�� ������ ũ��) ***Java �Ǽ��� ������ �⺻Ÿ��***
 		�� >> ��, ���� (true, false)		  >> boolean (���α׷��� ������ �帧����)
 		
 	*** ���ڿ��� ǥ�� >> "ȫ�浿" , "Hello"
 	String name = "ȫ�浿"; >> String Ŭ���� Ÿ��(����Ÿ��)
 	�׷����� �ұ��ϰ� �ٸ� �̾߱⸦ �ϱ� ������ String ���ڿ��� ���� �� �ִ� Ÿ��
 	int, double ó�� ���
 	
 	�ڹٴ� ũ��
 	1. �� Ÿ��			: 8���� �⺻Ÿ��: int i =100;     						-> value type
 	2. ����Ÿ�� (�ּҰ�) : Ŭ����, �迭 : ������ ���� ����Ǵ� ���� �ƴ϶� �ּҰ� ����(������) -> ref type
 * 
 * 
 * 
 */



//class == ���赵 == Ÿ��(Type)
class Car{ //Car Type �̴�, Car ���赵�̴� >> ��üȭ�� �깰�� ������ �� > ��ü(�޸�)
	String color;
	int window;
	
	
}


public class Ex03_DataType {

	public static void main(String[] args) {
		String str = "ȫ�浿";
		int age = 100;
		
		Car c; //c�� main �Լ� �ȿ� �ִ� ���� ����
		//System.out.println(c); �������� �ʱ�ȭ x
		//c��� ������ �ʱ�ȭ >> �ּҸ� ������ �ϴ� �� >> new ������
		c = new Car();
		
		
		//����� �ʱ�ȭ
		//����Ÿ���� �ʱ�ȭ : �ּҰ� ���´�
		Car c2 = new Car();
		System.out.println(c2.window);
		System.out.println(c2.color);
		c2.color = "blue";
		c2.window = 100;
		System.out.println(c2.window);
		System.out.println(c2.color);
		System.out.println(c.window);
		System.out.println(c.color);
		
		
		int i = 10;
		int j;
		j = 20;
		
		int k;
		k = j; //point [�� �Ҵ�]
		System.out.println("k:" +k);
		k = 300;
		System.out.println("k:" +k);
		System.out.println("j:" +j);
		
		int p,g,q;
		//�̷� ����� �迭�� ���� ���� ����.
		
		//int(-21 ~ 21)
		//Today Point
		//literal >> �ִ� �״�� >> �ҽ� �ڵ忡�� �����ڰ� ���� �Է��� ��
		//���� ���ͷ�: [�⺻�� defalut: int����]
		//int P = 1000000000;
		long I = 1000000000L;	//����
		long l2 = 100;			//����
		
		//int p2 = 1000000000L; 
		
		//char : 2byte ������
		//�� ���ڸ� ǥ���ϴ� �ڷ���
		//Today Point
		//���ڿ� : "��", "ȫ�浿" >> String str = "�����ٶ󸶹�"
		//���� : 'A' '��' 		 >> char ch = 'A';
		
		char single = '��';
		System.out.println(single);
		char ch = 'A';
		//char ���ڸ� ���������� ���������� �������� ������ �ִ�(�ƽ�Ű�ڵ�ǥ)
		//casting(Ÿ�� ��ȯ)
		int intch= 'A'; //���������� �ڵ�(�Ͻ���) �� ��ȯ
		System.out.println("intch:" +intch);
		System.out.println((int)ch);
		
		char ch2 ='a';
		System.out.println(ch2);
		int intch2 = (int)ch2;
		System.out.println(intch2);
		
		int intch3 = 65;
		char ch3 = (char)intch3;
		System.out.println(intch);
		//�������� [���� ���� ���� ���� ������ Ÿ���� ����]
		//������ ����ȯ (����� ����ȯ)
		//Key Point : 65��� ���ڰ� char Ÿ�� ���ϴ� ��� (������ �ս� ���� �Ҵ�)
		//int intch3 = 99999999;
		// ū ���� ���� ������ ����[������ �ս�]
		
		int intch4 =  ch3; //����ȯ .. �ڵ����� �����Ϸ�
		System.out.println(intch4);
		//�ڵ�����ȯ
		//int intch4 = (int)ch3 �����Ϸ��� �ڵ� �����
		
		
		/*
		 * Today Point
		 * 1. �Ҵ翡�� ������ ������ �ִ� ���� ���� ���� ������ Ÿ���� ����
		 * 2. ������ Ÿ�� ũ�⸦ Ȯ������.
		 * 3. ū Ÿ�Կ��� ���� Ÿ���� ���� �� �ִ�.
		 * 4. ���� Ÿ�Կ��� ūŸ���� ���� �� ����.(casting)
		 * 		char <- int >>>> char <- (char)int 
		 * 		int  <- char>>>> int  <- char �����ϸ� ���������� �����Ϸ��� int <- (int)char�� ��ȯ �����Ѵ�.
		 */
		
		//int intvalue = 1490594;
		//byte bytevalue = (byte)intvalue;
		//System.out.println("bytevalue: " + bytevalue); //������ �ʴ� �� �߻�
		
		int intvalue = 101; //OK
		byte bytevalue = (byte)intvalue;
		System.out.println("bytevalue: " + bytevalue); //�սǵ��� �ʾҾ��(100%�� �ƴϴ�)
		
		//String(���ڿ��� ǥ���ϴ� �ڷ���) 
		String name = "hello world";
		System.out.println(name);
		//syso ctrl + space
		
		String name2 = name + " �氡�氡"; // + >> ���ڰ� ���� ���, ���ڰ� ���� ����
		System.out.println(name2);
		//DB(oracle) >> + ������(���) , ���� ������ || '�ȳ�' || '�氡'
		
		//Tip) Java������ Ư�����ڸ� ���
		//�̽������� ���� >> Ư������ �տ� \
		char sing = '\'';
		// ���� ' �ϳ��� ǥ���ϰ� �;� >> �������ö�� ���ڿ� �����ؼ� ����ϸ� ���ڷ� �������ٰ�!
		System.out.println(sing);
		
		//ȫ"��"�� �̶�� ���ڸ� String ������ �����ϰ� ȭ�鿡 ����ϰ� ����
		String name3 = "ȫ\"��\"��";
		System.out.println(name3);
		
		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4;//"100010"
		System.out.println(result);
		
		//C:\temp ���ڿ��� String ������ �ְ� ȭ�鿡 ����ϼ���.
		String temp = "C:\\temp"; //C:	emp >>  \t >>tab	\n >> new line
		System.out.println(temp);
		
		//�Ǽ���(�ε��Ҽ���) (ǥ���� ������ �о����� ������, but ��Ȯ������ ����)
		//float(4byte)
		//double(8byte) **�Ǽ� ���ͷ��� �⺻Ÿ��**
		
		float f = 3.14F; //3.14 ���ͷ� ���� Double �׸��� �ֱ� ������ >> float���� �׸��� ��ü>>���̻�(F,f)
		//float f2 = (float)3.14;
		
		float f2 = 1.123456789f;
		System.out.println("f2: " + f2);
		//1.1234568 >> �뷫 7�ڸ� �Ҽ�ǥ��
		//�ݿø��� default
		
		double d = 1.123456789123456789;
		System.out.println("d :" + d);
		//1.1234567891234568 >> �뷫 16�ڸ� �Ҽ�ǥ��
		//�ݿø��� default
		
		System.out.println((byte)129);
		//byte -128 ~ 127  //overflow �� ��ȯ
		byte q2 = (byte)128;
		System.out.println(q2);
		
		double d2 = 100; // �Ͻ��� ����ȯ
		System.out.println(d2); //100.0
		
		//�����Ϸ�
		//double d2 = (double)100;
		
		//Quiz
		double d3 = 100;
		int i5 = 100;
		//�Ʒ� �ڵ尡 error ���� ó���Ƿ���?
		// int result2 = d3 + i5;
		//1. int result2 = (int) (d3 + i5);
		//  ���࿡ d3 = 3.145 >> int >> 3.0  �� ��� �ս��� �߻�
		//2. double result2 = d3 + i5; // �ս��� ����
		//System.out.println(result2);
		//3. int result2 = (int)d3 +i5;
		//System.out.println(result2);
		
		//Today Point
		//1. ���� Ÿ�� + ū Ÿ�� >> ū Ÿ��
		//2. Ÿ�� �� ��ȯ >> ������ ������ ���� ���� ���� ������ Ÿ���� ���� �Ǵ�����
		//3. �ʿ��ϴٸ� ����� ����ȯ�� Ȱ���Ͽ� �۾�(Casting) : �սǺп� ���� ��� �غ���
		
		int i6 = 100;
		byte b2 = (byte)i6; //����� ����ȯ
		System.out.println(b2);
		
		byte b3 = 20;
		int i7 = b3;
		//�����Ϸ��� ���������� (int)b3�� �Ͻ��� ����ȯ�� ��
		
	}

}
