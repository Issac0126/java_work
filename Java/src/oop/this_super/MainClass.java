package oop.this_super;

public class MainClass {

	public static void main(String[] args) {
		
		Player p1 = new Player();
//		System.out.println("p1의 주소값: "+p1);
		p1.name="전사1";
		p1.characterInfo();
		
		System.out.println();
		
		Player p2 = new Player("전사2");
//		System.out.println("p2의 주소값: "+p2);
		p2.characterInfo();
		
		System.out.println();

		Player p3 = new Player("전사3", 200);
		p3.characterInfo();
		
		System.out.println("=================================");
		
		p3.attack(p2);
		p1.attack(p2);
		p2.attack(p2);
		p2.attack(p1);
		
		System.out.println();
		
		Warrior w1 = new Warrior("전사 짱짱");
		w1.characterInfo();
		
		System.out.println();
		
		Maze m1 = new Maze("법사가최고지");
		m1.characterInfo();
		
		System.out.println();

		Hunter h1 = new Hunter("사냥꾼이대세다");
		h1.characterInfo();
		
		
		
		
		
		
		
	}

}
