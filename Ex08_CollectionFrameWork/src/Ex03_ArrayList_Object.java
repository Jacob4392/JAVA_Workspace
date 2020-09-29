import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		//사원 1명을 만드세요
		Emp emp = new Emp(100,"김유신","군인");
		System.out.println(emp.toString());

		//사원 2명 (Array)
		Emp[] emplist = {new Emp(100,"김씨","일반"),new Emp(200,"박씨","학생")};
		for(Emp e : emplist) {
			System.out.println(e.toString());
		}
		
		//1명이 입사를 더 했습니다. 추가하세요(기존에는 불가)
		//ArrayList >> 
		
		ArrayList elist = new ArrayList();
		elist.add(new Emp(1,"강","IT"));
		elist.add(new Emp(1,"김","IT"));
		//1명 입사를 더했습니다.
		elist.add(new Emp(1,"이","IT"));
		System.out.println(elist.size());
		System.out.println(elist.get(0).toString());
		for(int i=0;i<elist.size();i++) {
			System.out.println(elist.get(i));
		}
		
		//toString() 사용하지 말고 사원의 사번, 이름, 직종을 출력
		//일반 for문으로 getEmpno(), getEname(), getJob() 함수를 호출해서 출력
		for(int i=0;i<elist.size();i++) {
			Object obj = elist.get(i);
			//Object는 Emp타입의 부모타입이다
			Emp e = (Emp)obj;
			System.out.println(e.getEmpno() + "/"+e.getEname()+"/"+e.getJob());
		}
		
		for(Object e:elist) {
			Emp em = (Emp)e;
		}
		
		//이런식의 코드는 개발자 지양함
		//다시 다운 캐스팅,,, 반복
		//Object 쓰지 않고 객체 생성할 수 있도록
		//제너릭 (객체 생성의 타입을 강제)
		//현업에서 만드는 코드는 90% 제너릭 사용
		
		ArrayList<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(1,"A","IT"));
		for(Emp e:list2) {
			System.out.println(e.getEmpno() + "/"+e.getEname()+"/"+e.getJob());
		}
		
		
	}

}
