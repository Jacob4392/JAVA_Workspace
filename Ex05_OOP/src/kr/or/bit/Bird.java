package kr.or.bit;


//��(�����ڿ�)(�Ϲ�ȭ, �߻�ȭ�� �ڿ�) : ���� �� �� �ִ�. ���� ������
public class Bird {
	//������
	public void fly() {
		System.out.println("flying");
	}
	
	//�������� �ǵ�:
	//���� ����ϴ� ����� moveFast�� �ʿ信 ���� ������ ������ ���ھ�(�������� ����)
	protected void moveFast() {
		fly();
	}
	
	
}
