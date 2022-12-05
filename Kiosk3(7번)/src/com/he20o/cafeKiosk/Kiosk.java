package com.he20o.cafeKiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
	ProcMenu procMenu = new ProcMenu();
	public static ArrayList<Product> basket = new ArrayList<Product>();

	public static Scanner sc = new Scanner(System.in);

	public static Product p1 = new Product("아이스아메리카노", 3500);
	public static Product p2 = new Product("핫 아메리카노", 3000);
	public static Product p3 = new Product("오렌지쥬스", 5000);
	public static Product p4 = new Product("마카롱", 2500);
	public static Product p5 = new Product("스콘", 3000);
	public static Product p6 = new Product("붕어빵", 2000);
	public static Product p7 = new Product("초코아이스크림", 3000);
	public static Product p8 = new Product("딸기아이스크림", 3000);
	public static Product p9 = new Product("체리아이스크림", 3000);

	public static String cmd;

	void run() {
		System.out.println("");
		Display.title();
//		System.out.println("===================================");
//		System.out.println("=============🏝️CAFE🏝️==============");
//		System.out.println("===================================");
		System.out.println("");
		xx: while (true) {
			System.out.print("주문하기[1.음료선택/2.디저트선택/3.아이스크림선택/e.주문완료]");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				System.out.println("");
				Display.title1();
//				System.out.println("===================================");
//				System.out.println("===========🥤BEVERAGE🥤============");
//				System.out.println("===================================");
				System.out.println("");
				p1.info();
				p2.info();
				p3.info();
				System.out.println("");
				System.out.println("1.아아/2.뜨아/3.오렌지쥬스/x.이전메뉴로");
				System.out.println("");
				procMenu.run();
				break;

			case "2":
				System.out.println("");
				Display.title2();
//				System.out.println("===================================");
//				System.out.println("============🎂DESSERT🎂============");
//				System.out.println("===================================");
				System.out.println("");
				p4.info();
				p5.info();
				p6.info();
				System.out.println("");
				System.out.println("1.마카롱/2.스콘/3.붕어빵/x.이전메뉴로");
				System.out.println("");
				procMenu.run2();	

				
				break;

			case "3":
				System.out.println("");
				Display.title3();
//				System.out.println("===================================");
//				System.out.println("===========🍧ICECREAM🍧============");
//				System.out.println("===================================");
				System.out.println("");
				p7.info();
				p8.info();
				p9.info();
				System.out.println("");
				System.out.println("1.초코맛아이스크림/2.딸기맛아이스크림/3.체리맛아이스크림/x.이전메뉴로");
				System.out.println("");
				procMenu.run3();
				break;


			case "e":
				System.out.println("");
				System.out.println("🙌잠시만 기다려주세요🙌");
				System.out.println("");

				break xx;

			}

		}
		int count = basket.size();
		System.out.println("장바구니에 담긴 상품 갯수:" + count);

		int sum = 0;
		for (int i = 0; i < basket.size(); i = i + 1) {
			sum = sum + basket.get(i).price;
		}

		System.out.println("총 주문금액은 " + sum + "원 입니다.");

		sc.close();

	}
}
