import kr.or.bit.AirPlane;

public class Ex07_Static_AirPlane {

	public static void main(String[] args) {
		
		/*
		AirPlane air1 = new AirPlane();
		air1.makeAirPlane("�ƽþƳ�", 707);
		air1.airInfo();

		AirPlane air2 = new AirPlane();
		air2.makeAirPlane("�����װ�", 707);
		air2.airInfo();
		
		AirPlane air3 = new AirPlane();
		air3.makeAirPlane("�ƽþƳ�", 808);
		air3.airInfo();
		*/
		
		AirPlane air1 = new AirPlane(606, "�ƽþƳ�");
	
		AirPlane air2 = new AirPlane(707, "�ƽþƳ�");
		
		AirPlane air3 = new AirPlane(808, "�ƽþƳ�");

		AirPlane air4 = new AirPlane(909, "�ƽþƳ�");

	
		System.out.println("������� ������� ������� �� ���: "+AirPlane.sum);
	}

}
