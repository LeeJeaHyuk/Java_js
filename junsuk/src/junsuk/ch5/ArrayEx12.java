package junsuk.ch5;
class ArrayEx12 {
	public static void main(String[] args) {
		String[] names = { "Kim", "Park", "Yi" };
		String[] names2 = { new String("Kim"), new String("Park"), new String("Yi") };
		String[] names3 = new String[] { "Kim", "Park", "Yi" };
		// 문자는 같지만 다른 객체이다.
		// equals로 확인하면 문자가 같다는 것을 확인할 수 있다.
		// 여러 데이터가 저장되므로 변수이름을 복수형으로 주는 것이 좋다.

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]:" + names[i]);
		}

		String tmp = names[2]; // 배열 names의 세 번째요소를 tmp에 저장
		System.out.println("tmp:" + tmp);

		names[0] = "Yu"; // 배열 names의 첫 번째 요소를 "Yu"로 변경

		int index = 0;
		for (String name : names) {// 향상된 for문
			//System.out.println(name);
			//name은 for문에서만 사용하는 로컬 변수이다
			System.out.println("names[" + index + "]:" + name);
			index++;
		}
			
	} // main
}
