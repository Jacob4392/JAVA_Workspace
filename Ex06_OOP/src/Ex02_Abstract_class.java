/*
 	unit(유닛)
 	
 	unit: 공통기능(이동좌표, 이동, 멈춘다): 추상화, 일반화
 	unit: 이동 방법은 다르다(이동방법은 unit 마다 별도의 구현, 강제성을 갖길 원함)
 	abstract class 이름{ abstract 이동(); }
 	
 	
 */


abstract class Unit{
	int x,y;
	void stop() {
		System.out.println("Unit stop");
	}
	
	//이동(강제)
	abstract void move(int x, int y); //추상자원
}

//Tank
class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank 이동: "+this.x+","+this.y);
	}
	
	//Tank 특수화, 구체화
	void changeMode() {
		System.out.println("탱크 변환 모드");
	}
	
	public String toString() {
		return "Tank";
	}
	
}


class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine 이동: "+this.x+","+this.y);
		
	}
	
	//Marine 특수화, 구체화
	void steampack() {
		System.out.println("스팀팩 기능");
	}
	
	public String toString() {
		return "Marine";
	}
	
}

class Dropship extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Dropship 이동: "+this.x+","+this.y);
		
	}
	
	//특수화, 구체화
	void load() {
		System.out.println("Unit Load");
	}
	
	void unload() {
		System.out.println("Unit Unload");
	}
	
	public String toString() {
		return "Dropship";
	}
	
}


class CoMove{
	Unit[] unit;
	
	public void Product(int number, Unit u) {
		this.unit = new Unit[number];
		for(int i=0;i<number;i++) {
			unit[i] = u;
		}
	}
	
	public void CoMove(int x, int y) {
		
	}


	
}

public class Ex02_Abstract_class {

	public static void main(String[] args) {
		Tank t = new Tank();
		t.move(500, 200);
		t.stop();
		t.changeMode();
		
		Marine m = new Marine();
		m.move(500, 200);
		m.stop();
		m.steampack();
		
		//1.탱크 3대를 만들고 [같은 좌표]로 이동시키세요 (555,444)
		
		//CoMove c = new CoMove();
		//c.CoMove(3, t);
		
		
		Tank[] tanklist = {new Tank(),new Tank(),new Tank()};
		for(Tank tank:tanklist) {
			tank.move(555, 444);
		}
		
		
		
		//2.여러개의 Unit(Tank 1, Marine 1, Dropship 1) 같은 좌표로 이동시키세요
		Unit[] unitlist = {new Tank(),new Marine(),new Dropship()};

		for(int i=0;i<unitlist.length;i++) {
			unitlist[i].move(555, 444);
		}
		
		for(Unit unit: unitlist) {
			unit.move(555, 444);
		}
		
		
	}

}
