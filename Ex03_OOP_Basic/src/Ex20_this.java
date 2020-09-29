/*
원칙: 생성자는 객체 생성시 1개만 호출될 수 있다.(Car() or Car(10,20) or...)
this 객체의 주소를 담고 있음



this.color = "red";...this.color = color;  같은코드가 반복되는 것이 아닌가 하고 물음을 던진다면,
해결: 생성자를 배우지 않으면 불가, this를 배우지 않으면 불가

 */

class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar(){ //기본설정
		//this.color = "red";
		//this.geartype = "auto";
		//this.door = 2;
		this("red", "auto", 2); //나를 다시 호출하네
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
	
	Zcar2(){ //생성자를 호출하는  this
		this("red",1);
		System.out.println("default constructor");
		
	}
	
	Zcar2(String color, int door){
		this(color,door,"auto");
		System.out.println("overloading constructor parameter2개");
	}
	
	Zcar2(String color, int door, String geartype){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor parameter3개");
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
