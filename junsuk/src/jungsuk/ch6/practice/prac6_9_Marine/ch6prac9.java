package prac6_9_Marine;

class Exercise6_9 {
	public static void main(String args[]) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m1.info();
		m2.info();
		
		m1.move(10,20);
		Marine.weaponUp();
		Marine.weaponUp(5);
		
		m1.info();
		m2.info();
	}
}
