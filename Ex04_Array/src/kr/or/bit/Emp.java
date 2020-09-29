package kr.or.bit;

public class Emp {
	
	private int empno;
	private String name;
	
	public Emp(int empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	
	public Emp() {

	}



	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	//기능(정보 출력)
	public void empInfoPrint() {
		System.out.println(this.empno + "/" + this.name); //DTO //도메인
	}

}
