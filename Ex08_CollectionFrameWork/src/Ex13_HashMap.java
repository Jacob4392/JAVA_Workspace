import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex13_HashMap {
	public static void main(String[] args) {
		//�ϻ� ��Ȱ
		//������ȣ, �����ȣ, ȸ������ID/PW ����
		HashMap loginmap = new HashMap();
		loginmap.put("kim","kim1004");
		loginmap.put("scott","tiger");
		loginmap.put("lee","kim1004");
		
		
		
		//�츮 �ý��ۿ� ȸ�������� ȸ���� ID,PW ����
		//�α���
		//id(o), pwd(o) >> ȸ��(�氡)
		//id(o), pwd(x) >> ��й�ȣ �Է� >> 3ȸ �� ����
		
		//id(x), pwd(o)
		//id(x), pwd(x)
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id,pwd �Է����ּ���");
			System.out.print("ID: ");
			String id = sc.nextLine().trim().toLowerCase();
			System.out.print("PWD: ");
			String pwd = sc.nextLine().trim();
			
			if(!loginmap.containsKey(id)){
				System.out.println("���̵� �ٽ� �Է����ּ���");
			}else if(loginmap.containsValue(pwd)) {
				System.out.println("�氡�氡");
				break;
			}else {
				System.out.println("��й�ȣ�� Ȯ���ϼ���");
			}
		}
		
		

	}

}
