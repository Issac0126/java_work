package oop.constructor;

public class Phone {
	//핸드폰 하나 만들련다 
	
	String model;
	String color;
	int price;
	
	/*
	 # 생성자 (Constructor)
	 
	 1. 생성자는 객체를 생성하는 역할을 하며, 그렇기 때문에
	 클래스 내부에 반드시 하나 이상 존재해야 한다.
	 
	 2. 만약 생성자가 하나도 존재하지 않는다면 JVN(자바 가상 머신)이
	 자동으로 매개변수가 하나도 존재하지 않는 가장 기본 형태의 생성자를
	 (default constructor)를 하나 생성한다. 
	 
	 3. 생성자는 반드시 클래스 이름과 대/소문자까지 동일하게
	 작성하여 선언하고, 리턴 타입은 없다.
	 
	 4. 생성자 내부에는 객체가 생성되자마자 해야 할 로직들을
	 기술할 수 있다.
	 
	 */
	
	//생성자 선언
	Phone() { //기본 생성자. 3번에서 말한 아무것도 없는 생성자가 이것이다. 
		System.out.println("기본 생성자가 호출되었습니다.");
		model = "폴더폰";
		color = "그레이";
		price = 200000;
	}
	
	/*
	 #생성자 오버로딩(중복 선언)
	 
	 1. 생성자는 여러 개 중복선언이 가능하다.
	 2. 단, 생성자의 매개변수의 타입, 개수, 순서 중 하나가 달라야 중복을 인정한다.
	 */
	
	Phone(String pModel){
		System.out.println("모델 변경 생성자가 호출되었습니다.");
		model = pModel;
		color = "화이트";
		price = 1000000;
	}
	
	Phone(String pModel, String pColor){
		System.out.println("모델&컬러 변경 생성자가 호출되었습니다.");
		model = pModel;
		color = pColor;
		price = 1500000;
	}	
	
	Phone(String pModel, String pColor, int pPrice){
		model=pModel;
		color=pColor;
		price=pPrice;
	}
	
	
	
	void showSpec() {
		System.out.println("***핸드폰의 정보***");
		System.out.println("모델명: "+ model);
		System.out.println("색상: "+ color);
		System.out.println("가격: "+ price+ "원");
	}
	
}
