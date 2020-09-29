package kr.or.bit;

public class NoteBook {
	public String color;
	//public int year;
	private int year; 
	//캡슐화, 은닉화: 직접할당을 막고 간접할당을 통해서 자료를 보호(개발자가 원하는 값만) 처리, private 접근자를 통해서
	//간접할당
	//public int year >> 음수값 입력시, NoteBook notebook = new NoteBook(); notebook.year = -2000;
	//(직접할당은 -값을 막고 싶어도 막을 수 있는 방법이 없다.)
	
	
	//마우스를 가지고 있다
	//마우스는 여러개의 속성과 기능으로 만들수 있다. >> 별도의 클래스를 만들어야 한다는 뜻
	
	//public Mouse mouse;
	public Mouse handle(Mouse m) { //Mouse 타입의 [주소]값이 올 수 있다 >> new
		m.x = 100;
		m.y = 200;
		return m;
	}
	
	
	
	//캡슐화 된(private 접근자를 가진) member field에 대해서 write, read(set, get)할 수 있는 함수 >> 전용 함수
	//setter 함수, getter 함수
	public void setYear(int y) {
		if(y<0) {
			year = 1999;
		}else {
			year = y;
		}
	}
	
	public int getYear() {
		return year;
	}
	
}
