package chap2.quiz01;

public class Employee extends Person {
	
	String departments;
	
	public Employee(String name, int age, String departments) {
		super.info(name, age);
		System.out.println(", 부서: "+departments);
	}


	
	

	
	
	
	
}
