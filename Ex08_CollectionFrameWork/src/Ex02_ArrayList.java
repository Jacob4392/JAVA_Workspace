import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Today Point


public class Ex02_ArrayList {

	public static void main(String[] args) {
		//List �������̽� ���� >> ����, �ߺ���� ������ ����
		
		ArrayList arraylist = new ArrayList();
		//Object Ÿ���� ������ ���� �迭�� heap�޸𸮿� ������
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}

		System.out.println(arraylist.toString());
		System.out.println(arraylist.get(0)); //Ư�� �濡 �ִ� ��
		
		//add ���������� ������ �ֱ� 
		arraylist.add(0,111);
		System.out.println(arraylist);//[111, 100, 200, 300]
		arraylist.add(4,444);
		System.out.println(arraylist);
		//**��������� ������ �߰�, ���� >> ArrayList �������� ���� >> ������ �ִ� �������� ���տ� ����
		//**������ �������� �߰�, ������ ����
		
		//arraylist.remove(200); //ex index����
		System.out.println(arraylist);
		
		//[111, 100, 200, 300, 444]
		//ArrayList �Լ��� ����(�ʱ�)
		System.out.println(arraylist.contains(200));//true
		
		arraylist.clear(); //������ ����(������ �����ִ�)
		System.out.println(arraylist.size()); //size ������ ũ��
		System.out.println(arraylist.isEmpty());//true
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		
		System.out.println(arraylist.isEmpty()); //false
		
		System.out.println("������: "+arraylist.size());
		Object value = arraylist.remove(0); //0��° ���� ���� ����, �� ���� return
		System.out.println("������ ������: "+value);
		System.out.println("������: "+arraylist.size());
		System.out.println(arraylist.toString());
		
		
		//Point
		//������ ���� �ڵ�, �ϻ�ٹݻ�
		//������, (Ȯ�强, ��������) 
		List li = new ArrayList();
		li.add("��");
		li.add("��");
		li.add("��");
		li.add("��");
		li.add("��");
		
		List li2 = li.subList(0,2); //subList ������ִ� ������ ������ �ִ� ������ ����
		System.out.println(li2);
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		
		System.out.println(alist.toString());
		Collections.sort(alist); //�ʱ��ڴ� ����, �߱��� ��� ����
		System.out.println(alist.toString()); //���� �� ����
		Collections.reverse(alist); //���� �� ����
		System.out.println(alist);
		
		
	}

}
