package basic.iiipractice;

import java.util.Scanner;

public class iiiLoopNestingQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		int count = 0;
		boolean flag=false;

		System.out.print("소수: ");
		for(int i=1; i<=num;i++) {

			flag=false;
//			int yaksum=0; //밑에서 약수의 개수를 세고 옴. 
			
			for(int yak=2;yak<i;yak++) { //2 ~ (num-1) 사이에서 깃발이 들린다 = 너는 소수가 아니다.
				if(i % yak ==0) {
//					yaksum++; //약수의 개수 +1  약수 구하는 공식: (7 % (1234567) ==0 ) = 입력한 수 % (순차적으로올라가는수) ==0 
					flag=true;
				}
			}
			if(!flag) { //현재 yak의 약수 개수가 2개냐(=소수냐?) 묻기.
				count++; //소수면 개수 올려
				System.out.print(i+" "); //소수니까 바로 출력
			}
		} 
		System.out.println("\n1부터 "+num+"까지 중 소수의 개수: "+count);
		
		sc.close();



		// 정수 하나 받기 -> for문 적고, 안쪽 for문으로 1부터 순차적으로 올라가며 약수부터 구함(약수를 구해서 약수의 수가 2면 if 활성화. 즉, 해당되는 약수 숫자 출력. )
		// 바깥 for에서 if활성화=count 개수 +1. 
		// num의 수만큼 반복하다 num를 초과하면 바깥쪽 for도 종료. 합산된 count 개수 출력. 



	}

}
