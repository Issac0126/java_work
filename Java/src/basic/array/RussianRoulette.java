package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {

		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		 */
		Scanner sc = new Scanner (System.in);

		
		
		System.out.println("엔터를 누르면 게임을 시작합니다.");
		sc.nextLine();
		
		//게임 인원 입력
		int anPerson;

		while(true) { //인원수 이상하게 쓰면 반복.
			System.out.println("■ 게임에 참여할 인원을 입력해주세요.(2~4)");
			System.out.print("> ");
			anPerson = sc.nextInt();

			if(anPerson<2 || anPerson>4) {
				System.out.println("러시안 룰렛은 2~4명의 플레이어만이 참가가 가능합니다.");
				System.out.println("다시 입력해주세요.\n");
				continue;
			}
			break;
		}

		//플레이어 이름 등록
		//배열 하나 생성해서 플레이어들을 배치
		//배열의 크기는 게임 참가자의 명수와 동일.
		String[] person = new String[anPerson];
		System.out.println("\n■ 플레이어의 이름을 등록해주세요.");

		for(int i =0; i<person.length; i++) {
			System.out.print((i+1)+"번 플레이어 이름: ");
			person[i] = sc.next();
		}
		System.out.println("\n등록된 플레이어: "+Arrays.toString(person));
//		System.out.println("\n----------------------------------");





		//실탄 개수 입력. (1미만X, 5초과X)

		int anbullet;
		while(true) { //실탄 1~5개에서 벗어나면 반복.
			System.out.println("\n\n■ 실탄 개수를 입력해주세요. (1~5)");
			System.out.print("> ");
			anbullet = sc.nextInt();

			if(anbullet<1 || anbullet>5) {
				System.out.println("1~5개의 실탄만 장전할 수 있습니다.");
				System.out.println("다시 입력해주세요.\n");
				continue;
			}
			break;
		}//실탄 개수 받기 끝 

		//실탄을 탄창에 배치.
		boolean[] bulletPos = new boolean[6];

		//난수 생성, 생긴 난수번호 인덱스에 실탄 배치. (false -> true)
		//중복시 난수를 다시 생성하는 중복 방지 로직을 세운다. 같은 위치에 두개의 실탄이 장전되지 않도록 설계하기.
		for(int i=0; i<anbullet; i++) {
			int bulletra = (int) (Math.random()*bulletPos.length);	
//			System.out.println(bulletra);
			if(bulletPos[bulletra]==true) {
				i--;
				continue;	
			} else {
				bulletPos[bulletra] = true;
			}
		}//총알 배치 끝
		
		/*
		 선생님이 만드신 난수 생성 실탄 배치방법...
			횟수가 정확하면 for이 아니라 while을 이용하는 것이 쉽다. 
		
		int checkNum = 0; //실탄을 정확하게 장전한 횟수
		while(checkNum<anbullet) {
			int position = (int) (Math.random()*bulletPos.length);
			if(bulletPos[position]) {
				continue;
			} else {
				bulletPos[position] = true;
				checkNum++;
			}
		}//선생님 총알 배치 끝
		 */
		
		
//		System.out.println(Arrays.toString(bulletPos)); //트루 잘 나왔나 확인용~~
		System.out.println("\n==================================");


		//실행 순서 정하기
		//난수를 이용해서 실행 순서를 정한다.
		//시작 인덱스를 난수로 정해서 돌아가게 해도 되고, 아예 배치를 섞어도 무관함.

		int startPer = (int) (Math.random()*(person.length)); //시작하는 사람 랜덤뽑기.
		
		System.out.println("~ ＲＵＳＳＩＡＮ ＲＯＵＬＥＴＴＥ ！ Start ~\n");
		System.out.println("\n"+person[startPer]+"부터 차례대로 순서가 돌아갑니다.");
		System.out.println("엔터를 누르면 게임이 시작됩니다.");
		sc.nextLine();
		System.out.println("\n==================================\n\n");
		//일부러 입력 대기를 해서 흐름을 잠시 끊어준다. 
		//이 입력값(enter)는 받아서 활용할 것이 아니기 때문에 따로 변수를 선언하지 않는다.



		//최후의 1인이 남을 떄까지 게임 진행.
		//또는 총알을 다 소비할 때까지 게임 진행.
		//총알을 소모하면 true 값을 false로 변경해야 한다.
		//사람이 한 명 아웃되면 배열의 크기를 줄인다.
		
		int bulletCount=anbullet;
		while(true) {
//			System.out.println(Arrays.toString(bulletPos)); //트루 잘 나왔나 확인용~~
			System.out.println("■ "+person[startPer]+"의 차례입니다.");
			System.out.println("'Enter'를 누르면 격발됩니다.");
			sc.nextLine();
			
			int bang = (int) (Math.random()*6); //차례가 돌 때마다 탄창을 돌린다는 설정.
//			int bang = 0; //랜덤이 아니라 
			

			if(bulletPos[bang]==true) {
				System.out.println(".\n.\n.");
				System.out.println("빵!!");
				System.out.println("총알이 발사되었습니다.");	
				System.out.println(person[startPer]+" is Die...");	

				for(int i=startPer; i<person.length-1; i++) { 
						person[i] = person[i+1];
				} //하나씩 앞으로 땡기기
				
				String[] temp = new String[person.length-1];		
				for(int i=0; i<temp.length; i++) {
					temp[i] = person[i];
				} //temp에다가 담아서 1씩 줄이기. 
				
				person = temp; temp = null; //temp 버리기

				bulletPos[bang] = false;
				bulletCount -= 1;
				
			} else {
				System.out.println(".\n.\n.");
				System.out.println("총알은 발사되지 않았습니다.");
				startPer +=1; //다음 사람으로 간다. 
			}
			
//			bang += 1; //나중에 삭제할 예정	
			if(startPer >= person.length) { //시작사람이 더해지다 길이가 되면 리셋하라. (0부터 시작)
				startPer=0;
			}//다시 순서 0번부터 돌아가게 리셋.
			
		
			if(person.length==1) { //사람이 한 명 남으면 게임 종료
				System.out.println("\n남은 인원은 1명입니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}// 사람이 한 명 남아서 게임종료
			if(bulletCount==0) { //총알을 다 소비하면 게임 종료
				System.out.println("\n총알이 모두 소모되었습니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}//실탄 모두 소비로 게임 종료
			
//			System.out.println(Arrays.toString(bulletPos)); //트루 잘 나왔나 확인용~~
//			System.out.println(bang+1); //빵이 몇번이냐 확인용
			System.out.println("\n\n■ 현재 생존 인원: "+Arrays.toString(person));
			System.out.println("'Enter'를 눌러 새 총알을 장전합니다.");
			sc.nextLine();
			System.out.println("\n=========================\n");

		}

		System.out.println("\n=========================\n\n");
		System.out.println("■ 남은 총알 수: "+bulletCount);
		System.out.println("■ 생존 인원: "+Arrays.toString(person));
		System.out.println("~ ＲＵＳＳＩＡＮ ＲＯＵＬＥＴＴＥ ！ End ~\n");
		
		sc.close();















	}

}
