/*
�ó�����(�䱸����)
����� ������ǰ ���� �ַ���� �����ϴ� ������Դϴ�
A��� ������ǰ ������ ���µǸ� 
[Ŭ���̾�Ʈ �䱸����]
������ǰ��  ��ǰ�� ���� , ��ǰ�� ����Ʈ ������ ���������� ������ �ֽ��ϴ�
������ ������ǰ�� ��ǰ�� ������ �̸��� ������ �ִ�
ex)
������ ������ǰ�� �̸��� ������ �ִ�(ex: Tv , Audio , Computer)
������ ������ǰ�� �ٸ� ������ ������ �ִ�(Tv:5000, Audio:6000 ....)
��ǰ�� ����Ʈ�� ������ 10% �����Ѵ�
 
�ùķ��̼� �ó�����
������ : ��ǰ�� �����ϱ� ���� �ݾ����� , ����Ʈ ������ ������ �ִ� 
���� ��� : 10����  , ����Ʈ 0
�����ڴ� ��ǰ�� ������ �� �ִ� , ���������� �ϰԵǸ� ������ �ִ� ����  �����ϰ� ����Ʈ�� �ö󰣴�
�����ڴ� ó�� �ʱ� �ݾ��� ���� �� �ִ�




*/

class Product{
	int price;
	int bonuspoint;
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price / 10.0);
	}
}

class KtTv extends Product{
	KtTv(){
		super(500);
	}
//	KtTv(int price){
//		super(price);
//	}
	
	@Override
	public String toString() {
		return "KtTv";
	}
	
}

//KtTv tv = new KtTv();

class Audio extends Product{
	Audio(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio";
	}
	
}


class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
	
}


//������
class Buyer{
	int money = 1000;
	int bonuspoint;
	
	//�����ڴ� ���������� �� �� �ִ�.
	//��������(�ܾ�-��ǰ�� ����, ����Ʈ ���� ����)
	//***�����ڴ� ���忡 �ִ� ��� ������ ������ �� �ִ�***
	
	//1���ڵ�
	//������ 3��, ������ �� �ִ� �Լ��� 3��
	
	
	//1�� ����
	
	//���Ŀ���
	//���忡 ��ǰ�� 1000�� �ٸ� ��ǰ�� �߰�(���콺, �佺Ʈ��...)(��ǰ����� POS��� �ڵ�ȭ �ȴٰ� ����)
	//���忡 ��ǰ�� ����(1000��...)
	//1. ���忡�� �����ڰ� 3���ۿ� ���Ÿ� ����, ������ 997���� ��ǰ�� �� �� ����
	//997���� ��ǰ�� �����ϴ� ����� ����
	
	// ���߼��� ���� >> 997���� �Լ��� ����...
	//��ȭ�� �����ϴ� �ڵ带 ������ �ʾ���
	
	//��ſ� �ް��� ������ ���� ����� ����
	//1. ��� ����� �ϳ��� ����
	//2.
	//3. �ϳ��� �Լ��� ��� ���������� �� �� �ֵ��� parameter ����
	//4.
	//�ߺ�����
	
	
	
	/*
	void KtTvBuy(KtTv n) { //�Լ��� ��ǰ ��ü�� �ּҸ� parameter�� �޾ƾ� ��ǰ�� ���ݰ� ����Ʈ�� �� �� �ִ�.
		if(this.money<n.price) {
			System.out.println("���� �ܾ��� �����մϴ�" + this.money);
			return; //�Լ�����(�������� ����)
		}
		//�Ǳ�������
		this.money -= n.price; //�ܾ�����
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������: " + n.toString());
	}
	
	void AudioBuy(Audio n) { //�Լ��� ��ǰ ��ü�� �ּҸ� parameter�� �޾ƾ� ��ǰ�� ���ݰ� ����Ʈ�� �� �� �ִ�.
		if(this.money<n.price) {
			System.out.println("���� �ܾ��� �����մϴ�" + this.money);
			return; //�Լ�����(�������� ����)
		}
		//�Ǳ�������
		this.money -= n.price; //�ܾ�����
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������: " + n.toString());
	}
	
	void NoteBookBuy(NoteBook n) { //�Լ��� ��ǰ ��ü�� �ּҸ� parameter�� �޾ƾ� ��ǰ�� ���ݰ� ����Ʈ�� �� �� �ִ�.
		if(this.money<n.price) {
			System.out.println("���� �ܾ��� �����մϴ�" + this.money);
			return; //�Լ�����(�������� ����)
		}
		//�Ǳ�������
		this.money -= n.price; //�ܾ�����
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������: " + n.toString());
	}
	*/
	
	
	//2������ (�����丵 refactoring)
	//�ϳ��� �̸����� �������� ���(method overloading) >> Buy()
	//2������
	
	//3������
	//��ǰ�� �߰��Ǵ��� �������� ����� �� �ִ�
	//�ϳ��� �̸��� ����� �� �ְ�, �ߺ��ڵ� ���ŵ�
	//��� ��ǰ�� Product�� ����ϰ� �ֱ� ������ (�θ�)
	//Product p;
	//Audio audio = new Audio;
	//p = audio;
	
	
	void Buy(Product n
			) { //�Լ��� ��ǰ ��ü�� �ּҸ� parameter�� �޾ƾ� ��ǰ�� ���ݰ� ����Ʈ�� �� �� �ִ�.
		if(this.money<n.price) {
			System.out.println("���� �ܾ��� �����մϴ�" + this.money);
			return; //�Լ�����(�������� ����)
		}
		//�Ǳ�������
		this.money -= n.price; //�ܾ�����
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������: " + n.toString());
	}
	
	
	
}




public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {
		KtTv tv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		
		Buyer buyer = new Buyer();
		buyer.Buy(tv);
		buyer.Buy(notebook);
		buyer.Buy(audio);
		buyer.Buy(tv);

	}

}
