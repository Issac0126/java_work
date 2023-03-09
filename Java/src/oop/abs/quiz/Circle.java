package oop.abs.quiz;

public class Circle extends Shape {

	private int rds;
	
	public Circle(String name, int rds) {
		super(name); //부모클래스에 생성자가 없기 때문에 필요하다. 
		this.rds=rds;
	}

	@Override
	double getArea() {
		return rds*rds*Math.PI;
	}
	
	
	//필요하면 게터세터 만들어놔도 좋음... 근데.. 굳이 .... 
}
