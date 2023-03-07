package chap2.quiz01;

public class Person {
	
	String name;
	int age;
	
	void info(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.printf("이름: %s, 나이: %d세", this.name, this.age);
	}
	
	
	
}
