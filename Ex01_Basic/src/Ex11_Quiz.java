import java.util.Scanner;

public class Ex11_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1���� 20������  ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���ϴ� ���α׷��� �ۼ��ϼ���
			
		
		

		//2. �ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���
/*

	
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				int result = i + j;
				if(result == 6) {
					System.out.printf("(%d,%d)\n",i,j);
				}
			}
		}
		

		//3. ���� , ���� ,�� ���� �� ����� ���ؼ� �ۼ��ϼ��� (IF)

		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���� �Է����ּ���.");
		int user = 0;
		String RSP = sc.nextLine();
		if(RSP.equals("����")) {
			user = 1;		
		}else if(RSP.equals("����")) {
			user = 2;
		}else if(RSP.equals("��")) {
			user = 3;
		}else {
			System.out.println("�ٽ� �Է��� �ּ���.");
			return;
		}
		
		int com = (int)((Math.random()*3)+1);
		if(user == 1) {
			if(com == 1) {
				System.out.println("�����ϴ�.");
			}else if(com == 2) {
				System.out.println("����� �����ϴ�.");
			}else {
				System.out.println("����� �̰���ϴ�.");
			}
		}else if(user == 2) {
			if(com == 1) {
				System.out.println("����� �̰���ϴ�.");
			}else if(com ==2) {
				System.out.println("�����ϴ�.");
			}else {
				System.out.println("����� �����ϴ�.");
			}
		}else {
			if(com == 1) {
				System.out.println("����� �����ϴ�.");
			}else if(com == 2) {
				System.out.println("����� �̰���ϴ�.");
			}else {
				System.out.println("�����ϴ�.");
			}
		}
		System.out.println("user: "+ RSP);
		if(com == 1) {
			System.out.println("com: "+ "����");
		}else if(com ==2) {
			System.out.println("com: "+ "����");
		}else {
			System.out.println("com: "+ "��");
		}
		
		
		//��ǻ�Ͱ� �ڵ����� ���� ���� , ���� , �� �� ���ؼ� ����ڰ� ���� �Է� �ؼ� ó�� �ϼ���

		//( ���� ��� : ����=> 1   , ���� => 2  , �� => 3)

*/
		
		boolean auto = true;
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(auto) {
			System.out.println("**********************");
			System.out.println("1. ����  |  2. ���  |  3. �ܰ�  |  4. ����");
			System.out.println("**********************");
			
			System.out.println("����");
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
				case 1: 
							System.out.println("���� :");
							balance +=  Integer.parseInt(sc.nextLine());
							break;
				case 2:
							System.out.println("��� :");
							balance -=  Integer.parseInt(sc.nextLine());
							break;
				case 3:
							System.out.println("�ܰ� : " + balance);
							break;
				case 4:
							System.out.println("�����մϴ�");
							auto = false;
							break;
				default: System.out.println("�ùٸ� �޴��� �����ϼ���");
					
			}
		}
	}
}
