package jungsuk.ch6;


class Data {
	int x;
}

class RefAndPirParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		prichange(d.x);
		System.out.println("After prichange(d)");
		System.out.println("main() : x = " + d.x);
		refchange(d);
		System.out.println("After refchange(d)");
		System.out.println("main() : x = " + d.x);

	}

	static void prichange(int x) {
		x = 500;
		System.out.println("prichange() : x = " + x);
	}

	static void refchange(Data d) { // 참조형 매개변수
		d.x = 1000;
		System.out.println("refchange() : x = " + d.x);
	}

}

/*
 * - 기본형 매개변수는 값이 복사되서 메서드 안에서만 사용하므로 main으로 돌아왔을 때 값이 변하지 않는 것을 볼 수 있다.
 * - 참조형 매개변수는 객체에 직접 접근하기 때문에 값이 변경된 것을 볼 수 있다.
 */
