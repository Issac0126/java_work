package basic.loop;

import java.util.Scanner;

public class WhileQuiz03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.print("정수를 입력해주세요: ");
		int yak = sc.nextInt();
		int n = 1; //
		int total = 0;
		while(n <= yak) { //
			if(yak % n == 0) {
				total += n;
			}
			n++; //
		}
		
		System.out.println();
		System.out.println("숫자 "+yak+"의 약수의 총합: "+total);
		
		sc.close();

		
	}

}
