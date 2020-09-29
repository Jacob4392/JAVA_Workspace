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
class Tank extends Unit implements repairable{ //�߻�޼��尡 ����� �κ�
			//��> Template Method�� ����� �κ�
	public Tank() {
		super("Tank ����", 150);
	}
}
class Marine extends Unit implements flyObject, healable{ //�߻�޼��尡 ����� �κ�
				//��> Template Method�� ����� �κ�
	public Marine() {
		super("Marine ����", 40);
	}
	
	@Override
	public void attack(int xa, int ya, Object obj) {
		super.xa = xa;
		super.ya = ya;
		if(obj instanceof flyObject) {
			attackUpDown = true; //�������� ���� ���
		}
	}
}
class SCV extends Unit implements repairable, healable{ //�߻�޼��尡 ����� �κ�
			//��> Template Method�� ����� �κ�
	public SCV() {
		super("SCV ����",60);
	}
}

interface flyObject{}
interface repairable{}
interface healable{}


//��ü�� �����ϴ� Ŭ����(Factory)
abstract class Factory {//���丮 �⺻
	abstract Unit build(String name);
}
class Factory1 extends Factory{//���� ��ü�� ���� 

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

	public static void main(String[] args) {//�����Լ�����   Unit��ü�� �������� ����>>��ü������ �Ű澲���ʰ� ��ȯ�� ���� ���
											//���ο� �����̳� ���丮�� �߰��ǵ� ���� �ּ�ȭ
		
		Factory f = new Factory1();	//Factory Method�� ����� �κ� 	
		Unit u1 = f.build("Tank");	//Factory Method�� ����� �κ�	//Factory��ü �ȿ��� Unit��ü�� ����
		Unit u2 = f.build("Marine");//Factory Method�� ����� �κ�	//Factory��ü �ȿ��� Unit��ü�� ����
		Unit u3 = f.build("SCV");	//Factory Method�� ����� �κ�	//Factory��ü �ȿ��� Unit��ü�� ����

		System.out.println(u1.getName());//Template Method�� ����� �κ� //�θ�Ÿ���� getName()�� ȣ��
		System.out.println(u2.getName());//Template Method�� ����� �κ� //�θ�Ÿ���� getName()�� ȣ��
		System.out.println(u3.getName());//Template Method�� ����� �κ� //�θ�Ÿ���� getName()�� ȣ��
		
		u1.move(300, 500);		  //Template Method�� ����� �κ� //�θ�Ÿ���� move�� ȣ��
		System.out.println(u1.x); //Template Method�� ����� �κ� //�θ�Ÿ���� x�� ���
		System.out.println(u1.y); //Template Method�� ����� �κ� //�θ�Ÿ���� y�� ���
	}
}