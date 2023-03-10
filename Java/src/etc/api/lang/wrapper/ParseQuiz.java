package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		String n7;
		String answer;
		
		while(true) {
			System.out.print("\n주민등록번호를 입력하세요.\n> ");
			answer = sc.nextLine();
			
			if(answer.length()!=14 ) { 
				System.out.println("주민등록번호 13자리를 입력해주세요.");  continue; //글자수세기
			} else if(answer.indexOf("-")==-1 || !(answer.substring(6,7).equals("-"))) {	
				System.out.println("하이픈(-)이 앞자리와 뒷자리 사이에 포함되어야 합니다.");	continue; 
			} //하이픈 위치랑 있는지 여부 묻기
			n7 = answer.substring(7,8); 
			if(!(n7.equals("1") || n7.equals("2") || n7.equals("3") || n7.equals("4"))) {
				//1,2,3,4가 아니면 false가 떠서 !로 인해 문장이 출력된다.
				System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
				continue; //뒷자리 숫자 묻기 
			}
			try {
				String test = answer.substring(0,6);
				String test2 = answer.substring(7);
				Integer.parseInt(test);
				Integer.parseInt(test2);
				break; //앞에서 안걸리면 브레이크
			} catch(Exception e) {
				System.out.println("올바른 정수를 입력해주세요.");
			} //catch end
		}
		
		int birth = Integer.parseInt(answer.substring(0,2));
		if(n7.equals("1") || n7.equals("2")) {	birth+=1900;
		} else {	birth+=2000;
		}//생년월일 계산하기
		
		int month = Integer.parseInt(answer.substring(2,4));
		int day = Integer.parseInt(answer.substring(4,6));
		
		String gender=null;
		if(n7.equals("1") || n7.equals("3")) { 	gender="남성";
		} else {	gender="여성"; 
		}
		
		System.out.printf("%d년 %d월 %d일 %d세 %s"
				,birth, month, day, 2023-birth, gender);
		
		
	}

}











