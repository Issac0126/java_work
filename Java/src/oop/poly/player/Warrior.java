package oop.poly.player;

public class Warrior extends Player {
	
	int rage;
	
	Warrior(String name){
		super(name);
		this.rage = 60;
	}
	
	/*
		 - 전사의 고유 기능인 rush 메서드를 작성한다.
		 - rush의 대상은 모든 직업들 입니다. (어떤 직업이든 다 때릴 수 있다!)
		 - 만약 rush의 대상이 전사라면 -10의 피해를 받고, 
		  마법사라면 -20의 피해를 받고, 사냥꾼이라면 -15의 피해를 받습니다.
		 - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
		 - 남은 체력도 출력해주세요.
		 - main에서 객체를 생성한 후 호출해서 잘 적용됐는지 확인해주세요.
	 */
	public void rush(Player target) {
		
		int damage;
		if(target instanceof Maze) {
			damage=20;
		} else if(target instanceof Hunter) {
			damage=15;
		} else {
			damage=10;
		}
		
		System.out.println(this.name+"의 돌진!");
		target.hp-=damage;
		System.out.printf("%s(은)는 %d의 피해를 받았다.\n", target.name, damage);
		System.out.printf("%s의 남은 체력: %d\n\n", target.name, target.hp);
		
		
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: "+rage);
	}
	
	
	
	
	
	
	
	
	
}
