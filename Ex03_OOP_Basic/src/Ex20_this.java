/*
��Ģ: �����ڴ� ��ü ������ 1���� ȣ��� �� �ִ�.(Car() or Car(10,20) or...)
this ��ü�� �ּҸ� ��� ����



this.color = "red";...this.color = color;  �����ڵ尡 �ݺ��Ǵ� ���� �ƴѰ� �ϰ� ������ �����ٸ�,
�ذ�: �����ڸ� ����� ������ �Ұ�, this�� ����� ������ �Ұ�

 */

class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar(){ //�⺻����
		//this.color = "red";
		//this.geartype = "auto";
		//this.door = 2;
		this("red", "auto", 2); //���� �ٽ� ȣ���ϳ�
		System.out.println("default constructor");
	}
	
	Zcar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor");
		
	}
	
	void print() {
		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
	}
	
	
	
}
////////////////////////////////////////////////////////
class Zcar2{
	String color;
	String geartype;
	int door;
	
	Zcar2(){ //�����ڸ� ȣ���ϴ�  this
		this("red",1);
		System.out.println("default constructor");
		
	}
	
	Zcar2(String color, int door){
		this(color,door,"auto");
		System.out.println("overloading constructor parameter2��");
	}
	
	Zcar2(String color, int door, String geartype){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor parameter3��");
	}
	
	void print() {
		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
	}
	
	
}




////////////////////////////////////////////////////////


public class Ex20_this {

	public static void main(String[] args) {
		Zcar zcar = new Zcar();
		zcar.print();
		
		Zcar zcar2 = new Zcar("gold","auto",10);
		zcar2.print();
		
		Zcar2 zcar3 = new Zcar2();
		zcar3.print();
		

	}

}
