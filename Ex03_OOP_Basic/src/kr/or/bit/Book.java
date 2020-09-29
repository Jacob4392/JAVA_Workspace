package kr.or.bit;

/*
책은 책이름을 가지고 있고 가격을 가지고 있다
책이 출판되면 반드시 책이름과 책의 가격을 가지고 있어야 한다.
책의 이름과 가격정보는 특정 기능을 통해서만 볼 수 있고, 출판된 이후에 수정할 수 없다.
책이름과 가격정보는 각각 확인할 수 있다.
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
		System.out.println("책 정보: "+ getBookname()+"/"+getPrice());
	}
}
