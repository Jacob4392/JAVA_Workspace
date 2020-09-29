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
			System.out.println("아이디입력(5~20자리의 숫자 및 영문)");
			id=sc.nextLine(); 
				if(list.contains(id)) {
					System.out.println("중복된아이디입니다");
				}else {
		
					regex = Pattern.matches(pattern, id);        
				if(regex==true) {
					System.out.println("입력한아이디:"+id);
					break;        	
				}else
					System.out.println("입력형식이 잘못되었습니다");       
			}        
		}
	}

	public void PwCheck() {		
		pattern = "^[\\S]{8,20}$";
		
		while(true) {
			System.out.println("비밀번호입력(8~20자리)");
			pw=sc.nextLine();
			regex = Pattern.matches(pattern, pw);
				if(regex==true) {
					System.out.println("비밀번호확인");
					String pw2=sc.nextLine();
					if(pw.equals(pw2)) {
						System.out.println("입력완료");
						break;				
					}else 
						System.out.println("다시확인해주세요");				
							
				}else
					System.out.println("다시입력해주세요");		
	      
		}
	}


}
