package oop.abs.pet;

public class MainClass {

	public static void main(String[] args) {
		
		Pet dog = new Dog("초코", "푸들,", 3);
		Pet cat = new Cat("다봉이", "러시안블루", 4);
		
		dog.takeNap();
		cat.feed();
		dog.feed();
		cat.takeNap();
		
		
		
	}

}
