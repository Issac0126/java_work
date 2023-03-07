package oop.poly.car;

public class Car {
	
	Tire frontLeft;
	Tire frontRight;
	Tire rearLeft;  //멤버변수에 다형성 적용.
	Tire rearRight; //개체를 갈아끼우기에 유용하다.
	
	void run() {
		System.out.println("자동차가 달립니다");
		
	}
	
	
	
	
	
	
	
}
