/*
 	Today Point
 	[상속관계]에서 override: 상속관계에서 자식이 부모의 [함수를] [재정의]하는 것(상속이 없으면 오버라이드도 없다)
 	[상속관계]에서 [자식 클래스]가 [부모 클래스]의 메서드를(함수)를 재정의(내용을 바꾼다)
 	재정의: 틀의 변화가 없고(함수의 이름, 타입), 내용만 바꾸는 것 (){여기만 변화}
 	
 	문법)
 	1. 부모함수 이름과 동일
 	2. 부모함수 parameter 동일
 	3. 부모함수 return type 형식 동일
 	4. 결국 {실행블럭 안에 있는 코드만 변경 가능함}
 	
 */


class Point2{ //한점을 가지는 클래스
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x+"/"+this.y;
	}
}
class Point3D extends Point2{
	int z = 6;
	//출력
	//방법: 새롭게 함수 추가 String get3DPosition()...
	//재정의 
	//믿음...
	//오버라이드 되었는지 안되었는지 확인을 
	//Annotation >> java code만으로 전달할 수 없는 [부가적인 정보]를 컴파일러와 개발툴에 전달
	//맞지 않으면 Error
	//@Override 지금 이 함수가 정말 재정의 된 것이 맞는지 확인해봐
	@Override
	String getPosition() {
		return this.x+"/"+this.y+"/"+this.z;
	}
}


public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		String result = p.getPosition();//재정의된 함수가 호출된다
		System.out.println(result);

	}

}
