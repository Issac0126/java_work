package chap2.quiz01copy;

public class Student extends Person {
	
	String studentId;
	
	String info(String name, int age, String studentId) {
		System.out.print(super.info(name, age));
		return ", 학번: "+studentId;
	}
	
	
	
	
	
	
	
	
	
	
}
