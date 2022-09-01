package jungsuk.ch7.ex.ch07_21_PolyArgument1;

class Tv extends Product {
	Tv() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);			// Tv의 가격을 100만원으로 한다.
		// new Product(100);과 같다
	}
	
	Tv(int price){
		super(price);
		//값을 지정
	}

	public String toString() {	// Object클래스의 toString()을 오버라이딩한다.
		return "Tv";//Tv객체가 문자열로 표현되면 Tv를 출력한다.
	}
}