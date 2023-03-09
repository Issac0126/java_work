package oop.inter.basic;

//클래스가 상속 가능한 것처럼 인터페이스도 extends를 사용하여
//인터페이스 간의 상속을 구현할 수 있다.
//인터페이스끼리는 다증 상속도 가능하다. (변수는 상수라 상속에 영향이 없고 메서드는 껍데기밖에 없어서) 
public interface Inter2 extends ParentInter {
	
	int I = 5; //static final
	
//	static final public String HELLO = "ㅇ-ㅇ";
	
	void method2();
	
	
	
	
	
	
	
	
}
