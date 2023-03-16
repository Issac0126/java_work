package chap1;

import java.util.Scanner;


public class Solution04copy {

	public static void main(String[] args) { 
		//수정용 카피문서 (사유: 더 효율적인 방법을 찾음...)

		Scanner sc = new Scanner (System.in);
		int number=0;//사용자가 입력할 전체학생 수
		while(true) {//전체 학생 수 등록 완료
			System.out.print("■ 전체 학생 수를 입력해주세요 \n> ");
			number = sc.nextInt();
			if(number<1) {
				System.out.println("1명 미만의 학생은 등록이 불가능합니다.\n");
			} else break; //1명 이상이면 break	
		}//전체 학생 수 등록 완료
		
		boolean[] students = new boolean[number]; //학생 수 임의조절 가능
		int count=0; //누락학생 수 확인용!
		
		
		System.out.println("──────────────────────────────────────");
		System.out.println("\n\n■ 과제를 제출한 학생의 출석번호를 입력해주세요.");
		System.out.println("제출을 마감하려면 '0'을 입력해주세요.\n");

		
		for(int i=0; i<students.length; i++) {
			System.out.print("출석번호 입력 > ");
			int good = sc.nextInt(); 
//			goodStu[i] = sc.nextInt(); //제출한 착한학생들 입력받기

			if(good==0) { //조기 마감창... 
				System.out.print("\n■ 과제 제출을 마감합니까? Y/N \n> ");
				String choise = sc.next();

				if(choise.equals("Y") || choise.equals("y") || 
					choise.equals("ㅛ")) {
					break;	//Yes
				} else if(choise.equals("N") || choise.equals("n") || 
						choise.equals("ㅜ")) {
					System.out.println("제출 마감을 취소합니다.");
				} else {
					System.out.println("\n유효하지 않은 입력입니다.");
				} //나중에 스위치문으로 바꿔보기
				
				System.out.println("출석번호 입력란으로 돌아갑니다.\n");
				i--;  continue; 
				//조기 마감창 끝!
			} else if (good<0 || good>students.length) { //이상한 출석번호 입력했을 경우!!
				System.out.println("잘못된 번호입니다. (1~"+number+")\n");
				i--;	continue;
			} 
			
//			for(int j=0; j<i; j++) { //중복 체크
//				if(goodStu[j]==goodStu[i]) {
//					System.out.println("이미 제출 처리된 번호입니다.\n");
//					i--; break;
//				}	}  //중복 체크 끝!
			
			if(students[good-1]==true) { //중복체크
				System.out.println("이미 등록된 번호입니다.");
				i--;  continue;
			} //중복체크 완료
			
			students[good-1] = true;
			count = i+1; //누락학생 수 확인용
			
		}//for문 끝!! 과제제출마감 땅땅땅

		System.out.println("\n\n과제 제출이 마감되었습니다.");
		System.out.println("──────────────────────────────────────");
//		System.out.println(Arrays.toString(goodStu)); //제출 어떻게 됐나 확인용
		System.out.printf("\n전체 학생 %d명 중 과제를 제출한 학생은 %d명입니다.\n", number, count);
		System.out.print("과제가 누락된 학생: ");

//		for(int i=1; i<=students.length;i++) {//중복확인 및 출력 Start
//			
//			boolean flag = false;
//			for(int j=0; j<students.length; j++) {
//				if(goodStu[j]==i) flag = true; //중복있으면 flag true
//			}
//			if(!flag) System.out.print((i)+"번 "); //1부터 끝번호까지 돌려서 중복이 없으면 출력
//		}//중복확인 및 출력! End
		
		for(int i=0; i<students.length; i++) {//중복확인
			if(!students[i]) {
				System.out.print((i+1)+"번 ");
			}		
		}//중복확인완료
		
		if(count==number) {//우와!
			System.out.println("없음.\n\n🎉 와! 모든 학생이 과제 제출을 완료했습니다! 🎉");
		}
		System.out.println();
		
		sc.close();
	}//main종료

}
