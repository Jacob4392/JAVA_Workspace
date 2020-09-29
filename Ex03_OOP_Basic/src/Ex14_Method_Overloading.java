/*
	OOP(��ü���� ���α׷���)
	1. ���(���뼺)
	2. ĸ��ȭ(����ȭ) : private, getter, setter(�����Ҵ��� ���� �����Ҵ��� ���ؼ� �����͸� ��ȣ�ϰڴ�)
	3. ������: �ϳ��� Ÿ������ �������� ��ü�� ���� �� ����

// >> method overloading
// �ϳ��� �̸����� �������� ����� �ϴ� �Լ�(���ϰ� ������ �ϴ� �Լ�) ���ɰ� �������� ����
	System.out.println(); >> println() �����ε��� �����ϰ� �ִ� �Լ�
	1. �����ε��� ������� ������ ���� �ʴ´�
	2. ���ϰ� ����϶�� �����ڰ� ����� ��(������)
	3. �����ε� �𸣸� 20�� �ٸ� �̸� ����� �׻���...
	
	����) �Լ� �̸��� ����, parameter [����]�� [Ÿ��]�� �ٸ��� �ϸ� ��
	1. �Լ� �̸��� ���ƾ� �Ѵ�.
	2. parameter ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.
	3. return type�� �����ε��� �Ǵܱ����� �ƴϴ�.
	4. parameter ������ �ٸ��� �����Ѵ�(����)
	
 */


class Human{
	String name;
	int age;
	
}

class OverTest{
	int add(int i) {
		return 100+i;
	}
	
	int add(int i,int j) {
		System.out.println("�����ε�: "+ i +","+j);
		return i+j;
	}
	
	String add(String s) {
		System.out.println("�����ε�: "+ s);
		return "hello " + s;
	}
	
	String add(String s, int i) { //parameter ������ �ٸ��� ����
		return null;
	}
	
	String add(int i, String s) {
		return null;
	}
	
	void add(Human human) { //�����ε�
		human.name="ȫ�浿";
		human.age=100;
		System.out.println(human.name + ","+human.age);
	}
}



public class Ex14_Method_Overloading {

	public static void main(String[] args) {
		OverTest ot = new OverTest();
		int result = ot.add(100,200);
		System.out.println(result);
		
		String return2 = ot.add("world");
		System.out.println(return2);

		Human h = new Human();
		ot.add(h);
		System.out.println(h.name);
		
	}

}
