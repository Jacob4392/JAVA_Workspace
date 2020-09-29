package kr.or.bit.utils;

import java.util.Calendar;

//설계도
//편하게 (많이 사용하는 기능)
//static, 함수를 여러개(하나의 이름으로) -> 오버로딩

public class Edu_Date {
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR)+"년"+
				(date.get(Calendar.MONTH)+1)+"월"+
				date.get(Calendar.DATE)+"일";
	}
	
	public static String DateString(Calendar date, String opr) {
		return date.get(Calendar.YEAR)+opr+
				(date.get(Calendar.MONTH)+1)+opr+
				date.get(Calendar.DATE);
	}
	
	
	//요구사항
	//2020-8-26
	//1~9월 >> 01,02 ... 09
	//10,11,12 >> 그대로 출력
	
	public static String monthFormat_DateString(Calendar date) {
		
		if(date.get(Calendar.MONTH)+1 >=1 && date.get(Calendar.MONTH)+1<=9) {
			
		return date.get(Calendar.YEAR)+"년0"+
				(date.get(Calendar.MONTH)+1)+"월"+
				date.get(Calendar.DATE)+"일";
		}
		return date.get(Calendar.YEAR)+"년"+
				(date.get(Calendar.MONTH)+1)+"월"+
				date.get(Calendar.DATE)+"일";
	}
	
	public static String monthFormat_DateString(Calendar date,String opr) {
		
		if(date.get(Calendar.MONTH)+1 >=1 && date.get(Calendar.MONTH)+1<=9) {
			
		return date.get(Calendar.YEAR)+opr+"0"+
				(date.get(Calendar.MONTH)+1)+opr+
				date.get(Calendar.DATE);
		}
		return date.get(Calendar.YEAR)+opr+
				(date.get(Calendar.MONTH)+1)+opr+
				date.get(Calendar.DATE);
	}
	
}
