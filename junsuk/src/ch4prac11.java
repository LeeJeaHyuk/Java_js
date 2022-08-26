
public class ch4prac11 {
	public static void main(String args[]) {

		// 피보나치
		// Fibonnaci 1, 1 . 수열의 시작의 첫 두 숫자를 로 한다
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		int lastnum = 0;
		int Fibonnaci = 0;

		System.out.print(num1 + "," + num2);

		for (int i = 0; i < 8; i++) {
			// 이전 점수 저장

			if (i == 0) {
				num3 = num1 + num2;
				lastnum = num2;
				Fibonnaci = num3;
			} else {
				Fibonnaci = lastnum + num3;
				lastnum = num3;
				num3 = Fibonnaci;
			}
			System.out.printf(",%d", Fibonnaci);
		}
//
//		for (int i = 0; i < 8; i++) {
//			num3 = num1 + num2;
//			System.out.print(" ," + num3);
//			num1 = num2;
//			num2 = num3;
//		}
	}// main
}
