package jungsuk.ch7.ex.ch07_26_StarCraft;

class RepairableTest{
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();

		Marine marine = new Marine();
		SCV	scv = new SCV();

		scv.repair(tank);	// SCV가 Tank를 수리하도록 한다.
		scv.repair(dropship);
//		scv.repair(marine);	
	}
}

interface Repairable { } 
// datatype으로써의 용도
// 수리될 수 있는 타입이다

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Unit { 
	//unit이 동시에 가지고 있는 것
	// 체력, 최대체력
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp) {
		MAX_HP = hp;
	}
	//...
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);		// Tank의 HP는 150이다.
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Tank";
	}
	//...
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);		// Dropship의 HP는 125이다.
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Dropship";
	}
	//...
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	//...
}

class SCV extends GroundUnit implements Repairable{
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) { //수리가능한 타입
		if (r instanceof Unit) { // r가 unit의 subclass인지
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				/* Unit의 HP를 증가시킨다. */
				u.hitPoint++;
			}
			System.out.println( u.toString() + "의 수리가 끝났습니다.");
		}
	}	
	/*
	 * 예를 들어 repairable하고  building인 객체가 추가된다면 
	 * 위의 예시에서는 Unit이 최대 조상이지만(Object제외)
	 * 전부 다합친 그 위의 조상을 만들고 Unit과 교차해주면 된다
	 * ex ->Terran-(Unit, Building)-(GroundUnit,...)
	 */
	//...
}
/*
class Barrack extends Buliding implements Liftable{
	LiftableImpl l = new LiftableImpl();
	
	void liftOff() {
		l.liftOff();
	}
}

class LiftableImpl implements Liftable { }
*/