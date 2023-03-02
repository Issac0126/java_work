package basic.iiipractice;

import java.util.Arrays;
import java.util.Scanner;

public class iiiLotto0228 {


	static int[] num6lotto () {

		int[] num6 = new int[6];
		boolean flag = false;

		for(int i=0; i<6; i++) { //로또 진짜 구하기!
			int ran = (int) ((Math.random()*45)+1);

			flag=false;
			for(int j=0;j<=i;j++) {
				if(ran==num6[j]) {
					i--;  flag = true; //i 낮추고 플래그 세우고
					break;
				}
			}
			if(!flag) {
				num6[i] = ran;
			}//진짜 로또번호 구하기 완성!!!!
		}//6개 다 정해지면 나오기
		return num6;

	}//num6lotto end...  랜덤 6개의 숫자를 구하는 메서드

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int[] rightNum = new int[6]; //진짜 복권 당첨되는 번호
		int[] anNum = new int[6]; //직접 적은 번호
		int[] otNum = new int[6]; //오토로 뽑은 번호
		
		System.out.println("게임을 시작하려면 'Enter'를 눌러주세요.");
		sc.nextLine();
		
		int choise=0; //자동 수동 선택하기위한 선언
		System.out.println("■ 원하시는 서비스를 입력해주세요. \n자동입력(0) / 수동입력(1)");

		while(true) {//자동이냐 수동이냐로 돌려보장
			System.out.print("> ");
			choise = sc.nextInt(); //사용자가 선택한 자동수동 정보는 choise

			if(choise==0) {//자동일 경우
				//자동으로 6개의 난수를 뽑아줌.
				System.out.println("\n\n======================================");
				System.out.println("\n■ 번호가 자동으로 입력됩니다.");
				otNum=num6lotto();
				System.out.println("■ 뽑힌 번호는 "+Arrays.toString(otNum)+" 입니다.");
				break; //자동 뽑기 end!!

			} else if(choise==1) {//수동일 경우   //수동 6개의 난수를 입력.

				System.out.println("\n\n======================================");
				System.out.println("\n■ 번호를 수동으로 입력합니다.");
				
				for(int i=0; i<anNum.length; i++) {//수동 번호 입력 start
					System.out.print((i+1)+"번째 번호: ");
					anNum[i] = sc.nextInt();
					
					if(anNum[i]<1 || anNum[i]>45) { //1부터 45 숫자만 가능하다~
						System.out.println("1부터 45까지의 숫자만 입력이 가능합니다.\n");
						i--;
						continue;
					}
					for(int j=0; j<i; j++) {//중복 걸러내기
						if(anNum[i]==anNum[j]) {
							System.out.println("중복된 숫자는 입력이 불가능합니다.\n");
							i--;
							break;
						}
					}//중복 걸러내기.
				}//수동 번호 입력 end!!
				
				System.out.println("\n■ 입력한 번호는 "+Arrays.toString(anNum)+" 입니다.");
				break;

			} else {
				System.out.println("\n잘못된 입력입니다.");
				System.out.println("자동입력(0) / 수동입력(1) 중 하나를 입력해 주십시오.");
			}
		}//while end!! 사용자가 숫자 입력 완료.

		
		System.out.println("\n\n──────────────────────────────────────\n");
		System.out.println("결과를 확인 확인하려면 'Enter'를 눌러주세요.");
		sc.nextLine();
		sc.nextLine();
		System.out.println("\n\n======================================\n");
		
		System.out.println("당첨 번호를 추첨합니다.");
		System.out.println(".\n.\n.\n.");
		rightNum=num6lotto(); //정답 뽑기 두근두근
		
		System.out.println("\n\n당첨된 숫자는"+Arrays.toString(rightNum)+" 입니다!");
		
		if(choise==0)  anNum = otNum; // 수동입력 자동입력 합쳐주기!!
		System.out.println("\n입력한 숫자는"+Arrays.toString(anNum)+"입니다.\n");	
		
		
		int count=0;//몇 개 맞췄는지 카운트
		
		for(int i=0; i<6; i++) { //이제 얼마나 겹쳤는지 확인해보장...ㅎㅎ
			for(int j=0; j<6; j++) {
				if(rightNum[i]==anNum[j])   count++; //겹치면 카운트가 올라갑니당
			}
		}// 겹치는 숫자 세기 for문 end
		
		
		System.out.println("총 "+count+"개의 숫자를 맞추셨습니다.");
		switch(count) {
		case 6 :
			System.out.println("축하합니다! 1등입니다.");	break;
		case 5 :
			System.out.println("2등입니다!");			break;
		case 4 :
			System.out.println("3등입니다.");			break;
		case 3 :
			System.out.println("4등입니다.");			break;
		case 2 :
			System.out.println("5등입니다...");			break;
		case 1 : case 0 :
			System.out.println("꼴등입니다......");	break;
		}

		sc.close();

	}
}
