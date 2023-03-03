package oop.string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		String str = "Hello jave";
		String str2 = "Hello jave";
		System.out.println(str==str2);
		
		
		// 1. charAt(index): 문자열 인덱스에 따른 단일 문자 반환.
		char c = str.charAt(4);
		System.out.println("4번 인덱스의 값"+c);
		
		//2. substring(begin, end)
		//: 문자열을 범위 지정하여 추출
		
		String ss1 = str.substring(1,5);   //1번 이상, 5번 '미만' =1~4
		System.out.println("ss1: "+ss1);
		
		String ss2 = str.substring(6);   
		System.out.println("ss2: "+ss2); //6부터  끝까지
		
		
		//3. length(): 문자열의 총 길이 반환  //글자수 세기
		int ss3 = str.length();
		System.out.println("ss3: "+ss3);
		
		
		//4. indexOf(str): 해당 문자가 있는 인덱스를 반환한다.
		//해당 문자가 존재하지 않으면 -1을 리턴
		int ss4 = str.indexOf("l"); //만약 해당 값이 두 개라면, 먼저 발견된 인덱스를 반환한다 
		System.out.println("ss4: "+ss4); 
		int ss5 = str.indexOf("h");
		System.out.println("ss5: "+ss5);
		
		int ss6 = str.lastIndexOf("l"); //뒤에서부터 수색해 인덱스를 반환한다
		System.out.println("ss5: "+ss5);
		int ss7 = str.indexOf("java"); //여러 문자를 전달하면 시작 인덱스를 알려준다. 
		System.out.println("ss6: "+ss6); 
		
		
		//5. 일괄 대/소문자 변경
		String ss8 = "HeLLo WoRLd";
		System.out.println("ss8: " +ss8);
		String lower = ss8.toLowerCase(); //일괄 소문자 변경 
		System.out.println("ss8: " +lower);
		String upper = ss8.toUpperCase(); //일괄 소문자 변경 
		System.out.println("ss8: " +upper)
		;
		
		
		//6. trim(): 문자열의 앞, 뒤 공백을 제거
		String name = " 	 홍길동 	       ";
		System.out.println(name+"님 안녕하세요~");
		System.out.println(name.trim()+"님 안녕하세요~");
		
		
		//7. replace(old, new)
		//: 기존 문자열 내부의 old값을 모두 찾아서 new 문자열로 일괄 변경.
		String java = "자바는 재밌습니다. 자바 커피는 맛있습니다.";
		System.out.println(java.replace("자바", "java"));
		System.out.println(java.replace("습니", ""));
		
		//8. split : 문자열을 구분자로 구분하여 분할한다.
		// 분할된 문자들은 String 배열에 담아서 리턴한다. 
		String phone = "010-1234-5678";
		String[] numbers = phone.split("-");
		System.out.println(Arrays.toString(numbers));
		
		String pet = "멍멍이, 야옹이, 쨱쨱이";
		String[] pets = pet.split(", ");
		System.out.println(Arrays.toString(pets));
		
		System.out.println("--------------------------");
		
		//9. 문자열의 정수/실수 변환 
		
		String s1="100";
		String s2="3.14";
		System.out.println(s1+s2);
		
		int i = Integer.parseInt(s1); //문자열 -> 정수
		double d = Double.parseDouble(s2); //문자열 -> 실수
		System.out.println(i+d);
		
		//valueOf : 기본 타입을 문자열로 변경해준다. 
		System.out.println(3+4);
		System.out.println(String.valueOf(3)+String.valueOf(4));
		
		// Integer.parseInt(변수명)
		
		
		
		
//		for(int i=0;i<10;i++) {
//			//특수기호 사용은 불가능합니다.
//		}
		
		
		
		
	}

}
