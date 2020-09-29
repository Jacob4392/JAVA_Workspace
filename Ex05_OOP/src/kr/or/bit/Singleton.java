package kr.or.bit;

/*
 	����������(������ ���õ� ����) >> new >> 
 	��ü 1���� ���� �����ϰڴ�.
 	�ǵ�: �ϳ��� ��ü�� �����ϴ� ���� �����ϰڴ�(�ϳ��� ��ü�� ����ڴ�)
 	Ȱ��:
 	����������
 	DB �����۾�
 	Ȱ�� > JDBC ������ ��
 	
 */




public class Singleton {
	
	private static Singleton p;
	private Singleton() {
		//���� ��ü�� �������� ���ϰ� ����(private) new(x) ->heap�޸𸮿� ��ü������ ���ϰ� ����
		
	}
	
	public static Singleton getInstance() {
		if(p == null) {
			p = new Singleton(); //heap �޸𸮿� Singleton ��ü�� �ö�, �� ��ü�� �ּҸ� p��� ������ �����Ѵ�.
		}
		return p;
	}
	
	
}
