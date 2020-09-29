/*
 	�ǹ�(����ȯ��)
 	1���� Ŭ���������� �۾� ���� ��� ����
 	���赵 1����� ������ �������� -> ������ Ŭ���� ����
 	
 	���θ� >> �ֹ�����, ȸ������, ���, ��ǰ, >> ������ �������� >> ���赵 ����
 
 *** ����  ***
�������� ���赵�� ���踦 �ξ��ִ� ��

 1. ���(is ~ a :���) ~ �� ~�̴� (�θ� �ڿ�)
 2. ����(has ~ a :����) ~ �� ~�� ������ �ִ�
 
 ��)
 ��	����
 >>���� �����̴�
 >>�� extends ����
 
 ��	�� ����
 ���� ���̴�(x)
 ���� ���� ������ �ִ�(o)
 has ~ a
 >> class ��{�� ��}
 
 
 ����   ����
 >> ������ �����̴� (x)
 >> ������ ������ ������ �ִ�(o)
 class ���� {���� ..}
 
 
 ��) ��, �ﰢ��, �簢�� ����� ���赵 �ۼ�
 
 ���� �����̴�
 �ﰢ���� �����̴�
 �簢���� �����̴�
 
 ����: �߻�ȭ, �Ϲ�ȭ �Ȱ�(�׸���, ������ ������ ����) >> �����ڿ��� �̾Ƴ�
 ��: ��üȭ, Ư��ȭ(������, �� ��) >> ���θ��� ������ Ư¡
 
 ��: ��ǥ�� >> (x,y)
 ���� ���� ������ �ִ�.
 �ﰢ���� ���� ������ �ִ�.
 �簢���� ���� ������ �ִ�. 
 
 class Shape{ �׸���, ����     } >> ��Ӱ���(�θ�)
 class Point{ ��ǥ�� } >> ���԰���(��ǰ)
 
 ��üȭ, Ư��ȭ : circle, triangle, 
 
 
 */

//�߻�ȭ, �Ϲ�ȭ, ������

class Shape{
	String color = "gold"; //����Ӽ�


	void draw() {
		System.out.println("������ �׸���");
	}
}

//����(��)
class Point{
	int x;
	int y;
	
	Point(){
		//this.x=1;
		//this.y=1;
		this(1,1);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

//���� ���弼��(���� ����: ���� �� ���� �������� ������ �ִ�)
//1. ���� �����̴� (is ~ a): ����(Shape)
//2. ���� ���� ������ �ִ�(has ~ a): ��(Point)
//3. ���� �������� ������ �ִ�(Ư����) : r
//���� �������� �ʱⰪ 10�� ������
//���� ��ǥ�� �ʱⰪ(10,15)�� ������
//�⺻(�ʱⰪ)�� �������� ������ �������� ���� ���� �Է¹��� �� �ִ� (���� ��������� -> ������)
class Circle extends Shape{ //���
	Point point; //����
	int r; //Ư����
	
	Circle(){
		//this.r = 10;
		//point = new Point(10,15);
		this(10,new Point(10,15));
	}
	Circle(int r, Point point){
		this.r = r;
		this.point = point;
	}
	
}

//�� ����� ���� �����ϼ̴ٸ� �Ʒ�������...
//����2)
//�ﰢ�� Ŭ������ ���弼��
//����) �ﰢ���� 3���� ���� ���� �׸��� �׸��ٶ�� ����� ������ �ִ�
//shape, point ���� �޾ƿ�
//hint) (x,y)(x,y)(x,y) 3���� ��ǥ��
//default �� �׸� �� �ְ�, 3���� ��ǥ���� �޾Ƽ� �׸� �� �ִ�.

class Triangle extends Shape{
	Point point1;
	Point point2;
	Point point3;
	
	Triangle(){
		this(new Point(0,0),new Point(1,0),new Point(0,1));
	}
	Triangle(Point point1,Point point2,Point point3){
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	
}

////////////////////////////////////////////
class Triangle2 extends Shape{
	Point[] pointarray;
	
	Triangle2(){
		/*
		pointarray = new Point[3];
		pointarray[0] = new Point(10,20);
		pointarray[1] = new Point(30,40);
		pointarray[2] = new Point(50,60);
		 */
		
		//�����Ϸ��� �������� ����
		//pointarray = {new Point(10,20),new Point(30,40),new Point(50,60)};
		
		this(new Point[] {new Point(10,20),new Point(30,40),new Point(50,60)});
		
	}
	Triangle2(Point[] pointarray){
		this.pointarray = pointarray;
	}
	
	void trianglePoint() {
		for(Point point : this.pointarray) {
			System.out.printf("point: (%d,%d)\t\n",point.x,point.y);
		}
	}
	
}

////////////////////////////////////////////





public class Ex02_inherit_Composition {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("������: " +circle.r);
		System.out.println("�θ�: " +circle.color);
		System.out.println("��ǥ: " +circle.point.x);
		System.out.println("��ǥ: " +circle.point.y);
		circle.draw();//�θ�
		
		//Point p = new Point(10,20);
		Circle circle2 = new Circle(20,new Point(10,20));
		System.out.println("������: " +circle2.r);
		System.out.println("�θ�: " +circle2.color);
		System.out.println("��ǥ: " +circle2.point.x);
		System.out.println("��ǥ: " +circle2.point.y);
		circle2.draw();//�θ�
		
		circle2.color="white";
		
		
		
		
		//////////////////////////////////////////////////////
		Triangle triangle1 = new Triangle();
		System.out.println("�θ�: " + triangle1.color);
		System.out.printf("��1: (%d,%d)\n", triangle1.point1.x,triangle1.point1.y);
		System.out.printf("��2: (%d,%d)\n", triangle1.point2.x,triangle1.point2.y);
		System.out.printf("��3: (%d,%d)\n", triangle1.point3.x,triangle1.point3.y);

		triangle1.draw();
		
		Triangle triangle2 = new Triangle(new Point(1,1),new Point(11,1),new Point(1,11));
		System.out.println("�θ�: " + triangle2.color);
		System.out.printf("��1: (%d,%d)\n", triangle2.point1.x,triangle2.point1.y);
		System.out.printf("��2: (%d,%d)\n", triangle2.point2.x,triangle2.point2.y);
		System.out.printf("��3: (%d,%d)\n", triangle2.point3.x,triangle2.point3.y);
		triangle2.draw();
		//////////////////////////////////////////////////////
		
		
		Triangle2 tri2 = new Triangle2();
		tri2.trianglePoint();
		tri2.draw();
		
		
		Point[] pointarray = {new Point(10,20),new Point(30,40),new Point(50,60)};
		Triangle2 tri3 = new Triangle2(pointarray);
		tri3.trianglePoint();
		tri3.draw();
		
		
		
		
	}

}
