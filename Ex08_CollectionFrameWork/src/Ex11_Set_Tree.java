import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {
	public static void main(String[] args) {
		//Set >> 순서(x) 중복(x)
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
		//순서 (x), 중복(x), 정렬(o)
		//데이터를 검색하거나 정렬을 필요로 하는 자료구조(데이터 집합)에 효과적
		//1.이진트리 구조
		//2.데이터 저장될 때 정렬된다
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i=0;lotto.size()<6;i++) {
			lotto.add((int)(Math.random()*45 + 1));
		}
		System.out.println(lotto.toString());
		
		
		Set<String> ts = new TreeSet<String>();
		ts.add("하");
		ts.add("마");
		ts.add("바");
		ts.add("K");
		ts.add("G");
		ts.add("D");
		ts.add("P");
		ts.add("A");
		System.out.println(ts.toString());
		
		
	}

}
