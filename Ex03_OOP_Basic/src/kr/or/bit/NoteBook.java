package kr.or.bit;

public class NoteBook {
	public String color;
	//public int year;
	private int year; 
	//ĸ��ȭ, ����ȭ: �����Ҵ��� ���� �����Ҵ��� ���ؼ� �ڷḦ ��ȣ(�����ڰ� ���ϴ� ����) ó��, private �����ڸ� ���ؼ�
	//�����Ҵ�
	//public int year >> ������ �Է½�, NoteBook notebook = new NoteBook(); notebook.year = -2000;
	//(�����Ҵ��� -���� ���� �; ���� �� �ִ� ����� ����.)
	
	
	//���콺�� ������ �ִ�
	//���콺�� �������� �Ӽ��� ������� ����� �ִ�. >> ������ Ŭ������ ������ �Ѵٴ� ��
	
	//public Mouse mouse;
	public Mouse handle(Mouse m) { //Mouse Ÿ���� [�ּ�]���� �� �� �ִ� >> new
		m.x = 100;
		m.y = 200;
		return m;
	}
	
	
	
	//ĸ��ȭ ��(private �����ڸ� ����) member field�� ���ؼ� write, read(set, get)�� �� �ִ� �Լ� >> ���� �Լ�
	//setter �Լ�, getter �Լ�
	public void setYear(int y) {
		if(y<0) {
			year = 1999;
		}else {
			year = y;
		}
	}
	
	public int getYear() {
		return year;
	}
	
}
