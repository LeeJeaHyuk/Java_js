package prac6_9_Marine;

class Marine {
	
	static int count;
	int serialNo;
	int x = 0, y = 0; // Marine (x,y) 의 위치좌표
	int hp = 60; // 현재 체력
	static int weapon = 6; // 공격력
	static int armor = 0; // 방어력
	
	{
		count++;
		serialNo=count;
	}
	
	static void weaponUp() {
		weapon++;
	}
	
	static void weaponUp(int up) {
		weapon+=up;
	}

	static void armorUp() {
		armor++;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void info() {
		System.out.println("Marine "+this.serialNo +"," + "위치 " + this.x + "," + this.y + "\n" 
				+ "hp: " + this.hp + "\n" 
				+ "공격력: " + Marine.weapon + 
				", 방어력: " + Marine.armor+"\n");


	}

}
