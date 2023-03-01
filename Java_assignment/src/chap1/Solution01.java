package chap1;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {
		
		 //문제: nums 배열에서 가장 큰 값을 출력하는 코드를 작성합니다. 
		 
		
		Scanner sc = new Scanner (System.in);
		int[] nums = new int[10]; 

		System.out.println("값을 입력해주세요.\n");
		
		for(int i=0; i<nums.length; i++) {
			System.out.print((i+1)+"번째 값: "); //입력하세요 안내
			nums[i] = sc.nextInt(); //입력 받기
		}
		
		int max=0; //가장 큰 값 구하기
		for(int i =0; i<nums.length; i++) {
			if(max<nums[i]) max = nums[i];
		}
		
		//출력
		System.out.println("\n입력한 값 중 가장 큰 값은 "+max+"입니다.");
		
		
		sc.close();
		
	}

}
