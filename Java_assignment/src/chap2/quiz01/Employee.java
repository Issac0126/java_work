package chap2.quiz01;

public class Employee extends Person {

	String departments;
	
	String info(String name, int age, String departments) {
		System.out.print(super.info(name, age));
		return ", 부서: "+departments;
	}
}
