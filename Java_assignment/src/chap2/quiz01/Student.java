package chap2.quiz01;

public class Student extends Person {

	String studentId;

	public Student(String name, int age, String studentId) {
		super.info(name, age);
		System.out.println(", 학번: "+studentId);
	}
	
}
