package jungsuk.ch7.ex.ch07_21_PolyArgument3;

class Product {
	int price;			// 제품의 가격
	int bonusPoint;		// 제품구매 시 제공하는 보너스점수

	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}

	Product() {
		price = 0;
		bonusPoint = 0;
	}
}