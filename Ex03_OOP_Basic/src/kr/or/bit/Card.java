package kr.or.bit;

/*


[��� ī���� ���̿� �ʺ�� ����]

 */


public class Card {
	public int number;
	public String kind;
	
	//public int h = 50;
	//public int w = 20;
	public static int h = 50;
	public static int w = 20;
	
	//���(ī���� ���� Ȯ��)
	public void cardInfo() {
		System.out.printf("��ȣ: %d, ���: %s. h:%d, w:%d, \n",number, kind, h,w);
	}
}
