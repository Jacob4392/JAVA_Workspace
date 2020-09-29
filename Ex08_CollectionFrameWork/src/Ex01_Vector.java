import java.util.Vector;

/*
 	Collection Framework
 	[�ټ��� ������]�� �ٷ�� [ǥ��ȭ�� �������̽�]�� [�����ϰ� �ִ� Ŭ�������� ����]
 	
 	Collection �������̽� -> List ��� -> ArrayList(����:�����)
 						  Set ��� -> HashSet, TreeSet(����)
 	Map �������̽� (key,value) -> HashMap(����)
 	
 	1.List (���� ���ÿ�)
 	:����(��ȣǥ),�ߺ�(���) >> ���������� ������(�ڷ�, ��ü)���� >> [�迭]�� ���� >>[ȫ�浿][ȫ�浿][ȫ�浿]
 	
 	1.1 Vector(������)   -> ����ȭ�� ����(��Ƽ������ ȯ�濡��) -> ���������� Lock��ġ�� ������ ����(�����͸� ��ȣ) -> ������ ����
 	1.2 ArrayList(�Ź���)-> ����ȭ ���� ���� ����(��Ƽ������ ȯ�濡��) -> Lock��ġ(x), �ʿ信 ���� �� -> ������ �켱��
 	
 	����) ���� Ÿ���� �������� �����͸� �����ϴ� ��� :Array ����(����)
 	-���� ������ �ѹ� �������� (���� ũ��� ���� �Ұ�)
 	int[] arr = new int[5];
 	arr[0] = 100;
 	�Ǵ�
 	10���� �� �ʿ��Ҷ�,[���̰ų� �ø� �� ����]
 	int[] arr = {10,20,30};
 	
 	Array
 	1.�迭�� ũ�Ⱑ ����: Car[] cars = {new Car(), new Car()}; //�� 2��
 	2.���� ���(index ÷��) ���ȣ ����: cars[0],...cars[n] : 0...n��° ����� : ������ ���� ��ȣ��(index): length-1�̴�.
 	3.�ʱ� ���� �Ұ�
 	
 	Collection
 	List ����
 	(Vector, ArrayList)
 	1.�迭�� ũ�⸦ �������� Ȯ�� : ���, �ø��� ���� >> ����� [�迭�� ���Ҵ�]�� �̿�
 	2.������ ����(���������� �迭���:index), �ߺ��� ���
 	3.������ ������� : Array ���
 	
 	
 	
 */
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ� default �뷮: "+ v.capacity());
		System.out.println("size: "+v.size());
		v.add("AA");
		v.add("AA");
		v.add("AA");
		v.add(100);
		System.out.println("size: "+v.size()); //array������ length
		System.out.println(v.toString()); //[AA, AA, AA, 100] >> Vector�� toString() ������ �Ǿ� ����
		//Array >> length 
		//Collection >> size
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i)); //get(index) ���� return��, ���� arr[index]
		}
		
		for(Object obj:v) {
			System.out.println(obj);
		}
		
		//���ʸ� >> Ÿ���� �����ϴ� ��� >> 
		Vector<String> v2 = new Vector<String>(); //Object�� ���� �� �ִ� �׸����� String�� ���� �� �ִ� �׸����� �ٲ�
		v2.add("hello");
		v2.add("world");
		v2.add("king");
		for(String str:v2) {
			System.out.println(str);
		}
		///////////////////////////////////////////////////////
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A"); //
		v3.add("A"); // 11��° add //���� �ø� >> 
		System.out.println("�þ capacity: "+v3.capacity());
		System.out.println("size: "+v3.size());
		
		
		
	}

}
