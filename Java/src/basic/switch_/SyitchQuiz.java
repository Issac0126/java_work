package basic.switch_;

import java.util.Scanner;

public class SyitchQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 값을 입력해주세요: ");
		int num1 = sc.nextInt();
		
		System.out.print("연산 기호를 입력해주세요(+, =, ×, ÷): ");
		String giho = sc.next();
		
		System.out.print("두번째 값을 입력해주세요: ");
		int num2 = sc.nextInt();
		
		System.out.println("───────────────────────────────────");
		
		/*
		switch(giho) {
		
		case "+":
			if(num1 == 1 && num2 == 1) {
				System.out.println("창문😊");
			} else {
				System.out.print("두 수의 덧셈결과는 "+(num1+num2)+" 입니다."); 	
			} break;
		
		case "-":
			System.out.print("두 수의 뺄셈결과는 "+(num1-num2)+" 입니다."); 	break;
			
		case "*": case "x": case "×":
			if(num1 == 2 && num2 == 9) {
				System.out.println("이 구 아나");
			} else if(num1 == 6 && num2 == 3) { 
				System.out.println("63빌딩ㅎ");
			} else {
				System.out.print("두 수의 곱셈결과는 "+(num1*num2)+" 입니다.");
			}	break;
			
		case "/": case "÷":
			if(num2 == 0) {
				System.out.print("두번째 값이 0일 경우 나눗셈은 진행되지 않습니다."); 	break;
			} else {
				System.out.print("두 수의 나눗셈결과는 "+(num1/num2)+" 입니다.");
			} break;
			
		default:
			System.out.println("계산이 진행되지 않았습니다.");
			System.out.print("유효한 연산 기호(+, =, ×, ÷)를 입력해주십시오.");
			break;
		} */
		
		
		//또 다른 방법222222222222222222!!
		
		int result = 0;
		boolean flag = false;
		
		switch(giho) {
		case "+":
			result = num1 + num2;
			break;
			
		case "-":
			result = num1 - num2;
			break;
			
		case "*": case "x": case "×":
			result = num1 * num2;
			break;
			
		case "/": case "÷":
			if(num2 == 0) {
				System.out.print("두번째 값이 0일 경우 나눗셈은 진행되지 않습니다.");
				flag = true; 	break;
			}
			result = num1 / num2;
			break;
			
		default:
			System.out.println("계산이 진행되지 않았습니다.");
			System.out.print("유효한 연산 기호(+, =, ×, ÷)를 입력해주십시오.");
			break;
		}
		
		if(!flag)	{
			System.out.printf("%d %s %d = %d\n", num1, giho, num2, result);
		}
		
	}

}
