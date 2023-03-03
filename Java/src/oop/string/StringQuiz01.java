package oop.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		
		
		/*
		 1. 스캐너를 통해 id 입력 받습니다.
		 2. 천방지축 사용자는 id에 공백을 입력할 확률이 굉장히 높다.
		 3. 공백을 제거한 아이디가 5글자 미만이라면 다시 입력받으세요.
		 4. 5글자 이상 입력되었다면 "id가 등록되었습니다." 출력 후 종료하세요.
		 
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력해주세요: ");
			String answerId = sc.nextLine();
			
			if(answerId.replace(" ", "").length()>=5) {
				System.out.println("\nid가 등록되었습니다.");
				System.out.println("등록된 아이디는 "+answerId+"입니다.");
				break;
			}
			System.out.println("아이디는 5글자 이상이여야 합니다.\n");
			
		}
		
		
		
		
	}

}
