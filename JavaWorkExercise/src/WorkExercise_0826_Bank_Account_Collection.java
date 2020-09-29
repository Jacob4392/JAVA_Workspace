import kr.or.bit._0826_Bank;

public class WorkExercise_0826_Bank_Account_Collection {

	public static void main(String[] args) {
		_0826_Bank bank = new _0826_Bank();
		
		System.out.println("*******°èÁÂ »ı¼º*******");
		bank.addAccount("È«±æµ¿"); //°èÁÂ»ı¼º
		bank.addAccount("±èÀ¯½Å");
		bank.addAccount("±èÀ¯½Å");
		
		System.out.println();
		System.out.println("*******°èÁÂ Ã£±â(°èÁÂ¹øÈ£)*******");
		bank.getAccount();
		
		System.out.println();
		System.out.println("*******°èÁÂ Ã£±â(¼ÒÀ¯ÀÚ ¸í)*******");
		bank.findAccounts();
		
		System.out.println();
		System.out.println("*******°èÁÂ ¸ñ·Ï*******");
		bank.listAccounts();
		
		System.out.println();
		System.out.println("*******ÃÑ °èÁÂ¼ö*******");
		bank.getTotalAccount();
		
		System.out.println();
		System.out.println("*******ÀÔ±İ*******");
		bank.link(1).deposit(1000);
		bank.link(2).deposit(1000);
		bank.link(3).deposit(1000);
		bank.listAccounts();
		
		System.out.println();
		System.out.println("*******Ãâ±İ*******");
		bank.link(1).withdraw(200);
		bank.link(2).withdraw(500);
		bank.listAccounts();
		
		System.out.println();
		System.out.println("*******ÀÜ°í È®ÀÎ*******");
		bank.link(1).checkBalance();
		bank.link(2).checkBalance();
		bank.link(3).checkBalance();
		
		System.out.println("*******°Å·¡ ³»¿ª*******");
		bank.link(1).getTransactions();
		bank.link(2).getTransactions();
		bank.link(3).getTransactions();
		
	}
}
