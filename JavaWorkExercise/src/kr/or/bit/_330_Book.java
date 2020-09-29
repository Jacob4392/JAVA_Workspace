package kr.or.bit;

public class _330_Book {

    final String isbn;

    String title;

    int price;

    public _330_Book(String isbn, String title,int price){

           this.isbn = isbn;

           this.title = title;

           this.price = price;

    }

    public String ISBN(){

           return isbn;

    }

    public String toString(){

           return String.format("ISBN:%s 이름:%s 가격:%d", isbn, title,price);        }

}