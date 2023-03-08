package oop.poly.player;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("전사짱짱맨");
		Warrior w2 = new Warrior("함토리");
		Maze m1 = new Maze("지존z썬콜");
		Hunter h1 = new Hunter("재벌2세");
		
		w1.characterInfo();
		System.out.println();
		m1.characterInfo();
		System.out.println();
		h1.characterInfo();
		System.out.println();
		
		System.out.println("=============================");
		
		w1.rush(m1);
		w1.rush(h1);
		w2.rush(w1);
		w2.rush(m1);
		
		
	}

}
