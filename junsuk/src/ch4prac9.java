
public class ch4prac9 {
	public static void main(String args[]) {
		//각 자리의 합을 더한 결과를 출력
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {

			char tmp = str.charAt(i);
			sum = sum + Character.getNumericValue(tmp);
		// sum = str.charAt(i) -0;
		}
		System.out.println("sum="+sum);

	}
}
