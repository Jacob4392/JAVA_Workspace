//���ڿ��� �񱳴� ==�� ���� �ʴ´�. �ּҰ� �񱳸� �ϰ� �� >> equals(String) >> String Ŭ�������� ���

//opr == "+"
//if(opr.equals("+"))







import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է�: ");
		//String value = sc.nextLine();
		//int num = Integer.parseInt(value);
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.print("��ȣ�Է�: ");
		String num2 = sc.nextLine();
		
		System.out.print("�����Է�: ");
		int num3 = Integer.parseInt(sc.nextLine());
		
		double result = 0;
		
		if(num2.equals("+")) {
			result = num + num3;
		}else if(num2.equals("-")) {
			result = num - num3;
		}else if(num2.equals("*")) {
			result = num * num3;
		}else if(num2.equals("/")) {
			if(num3 != 0) {
				result = (double)num / num3;
			}else {
				System.out.println("0���� ���� �� �����ϴ�.");
				return; //[�Լ�����]�� ������ > main �Լ� Ż�� > ����
			}
		}sc.close();
		System.out.println("������: " + result);
		
		
	}
}