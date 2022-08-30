package junsuk.ch4;

public class ch4prac17 {
	public static void main(String args[]) {
		
		int number = 1234554321;
		int tmp = number;
		int result =0; // number 변수 를 거꾸로 변환해서 담을 변수

		
		String strnumber = "";// string 길이 구하기
		strnumber = Integer.toString(number);
		int lennumber = strnumber.length();

		
		for(int i= 1; i<=lennumber;i++){ //number 뒤집기			
		
			if (i==1) {
				tmp = number%((int)Math.pow(10,i));
				result = tmp*(int)Math.pow(10,lennumber-i);
			} else {
				tmp = (number%((int)Math.pow(10,i))-number%((int)Math.pow(10,i-1)))/(int)Math.pow(10,i-1);
				result += tmp*(int)Math.pow(10,lennumber-i);
			}
		}
		
		if(number == result)
		System.out.println( number + " 는 회문수 입니다."); 
		else
		System.out.println( number + " 는 회문수가 아닙니다.");
		
	}
}
//ex25보기

