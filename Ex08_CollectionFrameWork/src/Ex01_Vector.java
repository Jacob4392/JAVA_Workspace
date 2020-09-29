import java.util.Vector;

/*
 	Collection Framework
 	[다수의 데이터]를 다루는 [표준화된 인터페이스]를 [구현하고 있는 클래스들의 집합]
 	
 	Collection 인터페이스 -> List 상속 -> ArrayList(구현:약속을)
 						  Set 상속 -> HashSet, TreeSet(구현)
 	Map 인터페이스 (key,value) -> HashMap(구현)
 	
 	1.List (줄을 서시오)
 	:순서(번호표),중복(허용) >> 내부적으로 데이터(자료, 객체)들을 >> [배열]로 관리 >>[홍길동][홍길동][홍길동]
 	
 	1.1 Vector(구버전)   -> 동기화를 보장(멀티스레드 환경에서) -> 내부적으로 Lock장치를 가지고 있음(데이터를 보호) -> 성능은 조금
 	1.2 ArrayList(신버전)-> 동기화 보장 하지 않음(멀티스레드 환경에서) -> Lock장치(x), 필요에 따라서 씀 -> 성능을 우선함
 	
 	기존) 같은 타입의 여러개의 데이터를 관리하는 방법 :Array 정적(고정)
 	-방의 개수가 한번 정해지면 (방의 크기는 변경 불가)
 	int[] arr = new int[5];
 	arr[0] = 100;
 	또는
 	10개의 방 필요할때,[줄이거나 늘릴 수 없다]
 	int[] arr = {10,20,30};
 	
 	Array
 	1.배열의 크기가 고정: Car[] cars = {new Car(), new Car()}; //방 2개
 	2.접근 방법(index 첨자) 방번호 접근: cars[0],...cars[n] : 0...n번째 방까지 : 마지막 방의 번호는(index): length-1이다.
 	3.초기 설정 불가
 	
 	Collection
 	List 구현
 	(Vector, ArrayList)
 	1.배열의 크기를 동적으로 확장 : 축소, 늘리기 가능 >> 사실은 [배열의 재할당]을 이용
 	2.순서를 유지(내부적으로 배열사용:index), 중복값 허용
 	3.데이터 저장공간 : Array 사용
 	
 	
 	
 */
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 default 용량: "+ v.capacity());
		System.out.println("size: "+v.size());
		v.add("AA");
		v.add("AA");
		v.add("AA");
		v.add(100);
		System.out.println("size: "+v.size()); //array에서의 length
		System.out.println(v.toString()); //[AA, AA, AA, 100] >> Vector의 toString() 재정의 되어 있음
		//Array >> length 
		//Collection >> size
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i)); //get(index) 값을 return함, 정적 arr[index]
		}
		
		for(Object obj:v) {
			System.out.println(obj);
		}
		
		//제너릭 >> 타입을 강제하는 방법 >> 
		Vector<String> v2 = new Vector<String>(); //Object를 담을 수 있는 그릇에서 String을 담을 수 있는 그릇으로 바뀜
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
		v3.add("A"); // 11번째 add //방을 늘림 >> 
		System.out.println("늘어난 capacity: "+v3.capacity());
		System.out.println("size: "+v3.size());
		
		
		
	}

}
