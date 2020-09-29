import kr.or.bit.AirPlane;

public class Ex07_Static_AirPlane {

	public static void main(String[] args) {
		
		/*
		AirPlane air1 = new AirPlane();
		air1.makeAirPlane("아시아나", 707);
		air1.airInfo();

		AirPlane air2 = new AirPlane();
		air2.makeAirPlane("대한항공", 707);
		air2.airInfo();
		
		AirPlane air3 = new AirPlane();
		air3.makeAirPlane("아시아나", 808);
		air3.airInfo();
		*/
		
		AirPlane air1 = new AirPlane(606, "아시아나");
	
		AirPlane air2 = new AirPlane(707, "아시아나");
		
		AirPlane air3 = new AirPlane(808, "아시아나");

		AirPlane air4 = new AirPlane(909, "아시아나");

	
		System.out.println("현재까지 만들어진 비행기의 총 대수: "+AirPlane.sum);
	}

}
