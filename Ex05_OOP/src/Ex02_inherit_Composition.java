/*
 	실무(개발환경)
 	1개의 클래스만으로 작업 거의 사용 안함
 	설계도 1개라면 업무가 복잡해짐 -> 여러개 클래스 만듦
 	
 	쇼핑몰 >> 주문관리, 회원관리, 배송, 상품, >> 각각의 업무마다 >> 설계도 제작
 
 *** 기준  ***
여러개의 설계도의 관계를 맺어주는 것

 1. 상속(is ~ a :상속) ~ 은 ~이다 (부모를 뒤에)
 2. 포함(has ~ a :포함) ~ 은 ~을 가지고 있다
 
 예)
 원	도형
 >>원은 도형이다
 >>원 extends 도형
 
 원	점 관계
 원은 점이다(x)
 원은 점을 가지고 있다(o)
 has ~ a
 >> class 원{한 점}
 
 
 경찰   권총
 >> 경찰은 권총이다 (x)
 >> 경찰은 권총을 가지고 있다(o)
 class 경찰 {권총 ..}
 
 
 예) 원, 삼각형, 사각형 만드는 설계도 작성
 
 원은 도형이다
 삼각형은 도형이다
 사각형은 도형이다
 
 도형: 추상화, 일반화 된것(그리다, 색상을 가지고 있음) >> 공통자원을 뽑아냄
 원: 구체화, 특수화(반지름, 한 점) >> 본인만이 가지는 특징
 
 점: 좌표값 >> (x,y)
 원은 점을 가지고 있다.
 삼각형은 점을 가지고 있다.
 사각형은 점을 가지고 있다. 
 
 class Shape{ 그리다, 색상     } >> 상속관계(부모)
 class Point{ 좌표값 } >> 포함관계(부품)
 
 구체화, 특수화 : circle, triangle, 
 
 
 */

//추상화, 일반화, 공통적

class Shape{
	String color = "gold"; //공통속성


	void draw() {
		System.out.println("도형을 그리다");
	}
}

//공통(점)
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

//원을 만드세요(원의 정의: 원은 한 점과 반지름을 가지고 있다)
//1. 원은 도형이다 (is ~ a): 도형(Shape)
//2. 원은 점을 가지고 있다(has ~ a): 점(Point)
//3. 원은 반지름을 가지고 있다(특수성) : r
//원의 반지름은 초기값 10을 가진다
//점의 좌표는 초기값(10,15)를 가진다
//기본(초기값)을 설정하지 않으면 반지름과 점의 값을 입력받을 수 있다 (원이 만들어질때 -> 생성자)
class Circle extends Shape{ //상속
	Point point; //포함
	int r; //특수성
	
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

//원 만드는 것을 이해하셨다면 아래문제를...
//문제2)
//삼각형 클래스를 만드세요
//정의) 삼각형은 3개의 점과 색과 그리고 그리다라는 기능을 가지고 있다
//shape, point 제공 받아요
//hint) (x,y)(x,y)(x,y) 3개의 좌표값
//default 로 그릴 수 있고, 3개의 좌표값을 받아서 그릴 수 있다.

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
		
		//컴파일러가 인지하지 못함
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
		System.out.println("반지름: " +circle.r);
		System.out.println("부모: " +circle.color);
		System.out.println("좌표: " +circle.point.x);
		System.out.println("좌표: " +circle.point.y);
		circle.draw();//부모
		
		//Point p = new Point(10,20);
		Circle circle2 = new Circle(20,new Point(10,20));
		System.out.println("반지름: " +circle2.r);
		System.out.println("부모: " +circle2.color);
		System.out.println("좌표: " +circle2.point.x);
		System.out.println("좌표: " +circle2.point.y);
		circle2.draw();//부모
		
		circle2.color="white";
		
		
		
		
		//////////////////////////////////////////////////////
		Triangle triangle1 = new Triangle();
		System.out.println("부모: " + triangle1.color);
		System.out.printf("점1: (%d,%d)\n", triangle1.point1.x,triangle1.point1.y);
		System.out.printf("점2: (%d,%d)\n", triangle1.point2.x,triangle1.point2.y);
		System.out.printf("점3: (%d,%d)\n", triangle1.point3.x,triangle1.point3.y);

		triangle1.draw();
		
		Triangle triangle2 = new Triangle(new Point(1,1),new Point(11,1),new Point(1,11));
		System.out.println("부모: " + triangle2.color);
		System.out.printf("점1: (%d,%d)\n", triangle2.point1.x,triangle2.point1.y);
		System.out.printf("점2: (%d,%d)\n", triangle2.point2.x,triangle2.point2.y);
		System.out.printf("점3: (%d,%d)\n", triangle2.point3.x,triangle2.point3.y);
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
