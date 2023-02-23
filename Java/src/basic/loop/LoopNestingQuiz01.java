package basic.loop;

public class LoopNestingQuiz01 {

	public static void main(String[] args) {
		/*
        1. 구구단을 다음과 같이 가로로 출력해 보세요.

        2단: 2x1=2 2x2=4 2x3=6 .....
        3단: 3x1=3 3x2=6 3x3=9 .....
        4단: 4x1=4 4x2=8 4x3=12 .....

        2. 구구단을 다음과 같이 세로로 출력해 보세요.
        각 단의 간격은 탭 하나로 고정하겠습니다.
        2단         3단
        2x1=2      3x1=3
        2x2=4      3x2=6
        2x3=6      3x3=9
        .
        .
        .
		 */

		int num1, num2;

		for(num1=2; num1<=9 ; num1++) {
			System.out.print(num1+"단: ");
			for(num2=1;num2<=9;num2++) {
				int num12 = (num1*num2);
				if(num12<10) {
					System.out.printf("%d×%d=%d  ", num1, num2, num12);
				} else {
					System.out.printf("%d×%d=%d ", num1, num2, num12);
				}
			} System.out.println();
		}

		System.out.println("\n───────────────────────────────────────\n");

		for(int i=2;i<=9;i++) {
			System.out.print(i+"단 \t");
		} System.out.println();

		for(num2=1;num2<=9;num2++) {
			for(num1=2;num1<=9;num1++) {
				System.out.printf("%d×%d=%d \t", num1, num2, (num1*num2));
			} System.out.println();
		}


	}

}
