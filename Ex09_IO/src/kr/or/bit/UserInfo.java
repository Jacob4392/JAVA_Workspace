package kr.or.bit;

import java.io.Serializable;

/*
��ü ���
��ü(Car , Tv) ��Ʈ��ũ , ���� ����(txt ���� ��ü write, ��ü read) , ���μ��� ���� ��� (a.class , b.class)
����ȭ : ��ü�� �����ؼ� ���� ���� ������ ����
������ȭ : ��ü�� �ٽ� �����ϴ� ����
�ǽ�
��� >> ����  > ��ü write (����ȭ)
��� >> ����  > ��ü read  (������ȭ)

�� ������ : ���� ���̴� �� ...����ȭ (x)
����ȭ ������ ��ǰ(���赵) >> implements Serializable
���� ....implements Serializable
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









