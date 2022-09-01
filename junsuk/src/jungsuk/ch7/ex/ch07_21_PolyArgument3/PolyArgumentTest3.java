package jungsuk.ch7.ex.ch07_21_PolyArgument3;

import java.util.*;			// Vector클래스를 사용하기 위해서 추가해 주었다.

class PolyArgumentTest3 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();

		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}
