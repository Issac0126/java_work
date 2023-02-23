package basic.iiipractice;

import java.util.Scanner;

public class iiiLoopNestingQuiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력: ");
		int num = sc.nextInt();
		int count = 0; //최종 소수의 수

		System.out.print("\n소수: ");
		for(int i=1;i<=num;i++) {

			boolean flag=false; //for에서 약수를 세기 전에 소수 판단을 위해 다시 리셋해두기. 
			
			for(int ya=2 ; ya<i ; ya++) { //ya= i가 약수임을 구하기위해 1씩 올라가는 수. num이 8이라면, 2부터 7까지 중 소수가 있냐 없냐를 판별해줌. 
				if(i % ya ==0) {
					flag=true; //너 소수 아니다.
				}
			}
			if(!flag) {
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println("\n1부터 "+num+"까지의 숫자 중, 소수는 "+count+"개 입니다.");
		
		sc.close();



	}

}
