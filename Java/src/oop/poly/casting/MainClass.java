package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 2;   (x) //자식꺼는 부모개체에서 사용이 불가능함. 
		p.method1();
		p.method2();
//		p.method3(); (x) 
		
		System.out.println("====================");
		
		Child c = new Child();
		c.n1 = 1; //부모에게 물려받은 속성
		c.n2 = 1; //자식 고유의 속성
		
		c.method1();  //물려받아 새로 재정의한 메서드
		c.method2();  //부모에게 물려받은 메서드
		c.method3();  //자식 고유의 메서드
		
		System.out.println("====================");
		
		//다형성 적용(promotion)
		Parent p2 = new Child();
		p2.n1= 1 ;
//		p2.n2 =2;  (x)
		
		p2.method1();
		p2.method2();
//		p2.method3();   //부모의 
		
		System.out.println("====================");
		/*
		 - 다형성이 적용되면 자식 클래스의
		 본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생한다.
		 
		 - 이를 해결하기 위해 강제 타입 변환을 사용한다.
		 */
		
		Child c2 = (Child) p2; //부모 타입을 자식 타입으로 강제 변환(Downcasting)
		c2.n2 = 2;
		c2.method1();
		c2.method3();
		System.out.println("p2의 주소값: "+p2);
		System.out.println("c2의 주소값: "+c2); //
		
		
		
//		Object o = new Parent();
		//o.n1. =1; (x)
		//위도 가능은 하나, 무조건 데이터를 다 받으려면 Object를 유용하게 사용하기...   
		
		//다형성이 한 번도 발생하지 않은 경우에는
		//강제 형 변환을 사용할 수 없다.
		Parent ppp = new Parent();
//		Child c3 = (Child) ppp; //자식 타입의 부모개체라는 것은 없음. <<이거 그대로 F11누르면 오류 뜸...
		
		
		
		
		
		
	}

}
