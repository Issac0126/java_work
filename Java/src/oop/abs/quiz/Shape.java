package oop.abs.quiz;

public abstract class Shape {

	/*
    1. 도형의 이름을 저장할 수 있는 변수(name)을 private으로 선언.
    2. 생성자를 선언 -> 매개값으로 도형의 이름을 받아서 저장할 수 있도록.
    3. 자식 클래스에게 오버라이딩을 강제할 수 있는 메서드 
        getArea() 를 선언 (return type -> double)
    4. 도형 이름을 출력할 수 있는 메서드 getName()을 선언. (강제 x)
    */
	
	
	private String name; //1번
	
	public Shape(String name) { //2번 //얘가 세터의 역할을 함.
		this.name=name;
	}
	
	abstract double getArea(); //3번
		
	public String getName() { //4번
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}	//처음 지정한 이름으로 쭉 갈거라면 굳이 필요 없는 코드이나... 
		//하나 만들어두는 것을 추천함.	
	
	
	
	
}
