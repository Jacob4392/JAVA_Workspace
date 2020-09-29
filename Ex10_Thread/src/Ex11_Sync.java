/*
 	synchronized
 	
 	Collection (vector, arraylist) ��
 	
 	�����ڿ� : �������� �����(������)�� ���ÿ� �����ؼ� ���
 	ȭ��� 1��, ��� 10��(Thread 10��) >> Lock
 	Lock�� ���ؼ� �ڿ��� ��ȣ�޽��ϴ�
 	
 	����: �����ġ >> Lock
 	��ü ������ Lock
 	�Լ� ������ Lock(�� �����ٰ� ��)
 	
 	�ݴ�
 	
 	���ÿ� ó���ؾ� �� ��(�ڿ��� ��ȣ�� �ʿ䰡 ����)
 	
 	
 	
 	
 	
 	
 */

class Wroom {
	synchronized void openDoor(String name) {
		System.out.println(name + "�� ȭ��� ����");
		for(int i=0;i<100;i++) {
			System.out.println(name+"�� ���: "+i);
			if(i == 10) {
				System.out.println(name +"��");
			}
		}
		System.out.println("�̿� ����");
	}
}

class User extends Thread {
	Wroom wr;
	String who;
	User(String name, Wroom w){
		this.who = name;
		this.wr = w;
	}
	
	@Override
	public void run() {
		wr.openDoor(this.who);
	}
}

public class Ex11_Sync {

	public static void main(String[] args) {
		//�Ѱ� ��ġ
		Wroom w = new Wroom();
		
		//�����
		User kim = new User("�达",w);
		User park = new User("�ھ�",w);
		User lee = new User("�̾�",w);
		
		kim.start();
		park.start();
		lee.start();

	}

}
