/*
	자동차 영업소입니다.
	영업사원은 고객에게 자동차를 팔려고 합니다.
	고객은 자동차의 기본사양을 살 수도 있고, 여러가지 선택옵션을 선택할 수 있습니다.
	자동차의 기본은
	문의 개수 4개, 자동차의 색상 기본 red가 기본입니다.
	그런데 고객은
	문의 개수만 변경 가능하고 색상은 기본으로 할 수 있고
	문의 개수는 기본으로 하고 색상 변경가능하고
	문의 개수와 색상 모두 변경하여 차를 구매할 수 있습니다.
	
	자동차 구매
	1. 기본사양
	2. 옵션: 문 변경, 자동차의 색상 기본
	3. 옵션: 자동차의 색상 변경, 문 기본
	4. 옵션: 문 변경, 자동차의 색상 변경
	

 */



class Car5{
	int door;
	String color;
	
	public Car5() {
		door = 4;
		color = "red";
	}
	
	public Car5(int door) {
		this.door = door;
		color = "red";
	}
	
	public Car5(String color) {
		this.color = color;
		door = 4;
	}
	
	public Car5(int door, String color) {
		this.door = door;
		this.color = color;
	}
	
	public void carInfo() {
		System.out.println("door: "+ door + ", "+"color: "+color);
	}
}



public class Ex18_Constructor {

	public static void main(String[] args) {
		Car5 c1 = new Car5();
		c1.carInfo();
		
		Car5 c2 = new Car5(10);
		c2.carInfo();
		
		Car5 c3 = new Car5("white");
		c3.carInfo();
		
		Car5 c4 = new Car5(15,"black");
		c4.carInfo();
		

	}

}
