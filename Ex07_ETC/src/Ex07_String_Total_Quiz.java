import java.util.Scanner;

//�ֹι�ȣ : �޹�ȣ ù�ڸ� : 1,3 ���� , 2,4 ���� ��� ��� ... �ϴ� ����

//main �Լ� Scanner  ��� �ֹι�ȣ �Է¹ް�
//��:6�ڸ�     ��:7�ڸ�
//�Է°� : 123456-1234567 
//1. �ڸ��� üũ (���)�Լ� (14 ok)  return true , false 
//2. �޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ����Լ�  return true, false
//3. �޹�ȣ ù��° �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ����Լ�  void  ���

//3���� �Լ� static 

public class Ex07_String_Total_Quiz {


	
	static boolean juminCheck(String jumin) {
		return jumin.length() == 14;
	}
	
	static boolean juminCheck2(String jumin) {
		int index = jumin.indexOf("-");
		return jumin.substring(0,index).length()==6 &&
				jumin.substring(index+1,jumin.length()).length()==7;
	}
	
	
	static boolean limitNumber(String jumin) {
		if(Integer.parseInt(jumin.substring(7,8)) >=1 && Integer.parseInt(jumin.substring(7,8)) <=4) {
			return true;
		}else {
			return false;
		}
		//return (Integer.parseInt(jumin.substring(7,8)) >=1 && Integer.parseInt(jumin.substring(7,8)) <=4) ? true:false;
	}
	static void outPutGender(String jumin) {
		int num = Integer.parseInt(jumin.substring(7,8));
		if(num == 1 || num == 3) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
	}
	
	
	
	public static void main(String[] args) {
		//�ֹι�ȣ�� �Է¹޾Ƽ�
		System.out.println("�ֹι�ȣ�� �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		String juminnumber = scanner.nextLine();
		if(juminCheck(juminnumber) && limitNumber(juminnumber) && juminCheck2(juminnumber)) {
			outPutGender(juminnumber);
		}else {
			System.out.println("�ٽ� �Է����ּ���");
		}

	}

}
