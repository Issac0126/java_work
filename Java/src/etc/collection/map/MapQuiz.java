package etc.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz {

	public static void main(String[] args) {
		/*
        1. engKor이라는 이름으로 Map을 생성해 주세요.
         이 Map은 key로 영단어, value로 한글 뜻을 삽입할 겁니다.
         
        2. 사용자에게 영단어를 입력받아서, 이미 Map에 존재하는 단어라면
         다시 입력받으세요. (이미 존재한다는 메세지 출력)
         영단어 입력창에 '그만' 이라고 입력하면 입력을 종료해 주세요.
         
        3. 영단어 입력 후에는 한글 뜻을 입력받아서 Map에 삽입해 주세요.
        
        4. 입력이 종료되면, 반복문을 이용해서 
        영단어 : 뜻
        영단어 : 뜻
        영단어 : 뜻.... 형태로 입력받은 영단어와 뜻을 모두 출력해 주세요.
        */
		
		Scanner sc = new Scanner (System.in);
		Map<String, String> engKor = new HashMap<>();  //1번
		
		while(true) {
			System.out.print("영단어: ");
			String answEn = sc.next();
			
			if(answEn.equals("그만")) { //나가기 버튼 만들어주기
				System.out.println("입력을 종료합니다.");
				break;
			} //2-2번. 나가기.
			
			if(engKor.containsKey(answEn)) { //중복 거르기
				System.out.println("이미 입력된 영단어입니다.");
				continue;
			} else { //중복이 아님!
				System.out.print("단어 뜻: ");
				String answKo = sc.next();
				engKor.put(answEn, answKo); //3번 완료
				System.out.println("영단어 등록 완료!\n");
			}
		}//반복문 end
		
		System.out.println("\n\n영단어\t:\t뜻");
		System.out.println("─────────────────────────────");
		
		Set<String> eng = engKor.keySet();
		for(String e : eng){ //반복문으로 출력~~~
			System.out.println(e + "\t:\t"+engKor.get(e));
		}
		
		sc.close();
		
		
		
		
       
		
		
		
		
		
		
	}

}
