package kr.or.bit;
/*
Tv ���赵 �䱸���� ����
Tv�� ä�� ������ ������ �ִ�(������� 1~200 ���� ���� �� �ִ�)
Tv�� �귣�� �̸��� ������ �ִ�(���� ��� ����, �Ｚ)
Tv�� ä�� ��ȯ ����� ������ �ִ�(ä���� �� ä�ξ� �̵��� �����ϴ�)
-> ä���� ������Ű�� ����� ������ �ִ�
-> ä���� ���ҽ�Ű�� ����� ������ �ִ�
*/





public class Tv {
	public int ch; //default = 0
	public String brandname; //default = null

	public void ch_Up() {
		ch++; //�ϳ��� �޼ҵ�� �ϳ��� ����� ����Ѵ�
	}
	
	public void ch_Dowm() {
		ch--;
	}
	
	//�䱸���׿� ���� ������ �����غ��� ������ ����
	//ä�� ����, �귣�� �̸� ����ϴ� ���
	public void TvInfor() {
		System.out.printf("[%s],[%d]\n",brandname, ch);
	}
	
}
