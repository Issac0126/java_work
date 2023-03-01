package chap1;

import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {

		//scores 배열에 존재하는 점수에 순위를 매겨서 출력하는 프로그램 입니다.

		Scanner sc = new Scanner (System.in);
		int[] scores = new int[5]; 
		System.out.println("점수를 입력해주세요.\n");

		for(int i=0; i<scores.length; i++) {
			System.out.print((i+1)+"번째 점수: "); //입력받기
			scores[i] = sc.nextInt(); //입력받기22
		} //입력 받기 완료


		int[] rank = new int[5]; //순위 넣을 배열

		for(int i=0;i<scores.length;i++) {
			int count = 1; //순위 셀 카운트. 한바퀴마다 리셋

			for(int j=0;j<scores.length;j++) {
				if(scores[i] < scores[j]) count++; //본인보다 높은 정수가 있을 때마다 카운트가 올라감.
			}	
			rank[i] = count; //랭킹 배열에 넣어주기
		}


		System.out.println("\n\n점수\t순위");
		System.out.println("─────────────");

		for(int i=0;i<scores.length; i++) {	
			System.out.printf("%d\t %d위 \n", scores[i], rank[i]);
		}

		sc.close();








	}

}
