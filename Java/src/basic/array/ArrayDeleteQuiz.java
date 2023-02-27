package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
		System.out.println("현재 저장된 친구들: "+Arrays.toString(kakao));
		System.out.println("삭제를 원하는 친구를 입력하세요.");
		
		/* 
		 1.삭제할 친구를 입력받아서 삭제를 진행해 주세요.
		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.
		 */
		
		
		out : for(int i = 0; i<kakao.length; i++) {
			System.out.print("> "); //입력해라!
			String name = sc.next();
			
			for(int h=0; h<kakao.length; h++) {
				if(kakao[h].equals(name)) {
					System.out.println(name+"을(를) 삭제합니다.");
					
					while(h<kakao.length-1) { 
						kakao[h] = kakao[h+1]; //적발된 인덱스 h부터 하나씩 앞으로 떙겨오기.
						h++; //하나씩 올라가자
					}
					break out; //삭제 완료했으니까 이제 나가자.
				}
			}
			System.out.println("존재하지 않는 이름입니다."); //위 if에 안걸리면 존재하지 않는다는 뜻.
			System.out.println("다시 한 번 입력해주세요.");
			System.out.println();
			i -= 1;  //i 개수가 올라가지 않도록!
		}
		
		
		

		String temp[] = new String[kakao.length-1]; //temp 변수 생성
		for(int j = 0; j<temp.length; j++) temp[j] = kakao[j]; //temp 에다가 이미 떙겨둔 카카오 그대로 넣기. temp가 1 더 적으니까 temp의 -1만큼. 
		
		kakao = temp;
		temp = null; //kakao로 바꿔끼기
		
		System.out.println();
		System.out.println("삭제가 완료되었습니다.");
		System.out.println("현재 저장된 친구들: "+Arrays.toString(kakao));
		
		
		
		sc.close();
		
		
	}

}
