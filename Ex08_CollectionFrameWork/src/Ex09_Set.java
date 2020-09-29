import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 	Set 인터페이스를 구현하고 있는 클래스
 	Set -> 원 안에 들어가세요(순서 보장(x), 중복(x))
 	:순서가 없고 중복을 허락하지 않는 데이터 집합 : set
 	
 	HashSet, TreeSet
 	
 	
 	
 */
public class Ex09_Set {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(100);
		boolean bo2 = hs.add(55);
		System.out.println(bo2);
		
		bo2 = hs.add(1); //중복값이 없다는 보장을 받는다
		System.out.println(bo2);

		System.out.println(hs.toString());
		
		hs.add(2);
		System.out.println(hs.toString()); //출력 순서가 보장되지 않음
		
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
		//HashSet을 사용하여 1~45까지의 난수 6개를 넣으세요.
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
		
		
		Set set2 = new HashSet(); //Set 부모타입
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
		
		//Iterator로 출력
		Iterator it = set3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
