import kr.or.bit.Card;

public class Ex06_Static_CardMake {

	public static void main(String[] args) {
		//Card 53�� ����
		//�޸𸮿� �ø��� �۾�
		/*
		Card c = new Card();
		c.number = 1;
		c.kind="heart";
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind="heart";
		c2.cardInfo();
		*/
		//53 ī�带 new�� ���ؼ� ��������
		//Ŭ���̾�Ʈ .. ũ�� ���� �䱸..
		//���Ǽ��� �ٽ� ���� �մϴ�
		//���α׷� ���� ���氡�� h=70, w=50
		
		//1. �� �徿 �����Ѵ�
		//c.h=70;
		//c.w=50; (x53)
		
		//2. ���赵 ����(���� �� ������ ��)
		//�ٽ� ����
		
		//3. static
		//���̿� �ʺ� ���� ����
		Card c = new Card();
		c.number = 1;
		c.kind="heart";
		c.h=70;
		c.w=50;
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind="heart";
		c2.cardInfo();

	}

}
