import kr.or.bit.Book;

public class Ex17_Book_Exercise {

	public static void main(String[] args) {
		Book b1 = new Book("신밧드의 모험", 12000);
		Book b2 = new Book("삼국지", 15000);
		Book b3 = new Book("이순신", 13000);
		
		b1.bookInfo();
		b2.bookInfo();
		b3.bookInfo();

	}

}
