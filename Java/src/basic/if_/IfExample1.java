package basic.if_;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.println("내 점수는 "+ point + "점");
		
		System.out.println("───────────────────");
		
//		System.out.println(point >= 70);
		
		if(point >= 70) { 
			System.out.println("[경축!] 70점 이상으로 합격하셨습니다");
		}
		
//		if(point < 70) {
//		System.out.println("귀하는 필요점수 불충족으로 불합격하셨습니다.");
//	}
		
		else {
			System.out.println("70점 미만으로 불합격하셨습니다.");
		}
		
		System.out.println("시험 수고하셨습니다.");
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
