/*
this
1. ��ü �ڽ��� ����Ű�� this (������ ������ �ּҸ� ���� ���̶�� ����)
2. this ��ü �ڽ�(������ ȣ��) >> ��Ģ: �������� ������ ȣ��

 */

class Test2{
	int i;
	int j;
	
	Test2(){ //default 
		
	}
	
	Test2(int i, int j){ //Test(int k, int y)
		//�� �ڵ�� ������ �����
		//�׷��� ������...
		//parameter �̸��� ... member field ��� ����
		//Test(int i, int j){}
		//>>this >> Test2�� ����Ŵ >> 
		this.i = i;
		this.j = j;
		//i = i;
		//j = j;
	}
}


//Today Point
class Socar{
	String color;
	String geartype;
	int door;
	
	Socar(){ //�⺻����
		this.color = "red";
		this.geartype = "auto";
		this.door = 2;
	}
	
	Socar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		
	}
	
	void print() {
		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
	}
}



class Book2{
	String bookname;
	
	Book2(String bookname){
		this.bookname = bookname;
	}
}


public class Ex19_This {

	public static void main(String[] args) {
		Test2 t = new Test2(10,20);
		System.out.println(t.i +","+t.j);

		
		Book2 book = new Book2("ȫ�浿��");
		
		Socar socar = new Socar();
		socar.print();
		
		Socar socar2 = new Socar("gold","auto",5);
		socar2.print();
		
		
	}

}
