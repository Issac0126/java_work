package oop.abs.quiz;

public class Circle extends Shape {

	int rds;
	
	public Circle(String name, int rds) {
		super(name);
		this.rds=rds;
	}

	@Override
	double getArea() {
		return rds*rds*Math.PI;
	}

}
