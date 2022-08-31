package jungsuk.ch5;
import java.util.Arrays;

public class ch5prac6_1 {

	public static void main(String[] args) {

		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		System.out.println("money=" + money);

		for (int i = 0; i < coinUnit.length; i++) {

			System.out.printf("%d원짜리 동전 %개", coinUnit[i], money/coinUnit[i]);
			money %= coinUnit[i];
		}

	}// main

}
