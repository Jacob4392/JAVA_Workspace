package kr.or.bit;

//데이터를 담을 수 있는 클래스
//목적: DTO,VO, DOMAIN(업무를 담을 수 있는 객체)


public class Emp { //extends Object

	private int empno;
	private String ename;
	
	
	
	public Emp() {
		super();
	}

	public Emp(int empno, String name) {
		super();
		this.empno = empno;
		this.ename = name;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		if(this.empno<9 && this.empno>18) return;
		this.empno = empno;
	}
	public String getName() {
		return ename;
	}
	public void setName(String name) {
		this.ename = name;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
		
	//사번과 이름을 출력하는 메서드
	
	//toString : Object 클래스가 가지는 메서드
	//내가 Object ... toString() 내마음대로 쓰고 싶음 범용적인 이름으로
	/*
	@Override
	public String toString() { //값들이 제대로 찍혔는지 안찍혔는지 확인하기 위해
		return this.empno + "/"+ this.ename;
	}
	*/

}
