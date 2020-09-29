import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;

//import kr.or.bit.*;
//bit 상자안에 있는 모든 자원 사용하세요.
//가독성 문제


public class Ex01_Ref_Type {

	public static void main(String[] args) {
		
		
		//값타입(8가지 기본타입)
		//참조타입(Class, Array,...)
		//
		
		Person p2; //선언 stack이라는 영역에 공간만 확보(주소를 담을 수 있는 공간의 크기:4byte)
		p2 = new Person(); //p2라는 변수에 Person 객체의 주소가 할당
		System.out.println(p2); //kr.or.bit.Person@15db9742
		
		Person p3 = null; //main 함수안에 있는 local variable -> 초기화 해야 사용가능
						  //참조변수의 초기화는 null로 한다. -> 값이 없다, 메모리를 가지고 있지 않다.
						  //클래스 안에 선언된 변수는 초기화가 되어 있으나 함수안에 있는 변수는 지역변수이므로
						  //초기화 해야 사용가능
		
		//참조변수가 메모리를 가지는 방법
		//1. new >> p3 = new Person();
		//2. 주소값을 할당	p3=p2;
		p3=p2;
		
		
		Person person = new Person();
			person.name = "홍길동";
			person.age = 100;
			person.power = true;
			person.personPrint();

		Person p = new Person();
		p.personPrint();
		
		
		//주소값 비교(검증)
		System.out.println(person == p); //비교(변수가 가지고 있는 값)
		System.out.println(p2 == p3); //true
		
		int i = 100;
		i = 300;
		System.out.println("i: "+ i);
		
		
		//Tv 생산
		//Tv 이름: 비트
		//Tv 한 대 만들고 채널 5까지 올리고
		//Tv 정보 출력하세요.
		
		Tv btv = new Tv();
		btv.brandname="비트";
		System.out.println("현재 비트 TV 채널 정보:"+btv.ch);
		btv.ch_Up();
		btv.ch_Up();
		btv.ch_Up();
		btv.ch_Up();
		btv.ch_Up();
		
		btv.TvInfor();
		
		//사원 1명을 생성
		//사원은 사번 7788, 이름 김유신, 부서 IT
		//그리고 신체정보의 키는 190, 몸무게는 40
		
		Emp emp = new Emp();
		emp.empno = 7788;
		emp.name = "김유신";
		emp.job = "IT";
		/*
		emp.bodyinfo = new BodyInfo();
		emp.bodyinfo.height = 190;
		emp.bodyinfo.weight = 40;
		*/
		
		
		BodyInfo body = new BodyInfo();
		body.height = 190;
		body.weight = 40;
		
		emp.bodyinfo = body;
		
		System.out.println(emp + "/" + emp.bodyinfo);
		System.out.println(emp.empno + "/" + emp.bodyinfo.height);
		System.out.println(emp.name + "/" + emp.bodyinfo.weight);
		
		
	}

}
