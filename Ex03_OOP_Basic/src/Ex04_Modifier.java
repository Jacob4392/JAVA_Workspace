import kr.or.bit.Car;

/*
접근자(한정자): modifier
public >> 공유: package에 구분없이 공유된다
private >> 개인: 클래스 내부에서는 공유자원, 참조변수 입장에서는 접근 불가(사용불가)

객체지향언어
1. 캡슐화(은닉화)
1.1 클래스 내부에 있는 자원(member field, member method) 적용
	private int number; 직접할당을 막고 간접할당을 통해서 자원을 보호하겠다는 목적으로 사용 >> 간접(함수: write하는 전용함수를 setter함수, read(getter))
	private void call(); 다른 함수의 보조 역할(공통함수) >> 접근이 불가함. 클래스 내부에서 다른 함수가 호출해서 사용
	

	setter, getter
	1. setter만 만드는 경우(O) >> private int num; setNum(); 내부(class 내)에서만 쓰겠다고 하는 경우
	2. getter만 만드는 경우(O) >> getNum(); read만 하겠다고 하는 경우, 수정이 불필요한 경우
	3. setter, getter >> write, read 할 수 있게 하겠다.



*/
public class Ex04_Modifier {

	public static void main(String[] args) {
		Car car = new Car();
		car.setSpeed(10);
		car.setWindow(2);
		
		System.out.println(car.getSpeed());
		System.out.println(car.getWindow());

		car.speedUp();
		car.speedUp();
		System.out.println(car.getSpeed());
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		System.out.println(car.getSpeed());
		
	}

}
