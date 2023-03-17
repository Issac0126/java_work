package chap2.quiz02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {
	
	static Random r = new Random();
	
	static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수 6개 다 맞춤
	static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수 5개+보너스 맞춤
	static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수 5개 맞춤
	static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수 4개 맞춤
	static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수 3개 맞춤
	static int failCnt = 0; //꼴등 횟수를 세 줄 변수
	
	
	public static Set<Integer> createLotto() {
		/*
		 - 1 ~ 45 범위의 난수 6개를 생성하셔서
		  컬렉션 자료형에 모아서 리턴해 주세요.
		  무엇을 쓰든 상관하지 않겠습니다.
		  중복이 발생하면 안됩니다.
		 */
		Set<Integer> rightnum = new HashSet<>();
		while(rightnum.size()<6) {
			rightnum.add(r.nextInt(45)+1);
		}
		return rightnum;
		
	} //createLotto end
	
	
	//보너스 번호를 생성하는 메서드
	public static int createBonusNum(Set<Integer> right) {
		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
		  당첨번호들을 피해서 보너스번호 하나만 뽑아 주세요.
		  범위는 마찬가지로 1~25 사이의 난수입니다.
		 */
		while(true) {
			int num = r.nextInt(45)+1;
			if(!right.contains(num)) {
				return num;
			} 
		} //while end
	}// 보너스 생성 끝!
	
	
	//당첨 등수를 알려주는 메서드
	public static void checkLottoNumber(
			List<Integer> rightlist, Set<Integer> myLotto, int bonNum) {
		/*
		 매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
		 내 로또 번호와 당첨번호를 비교하여
		 일치하는 횟수를 세 주신 후 등수를 판단하세요.
		 판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
		 6개 일치 -> 1등
		 5개 일치 + 보너스번호 일치 -> 2등
		 5개 일치 -> 3등
		 4개 일치 -> 4등
		 3개 일치 -> 5등
		 나머지 -> 꽝
		 */
		
		int count=0;
		for(int j=0; j<6; j++) {
			if(myLotto.contains(rightlist.get(j))) {
				count++;
			}
		}
		
		switch(count) {	
		case 6 : 	prize1++; break;	
		case 5 : 
			if(myLotto.contains(bonNum)) prize2++;//만일 보너스넘버와 같다면
			else	prize3++;	break;
		case 4 : 	prize4++;	break;
		case 3 : 	prize5++;	break;
		case 2 : case 1 : case 0 :	failCnt++; 	break;
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {

		//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.
		//보너스번호도 하나 고정시키세요. 
		final Set<Integer> right = createLotto(); //확정
		final List<Integer> rightlist = new ArrayList<>(right); 
		final int bonNum = createBonusNum(right); //보너스
		Set<Integer> myLotto = new HashSet<>(); //내꺼
		
		long i=0L;
//		System.out.println(right); //정답확인용
//		System.out.println(bonNum);
		
	while(true) {
		/*
		 - 1등이 당첨 될 때까지 반복문을 돌립니다.
		 - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
		  반복문을 종료합니다.
		 - 로또를 구매하기 위한 금액도 출력하세요. (long)
		 */
		
		i++;
		System.out.println("로또 "+i+"장 째 구매 중...");
		myLotto = createLotto();
//		System.out.println(myLotto); //구입 확인용

		checkLottoNumber(
				rightlist, myLotto, bonNum); //결과확인
		
		if(prize1>0) {	break; //1등 당첨!!
		}
		

	} //while true end
	
	
	System.out.println("\n────────────────────────────────\n");
	System.out.println(i+"번만에 1등이 당첨되셨습니다!");
	System.out.println("2등 당첨 횟수: "+prize2+"번");
	System.out.println("3등 당첨 횟수: "+prize3+"번");
	System.out.println("4등 당첨 횟수: "+prize4+"번");
	System.out.println("5등 당첨 횟수: "+prize5+"번");
	System.out.println("당첨되지 못한 횟수: "+failCnt+"번");
	System.out.println("복권에 사용한 금액: "+i*1000+"원");
		
		
	}

}









