package kr.or.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class _Bank {
	private Scanner sc;
	private ArrayList<_0826_Account> accounts;
	private int totalAccounts;
	//////////////////////////////////////////////////

	public _Bank() {
		sc = new Scanner(System.in);
		accounts = new ArrayList<_0826_Account>();
		totalAccounts = 0;

	}

	//////////////////////////////////////////////////
	


	//���� ����
	public void addAccount(String name) {
		
		accounts.add(new _0826_Account(name));
		System.out.println(accounts.get(totalAccounts).getName()+" �̸��� ���°� �����Ǿ����ϴ�. ���¹�ȣ: "+(totalAccounts+1));
		accounts.get(totalAccounts).setAccountNo(totalAccounts+1);
		totalAccounts++;
	}
	
	//���� ��ȸ(���� ��ȣ)
	public void getAccount() {
		System.out.println("���¹�ȣ�� ���¸� ��ȸ�մϴ�. ���¹�ȣ�� �Է����ּ���.");
		String accountNo = sc.nextLine();
		for(int i=0;i<accounts.size();i++) {
			if(Integer.parseInt(accountNo)==accounts.get(i).getAccountNo()) {
				System.out.println(accounts.get(i));
			}
		}
	}
	
	//���� ��ȸ(�����ڸ�)
	public ArrayList<_Account> findAccounts() {
		ArrayList<_Account> accs = new ArrayList<_Account>();
		System.out.println("�̸����� ���¸� ��ȸ�մϴ�. �����ڸ��� �Է����ּ���.");
		String name = sc.nextLine();
		for(int i=0;i<accounts.size();i++) {
			if(name.equals(accounts.get(i).getName())) {
				acc
			}
		}
		return 
	}
	
	//���� ���
	public void listAccounts() {
		System.out.println("=��ü ���� ���=");
		for(int i=0;i<accounts.size();i++) {
			System.out.println(accounts.get(i));
		}
	}
	
	//�� ���¼�
	public void getTotalAccount() {
		System.out.println("�� ���� ��:" +accounts.size());
	}
	
	
}
