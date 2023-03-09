package oop.abs.quiz;

public class Rect extends Shape {

	private int length;
	
	public Rect(String name, int length) {
		super(name);
		this.length=length;
	}

	@Override
	double getArea() {
		return (double) this.length*this.length;
	}

}
