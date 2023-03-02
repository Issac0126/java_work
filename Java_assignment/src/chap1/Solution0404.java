package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution0404 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		boolean student[] = new boolean[10];
//		System.out.println(Arrays.toString(student));
		
		
		System.out.println("입력하세요~~~ (1~10)");
		
		for(int i=0; i<student.length; i++) {
			System.out.print("> ");
			int goodStud = sc.nextInt();
			
			if(goodStud==0) break; //조기 마감창	
			if(goodStud<1 || goodStud>10) {
				System.out.println("유효하지 않은 번호입니다. (1~10)");
				i--;  continue;
			}
			if(student[goodStud-1]==true) { //중복체크
				System.out.println("이미 등록된 번호입니다.");
				i--;  continue;
			}
			student[goodStud-1] = true;
			
		}
		
//		System.out.println(Arrays.toString(student));
		System.out.print("\n제출 안한 사람: ");
		for(int i=0; i<student.length; i++) {
			if(student[i]==false) {
				System.out.print((i+1)+"번 ");
			}
		}
		
		
		
	}
}
