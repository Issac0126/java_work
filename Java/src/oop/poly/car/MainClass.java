package oop.poly.car;

import oop.poly.casting.Parent;

public class MainClass {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Porsche p1 = new Porsche();
		Porsche p2 = new Porsche();
		Porsche p3 = new Porsche();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
//		Sonata[] sonatas = {s1,s2,s3};
//		for(Sonata s : sonatas) {
//			s.run();
//		}
		
		//다형성을 적용해서 이종모음 배열을 선언할 수 있다. 
		Car[] cars = {s1,s2,s3, p1,p2,p3, t1,t2,t3,t4};
		
		for(Car c : cars) {
			c.run();
		}
		
		System.out.println("======================");
		
		System.out.println("*** 타이어 교체 작업! ***");
		t1.frontLeft = new HTire();
		t2.frontRight = new HTire();
		t3.rearLeft = new HTire();
		t4.rearRight = new HTire();
		
		System.out.println("======================");
		Driver kim = new Driver();
		kim.drive(p2);
		kim.drive(s1);
		kim.drive(t4);
		
		System.out.println();
		Car c = kim.buyCar("테슬라"); //부모의 시선으로 보고 있어서 멤버쉽을 못씀. 
		c.run();
		Tesla t5 = (Tesla) c; //부모타입에서 자식타입으로 시선 옮기기
		t5.enterMembership();  //멤버쉽 가입할 떄만 테슬라로 바꾸고, 그냥 카타입 c로 살아도 무관함.
//		Tesla t5 = (Tesla) kim.buyCar("테슬라");
//		kim.drive(t5);
		
		System.out.println();
		CarShop shop = new CarShop();
		shop.carPrice(s1);
		shop.carPrice(new Tesla());
		shop.carPrice(kim.buyCar("포르쉐"));
		  //return -> new Porsche();
	
	
	
	
	
	
	}

}
