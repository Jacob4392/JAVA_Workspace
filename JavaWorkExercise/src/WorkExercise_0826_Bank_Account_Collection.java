import kr.or.bit._0826_Bank;

public class WorkExercise_0826_Bank_Account_Collection {

	public static void main(String[] args) {
		_0826_Bank bank = new _0826_Bank();
		
		System.out.println("*******���� ����*******");
		bank.addAccount("ȫ�浿"); //���»���
		bank.addAccount("������");
		bank.addAccount("������");
		
		System.out.println();
		System.out.println("*******���� ã��(���¹�ȣ)*******");
		bank.getAccount();
		
		System.out.println();
		System.out.println("*******���� ã��(������ ��)*******");
		bank.findAccounts();
		
		System.out.println();
		System.out.println("*******���� ���*******");
		bank.listAccounts();
		
		System.out.println();
		System.out.println("*******�� ���¼�*******");
		bank.getTotalAccount();
		
		System.out.println();
		System.out.println("*******�Ա�*******");
		bank.link(1).deposit(1000);
		bank.link(2).deposit(1000);
		bank.link(3).deposit(1000);
		bank.listAccounts();
		
		System.out.println();
		System.out.println("*******���*******");
		bank.link(1).withdraw(200);
		bank.link(2).withdraw(500);
		bank.listAccounts();
		
		System.out.println();
		System.out.println("*******�ܰ� Ȯ��*******");
		bank.link(1).checkBalance();
		bank.link(2).checkBalance();
		bank.link(3).checkBalance();
		
		System.out.println("*******�ŷ� ����*******");
		bank.link(1).getTransactions();
		bank.link(2).getTransactions();
		bank.link(3).getTransactions();
		
	}
}
