package basic;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double gu, su, yo;
		
		do {
			System.out.print("국어 점수: ");
			gu = sc.nextDouble();
			if(100 < gu) {
				System.out.println("점수는 100을 초과할 수 없습니다.");
			}
		} while(100 < gu);
		
		do {
			System.out.print("영어 점수: ");
			yo = sc.nextDouble();
			if(100 < yo) {
				System.out.println("점수는 100을 초과할 수 없습니다.");
			}
		} while(100 < yo);
		
		do {
			System.out.print("수학 점수: ");
			su = sc.nextDouble();
			if(100 < su) {
				System.out.println("점수는 100을 초과할 수 없습니다.");
			}
		} while(100 < su);
		
		
		double score = (gu + yo + su)/3;
		System.out.printf("당신의 평균 점수는 %.1f점 입니다.\n", score);

		if(score >= 60 && score <= 100) {
			if(score >= 95) {
				System.out.println("당신은 A+입니다.");
			} else if(score >= 90) {
				System.out.println("당신은 A0입니다.");
			} else if(score >= 80) {
				System.out.println("당신은 B입니다.");
			} else if(score >= 70) {
				System.out.println("당신은 C입니다.");
			} else if(score >= 60) {
				System.out.println("당신은 D입니다.");
			} 
		} else if(score > 100){
			System.out.println("당신은 사람입니까?");
		} else {
			System.out.println("당신은 F입니다.");
		}

		sc.close();

	}


}
