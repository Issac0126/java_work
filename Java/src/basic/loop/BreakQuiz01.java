package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("***연산퀴즈***");
		System.out.println("# 0을 입력하면 연산퀴즈가 종료됩니다.");

		String gihonum = "0";
		int answer = 0; //사용자가 입력한 답
		int right = 0;  //실제 답
		int winCount = 0; 
		int loseCount = 0; //정답혹은 오답시 카운팅용

		while(true) {

			int num1 = (int) ((Math.random()*100)+1); 
			int num2 = (int) ((Math.random()*100)+1);
			int giho = (int) ((Math.random()*2)+1); //+1 안쓰고 0과 1로 구분할 수도 있긴 함. 
			if(giho==1) gihonum = "+"; //밑에 문제제시를 위해 변수 안에 +, - 기호 담아두기. 
			if(giho==2) gihonum = "-";	

			System.out.print(num1+gihonum+num2+"= ");  //문제 제시
			answer = sc.nextInt(); 

			if(giho==1) right = (num1+num2); //정답 미리 계산 
			if(giho==2) right = (num1-num2); 


			if(right==answer){ //정답과 입력문구가 같냐?
				System.out.println("정답입니다!");
				winCount++;
			} else if(answer==0) { //정답이 아니라 0을 입력해서 탈출을 시도한다면
				System.out.println("\n----------------------");
				System.out.println("정답 횟수: "+winCount);
				System.out.println("오답 횟수: "+loseCount);
				System.out.println("***연산퀴즈 수고하셨습니다!***");
				break;
			}	else { //같지 않냐?
				System.out.println("오답입니다.  정답: "+right);
				loseCount++;
			}
			System.out.println(); //문제 끝나고 다음 문제 전 엔터
		}

		sc.close();

	}

}
