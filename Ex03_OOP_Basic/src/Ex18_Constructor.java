/*
	�ڵ��� �������Դϴ�.
	��������� ������ �ڵ����� �ȷ��� �մϴ�.
	���� �ڵ����� �⺻����� �� ���� �ְ�, �������� ���ÿɼ��� ������ �� �ֽ��ϴ�.
	�ڵ����� �⺻��
	���� ���� 4��, �ڵ����� ���� �⺻ red�� �⺻�Դϴ�.
	�׷��� ����
	���� ������ ���� �����ϰ� ������ �⺻���� �� �� �ְ�
	���� ������ �⺻���� �ϰ� ���� ���氡���ϰ�
	���� ������ ���� ��� �����Ͽ� ���� ������ �� �ֽ��ϴ�.
	
	�ڵ��� ����
	1. �⺻���
	2. �ɼ�: �� ����, �ڵ����� ���� �⺻
	3. �ɼ�: �ڵ����� ���� ����, �� �⺻
	4. �ɼ�: �� ����, �ڵ����� ���� ����
	

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
