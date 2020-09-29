import kr.or.bit.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		//1.사원 3명을 만드세요(단, 배열을 사용하세요)
		//1000,홍길동
		//2000,김유신
		//3000,유관순
		//만들고, 각각의 사번과 이름을 출력하세요.


		//1
		Emp[] p_array = new Emp[3];
		p_array[0] = new Emp();
		p_array[1] = new Emp();
		p_array[2] = new Emp();
		
		p_array[0].setEmpno(1000);
		p_array[1].setEmpno(2000);
		p_array[2].setEmpno(3000);
		
		p_array[0].setName("홍길동");
		p_array[1].setName("김유신");
		p_array[2].setName("유관순");
		
		for(int i=0;i<p_array.length;i++) {
			p_array[i].empInfoPrint();
		}
		
		
		
		//1
		Emp[] emplist1 = new Emp[3];
		for(int i=0;i<emplist1.length;i++) {
			emplist1[i] = new Emp();
			System.out.println(emplist1[i]);
		}
		emplist1[0].setEmpno(1000);
		emplist1[1].setEmpno(2000);
		
		
		
		//2
		Emp[] emplist2 = new Emp[] {new Emp(1,"이씨"), new Emp(2,"박씨")};
		for(int i=0; i<emplist2.length;i++) {
			emplist2[i].empInfoPrint();
		}
		
		//3
		Emp[] emplist3 = {new Emp(3,"김씨"), new Emp(4,"홍씨")};
		for(int i=0; i<emplist3.length;i++) {
			emplist3[i].empInfoPrint();
		}
		
		
		//그럼 개선된 for문을 배웠으니 객체배열 출력도 개선된 for문 사용하여 작성해보세요
		//
		for(Emp e:emplist3) {
			e.empInfoPrint();
		}
		
		
		
	}

}
