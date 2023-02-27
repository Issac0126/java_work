package basic.iiipractice;

import java.util.Scanner;

public class iii0224Quiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("\n연산기호[+, -, ×, ÷]: ");
		String giho = sc.next();
		System.out.print("\n정수2: ");
		int num2 = sc.nextInt();
		
		switch(giho) {
		
		case "+":
			System.out.printf("\n %d + %d = %d", num1, num2, (num1+num2));	break;
		
		case "-":
			System.out.printf("\n %d + %d = %d", num1, num2, (num1-num2));	break;
		case "*": case "x": case "×":
			System.out.printf("\n %d + %d = %d", num1, num2, (num1*num2));	break;
		case "/": case "÷":	
			System.out.printf("\n %d + %d = %d", num1, num2, (num1/num2));	break;
			
		default :


			
		}
		
		
		sc.close();
		
		
		
		
		
	}

}
