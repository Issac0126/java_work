package basic.switch_;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("성별을 입력하세요.(M/F)");
		System.out.print("> ");
		String gender = sc.next();
		
		
		switch(gender) {
		/*
		 - switch 키워드 뒤에 나오는 괄호는 boolean형 조건식이 아닌
		 변수나, 변수의 연산식을 적어야 하며, 타입은 정수, 문자열만 가능합니다.
		 
		 - switch 괄호 안에 지정한 기준값에 따라
		 만족하는 case문을 순서대로 탐색합니다.
		 적합한 case가 존재하는 경우에는 해당 case에
		 종속된 코드를 실행합니다.
		 따로 조치가 없다면 나머지 케이스들이 연속적으로 실행됩니다. 
		 */
		
		case "M": case "m": case "남자": case "남": case "남성": case "ㅡ":
			System.out.println("남자입니다."); 
			break; //해당 case만 실행하고 switch를 종료해라
		
		case "F": case "f": case "여자": case "여": case "여성": case "ㄹ":
			System.out.println("여자입니다.");
			break;
			
		default:  //case를 설정하지 않은 값들은 모두 dafault로 온다.
			System.out.println("잘못된 입력입니다.");
			
		}
		
		
		
		

	}

}
