package kr.or.catchjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Check {
	HashMap<String,String> idlist = new HashMap<>();
	ArrayList<String>list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	String pattern;
	String id;
	String pw;	
	static int idcount;
	boolean regex;
	
	public HashMap<String, String> getIdlist() {
		return idlist;
	}


	public String getId() {
		return id;
	}


	public String getPw() {
		return pw;
	}


	public void CreateId() {
		IdCheck();
		PwCheck();
		list.add(id);
		idlist.put(list.get(idcount), pw);
		idcount++;
		IdCheck();
		PwCheck();
		list.add(id);
		idlist.put(list.get(idcount), pw);
		idcount++;	
		System.out.println(idlist.toString());
		
	}
	
	
	public void IdCheck() {
		pattern = "^[a-z0-9]{5,20}$"; 
		
		while(true) {
			System.out.println("���̵��Է�(5~20�ڸ��� ���� �� ����)");
			id=sc.nextLine(); 
				if(list.contains(id)) {
					System.out.println("�ߺ��Ⱦ��̵��Դϴ�");
				}else {
		
					regex = Pattern.matches(pattern, id);        
				if(regex==true) {
					System.out.println("�Է��Ѿ��̵�:"+id);
					break;        	
				}else
					System.out.println("�Է������� �߸��Ǿ����ϴ�");       
			}        
		}
	}

	public void PwCheck() {		
		pattern = "^[\\S]{8,20}$";
		
		while(true) {
			System.out.println("��й�ȣ�Է�(8~20�ڸ�)");
			pw=sc.nextLine();
			regex = Pattern.matches(pattern, pw);
				if(regex==true) {
					System.out.println("��й�ȣȮ��");
					String pw2=sc.nextLine();
					if(pw.equals(pw2)) {
						System.out.println("�Է¿Ϸ�");
						break;				
					}else 
						System.out.println("�ٽ�Ȯ�����ּ���");				
							
				}else
					System.out.println("�ٽ��Է����ּ���");		
	      
		}
	}


}
