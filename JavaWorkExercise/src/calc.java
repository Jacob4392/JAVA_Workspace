import java.util.Scanner;

public class calc {
	public void Calculator() {
	  Scanner in = new Scanner(System.in);
      double a, b, c = 0.0;
      System.out.print("첫번째 숫자를 입력하세요. \n");
      a = in.nextDouble();
      System.out.print("두번째 숫자를 입력하세요.  \n");
      b = in.nextDouble();
      System.out.print("어떻게 계산 하실건가요?  " +
            "\n1.더하기" +
      		"\n2.빼기" +
      		"\n3.곱하기" +
      		"\n4.나누기" +
    		"\n#" + "계산방식을 선택하세요. \n");
      		
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

