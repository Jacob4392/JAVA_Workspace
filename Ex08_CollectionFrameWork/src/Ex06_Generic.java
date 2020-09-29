import java.util.ArrayList;

/*
 	Today Point
 	Generic jdk 1.5
 	C#, java, �ʼ� ���
 	
 	Collection Ŭ���� >> ������ �⺻����������� Object�� �����
 	1. Object Ÿ�� ���� >> Ÿ�� ����(��ü������ Ÿ���� ����) >> ���ʸ�
 	2. Ÿ���� ������ ����(Ÿ�� ����)
 	3. ���� ����ȯ(casting�� ���� ���� ����) : (Car)object (x)
 	
 	����: Ŭ������ ������ �� ���ʸ��� �����ϴ� �ڵ带 ����� ������ 	
 	
 	
 */

class MyGen<T>{ //type parameter
	T obj;
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class Person extends Object{
	int age = 100;
}



public class Ex06_Generic {

	public static void main(String[] args) {
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("���ڿ�");
		String str = mygen.get();
		System.out.println(str);

		ArrayList list = new ArrayList();
		//��������� Ÿ���� Object[] elements
		list.add(10);
		list.add(new Person());
		list.add("ȫ�浿");
		
		//���
		//������ for��
		for(Object obj:list) {
			//person ��ü�� ���̸� ����ϰ�, �������� ���� ����ϼ���
			//System.out.println(obj);
			//��ü�� �Ͱ� �ƴ� ���� �����ؾ� ��
			if(obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p.age);
			}else {
				System.out.println(obj);
			}
			
			
		}
		
		
		
		
	}

}
