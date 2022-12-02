package com.he20o.cafeKiosk;

public class Product {

	String name;
	int price;

	Product(String xx, int yy) {
		name = xx;
		price = yy;
	}

	void info() {
		System.out.println("❤️:"+name+"//💰:"+price);
	}
}
