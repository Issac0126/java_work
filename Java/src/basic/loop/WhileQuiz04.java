package basic.loop;

import java.util.Scanner;

public class WhileQuiz04 {

	public static void main(String[] args) {	
		/*
        1. 정수를 두개 입력받으세요. (x, y)
        2. x부터 y까지의 누적합계를 while을 사용하여 구하는 코드를 작성하세요.
        ex) 입력: 3, 7 -> "3부터 7까지의 누적합계: 25"

        처음에는 x에 무조건 작은 값이 들어올 것이라고 예상하고 작성하겠습니다.
        다 하신 분은 만약 x에 큰 값이 들어왔을 경우에는
        어떻게 대처할 지 생각해 보세요.
        (x에 큰 값이 들어와도 정상적으로 출력이 되었으면 좋겠습니다.
        입력: 7, 3 -> "3부터 7까지의 누적합계: 25")
        - while문을 if else 로 나눠서 두번 쓰는 것은 지양하겠습니다.
		 */

		Scanner sc = new Scanner (System.in);

		System.out.print("첫 번째 정수를 입력해주세요: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요: ");
		int num2 = sc.nextInt();

		int total = 0;
		int x, y;
		boolean flag = false;


		if(num1 < num2) {
			x = num1; y = num2;
		} else {
			y = num1; x = num2;
		} 

		//		int start = (num1 > num2 ? num2 : num1);
		//		int end = (num2 > num1 ? num1 : num2);

		while(x <= y) { //혹은, while(num1 < num2 ? num1 <= num2 : num2 <= num1);
			total += x++; //++x;가 아닌 x++;이므로 total+x 이후 x+1이 된다.
		}

		if(num1 == num2) {
			System.out.println();
			System.out.println("두 값이 동일합니다.");
			System.out.printf("두 수의 합은 %d입니다.", num1*2);
			flag = true;
		}

		if(!flag) {
			System.out.println();
			System.out.printf("두 수의 합은 %d입니다.", total);
		}
		sc.close();
	}

}
