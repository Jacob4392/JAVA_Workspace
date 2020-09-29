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
	
	


	//입금
	public void deposit(long amount) {
		this.balance += amount;
		transactions.add(new _0826_Transaction(amount));
		transactions.get(tindex).setKind("입금");
		transactions.get(tindex).setTdeposit(amount);
		System.out.println(accountNo+"번 계좌에 "+transactions.get(tindex).getAmount()+"원 입금되었습니다.");
		
		tindex++;

	}
	
	//출금
	public void withdraw(long amount) {
		this.balance -= amount;
		transactions.add(new _0826_Transaction(amount));
		transactions.get(tindex).setKind("츌금");
		transactions.get(tindex).getTbalance();
		System.out.println(accountNo+"번 계좌에 "+transactions.get(tindex).getAmount()+"원 출금되었습니다.");

		tindex++;
		
	}
	
	//잔고확인
	public void checkBalance() {
		System.out.println(accountNo+"번 계좌 잔고: "+this.balance);
		
	}
	
	//거래내역
	public void getTransactions() {
		System.out.println(accountNo+"번 계좌");
		for(int i=0;i<transactions.size();i++) {	
			System.out.println(transactions.get(i).toString());
		}
		System.out.println("총 거래 건수: "+ transactions.size());
	}
	
	
	@Override
	public String toString() {
		return "[계좌번호: "+this.accountNo+", 소유자 명: "+this.name+", 잔액: "+this.balance+"]";
	}
	
	
}
