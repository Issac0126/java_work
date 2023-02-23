package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		/*
		 -미션: 정수 하나를 입력받아서 해당 정수가 소수(prime number)
		 인지를 판별하기.
		 */
		Scanner sc = new Scanner (System.in);
		
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		int i = 1;
		int count = 0; 
		
//		while(i <= num) {
//			if(num % i ==0) {
//				count++;
//			} i++;
//		}
//		if(count == 2) {
//			System.out.println(num+"은(는) 소수입니다.");
//		} else {
//			System.out.println(num+"은(는) 소수가 아닙니다.");
//		}
		
//		System.out.println((count==2) ? num+"은(는) 소수입니다." : num+"은(는) 소수가 아닙니다.");
		
		System.out.println("---------------------------------");
		
		int j = 2; //1은 모든 수의 약수이기 때문에 배제. +어차피 1은 소수가 아니다.
		
		while(num % j !=0) {
			j++;
		}
		System.out.println(num==j ? num+"은(는) 소수입니다." : num+"은(는) 소수가 아닙니다.");
		
		sc.close();
	}

}
