import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 	Set �������̽��� �����ϰ� �ִ� Ŭ����
 	Set -> �� �ȿ� ������(���� ����(x), �ߺ�(x))
 	:������ ���� �ߺ��� ������� �ʴ� ������ ���� : set
 	
 	HashSet, TreeSet
 	
 	
 	
 */
public class Ex09_Set {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(100);
		boolean bo2 = hs.add(55);
		System.out.println(bo2);
		
		bo2 = hs.add(1); //�ߺ����� ���ٴ� ������ �޴´�
		System.out.println(bo2);

		System.out.println(hs.toString());
		
		hs.add(2);
		System.out.println(hs.toString()); //��� ������ ������� ����
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		hs2.add("A");
		hs2.add("A");
		hs2.add("A");
		System.out.println(hs2);
		
		String[] obj = {"A","B","C","D","B","A"};
		HashSet<String> hs3 = new HashSet<String>();
		for(int i=0;i<obj.length;i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		
		//Quiz
		//HashSet�� ����Ͽ� 1~45������ ���� 6���� ��������.
		/*
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			//System.out.println(lotto[i]);
			for(int j=0;j<i;j++) {
				while(lotto[i]==lotto[j]) {
					lotto[i]=(int)(Math.random()*45 + 1);
				}
			}
		}
		*/
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		for(int i=0;lotto.size()<6;i++) {
			int num = (int)(Math.random()*45 + 1);
			lotto.add(num);
		}
		System.out.println(lotto.toString());
		
		
		Set set2 = new HashSet(); //Set �θ�Ÿ��
		while(set2.size()<6) {
			int num  = (int)(Math.random()*45 + 1);
			set2.add(num);
		}
		System.out.println("lotto: "+ set2);
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFF");
		System.out.println(set3.toString());
		
		//Iterator�� ���
		Iterator it = set3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
