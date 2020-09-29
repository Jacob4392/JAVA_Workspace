class Human2{
	String name;
	int age;
}

class Test{
	Human2 add(Human2 h) {
		h.name = "홍길동";
		h.age = 100;
		return h;
	}
	
	Human2 add(Human2 h, Human2 h2) {
		h2.name = h.name;
		h2.age = h.age;
		return h2;
	}
}




public class Ex15_Method_Overloading {

	public static void main(String[] args) {
		//어떤 코드든지 상관없음 add함수를 동작, error만 안나도록
		Test t = new Test();
		Human2 man = new Human2();
		
		t.add(man);
		System.out.println(man.age);
		System.out.println(man.name);
		
		Human2 man2 = new Human2();
		t.add(man,man2);
		System.out.println(man2.age);
		System.out.println(man2.name);
		
		System.out.println(t.add(man));
		System.out.println(t.add(man,man2));

		System.out.println(t.add(new Human2()));
		System.out.println(t.add(man,new Human2()));
	}

}
