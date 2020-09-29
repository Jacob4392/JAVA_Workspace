import java.util.StringTokenizer;

public class Ex06_String_Function {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat(" world");
		System.out.println(concatstr);
		
		boolean bo = str.contains("ell");
		System.out.println(bo);
		
		String str2 = "a b c d"; //[a][][b][][c][][d]
		System.out.println(str2.length()); //���ڵ� char���� �ϳ�
		
		String filename = "hello java world"; //[h][e][l][l][o][][j] ...
		System.out.println(filename.indexOf("h"));
		System.out.println(filename.indexOf("java")); //������ġ j�� ���� ����
		System.out.println(filename.indexOf("�ȳ��ϼ���")); //-1�� �迭�� ���ٴ� �� //-1�� �ƴ϶�� ���� ���ڿ� ���ϴ� ���ڰ� �ϳ��� �ִٴ� ��
		//�Ź� �缳 �˻� ... �̷� �ܾ �ϳ��� �ִٸ� -1���� �ȳ���
		//indexOf�� ������ ���� ���ϴ� ���ڿ��� ���ԵǾ� �ִ����� Ȯ���ϴ� ���� ����(0���� ū���̸� 1���� ���ԵǾ� ���� ���̴ٶ�� ������ �� �ִ�)
		
		if(filename.indexOf("wo") != -1) {
			System.out.println("wo�� �ϳ��� ������ �ֳ׿�");
		}
		
		System.out.println(filename.lastIndexOf("a"));
		System.out.println("�ڿ��� ó�� ������ a�� index�� �̾Ƴ��� �Լ�");
		
		//length(), indexOf(), substring(), replace(), split()
		
		String result = "superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(1,2)); //�ڱ��ڽ� //u endindex-1
		System.out.println(result.substring(0,0)); //�ȳ���
		System.out.println(result.substring(0,1)); //s
		//beginIndex - the beginning index, inclusive.
		//endIndex - the ending index, exclusive.
		//endindex - 1�� ó����(exclusive) �ڹٿ����� ����
		
		
		//Quiz
		String filename2="aaaa.zip"; //�Ǵ� hong.png �Ǵ� h.jpeg
		//���⼭ ���ϸ�� Ȯ���ڸ� �и��ؼ� ����ϼ���.
		//1. ���ϸ� >> aaaa
		//2. Ȯ���� >> zip
		//������ ��� �Լ��� ������ ������ Ǯ�����.
		
		if(filename2.indexOf(".") != -1) {
			int index = filename2.indexOf(".");
			
			System.out.println("1.���ϸ�: "+filename2.substring(0,index));
			System.out.println("2.Ȯ����: "+filename2.substring(index+1,filename2.length()));
		}
		
		
		//replace(ġȯ�Լ�)
		
		String str3 = "ABCDADDDDDA";
		String result3 = str3.replace("DDDDD", "������ �����");
		System.out.println(result3);
		
		result3 = str3.replace("A","a");
		System.out.println(result3);
		
		//ETC
		System.out.println(str3.charAt(0)); //index�� �ش��ϴ� char�� �ϳ��� ����Ѵ�
		System.out.println(str3.endsWith("DDDA")); //�ڿ������� ���� ������ ã���ش� //�ڿ� �� ���ڹ����� ������ True
		System.out.println(str3.equalsIgnoreCase("abcdADDDDDA")); //��ҹ��� �������� �ʰ� ������ True
		
		//Today Point(Split)
		//String str4 = "���۸�,��Ƽ,�����,������,������";
		//String[] namearray = str4.split(",");
		
		String str4 = "���۸�.��Ƽ.�����.������.������";
		String[] namearray = str4.split("\\.");
		for(String s :namearray) {
			System.out.println(s);
		}
		
