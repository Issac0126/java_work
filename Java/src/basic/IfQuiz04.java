package basic;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.print("값을 입력하세요.\n:");
		double num1 = sc.nextDouble();
		System.out.print("값을 입력하세요.\n:");
		double num2 = sc.nextDouble();
		System.out.print("값을 입력하세요.\n:");
		double num3 = sc.nextDouble();

		double max, mid, min;
		
		
		
		if(num1 > num2 && num1 > num3)  { //num1이 max인 경우 
			if(num2 > num3) {
				max = num1;  mid = num2; min = num3; 
			} else {
				max = num1;  mid = num3; min = num2;
			}
		} else if (num2 > num1 && num2 > num3) { //num2이 max인 경우 
 			if(num1 > num3) {
				max = num2;  mid = num1; min = num3;
			} else {
				max = num2;  mid = num3; min = num1;
			}
		} 	else if (num1 > num2) { //num3이 max인 경우, 312 
			max = num3;  mid = num1; min = num2;
		} else { //num3이 max인 경우, 321
			max = num3;  mid = num2; min = num1;
		} 
		
		System.out.printf("가장 큰 값은 %.1f이고, 중간 값은 %.1f, 가장 작은 값은 %.1f입니다."
				,max, mid, min);

		sc.close();

	}

}
