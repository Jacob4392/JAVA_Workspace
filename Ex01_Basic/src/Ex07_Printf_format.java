import java.util.Scanner;

public class Ex07_Printf_format {

	public static void main(String[] args) {
		//System.out.println()
		//C#: Console.WriteLine()
		System.out.println(); //�ٹٲ�
		System.out.print("A");
		System.out.print("B");
		System.out.println("C");
		System.out.println("D");
		
		int num = 100;
		System.out.println(num);
		System.out.println("num ���� " + num + "�Դϴ�.");
		//����(format)
		System.out.printf("num ���� %d�Դϴ�.", num);
		//format ���Ĺ���(��ӵ� ǥ��)
		//%d (10���� ������ ���� ��) >> d �ڸ��� ����
		//%f (�Ǽ�)
		//%s (���ڿ�)
		//%c (����)
		// \t > tab, \n > �ٹٲ�
		System.out.printf("num ���� [%d]�Դϴ�. �׸��� [%d]�� �־�� \n",num,12345);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f ������ %f �Դϴ� \n",f);
		
		//�Է��� ���� �� ����(console(cmd)) ����ڰ� �Է��� ���� �Է� ���� �� ����.
		Scanner sc = new Scanner(System.in);
		//����Ű 
		//Ctrl + Shift + O >> import �ڵ�����
		
		//System.out.println("���� �Է��ϼ���");
		//String value = sc.nextLine(); //�Է��ϰ� ���� ĥ ������ ���, �Է°��� ���ڿ��� �����ϴ� �Լ�
		//System.out.println("value: " + value);
		
		//int number = sc.nextInt();
		//System.out.println("������: " + number);
		
		//float number = sc.nextFloat();
		//System.out.println("�Ǽ���: " + number);
		
		//�������: nextInt, nextFloat ���ٴ� nextLine() read
		//Today Point
		//[����]�� -> ���ڷ� ��ȯ�� �� ����(����, �Ǽ�)
		//Integer.parseInt("11") >> ���� ���ڸ� ������ ��ȯ
		//Float.parseFloat(s) >> �Ǽ��� ��ȯ
		
		System.out.println("���� �Է��ϼ���");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("������: "+ number);
		
	}

}
