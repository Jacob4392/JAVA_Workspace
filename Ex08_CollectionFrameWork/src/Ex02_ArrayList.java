import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Today Point


public class Ex02_ArrayList {

	public static void main(String[] args) {
		//List 인터페이스 구현 >> 순서, 중복허용 데이터 집합
		
		ArrayList arraylist = new ArrayList();
		//Object 타입을 가지는 정적 배열이 heap메모리에 생성됨
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}

		System.out.println(arraylist.toString());
		System.out.println(arraylist.get(0)); //특정 방에 있는 값
		
		//add 순차적으로 데이터 넣기 
		arraylist.add(0,111);
		System.out.println(arraylist);//[111, 100, 200, 300]
		arraylist.add(4,444);
		System.out.println(arraylist);
		//**비순차적인 데이터 추가, 삭제 >> ArrayList 적합하지 않음 >> 순서가 있는 데이터의 집합에 적합
		//**순차적 데이터의 추가, 삭제에 유리
		
		//arraylist.remove(200); //ex index문제
		System.out.println(arraylist);
		
		//[111, 100, 200, 300, 444]
		//ArrayList 함수를 공부(초급)
		System.out.println(arraylist.contains(200));//true
		
		arraylist.clear(); //데이터 삭제(공간은 남아있다)
		System.out.println(arraylist.size()); //size 데이터 크기
		System.out.println(arraylist.isEmpty());//true
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		
		System.out.println(arraylist.isEmpty()); //false
		
		System.out.println("삭제전: "+arraylist.size());
		Object value = arraylist.remove(0); //0번째 방의 값을 삭제, 그 값을 return
		System.out.println("삭제된 데이터: "+value);
		System.out.println("삭제후: "+arraylist.size());
		System.out.println(arraylist.toString());
		
		
		//Point
		//개발자 쓰는 코드, 일상다반사
		//다형성, (확장성, 유연해짐) 
		List li = new ArrayList();
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		li.add("마");
		
		List li2 = li.subList(0,2); //subList 만들어주는 데이터 순서가 있는 데이터 집합
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
		Collections.sort(alist); //초급자는 지양, 중급자 사용 권장
		System.out.println(alist.toString()); //낮은 값 정렬
		Collections.reverse(alist); //높은 값 정렬
		System.out.println(alist);
		
		
	}

}
