package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {

		//		int i = 1; //
		//		int total = 0;	
		//		while(i <= 10) {
		//			total += i++;
		//		}

		int total = 0;
		for(int i=1; i<=10; i++) {
			total += i;
		}

		System.out.println(total);


		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		//가로로 출력해 보세요. (for)

		for(int n=1; n <=200;n++) {
			if(n % 6 == 0 && n % 12 != 0) {
				System.out.print(n +" ");
			}
		}

		
		//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요. (for)
		System.out.println();
		
		int to=0;
		for(int i=1; i <= 60000; i++) {
			if(i % 177 == 0) {
				to++;
			}
		}
		System.out.println("1부터 60,000까지의 정수 중 177의 배수는 "+to+"개 이다.");
		
		
		
		//입력받은 정수까지의 팩토리얼 값을 구하세요.
		// 팩토리얼) 5! 5x4x3x2x1
		
		System.out.println();
		
		Scanner sc = new Scanner (System.in);
		System.out.print("정수를 입력하십시오: ");
		int mu = sc.nextInt();
		System.out.println();
		
		int total2 = 1;
		for(int num = mu; num>=1 ; num--) {
			total2 *= num;
		}
		System.out.print( mu+"의 팩토리얼 값은 "+total2+"입니다.");
		

	}
}
