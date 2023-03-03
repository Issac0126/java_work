package oop.constructor;

public class Person {
	
	String name;
	int age;
	int height;
	
	Person(){} //이거 잊지말기!~~
	
	Person(String pName, int pAge, int pHeight){
		name=pName;
		age=pAge;
		height=pHeight;
	}
	
	void info() {
		System.out.printf("%s님의 정보가 등록되었습니다. / %d세 %dcm"
				, name, age, height);
	}
	
	
	
	
}
