package chap2.quiz01;

public class Teacher extends Person {

	String subject;

	public Teacher(String name, int age, String subject) {
		super.info(name, age);
		System.out.println(", 과목: "+subject);
	}

}
