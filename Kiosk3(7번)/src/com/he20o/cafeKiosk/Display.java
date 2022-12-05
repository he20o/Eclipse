package com.he20o.cafeKiosk;

import com.he20o.util.Cw;

public class Display {
	//static 변수
	static String x = "x";
	//final키워드를 붙이면 변수가 상수가 됨.
	//처음에 값이 들어가면 그 이후 값을 못바꿈.
	//상수 명명 국룰 = 이름 다 대문자로 씀.
	final static String DOT = "☆";
	public static void line() {
//		Cw.w(x);      //일반 멤버 변수는 못씀.
		for(int i=0;i<32;i=i+1) {
			Cw.w(DOT);       //static멤버 변수는 사용가능.
		}
		Cw.wn("");
	}
	public static void title() {
		line();
		Cw.wn("☆===========🏝️CAFE🏝️===============☆");
		line();
		
	}
	public static void title1() {
		line();
		Cw.wn("☆==========🥤BEVERAGE🥤============☆");
		line();
		
	}
	public static void title2() {
		line();
		Cw.wn("☆==========🎂DESSERT🎂=============☆");
		line();
		
	}
	public static void title3() {
		line();
		Cw.wn("☆===========🍧ICECREAM🍧===========☆");
		line();
		
	}

}
