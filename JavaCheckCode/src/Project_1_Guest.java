import java.util.Scanner;//��ĳ��
import java.util.*;


class mainmanu {
	 private String id;//���̵�
	 private String pw;//�н�����
	 private String name;//�̸�
	 private String ph;//����ó
	/*get-set(ID)-----------------------------------------------*/
	 public String getId() {
	  return id;
	 }
	 public void setId(String id) {
	  this.id = id;
	 }
	/*get-set(Pw)----------------------------------------------*/
	public String getPw() {
		return pw;
		}
		public void setPw(String pw) {
		this.pw = pw;
		}
	/*get-set(Name)--------------------------------------------*/
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name = name;
		}
	/*get-set(Name)--------------------------------------------*/
	public String getPh() {
		return ph;
		}
		public void setPh(String ph) {
		this.ph = ph;
		}
	/*----------------------------------------------------------*/
	 public void printInfo() {
	  System.out.println("���̵�:" + id);
	  System.out.println("�н�����:" + pw);
	  System.out.println("�̸�:" + name);
	  System.out.println("����ó:" + ph);
	 }
	}

/*----------------------------------------------------------*/
public class Project_1_Guest {
	public static void main(String[] args) {
	 int count = 0;
	 //**String name;
	 Project_1_Guest[] guest = new Project_1_Guest[30]; //ȸ���� 30��
	 boolean stop = true;
	 while (stop) {//stop=true �̱� ������ ���� �ݺ�!
/*��ũ�� ȭ��---------------------------------------------------*/
	 System.out.println("-----------------------------");
	 System.out.println("|1|ȸ������ |2|ȸ������ Ȯ�� |3|����");
	 System.out.println("-----------------------------");
	 System.out.println("��>�׸��� ��ȣ�� �����ϼ���");
	 Scanner scan = new Scanner(System.in);
/*�޴������Է�--------------------------------------------------*/
	 int a = scan.nextInt(); //a �Է¹���
	 switch (a) {
/*----------------------------------------------------------*/	
	 case 1:
	 if (guest.length - count == 0) {
	 System.out.println("ȸ�� �߰��� ���ҽ� ���� ȸ���� �����Ͽ� �뷮�� ����ּ���");
	 break;
/*----------------------------------------------------------*/	
/*
	 case 1:
 if (!guest.get(id).equals(id)) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("�Է��Ͻ� ID�� �ߺ��Դϴ�. �ٽ� �Է� ��Ź�帳�ϴ�.");
		 String id = scanner.nextLine().trim();
	     break;
*/
/*----------------------------------------------------------*/
	 } else {
		 guest[count] = new Project_1_Guest(); //��� �߰�
		 Scanner scanner = new Scanner(System.in);
		 
	     System.out.print("ID�� �Է��ϼ���:");
		 String id = scanner.nextLine().trim();
		
	     System.out.print("PW�� �Է��ϼ���:");
		 String pw = scanner.nextLine().trim();
	     //Scanner input2 = new Scanner(System.in);
	     //String pw = input2.nextLine(); //pw �Է�
	    
	     System.out.print("�̸��� �Է��ϼ���:");
		 String name = scanner.nextLine().trim();
	    
	     System.out.print("-�������� �ڵ�����ȣ�� �Է��ϼ���:");
		 String ph = scanner.next().trim();
		 //guest[count].setId(id);
		 //guest[count].setPw(pw);
		
	     count++; //�� �� �߰��ø��� count �� �þ
		 System.out.println();
	     System.out.println("ȸ�������� ȯ���մϴ�.");
	     System.out.println("��ȸ���� ��: " + (count));
	     break;
		 }
/*----------------------------------------------------------*/
	   	 case 2:{
	     System.out.println("ȸ������ �̸��� �Է� ��Ź�帳�ϴ�.");
//	     name = scan.nextLine();	    
//	     if(guest.containsKey(name)){
//         Guest guest = guest.get(name);
//         System.out.println("�˻� ���>>"+guest.toString());
//	     }else{
//         System.out.println("�������� �ʽ��ϴ�.");
	     }break;
/*3.����-----------------------------------------------------*/
	     case 3:
	     stop = false; //stop ���� false�� �ٲ�->while�� ���ѹݺ� ����
	     System.out.println("�̿����ּż� �����մϴ�.");
	     break;
/*4.���ܹ���---------------------------------------------------*/
	     default: //�ٸ� ���� �Է����� ���
	     System.out.println("����:�缱�� ��Ź�帳�ϴ�.");
	   }
	  }
	}
}