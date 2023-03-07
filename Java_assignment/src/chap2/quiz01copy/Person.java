package chap2.quiz01copy;

public class Person {

	String name;
	int age;
	
	String info(String name, int age) {
		this.name = name;
		this.age = age;
		return "이름: "+name+", 나이: "+age;
	}
	
	
}
