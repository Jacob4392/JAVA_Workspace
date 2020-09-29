package kr.or.bit;

//�����͸� ���� �� �ִ� Ŭ����
//����: DTO,VO, DOMAIN(������ ���� �� �ִ� ��ü)


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
		
	//����� �̸��� ����ϴ� �޼���
	
	//toString : Object Ŭ������ ������ �޼���
	//���� Object ... toString() ��������� ���� ���� �������� �̸�����
	/*
	@Override
	public String toString() { //������ ����� �������� ���������� Ȯ���ϱ� ����
		return this.empno + "/"+ this.ename;
	}
	*/

}
