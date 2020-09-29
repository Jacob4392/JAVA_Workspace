import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {
	public static void main(String[] args) {
		//Set >> ����(x) �ߺ�(x)
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");
		System.out.println(hs.toString());
		
		
		//TreeSet
		//���� (x), �ߺ�(x), ����(o)
		//�����͸� �˻��ϰų� ������ �ʿ�� �ϴ� �ڷᱸ��(������ ����)�� ȿ����
		//1.����Ʈ�� ����
		//2.������ ����� �� ���ĵȴ�
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i=0;lotto.size()<6;i++) {
			lotto.add((int)(Math.random()*45 + 1));
		}
		System.out.println(lotto.toString());
		
		
		Set<String> ts = new TreeSet<String>();
		ts.add("��");
		ts.add("��");
		ts.add("��");
		ts.add("K");
		ts.add("G");
		ts.add("D");
		ts.add("P");
		ts.add("A");
		System.out.println(ts.toString());
		
		
	}

}
