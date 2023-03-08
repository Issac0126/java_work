package oop.final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person kim = new Person("김철수");
//		kim.nation="미국"; (x)
//		kim.name="김마이클"; (x)
		kim.age=39;
		
		Person park = new Person("박영희");
//		park.nation="영국"; final로 막아놔서 될리가없음.
		
		System.out.println(kim.name);
	}

}
