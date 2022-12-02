package com.he20o.cafeKiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Product>basket = new ArrayList<Product>();
		
		System.out.println("===================================");
		System.out.println("=============🏝️CAFE🏝️==============");
		System.out.println("===================================");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product("아이스아메리카노",3500);
		Product p2 = new Product("핫 아메리카노",3000);
		Product p3 = new Product("오렌지쥬스",5000);
		Product p4 = new Product("마카롱",2500);
		Product p5 = new Product("스콘",3000);
		Product p6 = new Product("붕어빵",2000);
		
		String cmd;

		xx: while (true) {
			System.out.print("주문하기[1.음료선택/2.디저트선택/e.주문완료]");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				System.out.println("===================================");
				System.out.println("===========🥤BEVERAGE🥤============");
				System.out.println("===================================");
				System.out.println("");
				p1.info();
				p2.info();
				p3.info();
				System.out.println("");
				System.out.println("1.아아/2.뜨아/3.오렌지쥬스/x.이전메뉴로");
				System.out.println("");
				yy: while (true) {
					
					cmd = sc.next();
					switch(cmd) {
					case "1" :
						System.out.println("아이스아메리카노");
						Product x = new Product("아이스아메리카노",3500);
						basket.add(x);
						break;
						
					case "2" :
						System.out.println("핫 아메리카노");
						Product y = new Product("핫 아메리카노",3000);
						basket.add(y);
						break;
						
					case "3" :
						System.out.println("오렌지쥬스");
						Product z = new Product("오렌지쥬스",5000);
						basket.add(z);
						break;
						
					case "x" :
						System.out.println("이전 화면으로 이동");
						break yy;
					}
					
				}break;

			

			case "2":
				System.out.println("===================================");
				System.out.println("===========🎂DESSERT🎂============");
				System.out.println("===================================");
				System.out.println("");
				p4.info();
				p5.info();
				p6.info();
				System.out.println("");
				System.out.println("1.마카롱/2.스콘/3.붕어빵/x.이전메뉴로");
				System.out.println("");
				zz:while(true) {
					cmd = sc.next();
					switch(cmd) {
					case "1" :
						System.out.println("마카롱");
						Product a = new Product("마카롱",2500);
						basket.add(a);
						break;
					case "2" :
						System.out.println("스콘");
						Product b = new Product("스콘",3000);
						basket.add(b);
						break;
					case "3" :
						System.out.println("붕어빵");
						Product c = new Product("붕어빵",2000);
						basket.add(c);
						break;
					case "x" :
						System.out.println("이전 화면으로 이동");
						break zz;
					}
					
				}break;
				

			case "e":
				System.out.println("");
				System.out.println("🙌잠시만 기다려주세요🙌");
				System.out.println("");
				
				break xx;

			}
			
		}
		int count = basket.size();
		System.out.println("장바구니에 담긴 상품 갯수:"+count);
		
		int sum = 0;
		for(int i=0;i<basket.size();i=i+1) {
			sum = sum + basket.get(i).price;
		}
		
		System.out.println("총 주문금액은 "+ sum +"원 입니다.");

		sc.close();
	}

}

