package kr.or.bit;

/*
å�� å�̸��� ������ �ְ� ������ ������ �ִ�
å�� ���ǵǸ� �ݵ�� å�̸��� å�� ������ ������ �־�� �Ѵ�.
å�� �̸��� ���������� Ư�� ����� ���ؼ��� �� �� �ְ�, ���ǵ� ���Ŀ� ������ �� ����.
å�̸��� ���������� ���� Ȯ���� �� �ִ�.
 */

public class Book {
	
	private String bookname;
	private int price;
	
	public Book(String b, int p) {
		bookname = b;
		price = p;
	}
	
	public String getBookname() {
		return bookname;
	}

	public int getPrice() {
		return price;
	}

	
	public void bookInfo() {
		System.out.println("å ����: "+ getBookname()+"/"+getPrice());
	}
}
