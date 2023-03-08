package oop.static_.clac;

public class Calculator {
	//클래스 목적: static이 어떤 경우에 사용되는지 알아보자!
	
	/*
	 - 계산기마다 색깔이 각각 다를 수 있게 때문에 color같은 변수는
	 데이터를 공유시키지 말고, 객체별로 따로 관리해야 한다.
	 
	 - 반면에 pie 같은 원주율값은 계산기마다 값이 동일해야 하기 때문에
	 static을 붙여서 데이터를 공유하게 하는 것이 유리하다.
	 */
	
	
	String color;
	static double pi = 3.141592;
	//값을 다 다르게 두고 싶다면 static을 선언하지 않는다. 
	//전부 값을 통일하고 싶다면 static 선언!
	
	/*
	 - 메서드 내부에서 non-static 데이터를 참조하고 있는 메서드는
	  해당 변수의 정확한 위치(객체의 주소값)을 알려줘야 하기 때문에
	  정적 메서드로 선언하기가 부적합하다.
	 */
	public void paint(String color) {
		System.out.println("계산기에 "+color+"색을 칠합니다.");
		this.color = color;
	}
	
	/*
	 - 메서드 내부에서 인스턴스 변수(=멤버변수)를 사용하지 않고 범용성 있게 사용하는
	 메서드는 static 키워드를 붙여서 정적 메서드로 선언하는 것이 좋다.
	 */
	public static double areaCircle(int r) {
		return r*r*pi;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
