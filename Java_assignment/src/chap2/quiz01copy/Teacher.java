package chap2.quiz01copy;

public class Teacher extends Person {

	String subject;
	
	String info(String name, int age, String subject) {
		System.out.print(super.info(name, age));
		return ", 과목: "+subject;
	}
}
