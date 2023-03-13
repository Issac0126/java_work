package etc.api.util.arrays;

import java.util.Arrays;

/*
        - 참가한 사람의 이름이 담긴 배열 participant와
        완주한 사람의 이름이 담긴 배열 completion이 주어질 때
        완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
 */

public class ArraysQuiz {

	public static String solution (String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i=0;
		for(i=0; i<participant.length; i++) {
			if(Arrays.binarySearch(completion, participant[i])<0) {
				break; 
			}
		}
		return participant[i];
		
//		for(int j=0; j<completion.length; j++) { //두번째 선생님 방법
//			if(!participant[j].equals(completion[j])) {
//				return participant[j];
//			}
//		}
//		return participant[participant.length-1];
		
	}
	
	public static void main(String[] args) {
		
		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"};
		String[] completion = {"홍길동", "김길동", "박영희", "김철수"};
		
		System.out.println("완주하지 못한 사람: "+solution(participant, completion));
		
		
	}

}
