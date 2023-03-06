package oop.encap.good;

public class MainClass {

	/*
    - month와 day의 setter / getter 메서드를 선언하세요.
    - month: 1 ~ 12
    - day: 1 ~ 31
    - getter 메서드는 따로 비밀번호 등 권한 검사 없이
     바로 return 속성값 해 주세요.
    */
	
	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
		
		my.setYear(2001);
		my.setMonth(3);
		my.setDay(22);
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다."
				, my.getYear("0126"), my.getMonth(), my.getDay());
		
	}

}
