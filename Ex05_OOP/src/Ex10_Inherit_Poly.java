/*
 	������(��Ӱ��迡���� ����)
 	������: �������� ����(����)�� ���� �� �ִ� �ɷ�
 	
 	C#: ������(overloading, override)
 	java: [��Ӱ���]���� [�ϳ��� ��������]�� [�������� Ÿ��]�� ���� �� �ִ�.
 	[�ϳ��� ��������] >> [�θ�Ÿ��]�� ���ϴ� ��
 	�θ�Ŭ���� Ÿ���� ���������� �������� �ڽ�Ŭ���� ��ü�� ���� �� �ִ�.
 	
 	������: ���Ǽ��迡���� �θ�� �ڽĿ��� ��� ���� �ش�
 		     ���α׷����迡���� �ڽ��� �θ𿡰� ���Ǿ��� �帰��>> ������
 	
 */

class Tv2{ //�θ�(�Ϲ�ȭ, �߻�ȭ) ����и�
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	
	void chUp() {
		this.ch++;
	}
	
	void chDown() {
		this.ch--;
	}
	
}


class CapTv extends Tv2{ //CapTv�� ���� �ִ� Ư��ȭ, ��üȭ, ������ �ڿ��鸸 ���� ��
	String text;
	String captionText() {
		return this.text = "���� �ڸ� ó����";
	}
	
	
}



public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv captv = new CapTv();
		captv.power();
		System.out.println("����: " + captv.power);
		
		captv.chUp();
		System.out.println("ä������: "+captv.ch);
		System.out.println(captv.captionText());
		//������ ��� ����

		
		//Car c = new Car();
		//Car c2 = new Car();
		
		Tv2 tv2 = captv;
		//��Ӱ��迡�� �θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�(������)
		//�� �θ�� �ڽ��� �ڿ��� ������ �� �ִ�
		//�� �����Ǹ� �����ϰ�
		
		System.out.println(tv2.toString()); //CapTv@15db9742
		System.out.println(captv.toString());//CapTv@15db9742
		
		//���� 601ȣ�� ���� �ڽ��� �� �� �� ������,(�����)
		//�θ�� �θ� ���� �͸� �� �� �ִ�(�����, TV)
		//tv.captionText(); (x)�Ұ�
		
		
		
	}

}
