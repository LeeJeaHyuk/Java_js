package jungsuk.ch5;
import java.util.Arrays;

public class ch5prac6 {

	public static void main(String[] args) {

		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		System.out.println("money=" + money);
		int tmp = 0;
		int sum = 0;
		for (int i = 0; i < coinUnit.length; i++) {

			tmp = money % coinUnit[i];
			money -= coinUnit[i] * tmp;
			sum += tmp;
		}
		System.out.println(sum);
	}// main

}
