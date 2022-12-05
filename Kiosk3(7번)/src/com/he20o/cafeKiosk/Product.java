package com.he20o.cafeKiosk;

public class Product {
	
//변수들
	String name;
	int price;

	Product(String xx, int yy) {
		name = xx;
		price = yy;
	}
//2.함수들 (메인 말고)
	void info() {
		System.out.println("❤️:" + name + "//💰:" + price);
	}
}
