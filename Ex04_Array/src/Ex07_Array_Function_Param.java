
class Human{
	String name;
}


class OverTest{
	int add(int i,int j) {
		return i+j;
	}
	void add(Human human) { //오버로딩 //Point Human이라는 타입을 가지는 객체의 주소를 넣어라
		System.out.println(human.name);
	}
	
	//1. add(new Human());
	//2. Human h = new Human(); >> add(h);
	int add(int param) {
		return param;
	}
	//Today Point : 배열도 타입이다
	int[] add(int[] param) { //배열의 주소값을 받아서 배열의 주소값을 리턴해라
		int[] target = new int[param.length]; //
		for(int i=0;i<target.length;i++) {
			target[i] = param[i]+1;
		}
		return target; //주소 배열의 
	}
	
	int[] add(int[] so,int[] so2) {
		//연습해보기
		return null;
	}
	
	
	
	
}


public class Ex07_Array_Function_Param {
	public static void main(String[] args) {
		OverTest ot = new OverTest();
		int[] source = {10,20,30,40,50};
		int[] target = ot.add(source);
		for(int value : target) {
			System.out.println(value);
		}
		
	}

}
