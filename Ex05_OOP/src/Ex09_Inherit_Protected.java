import kr.or.bit.Bird;

//Bird 상속받아서 구현
//Protected 상속관계에서 [재정의]를 했으면 좋겠어(필요에 따라서) (90%)
//상속: 재정의해서 사용 (재정의 안하면 사용 못함)

class Bi extends Bird{

	@Override
	protected void moveFast() {
		// TODO Auto-generated method stub
		super.moveFast();
	}
	
}


class Ostrich extends Bird{
	//구체화 특수화
	void run() {
		System.out.println("run");
	}

	@Override
	protected void moveFast() {
		run();
	}
	
	
	
}


public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Bi b = new Bi();
		b.fly();
		b.moveFast();
		
		Ostrich o = new Ostrich();
		o.run();
		o.moveFast();

	}

}
