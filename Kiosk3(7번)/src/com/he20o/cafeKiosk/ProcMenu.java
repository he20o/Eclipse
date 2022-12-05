package com.he20o.cafeKiosk;

public class ProcMenu {

	public void run() {
		yy: while (true) {
			// 메뉴출력
	
			
		
			Kiosk.cmd = Kiosk.sc.next();
			switch (Kiosk.cmd) {
			case "1":
				System.out.println("아이스아메리카노");

				Product x = new Product("아이스아메리카노", 3500);
				Kiosk.basket.add(x);

				break;

			case "2":
				System.out.println("핫 아메리카노");
				break;

			case "3":
				System.out.println("오렌지쥬스");
				break;

			case "x":
				System.out.println("이전 화면으로 이동");
				break yy;
			}

		}
	}

	public void run2() {
		zz: while (true) {
			Kiosk.cmd = Kiosk.sc.next();
			switch (Kiosk.cmd) {
			case "1":
				System.out.println("마카롱");
				Product a = new Product("마카롱", 2500);
				Kiosk.basket.add(a);
				break;
			case "2":
				System.out.println("스콘");
				Product b = new Product("스콘", 3000);
				Kiosk.basket.add(b);
				break;
			case "3":
				System.out.println("붕어빵");
				Product c = new Product("붕어빵", 2000);
				Kiosk.basket.add(c);
				break;
			case "x":
				System.out.println("이전 화면으로 이동");
				break zz;

			}
		}
	}

	public void run3() {
		vv: while (true) {
			Kiosk.cmd = Kiosk.sc.next();
			switch (Kiosk.cmd) {
			case "1":
				System.out.println("초코맛아이스크림");
				Product d = new Product("초코맛아이스크림", 3000);
				Kiosk.basket.add(d);
				break;
			case "2":
				System.out.println("딸기맛아이스크림");
				Product e = new Product("초코맛아이스크림", 3000);
				Kiosk.basket.add(e);
				break;
			case "3":
				System.out.println("체리맛아이스크림");
				Product f = new Product("초코맛아이스크림", 3000);
				Kiosk.basket.add(f);
				break;
			case "x":
				System.out.println("이전 화면으로 이동");
				break vv;

			}
		}

	}
}