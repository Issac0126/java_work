package oop.poly.player;

public class Maze extends Player {
	
	int mana;
	
	Maze(String name){
		super(name);
		this.mana = 50;
	}
	
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 마나: "+mana);
		
	}

	
	
	
	
}
