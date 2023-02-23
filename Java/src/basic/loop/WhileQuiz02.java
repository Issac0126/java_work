package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num1, num2;
		num1 = 1;
		num2 = 1; //

//		System.out.println("구구단을 입력하세요.");
//		System.out.print("> ");
//		num1 = sc.nextInt(); 
//		System.out.println();
		
		System.out.println("*** 구구단을 외우자 ***");
		
		while(num2 <= 9 && num1 <= 9) { //
			System.out.printf(" %d×%d=%d  ", num1, num2, (num1*num2));
			if((num1*num2) < 10) {
				System.out.print(" ");
			} 
			if(num1 == 9) {
				System.out.println();
				num2++; num1 = 0;
			}
			num1++; //
		}	
		sc.close();

	}

}
