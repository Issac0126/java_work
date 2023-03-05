package oop.string;

import java.util.Arrays;

public class Hello {

	public static void main(String[] args) {
		
		
		
		String arc = "A piece of CAKE";
		System.out.println("arc");
		
		
		System.out.println("1. 변수명.charAt(Idx)");
		System.out.println("지목받은 인덱스의 글자를 챠 형식으로 꺼내준다.");
		System.out.println("●3번 추출: "+arc.charAt(3));
		System.out.println("나중에 나올 replace(old, new)가 더 편할 것 같음...ㅇㅅㅇ");
		
		System.out.println("\n2. 변수명.substring(start, end)");
		System.out.println("start이상 end미만까지 추출한다.");
		System.out.println("●8~10번 추출: "+arc.substring(8, 10));
		System.out.println("하나만 적을 수도 있음. 이 경우 끝까지 추출.");
		System.out.println("●11번 인덱스부터 "+arc.substring(11));
		
		System.out.println("\n3. 변수명.lenth();");
		System.out.println("알지 길이 추출하는 그거다 ㅇㅇ ");
		System.out.println("●문장 길이: "+arc.length());
		
		System.out.println("\n4. 변수명.indexOf(문자) << 여기에 큰따옴표");
		System.out.println("문구를 입력하면 인덱스 번호를 찾아줌. 없으면 -1로.");
		System.out.println("●a 찾기: "+arc.indexOf("a"));
		System.out.println("여기서 잠깐! 뒤에서부터 찾고 싶으면 last를 더해주기.");
		System.out.println("●(뒤부터) a 찾기: "+ arc.lastIndexOf("a"));
		
		System.out.println("\n5. 변수명.toLowerCase()");
		System.out.println("전부 소문자로... 로우어ㅇㅇ");
		System.out.println("●소문자화: "+arc.toLowerCase());
		System.out.println("대문자버전도 있음!! toUpperCase... ");
		System.out.println("●대문자화: "+arc.toUpperCase());
		
		System.out.println("\n6. 변수명.trim()");
		System.out.println("앞뒤 공백 짤라먹기~");
		System.out.println("●공백 자르기"+"     a   piece  hh        ".trim());
		
		System.out.println("\n7. 변수명.replace(old, new)");
		System.out.println("old 값을 모두 new 값으로 변경! 공백 제거에 유용");
		System.out.println("●케이크를 라이스로: "+arc.replace("CAKE", "rice"));
		System.out.println("●띄어쓰기 제거에도 유용함: "+arc.replace(" ", ""));
		
		System.out.println("\n8. 변수명.split(구분자)");
		System.out.println("구분자를 기준으로 배열에 넣음.");
		String[] arcSplit = arc.split(" ");
		System.out.println("●공백 기준으로 나눠넣기"+Arrays.toString(arcSplit));
		
		System.out.println("\n9. Integer.parseInt(변수명), Double.parseDouble(변수명)");
		System.out.println("String을 int로, double로.");
		
		String number = "123456";
		int i = Integer.parseInt(number);
		System.out.printf("●String->int 했다! %d\n",i);

		double d = Double.parseDouble(number);
		System.out.printf("●String->double 했다! %.2f\n",d);
		
		String.valueOf(d);
		System.out.println("●int->double->String 했다! "+d);
		
		/*
		 arc.Atchar(Idx); 인덱스 문구 추출
		 arc.subString(5, 6); >>부터 까지 추출
		 arc.length() >>ㅇㅇ그거~ 길이~~~
		 arc.indexOf("p") >>해당 문구 추출  
		 .. arc.lastIndexOf("d") >>위랑 연계 : 뒤부터
		 arc.toUpperCase() >>대문자 
		 .. arc.toLowerCase() >>소문자
		 arc.trim() >>공백제거~~
		 arc.split(구분자) >> split 는 나뉘다~ 배열에 넣어줌. 
		 arc.replace(old, new) >>올드를 뉴로
		 int i = Integer.parseInt(arc); >>스트링을 인트로
		 double d = Double.parseDouble(arc); >>스트링을 더블로.
		 String s = valueOf(i) >>인트나 더블이나 뭐듯을 스트링으로
		 
		 parse
		 split subString
		 Atchar
		 replace
		 arc.LowerCase
		 arc.UpperCase
		 length
		 lastIndexOf
		 
		 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
