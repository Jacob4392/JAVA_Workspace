package kr.or.bit;

import java.io.IOException;

/*
 설계도(class) 만들 때 이것을 사용하는 사람들이 혹시 문제가 발생하지 않을까? 하는 의문이 생긴다면,,
 문제가 발생하는 부분에 대해서 프로그램이 강제로 종료되지 않도록 하겠다 한다면,
 내 설계도를 사용하는 개발자가 [예외를 강제]로 처리, 안전하게
 
 생성자, 함수를 만들 때 강제로 예외를 처리할 수 있음
 
 
 */


public class ExClass {
	public ExClass(String path) throws IOException, NullPointerException{
		System.out.println(path);
	}
}
