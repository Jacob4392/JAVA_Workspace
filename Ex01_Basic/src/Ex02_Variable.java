//�����ּ�
/*
	���ּ�(�ؼ����� �ʴ� �ڿ�)
	1.Ex02_Variable Ŭ���� >> ���赵 >> Ÿ���̴�(�������� ���� Ÿ���� ��Ƴ��� �ǹ��ִ� ����)
	
	-Ŭ������ ����
		-- class Test{} >> �������� ������ �Ұ��� : �ٸ� Ŭ����(���赵)�� �����ϴ� Ŭ���� : main �Լ��� ����>> lib
		-- class Test{public static void main(String[] args){}   } >> ���డ���� Ŭ����
		-- static void main(String[] args) >> main �̸��� ������ �Լ� >> ���α׷� ������, ������ >>���
	C# : static void Main(){}
	
	���� : variable
	:������(�ڷ�) ���� �� �ִ� ������ �̸�
	����(ũ��): Ÿ��(�ڷ���)
	������Ÿ�� ������ >> int i = 100;

	������ ����Ǵ� ��ġ�� ���� (scope: ��ȿ����)
	1. instance variable: ��ü���� >> class Person{int age;} Ŭ���� �ȿ��� ����Ǵ� ����
	2. local variable : ��������(���� : �Լ���) >> class Person{public void run(){int speed}} �Լ��ȿ����� ��ȿ
	3. �Լ��ȿ� if ��, for �� �ȿ� �ִ� ������ (�� �ȿ����� ��ȿ)
	4. static variable: �����ڿ�(��ü��)
	
*/


//class�� ���赵�̴� == class�� Ÿ��(Type)�̴�(�������� �ǹ��ִ� ���� Ÿ���� ������ ū Ÿ���̴�) == ����� ���� Ÿ��
class Test{
	int iv=100; // �ʱ�ȭ>100
	//instance variable
	//�� ������ �ʱ�ȭ�� ���� �ʾƵ� �ȴ�.(���������� �⺻���� ���� ����:default)
	int window; // �⺻��>0
	//�ʱ�ȭ : ������ ó�� ���� ���� ��(�Ҵ��� ���ؼ�)
	//���� : why window ������ �ʱ�ȭ�� ���� �ʾƵ� ��밡���ұ��
	//window ����Ʈ�� â���� ������ ���� ����
	//���赵�� �ϳ� ...���赵�� ������� ����Ʈ ������...����Ʈ���� â���� ������ �ٸ� �� �ִ�.
	//����Ʈ����(��ü) â���� ������ �ٸ��� �ϰڴ�.
	
	//Test �Ｚ����Ʈ = new Test();
	//�Ｚ����Ʈ.window=4;
	
	//Test �������Ʈ = new Test();
	//�������Ʈ.window=2;
	
	Test(){ //������ �Լ�(Ư���� �Լ�) ��ü�� �����ɶ� �ڵ����� ȣ��Ǵ� �Լ�:��ü ������ ���ÿ�:constructor(�ʱ���, ������)
		System.out.println("���� ������");
	}
	Test(int data){ //�����ε� :overloading : �ϳ��� �̸����� �������� ����� ����
					//�ڵ����� ȣ��Ǵ� �Լ� : ����Ʈ�� ������ �� ����
		window = data;//â���� ���� ���� �ʱ�ȭ
	}
	
	void write() {//���, ���� method
		int num=100; 
		//local variable
		//����� ���� ���������� ����ϰ� �ʹٸ� ���� �ݵ�� �ʱ�ȭ�� �ض�.
		//write �Լ��� ȣ��Ǹ� �����ǰ�, �Լ��� ����Ǹ� �޸𸮿��� �������
		
		System.out.println(num);
		int age = 15;
		//���������� ���(���, ���ϰų� ���ų�)�ϱ� ���� �ݵ�� �ʱ�ȭ(���� �Ҵ��ϴ� ����)�ؾ� �Ѵ�(����)
	}

	void print() {
		//�ȿ��� age ���� ��� (���Ұ�) �ٸ��Լ�... ���ٺҰ�
		//System.out.println(age);
		System.out.println(window);
	}

}
public class Ex02_Variable {

	public static void main(String[] args) {
		Test t = new Test(); //���赵�� ��üȭ...��ü����...����Ʈ�� ���� ��(t: ����Ʈ�̸�)
		t.print();
		
		int lv = 100;
		System.out.println("lv ��������:"+lv);
		
		class Apt{
			int window;
		}
		
		//Ex02_Variable
		//javac Ex02_Variable.java >> Ex02_Variable.class ����
		//java Ex02_Variable ����
		//JVM ���� >> OS >> app �޸� ���� >> �ڿ��Ҵ�... >> ���α׷����� >> ����ߴ� ������ ��ȯ OS
		//��Ŭ���� ���� ������ (Ctrl + F11 ������>>����)
		
		//1. ���������� �ݵ�� �ʱ�ȭ�� �ϰ� ���(������ ó�� ���� �Ҵ��ϴ� ��)
		//2. ���! >> main �� �Լ��� >> �ʱ�ȭ
		
		int number = 0; //����� ���ÿ�
		number = 100;
		number = 200;
		System.out.println("number: "+number);
		
		int a; // ����
		int b;
		
		a=100; // �ʱ�ȭ
		b=200;
		
		int c,d; //��ȣ���� ���� >> �迭�� ����Ѵ�
		
		Apt ssung = new Apt();
		System.out.println(ssung.window);
		Apt ppark = ssung;
		ppark.window = 100;
		System.out.println(ssung.window);
		System.out.println(ssung);
		System.out.println(ppark);
		
	}

}
