package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior(); //w1에 주소값이 들어있다.
		w1.characterInfo();
		System.out.println();
		w1.level=1;
		w1.atk=3;
		w1.hp=50;
		w1.name="전사1";
		w1.rage=60;
		w1.characterInfo();
		
		System.out.println();
		Maze m1 = new Maze();
		m1.level=15;
		m1.atk=41;
		m1.hp=120;
		m1.name="법사닉네임";
		m1.mana=80;
		m1.characterInfo();
		
		System.out.println();
		Hunter h1 = new Hunter();
		h1.name="초보헌터";
		h1.level=2;
		h1.atk=5;
		h1.hp=45;
		h1.pet="빨간달팽이";
		h1.characterInfo();
		
		
		
		
		
		
		
		
		
	}

}
