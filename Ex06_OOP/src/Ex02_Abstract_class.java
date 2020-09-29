/*
 	unit(����)
 	
 	unit: ������(�̵���ǥ, �̵�, �����): �߻�ȭ, �Ϲ�ȭ
 	unit: �̵� ����� �ٸ���(�̵������ unit ���� ������ ����, �������� ���� ����)
 	abstract class �̸�{ abstract �̵�(); }
 	
 	
 */


abstract class Unit{
	int x,y;
	void stop() {
		System.out.println("Unit stop");
	}
	
	//�̵�(����)
	abstract void move(int x, int y); //�߻��ڿ�
}

//Tank
class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank �̵�: "+this.x+","+this.y);
	}
	
	//Tank Ư��ȭ, ��üȭ
	void changeMode() {
		System.out.println("��ũ ��ȯ ���");
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
		System.out.println("Marine �̵�: "+this.x+","+this.y);
		
	}
	
	//Marine Ư��ȭ, ��üȭ
	void steampack() {
		System.out.println("������ ���");
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
		System.out.println("Dropship �̵�: "+this.x+","+this.y);
		
	}
	
	//Ư��ȭ, ��üȭ
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
		
		//1.��ũ 3�븦 ����� [���� ��ǥ]�� �̵���Ű���� (555,444)
		
		//CoMove c = new CoMove();
		//c.CoMove(3, t);
		
		
		Tank[] tanklist = {new Tank(),new Tank(),new Tank()};
		for(Tank tank:tanklist) {
			tank.move(555, 444);
		}
		
		
		
		//2.�������� Unit(Tank 1, Marine 1, Dropship 1) ���� ��ǥ�� �̵���Ű����
		Unit[] unitlist = {new Tank(),new Marine(),new Dropship()};

		for(int i=0;i<unitlist.length;i++) {
			unitlist[i].move(555, 444);
		}
		
		for(Unit unit: unitlist) {
			unit.move(555, 444);
		}
		
		
	}

}
