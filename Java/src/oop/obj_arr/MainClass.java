package oop.obj_arr;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
//		Person kim = new Person("김길동", 32, "남자");
//		Person lee = new Person("이영희", 48, "여자");
//		Person park = new Person("박철수", 18, "남자");
//		
//		kim.personInfo();
//		lee.personInfo();
//		park.personInfo();
		
		
//		Person[] people = new Person[3];
//		people[0] = new Person("김철수", 32, "남자");

		Person[] people = { //한꺼번에 차곡차곡 배열에 넣기
				new Person("김길동", 32, "남자"),
				new Person("이영희", 48, "여자"),
				new Person("박철수", 18, "남자"),
//				new Person("김씨", 5, "남자")
		};  //몇 명이든 넣을 수 있는 방법.
		
		//출력하는 방법 1번
		for(int i=0; i<people.length; i++) {
			people[i].personInfo();
		}
		
		//출력하는 방법 2번
		for(Person p : people) {
			p.personInfo();
		}
		
		
	}

}
