package oop.static_.field;

public class MainClass {

	public static void main(String[] args) {
		
		
		Count c1 = new Count();
		
		c1.a +=5;
		c1.b +=5;
		
		System.out.println("인스턴스 변수 c1.a: "+c1.a);
		System.out.println("정적 변수 c1.b: "+c1.b);
		
		
		System.out.println("----------- ( +=7 )");
		
		Count c2 = new Count();
		
		c2.a +=7;
		c2.b +=7;
		
		
		System.out.println("인스턴스 변수 c2.a: "+c2.a);
		System.out.println("정적 변수 c2.b: "+c2.b);

		System.out.println("----------- ( +=8 )");
		
		Count c3 = new Count();
		
		c3.a +=8;
		
		
		System.out.println("인스턴스 변수 c3.a: "+c3.a);
		System.out.println("정적 변수 c3.b: "+c3.b);
		System.out.println("정적 변수 c1.b: "+c1.b);
		System.out.println("정적 변수 c2.b: "+c2.b);
		
		/*
		 - static이 붙은 데이터는 그 static 데이터가 선언된
		 클래스 이름으로 바로 참조할 수 있다. 
		 - 일반 멤버변수와 혼동할 가능성이 있기 때문에
		 주소값으로 접근하지 않는다.  
		 */
		
		c3.b +=8; // (x) 오히려 헷갈리고 의미가 없는 방식. 
		Count.b += 8;  // (o) !! 
	}

}