		/*
		  	.(��) >> ����ǥ���� ���� >>���ڱ״�� �����Ϸ���? \. ?? �̰͵� ����ǥ������,, >> \\. (2�� ����)
		 
		 	����ǥ���� ǥ��(java, javascript, Oracle, C#) �������� ��Ģ
		 	��� ���ڸ� ���鶧 [��Ģ]�� �ο��ϴ� �� >> ��ȿ�� �Ǵ� �ٰ�
		 	
		 	�ֹι�ȣ: ���� 6�ڸ� - ���� 7�ڸ� {\d6}-{\d7} ��Ģ�� �´��� ���� �ʴ��� ��
		 	12345-1234567 >> false
		 	�ڵ�����ȣ
		 	������ȣ
		 	�����ȣ
		 	�������ּ�
		 	�̸����ּ� ���� ������ �� �ִ� ����ǥ������ �̸� �����ڰ� ����� ����
		 	
		 	��Ű�ǵ��:  https://ko.wikipedia.org/wiki/%EC%A0%95%EA%B7%9C_%ED%91%9C%ED%98%84%EC%8B%9D
		 	�������� (����Ʈ���� ã�� �ؼ��� �����ϱ�) 5���ϱ�
		 	
		 	�޴�����ȣ - ���� �߼۵��� �۾��Ұ�� �޴��� ��ȣ�� �Է¹������ �����մϴ�.
		 	01[01789]-\d{3,4}-\d{4}
		 	
		 	�����ȣ - ��6�ڸ� ���ڷ� ��� -(������)�� �ִ°��� ���°�� �Ѵ� ����մϴ�.
			"/^\d{3}-?\d{3}$/u"

			���̵� - ���̵�� ����/���ڸ� ����ϸ�, ù���ڴ� �����ڷ� �����Ͽ��� �ϸ�, 3�ڸ����� 8�ڸ� �̳��� �Է¹���
			"/^[a-zA-Z]\w{2,7}$/u"
			
			
			�ֹι�ȣ - ���� 13�ڸ��� ������, ��� -(������)�� �־ ��� �Ǹ�, �Ϻ� �ڸ����� ���Ͽ� ���ü� �ִ� ���ڿ� ������ �ξ���
			"/^\d{2}[0-1]\d[0-3]\d-?[1-6]\d{6}$/u"
			
			
			��¥ - �Ϲ� -(������)������ ��¥�� ������, �ڸ��� ���� �ü� ���� ������ ��� �Ϻ� ������ �ξ� �ʹ� ������ ��¥ �Է��� �Ϻ� ����
			"/^[1-2][9|0]\d{2}-[0-1]\d-[0-3]\d/u"


		 	
		 */
		
		String filename3 = "bit.hwp";
		//split ����ؼ� ���ϸ�� Ȯ����� ����غ�����.
		String[] filearray = filename3.split("\\.");
		for(String s : filearray) {
			System.out.println(s);
		}
		//ex) �ߺ����ϸ� ó���� �� �ַ� ���
		
		
		String str5 = "a/b,c-d.f";
		StringTokenizer sto = new StringTokenizer(str5,"/,-.");
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		
		//�ͼ���
		String str6 = "ȫ             ��            ��";
		//���� >> �������� >> "ȫ�浿"���� �����ϰ� �ʹٸ�?
		StringTokenizer sto2 = new StringTokenizer(str6,"                                      ");
		while(sto2.hasMoreElements()) {
			System.out.print(sto2.nextToken());
		}
		System.out.println(str6.replace(" ",""));
		
		String str7 = "              ȫ�浿                   ";
		System.out.println(">"+str7+"<");
		//���������� "ȫ�浿"
		System.out.println(">"+str7.trim()+"<");
		System.out.println(">"+str7.replace(" ", "")+"<");
		
		String str8 = "      ȫ    ��         ��       ";
		//"ȫ�浿"
		System.out.println(str8.replace(" ",""));
		
		//�������� �Լ��� ������ ���� (method chain ���)
		System.out.println(str8.trim().replace(" ","").substring(2));
		
		//Quiz-1
		int sum = 0;
		String[] numarr = {"1","2","3","4","5"};
		//����: �迭�� �ִ� ���ڰ����� ���� sum ������ ��Ƽ� ��� : ��� 15
		
		for(String s : numarr) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
		
		/*
		String s = numarr[0].concat(numarr[1]).concat(numarr[2]).concat(numarr[3]).concat(numarr[4]);
		System.out.println(s);
		for(int i=0;i<numarr.length;i++) {
			sum += Integer.parseInt(s.charAt(i));
		}
		System.out.println(sum);
		*/
		
		
		//Quiz-2
		String jumin = "123456-1234567";
		//�� �ֹι�ȣ�� ���� ���ϼ���
		int sum2 = 0;
		String numbers = jumin.replace("-","");
		for(int i=0;i<numbers.length();i++) {
			String num = numbers.substring(i,i+1);
			sum2+= Integer.parseInt(num);
		}
		System.out.println(sum2);
		
		
		
		 //Quiz-2
		   String jumin2="123456-1234567";
		   //�� �ֹι�ȣ�� ���� ���ϼ���_1
		   int sum3=0;
		   for(int i = 0 ; i < jumin.length() ; i++) {
			   String numstr =jumin.substring(i, i+1);
			   if(numstr.equals("-")) continue;
			   sum3+= Integer.parseInt(numstr);
		   } 
		   System.out.println("�ֹι�ȣ ��:" + sum2);
		   
		 //�� �ֹι�ȣ�� ���� ���ϼ���_2
		 //String jumin="123456-1234567";
		   String[] numarr2 = jumin.replace("-","").split("");
		   int sum4=0;
		   for(String i : numarr2) {
			   sum4+= Integer.parseInt(i);
		   }
		   System.out.println("�ֹι�ȣ ��2:" + sum3);
		   
		 //�� �ֹι�ȣ�� ���� ���ϼ���_3
		   String jumin4 = jumin.replace("-", "");
		   int sum5=0;
		   for(int i = 0 ; i < jumin4.length() ;i++) {
			   sum5+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
		   }
		   System.out.println("�ֹι�ȣ ��4:" + sum5);
		   
		}
	}


