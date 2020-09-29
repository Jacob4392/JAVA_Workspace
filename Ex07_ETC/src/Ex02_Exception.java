
public class Ex02_Exception {

	public static void main(String[] args) {
		
		int num = 100;
		int result = 0;
		System.out.println("main start");
		
		try {
			for(int i=0;i<10;i++) {
				result = num / (int)(Math.random()*10); //0~9
				System.out.println("result: "+ result + " i: "+i);
			}
		}catch(ArithmeticException ae) { //문제가 발생되면 문제에 맞는 객체가 자동 생성되고 주소값 전달
			System.out.println("문제가 발생, 관리자에게 메일 발송");
			System.out.println("원인: "+ ae.getMessage());
			
			// catch(Exception e) >> 가독성이 떨어짐 >> 
			// java.lang.ArithmeticException
			
			//catch (ArithmeticException e) 좋은 코드(가독성)
			//여러개의 catch를 쓰려면 >> 작은 것을 먼저, 큰 것을 나중에 쓴다
		}catch(NullPointerException e) {
			//NullPointerException은 내가 처리

		}catch(Exception e) {
			//연산 예외, Null예외를 제외한 나머지 예외를 잡는다.
		}
		
		System.out.println("main end");
	}

}
