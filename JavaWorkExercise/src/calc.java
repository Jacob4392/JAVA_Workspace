import java.util.Scanner;

public class calc {
	public void Calculator() {
	  Scanner in = new Scanner(System.in);
      double a, b, c = 0.0;
      System.out.print("ù��° ���ڸ� �Է��ϼ���. \n");
      a = in.nextDouble();
      System.out.print("�ι�° ���ڸ� �Է��ϼ���.  \n");
      b = in.nextDouble();
      System.out.print("��� ��� �Ͻǰǰ���?  " +
            "\n1.���ϱ�" +
      		"\n2.����" +
      		"\n3.���ϱ�" +
      		"\n4.������" +
    		"\n#" + "������� �����ϼ���. \n");
      		
      double somethin = in.nextDouble();
      double addition = 1;
      double subtraction = 2;
      double multiplication = 3;
      double division = 4;
      if (somethin == addition) {
      	c = a + b;
      	System.out.println(a + " + " + b + " = " + c);  }
      else if (somethin == subtraction)  {
      	c = a - b;
      	System.out.println(a + " - " + b + " = " + c);	}
      else if (somethin == multiplication)	{
      	c = a * b;
      	System.out.println(a + " * " + b + " = " + c);	}
      else if (somethin == division)   {
      	c = a / b;
      	System.out.println(a + " / " + b + " = " + c);	}
	}
}

