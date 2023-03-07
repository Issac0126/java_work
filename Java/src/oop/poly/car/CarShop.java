package oop.poly.car;

public class CarShop {
	
	/*
	 instanceof  <<개체가 어떤건지 확인할 수 있는 키워드
	 - 키워드 instanceof는 객체가 지정한 클래스 타입을 가질 수 있는
	 객체인지를 검사할 때 사용하는 연산자이다.
	 
	 -instanceof를 기준으로 좌항의 객체가 우항의 클래스 타입을 가질 수
	 있는 지를 물어봐서 맞다면 true, 그렇지 않다면 false를 도출한다.
	 
	 
	 */
	
	public void carPrice(Car c) { //테슬라, 소나타, 포르쉐만 들어올 수 있음.)
		if(c instanceof Sonata) {
			System.out.println("소나타의 가격은 30,000,000원 입니다.");
		} else if(c instanceof Tesla) {
			System.out.println("테슬라의 가격은 70,000,000원 입니다.");
		} else if(c instanceof Porsche) {
			System.out.println("포르쉐의 가격은 240,000,000원 입니다.");
		}
	}
	
	
	
	
	
}
