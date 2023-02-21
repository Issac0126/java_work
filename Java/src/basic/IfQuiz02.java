package basic;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 첫 번째 값을 입력해주세요. \n 값: ");
		double num1 = sc.nextDouble();

		System.out.print("2. 두 번째 값을 입력해주세요 \n 값: ");
		double num2 = sc.nextDouble();
		
		if(num1 > num2) {
			System.out.printf("\n첫 번째 %.1f의 값이 두 번째 %.1f의 값보다 큽니다.", num1, num2);
		} else if(num1 == num2) {
			System.out.printf("\n첫 번째 %.1f의 값과 두 번째 %.1f의 값은 같습니다.", num1, num2);
		} else {
			System.out.printf("\n첫 번째 %.1f의 값이 두 번째 %.1f의 값보다 작습니다.", num1, num2);
		}
	
		sc.close();
	}

}
