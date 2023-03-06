package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;
import oop.modi.protec.pac1.B;

public class C extends A {

//	A a1 = new A(30); // 프로텍티드도 안됨...
//	B b1 = new B(3.14); //디폴트도 안댐... 
	
//	a1.method(){}
	
	public C() {
		/*
		protected 제한자는 패키지가 다른 경우
		두 클래스 사이에 상속 관계가 있다면
		super 키워드를 통해 참조를 허용합니다.
		
		protected는 상속을 강제하고 싶을때 주로 사용한다. 많이 사용하진 않음.
		 */
		super(30);
//		super(5.76); // (x) 얘는 디폴트라서 슈퍼 써도 사용 불가능.
		super.x =1;
//		super.y =2; //디폴트라안됨
		super.method1();
		
		
	}
	
	
	
	
}
