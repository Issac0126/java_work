package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);


		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		int coun = 0; //소수의 개수를 세는 수

		System.out.print("소수: ");
		for(int i=1; i<=num; i++) { //i는 바깥쪽 포문의 if로 소수 개수 세는용. 1~num

			int cnt = 0; //소수의 판별을 위해 약수의 개수를 세줄 변수. 0으로 리셋하기 위해 for 안에 넣기.
			for(int j=1; j<=i; j++) { //j는 약수판별용. 1~i   i가 3일때 j는 1, 2, 3이 돌아감. 
				if(i % j ==0) { //약수면은 cnt를 올리겠다. 
					cnt++;
				}
			}
			if(cnt==2) {
				System.out.print(i + " ");
				coun++;
			}
		}
		System.out.print("\n 소수의 개수: "+coun+"개");
		sc.close();
	}
	

}


/*
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		int coun = 0; //소수를 세는 수
		int j = 0;

		System.out.print("\n입력받은 수 -> "+num+"\n");
		System.out.print("소수: ");

		for(int n=num; 2<=n; n--) {

			for(j=2;n % j !=0;j++) {
			}
			coun++;
			System.out.print(n+" ");
		}

		System.out.println();
		System.out.println(coun+"개");

	}
 */


//		for(int i=2 ; num % i !=num ; i++) {
//			if (num % i ==0) {
//				total++;
//			}	
//		} 
//		if(total==1) {
//			coun++;
//		}



// 13에서 소수만 골라낸다 .
// 어 ? 소수다! 카운트 +1


