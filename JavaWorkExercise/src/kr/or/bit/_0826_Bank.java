package kr.or.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class _0826_Bank {
	private Scanner sc;
	private ArrayList<_0826_Account> accounts;
	private int totalAccounts;
	//////////////////////////////////////////////////

	public _0826_Bank() {
		sc = new Scanner(System.in);
		accounts = new ArrayList<_0826_Account>();
		totalAccounts = 0;

	}

	//////////////////////////////////////////////////
	


	//계좌 생성
	public void addAccount(String name) {
		
		accounts.add(new _0826_Account(name));
		System.out.println(accounts.get(totalAccounts).getName()+" 이름의 계좌가 생성되었습니다. 계좌번호: "+(totalAccounts+1));
		accounts.get(totalAccounts).setAccountNo(totalAccounts+1);
		totalAccounts++;
	}
	
	//계좌 조회(계좌 번호)
	public void getAccount() {
		System.out.println("계좌번호로 계좌를 조회합니다. 계좌번호를 입력해주세요.");
		String accountNo = sc.nextLine();
		for(int i=0;i<accounts.size();i++) {
			if(Integer.parseInt(accountNo)==accounts.get(i).getAccountNo()) {
				System.out.println(accounts.get(i));
			}
		}
	}
	
	//계좌 조회(소유자명)
	public void findAccounts() {
		System.out.println("이름으로 계좌를 조회합니다. 소유자명을 입력해주세요.");
		String name = sc.nextLine();
		for(int i=0;i<accounts.size();i++) {
			if(name.equals(accounts.get(i).getName())) {
				System.out.println(accounts.get(i));
			}
		}
	}
	
	//계좌 목록
	public void listAccounts() {
		System.out.println("=전체 계좌 목록=");
		for(int i=0;i<accounts.size();i++) {
			System.out.println(accounts.get(i));
		}
	}
	
	//총 계좌수
	public void getTotalAccount() {
		System.out.println("총 계좌 수:" +accounts.size());
	}
	
	//Transaction과 연결 역할
	public _0826_Account link(int index) {
		return accounts.get(index-1);
	}
	
}
