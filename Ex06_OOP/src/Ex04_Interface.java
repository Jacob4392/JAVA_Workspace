
interface Irepairable{ //~할 수 있는 (수리할 수 있는)
	
}

class Unit2{
	int hitpoint; //기본 에너지
	final int MAX_HP;//최대 에너지
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

//지상유닛
class GroundUnit extends Unit2{
	GroundUnit(int hp){
		super(hp);
	}
}


//공중유닛
class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}
}


//건물
class CommandCenter implements Irepairable{
	
}

class Tank2 extends GroundUnit implements Irepairable{

	Tank2(){
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank2";
	}
	

	
	
	
}


class Marine2 extends GroundUnit{

	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Marine2";
	}
	
	
	
}

//Scv 광물캐고, 치료가능
class Scv extends GroundUnit implements Irepairable{

	Scv() {
		super(60);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Scv";
	}
	
	//Scv 구체화, 특수화 된 고유한 기능
	//repair(수리)
	
	/*
	void repair(Scv2 scv) {
		if(Scv2.hitpoint != Scv2.MAX_HP) {
			Scv2.hitpoint += 5;
		}
	}
	*/
	
	/*
	void repair(Tank2 tank) {
		if(Tank2.hitpoint != Tank2.MAX_HP) {
			Tank2.hitpoint += 5;
		}
	}
	*/
	
	 //Scv repair 해야하는  Unit  증가하면 ..... 함수를 Unit  개수 만큼 ....
	 //고민 : 하나의 함수가 Unit  repair  할 수 있다면 ......
	 //다형성  ....  상속관계 ,  부모타입 , ...부모는 자식객체의 주소를 가질 수 있다 ...... 전자제품 .....
	
	//****우리가 가지고 있는 모든 Unit2은 repair 대상이 아니다****
	//void repair(Unit2 unit){ >> Marine2(x) Scv(0)  Tank2(0)
	 //void repair(GroundUnit  unit) {}   >> Marine2 (x) ,  Scv(0)   Tank2(0)
	
	
	//**CommandCenter repair 가능
	
	//고민
	//서로 연관성이 없음
	
	//implements Irepairable
	//서로 연관성이 만들어져요
//	class CommandCenter implements Irepairable
//	class Tank2 extends GroundUnit implements Irepairable
//	class Scv extends GroundUnit implements Irepairable
	
	
	void repair(Irepairable repairunit) {
		//Irepairable을 구현하고 있는 객체의 주소: Irepairable 부모타입 : 자식타입 (Tank2, CommandCenter, Scv2)
		//repair 대상 Tank2, Scv2 >> scv.hitpoint += 5;
		//repair 방법 >> CommandCenter
		//repairunit >> CommandCenter 이거나 아니거나 구분처리
		
		
		//Irepairable repairunit >> Tank2
		//repairunit 볼 수 있는 것이 아무것도 없음 >> hitpoint, MAX_HP >> 
		
		//downcasting >> Tank2 tank = (Tank2)repairunit; (상위타입을 하위타입으로)
		//downcasting >> Scv2 scv =    (Scv2)repairunit; (상위타입을 하위타입으로)
		
		//위 코드는 무엇이 올지 모름
		//Tank2 >> GroundUnit >> Unit2
		//Scv2 >> GroundUnit >> Unit2
		//공통점: Unit2(hitpoint, MAX_HP)
		
		//또 문제점
		//그런데 CommandCenter는 Unit2가 아니다(연관성이 없음)
		//1. parameter로 들어온 [주소]가 Unit2 타입이냐 아니냐
		//2. 충전방법을 2가지로 나누어서 처리할 수 있다.
		//3. 연산자(instanceof())
		//void repair(Irepairable repairunit) >> repair(new Tank2())
		//void repair(Irepairable repairunit) >> repair(new CommandCenter())
		
		//repairunit >> Tank2 주소
		//repairunit >> CommandCenter 주소
		
		//if(repairunit instanceof Unit2)
		
		//POINT: 타입비교(instanceof)
		
		if(repairunit instanceof Unit2) {
			Unit2 unit = (Unit2)repairunit; //unit >> Tank2, Scv
			if(unit.hitpoint!=unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP;
			}
			
		}else { //부모가 Unit2가 아님
			System.out.println("다른 충전 방식을 제공합니다. Unit2타입이 아닙니다");
		}
		
	}
	

}



public class Ex04_Interface {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();

		//전투
		tank.hitpoint-=20;
		System.out.println("탱크: "+tank.hitpoint);
		System.out.println("Scv 수리요청");
		scv.repair(tank);
		System.out.println("탱크 수리완료: "+tank.hitpoint);
		
		scv.hitpoint-=10;
		System.out.println("scv: "+scv.hitpoint);
		System.out.println("Scv 수리요청");
		scv.repair(scv);
		System.out.println("scv 수리완료: "+scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
		
		
	}

}
