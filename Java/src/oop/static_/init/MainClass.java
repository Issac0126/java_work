package oop.static_.init;

public class MainClass {

	public static void main(String[] args) {
	
//		DBManager DBManager = new DBManager();
		
		/*
		 - 정적 초기화자를 호출하려면 클래스를 로딩하면 된다.
		 # 클래스 로딩 방법
		 1. 클래스의 이름을 참조하여 static 멤버를 호출. 예시) DBManager.addr ... 
		 2. 객체를 생성함. 
		 - 정적 초기화자는 클래스 로딩 시 최초 1회만 호출된다. 
		 (조건이 만족되면 1번 호출되고 그 이후는 호출 불가능. 미리 호출해놓고 사용하기.)
		 
		 */
		
		System.out.println("주소: "+DBManager.addr);
		System.out.println("계정명: "+DBManager.uid);
		System.out.println("비밀번호: "+DBManager.upw);
		
	}

}
