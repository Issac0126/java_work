package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {
		/*
        # UP&DOWN 게임을 제작합니다.
        1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
        2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
        작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
        정답에 근접할 수 있도록 유도해 주세요.
        3. 승리 조건 횟수는 7회로 제한하겠습니다.
        7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
        정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
        +n번 만에 맞췄는지도 판단하기.
		 */


		Scanner sc = new Scanner (System.in);

		int right = (int) ((Math.random()*100)+1); //정답
//		System.out.println(right); //정답
		System.out.println("*** UP & DOWN 게임 ***");
		System.out.println("# 1부터 100까지의 정수 중 어느 숫자가 선택되었을까요?");
		int answer; //사용자가 입력할 값
		int count = 7; //도전횟수

		while(true) {

			System.out.print("\n> ");
			answer= sc.nextInt();
			count--;
			
			if(answer>100 || answer<1) {
				System.out.println("1부터 100까지의 유효한 숫자를 입력해주십시오.");
				count++;
				continue;
			}
			
			
			if(answer==right) {
				System.out.println("정답입니다!");
				System.out.println((8-count)+"번 만에 정답을 맞추었습니다.");
				break;
			} 
//			else if(answer>100 || answer<1) { //유효하지 않은 숫자 거르기
//				System.out.println("1부터 100까지의 유효한 숫자를 입력해주십시오.");
//				count++;
//			} 
			else if(right>answer) System.out.println("Up!   / 남은 정답 기회: "+(count));
			else System.out.println("Down! / 남은 정답 기회: "+(count)); 
			
			if(count<1) {
				System.out.println("준비된 기회를 모두 소진하였습니다.");
				System.out.println("정답은 "+right+"입니다.");
				break;
			}
			
		}
		sc.close();

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
