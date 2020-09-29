package kr.or.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class _Account {
	private Scanner sc;
	
	private int accountNo=0; 
	private String name;
	private long balance = 0;
	private ArrayList<_0826_Transaction> transactions;
	private int tindex = 0;
	//////////////////////////////////////////////////
	
	

	
	
	public _Account(String name) {
		sc = new Scanner(System.in);
		this.name = name;
		transactions = new ArrayList<_0826_Transaction>();
	}
	
	
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public long getBalance() {
		return this.balance;
	}

	public void setDeposit(long balance) {
		this.balance += balance;
	}

	public void setWithdraw(long balance) {
		this.balance -= balance;
	}
	

	
	
	//////////////////////////////////////////////////
	
	


	//�Ա�
	public void deposit(long amount) {
		this.balance += amount;
		transactions.add(new _0826_Transaction(amount));
		transactions.get(tindex).setKind("�Ա�");
		transactions.get(tindex).setTdeposit(amount);
		System.out.println(accountNo+"�� ���¿� "+transactions.get(tindex).getAmount()+"�� �ԱݵǾ����ϴ�.");
		
		tindex++;

	}
	
	//���
	public void withdraw(long amount) {
		this.balance -= amount;
		transactions.add(new _0826_Transaction(amount));
		transactions.get(tindex).setKind("����");
		transactions.get(tindex).getTbalance();
		System.out.println(accountNo+"�� ���¿� "+transactions.get(tindex).getAmount()+"�� ��ݵǾ����ϴ�.");

		tindex++;
		
	}
	
	//�ܰ�Ȯ��
	public void checkBalance() {
		System.out.println(accountNo+"�� ���� �ܰ�: "+this.balance);
		
	}
	
	//�ŷ�����
	public void getTransactions() {
		System.out.println(accountNo+"�� ����");
		for(int i=0;i<transactions.size();i++) {	
			System.out.println(transactions.get(i).toString());
		}
		System.out.println("�� �ŷ� �Ǽ�: "+ transactions.size());
	}
	
	
	@Override
	public String toString() {
		return "[���¹�ȣ: "+this.accountNo+", ������ ��: "+this.name+", �ܾ�: "+this.balance+"]";
	}
	
	
}
