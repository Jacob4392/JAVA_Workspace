import java.util.ArrayList;

/*
 	�ڹ� 8���� �⺻Ÿ��(��Ÿ��) : Java API ����
 	
 	8���� �⺻ Ÿ�Կ� ���ؼ� ��ü ���·� ��밡���ϵ��� ���� ���� Wrapper class�̴�.
 	
 	�⺻Ÿ�� ��ſ� ��ü ���� Ÿ���� ����ؾ� �� ���� �ִ�. >> ���ʸ�, static�ڿ�(���ڸ� -> ����, �Ǽ��� �ٲ� ��)
 	1. �Ű������� ��ü�� �䱸�� ��
 	2. �⺻�� ���� �ƴ� ��ü���·� ����
 	3. ��ü�� �� ��
 	4. Ÿ�� ��ȯ�� ó��
 */
public class Ex08_Wrapper_Class {
	public static void main(String[] args) {
		int i = 100;
		Integer n = new Integer(500);
		System.out.println("n: "+n); //toString() ������, �ּҰ� �ƴ� ���� ��������
		System.out.println(n.MAX_VALUE);
		System.out.println(n.MIN_VALUE);
		
		//Point
		//parameter�� ���� ��
		//���ʸ�(generic)
		//��ü�� ������ �� Ÿ���� �����ϴ� ���(Object�� ���� Ÿ���� ���������ν� ĳ�����ϴ� ���ŷο��� ��������)
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(100);
		//li.add("A");
		li.add(200);
		for(int value : li) {
			System.out.println(value);
		}
		
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2==i3); //false �ּҰ� ��
		System.out.println(i2.equals(i3)); //true
		
		//equals�� Object��
		//String Ŭ���� equals ������
		//Interger Ŭ���� equals ������ (���� ���� ���ϵ���)
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4==i5); //true
		
		Integer t = new Integer(500);
		integerMethod(t); //t��� ���������� [�ּҰ�]�� ����
		intMethod(t); //t��� ���������� ������ �ִ� [��]�� ����
		
		
		
		
	}
	static void integerMethod(Integer i) {
		System.out.println("integer param: "+ i);//toString() ������
		System.out.println(i.MAX_VALUE);
	}
	
	static void intMethod(int i) {
		System.out.println("int param: "+i);
	}

}
