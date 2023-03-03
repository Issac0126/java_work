package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		
		/*
		 1. 주민등록번호 13자리를 입력받습니다.
		 2. 주민등록번호는 -을 포함해서 받을 예정입니다.
		 3. 13자리가 아니라면 다시 입력받습니다.
		 4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다. 
		 */
		
		

		Scanner sc = new Scanner(System.in);
		out : while(true) {
			System.out.print("주민등록번호 13자리를 입력해주세요. ('-'포함)\n> ");
			String answer = sc.next().trim();
			
			if(answer.length()!=14 || !answer.substring(6,7).equals("-")) {
				System.out.println("'-'을 포함하여 유효한 숫자를 입력해주세요.\n");
				continue;
			} else {
				switch(answer.charAt(7)){
				case '1' : case '3' :
					System.out.println("남성입니다.");
					break out ;
				case '2' : case '4' :
					System.out.println("여성입니다.");
					break out;
				default : 
					System.out.println("유효한 값을 입력해주세요.\n");
				}
			}
			
//			char an7 = answer.charAt(7); //키워드 챠로 변환
//			if(an7=='1' || an7=='3' ) {
//				System.out.println("남성입니다.");
//				break;
//			} else if (an7=='2' || an7=='4') {
//				System.out.println("여성입니다.");
//				break;
//			} else {
//				System.out.println("유효하지 않은 입력입니다.");
//			}

		}
		
		sc.close();
		
		
	}

}
