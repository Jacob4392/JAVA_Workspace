import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex12_Map_Interface {
	public static void main(String[] args) {
		//Map 인터페이스 구현
		//Map >> (키, 값) 쌍의 구조를 가지는 배열
		//ex)지역번호(02,서울) , (031,경기)
		//key: 중복 (x)
		//value: 중복(o)
		
		//generit 지원
		//Map 인터페이스 구현
		//구버전: HashTable (동기화 되어 있음)
		//신버전: HashMap (동기화를 강제하지 않음):성능을 고려함
		//동기화(Thread를 학습해야함 : 여러개의 Stack을 동시에 사용할 때 의미가 있음)
		
		HashMap map = new HashMap(); //로그인한 ID,PW값 담을 수 있는 역할
		map.put("Tiger","1004");
		map.put("Scott","1004");
		map.put("Superman","1004");
		
		
		System.out.println(map.containsKey("Tiger"));
		System.out.println(map.containsKey("Scott"));
		System.out.println(map.containsValue("1004"));
		
		System.out.println(map.get("Tiger")); //key >> value "1004"리턴
		System.out.println(map.get("Hong")); //key값이 없으면 null
		
		map.put("Tiger","1007"); //value replace
		System.out.println(map.get("Tiger")); //1007로 overwrite
		System.out.println(map.size()); //3
		
		Object value = map.remove("Superman");
		System.out.println("value: "+value);
		System.out.println(map.toString());
		System.out.println(map.size());
		
		//응용(이해)
		Set set = map.keySet(); //keySet 함수는 Set을 구현하고 있는 객체의 주소를 리턴
		System.out.println("keyset: "+set.toString());
		//순서(x),중복(x) 
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collection clist = map.values();
		System.out.println(clist.toString());
		
	}

}
