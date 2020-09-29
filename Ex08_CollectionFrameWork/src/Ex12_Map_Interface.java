import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex12_Map_Interface {
	public static void main(String[] args) {
		//Map �������̽� ����
		//Map >> (Ű, ��) ���� ������ ������ �迭
		//ex)������ȣ(02,����) , (031,���)
		//key: �ߺ� (x)
		//value: �ߺ�(o)
		
		//generit ����
		//Map �������̽� ����
		//������: HashTable (����ȭ �Ǿ� ����)
		//�Ź���: HashMap (����ȭ�� �������� ����):������ �����
		//����ȭ(Thread�� �н��ؾ��� : �������� Stack�� ���ÿ� ����� �� �ǹ̰� ����)
		
		HashMap map = new HashMap(); //�α����� ID,PW�� ���� �� �ִ� ����
		map.put("Tiger","1004");
		map.put("Scott","1004");
		map.put("Superman","1004");
		
		
		System.out.println(map.containsKey("Tiger"));
		System.out.println(map.containsKey("Scott"));
		System.out.println(map.containsValue("1004"));
		
		System.out.println(map.get("Tiger")); //key >> value "1004"����
		System.out.println(map.get("Hong")); //key���� ������ null
		
		map.put("Tiger","1007"); //value replace
		System.out.println(map.get("Tiger")); //1007�� overwrite
		System.out.println(map.size()); //3
		
		Object value = map.remove("Superman");
		System.out.println("value: "+value);
		System.out.println(map.toString());
		System.out.println(map.size());
		
		//����(����)
		Set set = map.keySet(); //keySet �Լ��� Set�� �����ϰ� �ִ� ��ü�� �ּҸ� ����
		System.out.println("keyset: "+set.toString());
		//����(x),�ߺ�(x) 
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collection clist = map.values();
		System.out.println(clist.toString());
		
	}

}
