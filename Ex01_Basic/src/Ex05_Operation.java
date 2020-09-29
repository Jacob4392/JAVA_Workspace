
public class Ex05_Operation { //������

	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);
		
		result = 13/2; //��
		System.out.println(result);
		
		//������ ���ϴ� ������(%)
		result = 13%2;
		System.out.println(result);
		
		//����, ����(������ ������ : ++, --) 1�� ����, 1�� ����
		int i = 10;
		++i; //��ġ����
		System.out.println("��ġ: "+ i);
		i++; //��ġ����
		System.out.println("��ġ: "+ i);
		//�� �ڵ�� ��ġ, ��ġ�� �ǹ̰� ����.
		
		//Point (�����ڰ� ���յǸ� ��ġ, ��ġ ���е�)
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println("result2: " + result2 + " j2: " + j2 );
		
		result2 = i2 + j2++;
		System.out.println("result2: " + result2 + " j2: " + j2);
		
		byte b = 100;
		byte c = 1;
		//byte d = b+c; >> ����ȯ �ʿ�
		
		//Today point
		//�ڹ��� �����Ģ
		//������ ��� ������ int��� Ÿ������ ��ȯ �Ŀ� ó���Ѵ� (int�� 4byte)
		
		//byte + short => �����Ϸ��� int + int
		//char + char => �����Ϸ��� int + int
		//����ó���� �������꿡�� int���� ���� Ÿ�� int ��ȯ(long ����)
		//byte, char, short >> int ��ȯ
		
		//byte + short -> int + int
		//char + int -> int + int
		//int + long -> long + long
		
		//���� + �Ǽ� > Ÿ���� ũ��� ������� > �Ǽ��� ����
		
		long ln = 10000000000L;
		float fl = 1.2f;
		long lnresult = (long)(fl + ln);
		System.out.println("lnresult: " + lnresult);
		
		//�Ҽ��ΰ� �սǹ߻�
		//float�� ������ ��
		
		float num2 = 10.45f;
		int num3 = 20;
		//num2 + num3
		//float + int >> float + float
		float result5 = num2 + num3;
		System.out.println(result5);
		
		//int result5 >> 30
		
		char c2 = '!';
		char c3 = '!';
		//c2 + c3
		int result6 = c2 + c3;
		System.out.println(result6);
		System.out.println((char)result6);
		
		//���
		//�߼ұ�� ���蹮��(������ ���) >> ����� ���� >> �ﰢ��(�������� �ɷ��� �ִ��� ���� ��)
		
		int sum = 0;
		for(int j=1;j<=100;j++) {
			//System.out.println("j: "+ j);
			//sum = sum + j;
			//sum+=j;
			if(j%2 == 0) {
				sum+=j; //¦���� ��
			}
		}
		System.out.println(sum);
		
		// == ������(���� ���ϴ� ������)
		if(10==10.0f) { //Ÿ���� ������ �ʾƿ� ������ ����
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// !���� ������
		if('A'!=65) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ��");
		}
		
		//�ϱ�����(Today Point)
		int p = 10;
		int k =-10;
		int result8 = (p==k)? p : k;
		System.out.println("result8 = " + result8);

		if(p==k) {
			result8=p;
		}else {
			result8=k;
		}
		System.out.println("result8: " + result8);
		
		//����ǥ
		//������
		// 0 : false, 1 : true
		
		//0,1 ����(����
		
		
		
		/*
		       OR    AND
		 0 0   0	  0
		 0 1   1	  0
		 1 0   1	  0
		 1 1   1	  1
		 
		 
		 Oracle(sql)
		 select*
		 from emp
		 where job ='IT' and sal>2000 //�׸���(�� �� ���� ���)
		 
		 select*
		 from emp
		 where job ='IT' or sal>2000 //�Ǵ�(�� �߿� �ϳ��� ���̾ ����)
		 	
		 	������(��Ʈ����)
		 	| or ������
		 	& and ������
		 	
		 	|| ������(OR)
		 	&& ������(AND) 
		 	
		 	
		 */
		
			int x = 3;
			int y = 5;
			System.out.println("x|y: " + (x|y)); //7
			
			//������ -> 2����(0,1)
			// 128  64  32  16  8  4  2  1
			//                  0  0  1  1 >> ������ 3�� 2���� 0011
			//                  0  1  0  1 >> ������ 5�� 2���� 0101
			// OR			    0  1  1  1 >> 4 + 2 + 1 = 7
			// AND			    0  0  0  1 >> 1
			
			System.out.println("x&y: " + (x&y));
			
			//Today Point(&&(and), ||(or)) ������ short circuit
			//if(10>0 && -1>1 && 100>2 && 1>-1 ... 10��){���๮}
			//if(10>0 || -1>1 || 100>2 || 1>-1 ... 10��){���๮}
			
			
		int data = 90;
		switch(data) {
			case 100 : System.out.println("100�Դϴ�");
				//break; //���ǿ� ������ Ż���մϴ�. �ʿ信 ���� break�� �ɼ��� �ְ� �� �ɼ��� �ִ�.
			case 90 : System.out.println("90�Դϴ�");
				//break;
			case 80 : System.out.println("80�Դϴ�");
				//break;
			default: System.out.println("default");
		}
		
		//break�� ���������Դϱ� (�ʿ信 ���� ����������)
		
		int month = 4;
		String res = ""; //�� ���ڿ��� �ʱ�ȭ
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:res="31";
				break;
			case 4:
			case 6:
			case 9:
			case 11:res="30";
				break;
			case 2:res="29";
				break;
			default : res = "�� �����Ͱ� �ƴմϴ�";
		}
			System.out.println(month + " ���� �ϼ��� " + res);		
		
			
			//����(������ : ������ ���Ⱚ)
			//https://docs.oracle.com/javase/8/docs/api/index.html
			//����(package)
			//java.lang.Math (Math Ŭ����)
			//java �������� default�� �����ִ� ���� java.lang ����
			//����>import java.lang.*
			//Math Ŭ������ ������ �ִ� �ڿ��� (static)�� ������ ��ü ���� ���̵� ��� ������ �ڿ�
			//Math.random() -> a pseudorandom double greater than or equal to 0.0 and less than 1.0.
			//��� : doubleŸ���� �Ǽ��� return�ǰ� 0.0<= random <1.0
			System.out.println("Math.random(): " + Math.random());
			System.out.println("Math.random()*10: " + (Math.random()*10));
			//0~9
			System.out.println("Math.random()*10: " + (int)(Math.random()*10));
			//1~10
			System.out.println("Math.random()*10+1: " + ((int)(Math.random()*10)+1));
			//100~1000
			System.out.println("Math.random()*10+1: " + ((int)((Math.random()*10)+1)*100));
			
			
			
			
			
			
			
			int num = ((int)((Math.random()*10)+1)*100);
			String item = "";
			switch(num) {
			case 600: item ="����";
					break;
			case 700: item ="�ѿ켼Ʈ, ����";
					break;
			case 800: item ="�����, �ѿ켼Ʈ, ����";
					break;
			case 900: item ="NoteBook, �����, �ѿ켼Ʈ, ����";
					break;
			case 1000: item="TV, NoteBook, �����, �ѿ켼Ʈ, ����";
					break;
			default : item = "ĩ��";
			}
			System.out.println("���ϵ帳�ϴ�! ����� ������ " + num + "���̹Ƿ�, ��ǰ�� " + item + " �Դϴ�!");
				
		
			
			
			int jumsu = ((int)((Math.random()*10)+1)*100);
			String msg=""; //�ʱ�ȭ
			msg+="������ ������: " + jumsu + "�̰� ��ǰ��";
			switch(jumsu) {
			case 1000: msg+=", TV";
			case 900: msg+=", NoteBook";
			case 800: msg+=", �����";
			case 700: msg+=", �ѿ�";
			case 600: msg+=", ����";
				break;
			default : msg+=", ĩ��";
			}
			System.out.println(msg);
			
			
			String m = "F";
			String r = "";
			switch(m) { //���ǽĿ� ���ڿ� �Ǵ� ���� ��밡��
				case "A":
				case "B":
				case "C":
				case "D":
				case "E":
				case "F":
				case "G":r="OK";
					break;
				case "H":
				case "K":r="NO";
					break;
				default:r="�����Ͱ� �ƴմϴ�.";
			}
			System.out.println(r);
			
		}
	
			
			
			
			
	}


