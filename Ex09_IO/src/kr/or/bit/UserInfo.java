package kr.or.bit;

import java.io.Serializable;

/*
객체 통신
객체(Car , Tv) 네트워크 , 파일 간에(txt 파일 객체 write, 객체 read) , 프로세스 간에 통신 (a.class , b.class)
직렬화 : 객체를 분해해서 줄을 세워 보내는 과정
역직렬화 : 객체를 다시 조립하는 과정
실습
대상 >> 파일  > 객체 write (직렬화)
대상 >> 파일  > 객체 read  (역직렬화)

단 조건은 : 본드 붙이는 것 ...직렬화 (x)
직렬화 가능한 제품(설계도) >> implements Serializable
레고 ....implements Serializable
*/
public class UserInfo implements Serializable {
	private String name;
	private String pwd;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public String getPwd() {
		return pwd;
	}
	public int getAge() {
		return age;
	}
	public UserInfo() {}
	public UserInfo(String name, String pwd , int age) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
	
}









