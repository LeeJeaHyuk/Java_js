package junsuk.ch5;
import java.util.Arrays;

public class ch5prac4 {

	public static void main(String[] args) {

		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j]= tmp;
		}
		// ballArr 3 ball3 . 배열 의 앞에서 개의 수를 배열 로 복사한다


		for (int i= 0; i< ball3.length;i++)	{
			ball3[i]=ballArr[i];
		}
		
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}

	}// main

}
