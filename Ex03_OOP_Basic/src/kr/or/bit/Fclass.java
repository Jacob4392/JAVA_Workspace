package kr.or.bit;


/*
���(����) ����� ���
�Լ� (function, method)

method: ���� �Ǵ� ���(�ּҴ���): �ϳ��� �Լ��� �ϳ��� ��ɸ� ����

Ŭ����: �ʵ� + �Լ� + ������

ex) �����̱� -> �����ְ� ������ �޴°� (�����ִ� ��(��))

�Լ��� ȣ�⿡ ���ؼ��� �����Ѵ�.

JAVA) �Լ�
1. void, parameter(o): void print(String str){�����ڵ�}
2. void, parameter(x): void print(){�����ڵ�}
3. return type, parameter(o): int print(int data){return 100;}
4. return type, parameter(x): int print(){return 100;}


****
void >> �����ִ� ���� ���� >> return value�� ����
return type >> 8���� �⺻Ÿ��, String, Array, *Class*(����ڰ� ���� Ÿ��), Collection, Interface
parameter type >>8���� �⺻Ÿ��, String, Array, *Class*, Collection, Interface
void print(int a, int b, int c, int d){} ... ����, �μ�, �Ű�����, ���ް� >> parameter
ex) print(10,20,30); (X), print(1,2,3,4); (O)


Car print(){ Car c = new Car(); return c; }...���� { return new Car(); }
boolean print(boolean bo){return true;}

�Լ��� �̸�: ������ ǥ�� 
�ǹ��ִ� �ܾ��� ����(�� �������)
:getChannelNumber()
:getEmpListByEmpno()

�Լ��� �ݵ�� ȣ��(call)�Ǿ�� ����ȴ�: 

*/


public class Fclass {
	public int data;
	
	
	//void m() //�����Ϸ��� default void m(): ���� ��Ű�� �������� ����� ���
	public void m() {  //�ٸ� package���� ��밡��
		int i;
		
		System.out.println("�Ϲ��Լ�: void, parameter(x)");
	}
	
	//void m(int ..)
	public void m2(int i) {
		System.out.println("�Ϲ��Լ�: void, parameter(o)");
		System.out.println("parameter value: (scope�� �Լ�����)"+ i);
	}
	
	
	public int m3() {
		return 0; //return Type�� �����ϸ� �ݵ�� return Ű���尡 �־�� �Ѵ�
	}
	
	
	public int m4(int data) {
		return 100+data;
	}
	//��������� �Լ� �⺻...
	
	//Ȯ��
	public int sum(int i, int j, int k) {
		return i+j+k;
	}
	
	//default int subSum()...
	//�������� �ǵ� : subSum() �̶�� �Լ��� �ٸ� �Լ��� �����ִ� �Լ� [����]���� ȣ��
	//���ο��� �������� ���� ��Ƽ� �ʿ��� �� �ҷ���
	//�̷� ����: private�����ڰ� �� �����ϴ�: Ŭ���� ���ο����� ����� �� ���� -> ����  package���� ����
	//**Ŭ���� ���ο�����: public, private, default �������� �ʴ´�.
	private int subSum(int i) { //Ŭ���� ������ �����Լ��� ����ϰڴٴ� ������ ��� ������
		return i + 100;
	}
	public void callSubSum() {
		int result = subSum(100);
		System.out.println(result);
	}
	
	private int operationMethod(int data) { //Ŭ���� ���ο���... �����Լ��� ���ڴ�
		return data * 200;
	}
	
	public int opSum(int data) {
		int result = operationMethod(data);
		if(result>0) {
			return 1;
		}else {
			return -1;
		}
	}
	
	//Quiz
	//a�� b �� �߿� ū ���� return �ϴ� �Լ��� ���弼��
	//ex) max(300,100) return ���� 300
	//public int max(int a, int b){}
	
	
	//30�� : return�� �ּҷ� �ۼ�(�ݺ��� ��� ����)
	/*	public int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	//60��
		public int max(int a, int b) {
		int result = 0;
			if(a>b) {
			result a;
		}else {
			result b;
		}
			return result;
	}
	
	//90��
	  public int max(int a, int b) {
	  int max = (a>b)? a : b;
	  return max;
	  }
	  
	//100��
	  public int max(int a, int b) {
	  	return (a>b)? a : b;
	  }
	  	*/	
	  public int max(int a, int b) {
		  return (a>b)? a : b;
	  }
	  
	  
	  //�Լ��� ����Ҷ� �⺻Ÿ��(��Ÿ��)
	  //�Լ��� ����Ÿ��
	  //return Type�� Ŭ������ �� �� �ִ�.
	  public Tv tCall() { //Tv Ÿ���� ������ [***�ּ�***]�� ���� >> new... 
		  //return null;
		  Tv t = new Tv();//Ȯ�强 �鿡 �־ ����
		  return t; //stack �� �������� t�� ������� heap�� Tv��ü�� �״�� ��������
	  }
	  	
	  public Tv tcall2() {
		  return new Tv(); //�� ��ɸ� ���� ���� �̰��� ����, ���������� Ȱ���� ����
	  }
	
	  public void tCall3(Tv t) { //TvŸ���� ������ �ּҸ� parameter�� ���´�
		  System.out.println("t �ּҰ�: " + t);
	  }

	  //1. tCall3(new Tv()) -> Tv Ÿ���� �ּҸ� ����
	  //2. Tv t = new Tv(); 
	  //	tCall3(t);
	  
	  // �̰��� ���� ����? �پ��� ���踦 �� �� �ִ�.
	  
}
