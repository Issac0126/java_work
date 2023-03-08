package oop.poly.player;

public class Player {
	
	String name;
	int level;
	int atk;
	int hp;
	
	
	Player(){
		System.out.println("Player의 기본 생성자가 호출되었습니다.");
		level=1;
		atk=3;
		hp=50;
	}
	
	Player(String name){
		this(); //같은 클래스의 다른 생성자를 부르는 문법
		System.out.println("Player의 2번 생성자가 호출되었습니다.");
		this.name = name;
	}
	
	
	Player(String name, int hp){
		this(name); //this()는 반드시 생성자의 최상단에 위치해야한다.
		System.out.println("Player의 3번 생성자가 호출되었습니다.");
		this.hp = hp;
	}
	
	
	void attack(Player target) {
		
		if(this==target) {
			System.out.println("스스로는 때릴 수 없습니다.\n");
			return;
		}
		
		// 출력메세지: x가 y를 공격합니다.
		System.out.printf("%s(이)가 %s(을)를 공격합니다.", this.name, target.name);
		
		//상대방의 체력을 10 낮추고, 나의 체력을 5 회복하자.
		target.hp -=10;
		this.hp +=5;
		if(target.hp<=0) {
			System.out.printf("\n%s가 쓰러졌습니다. (체력: 0)", target.name);
			return;
		}
		System.out.printf("\n 나의 체력: %d / 상대방의 체력: %d\n\n", this.hp, target.hp);
	}
	
	
	
	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디: " +name);
		System.out.println("# 레벨: " +level);
		System.out.println("# 공격력: " +atk);
		System.out.println("# 체력: " +hp);
	}	
	
}
