package basic;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		/*
		 # 스캐너를 사용하여 정수를 하나 입력받으세요.
		 
		 -입력받은 값이 7의 배수라면 "7의 배수입니다."를 축력.
		 -입력받은 값이 7의 배수가 아니라면 "7의 배수가 아닙니다."를 출력.
		 -입력받은 값이 0이라면 "0입니다."를 출력하세요.
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력해주세요.\n: ");
		int num = sc.nextInt();
		
		if ( 0 == num ) {
			System.out.print("\n 0입니다.");
		} else if (0 == (num % 7)) {
			System.out.printf("\n%d은(는) 7의 배수입니다.", num);
		} else {
		 System.out.printf("\n%d은(는) 7의 배수가 아닙니다.", num);
		}
		
		sc.close();
		
		
	}

}
