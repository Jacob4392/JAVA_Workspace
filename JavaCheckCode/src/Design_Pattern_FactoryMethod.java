abstract class Unit {
	
	private String name;
	private int hp;
	int x;
	int y;
	int xa;
	int ya;
	boolean attackUpDown;
	
	public int getHp() {return hp;}
	public void setHp(int hp) {this.hp = hp;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public Unit(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void attack(int xa, int ya, Object obj) {
		this.xa = xa;
		this.ya = ya;
	}
}
class Tank extends Unit implements repairable{ //추상메서드가 적용된 부분
			//ㄴ> Template Method가 적용된 부분
	public Tank() {
		super("Tank 생산", 150);
	}
}
class Marine extends Unit implements flyObject, healable{ //추상메서드가 적용된 부분
				//ㄴ> Template Method가 적용된 부분
	public Marine() {
		super("Marine 생산", 40);
	}
	
	@Override
	public void attack(int xa, int ya, Object obj) {
		super.xa = xa;
		super.ya = ya;
		if(obj instanceof flyObject) {
			attackUpDown = true; //공중유닛 공격 모드
		}
	}
}
class SCV extends Unit implements repairable, healable{ //추상메서드가 적용된 부분
			//ㄴ> Template Method가 적용된 부분
	public SCV() {
		super("SCV 생산",60);
	}
}

interface flyObject{}
interface repairable{}
interface healable{}


//객체를 생성하는 클래스(Factory)
abstract class Factory {//팩토리 기본
	abstract Unit build(String name);
}
class Factory1 extends Factory{//실제 객체를 구현 

	@Override
	Unit build(String name) {
		switch(name) {
		case "Tank": return new Tank();
		case "Marine": return new Marine();
		case "SCV":return new SCV();
		}
		return null;
	}
}


public class Design_Pattern_FactoryMethod {

	public static void main(String[] args) {//메인함수에는   Unit객체를 생성하지 않음>>객체생성을 신경쓰지않고 반환한 값만 사용
											//새로운 유닛이나 팩토리가 추가되도 변경 최소화
		
		Factory f = new Factory1();	//Factory Method가 적용된 부분 	
		Unit u1 = f.build("Tank");	//Factory Method가 적용된 부분	//Factory객체 안에서 Unit객체를 생성
		Unit u2 = f.build("Marine");//Factory Method가 적용된 부분	//Factory객체 안에서 Unit객체를 생성
		Unit u3 = f.build("SCV");	//Factory Method가 적용된 부분	//Factory객체 안에서 Unit객체를 생성

		System.out.println(u1.getName());//Template Method가 적용된 부분 //부모타입의 getName()을 호출
		System.out.println(u2.getName());//Template Method가 적용된 부분 //부모타입의 getName()을 호출
		System.out.println(u3.getName());//Template Method가 적용된 부분 //부모타입의 getName()을 호출
		
		u1.move(300, 500);		  //Template Method가 적용된 부분 //부모타입의 move를 호출
		System.out.println(u1.x); //Template Method가 적용된 부분 //부모타입의 x를 출력
		System.out.println(u1.y); //Template Method가 적용된 부분 //부모타입의 y를 출력
	}
}