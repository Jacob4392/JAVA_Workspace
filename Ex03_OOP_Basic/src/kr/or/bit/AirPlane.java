package kr.or.bit;

/*
�츮 ȸ��� ����⸦ �ֹ� ���� �Ǹ� �ϴ� ȸ���Դϴ�
�츮 ȸ��� ����⸦ �����ϴ� ���赵�� �ۼ� �Ϸ��� �մϴ�
�䱸����
1.����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ� �մϴ�
2.����Ⱑ ����Ǹ� ������� �̸��� ��ȣ �°� �ο��Ǿ��� Ȯ�� �ϴ� �۾��� �ʿ��մϴ� (������� Ȯ��)
3.�������� ������� ������� ������� �Ѵ�� (����)�� Ȯ�� �� �� �ֽ��ϴ�

AirPlane air = new AirPlane();
AirPlane air2 = new AirPlane();
AirPlane air3 = new AirPlane();
 */


/*
���� �����ڸ� �������
����⸦ ���鶧 ������ ������� ��ȣ, ������� �̸��� �Է��Ͽ� ����Ⱑ ����������� �ڵ带 �ٲټ���.

 */


public class AirPlane {
	public String airname;
	public int airno;
	public static int sum;
	
	public void airInfo() {
		System.out.printf("������: %s, ��ȣ: %d\n",this.airname,this.airno);
		sum++;
	}
	
	public AirPlane(int airno,String airname) {
		this.airno = airno;
		this.airname = airname;
		sum++;
		
	}
	
	public void makeAirPlane(String name, int num) {
		airname = name;
		airno = num;
	}
}
