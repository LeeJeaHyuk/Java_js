public class ch3prac9 {

		public static void main(String[] args) {
		char ch = 'z';
		boolean b = ('A'<=ch && ch<='Z'||'a'<=ch && ch<='z'||'0'<=ch && ch<=9);
		System.out.println(b);
		}
}

// 중첩 삼항 연산자
// 위와 같이 사용할 수 있지만 가독성이 좋지 않다.
// if를 사용하면 가독성이 늘어난다.