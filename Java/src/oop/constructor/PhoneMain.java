package oop.constructor;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone basic = new Phone(); //Phone()<< 이게 생성자를 호출하는 행위... 이미 호출했음. 
		//객체를 생성할 때 추가적으로 필요한 로직이 있으면 생성자를 쓰는게 유용함. 
		
		basic.showSpec();
		
		System.out.println();
		Phone basic2 = new Phone(); 
		basic2.showSpec();
		
		System.out.println();
		Phone galaxy23 = new Phone("갤럭시23"); 
		galaxy23.showSpec();
		
		System.out.println();
		Phone iPhone14 = new Phone("아이폰14", "스페이스 그린"); 
		iPhone14.showSpec();
		
		System.out.println();
		Phone iphone50 = new Phone("아이폰50", "블루블랙", 20000000);
		iphone50.showSpec();
				
		
		
		
	}

}
