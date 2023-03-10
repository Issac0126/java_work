package oop.inter.basic;

// 인터페이스: 객체의 규격(기능)을 표준화해서 명세하는 역할.
// 변수=static, 메서드=추상메서드 등으로 인터페이스에는 값이 저장되지 않는다.
public interface Inter extends ParentInter{

	//인터페이스에서 변수를 선언하면 상수(static final)로 지정된다.
	int NUM = 5;
	
	//인터페이스는 생성자를 가질 수 없다. (=객체화 될 수 없는 개념이다.)
//	Inter(){		
//	}
	
	//인터페이스에서 메서드를 선언하면 추상 메서드로 지정된다.
	void method1();
	
	public static void staticMethod() {
		System.out.println("static 메서드는 여기 저장이 아니라서 가능하다~");
	}
	
	
	
}
