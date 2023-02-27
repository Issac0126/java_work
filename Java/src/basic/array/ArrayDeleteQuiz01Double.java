package basic.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayDeleteQuiz01Double {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		
		String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
		System.out.println("현재 저장된 친구들: "+Arrays.toString(kakao));
		System.out.println("삭제를 원하는 친구를 입력하세요.");
		
		/* 
		 1.삭제할 친구를 입력받아서 삭제를 진행해 주세요.
		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.
		 */
		
		boolean flag = false;
		
		System.out.print("> "); //입력해라!
		String name = sc.next();
		
		for(int i = 0; i<kakao.length; i++) { //이름 찾는 로직
			if(kakao[i].equals(name)) {
				flag = true; 
				for(int j=i; j<kakao.length-1;j++) {
					kakao[j] = kakao[j+1];
				}
				break;
			}
		}
		
		if(!flag) System.out.println("없는 이름입니다.");
		else {
		String[] temp = new String[kakao.length-1];
			for(int k =0; k<temp.length; k++ ) {
				temp[k] = kakao[k];
			}
			
			kakao =temp;
			temp=null;
			System.out.println(Arrays.toString(kakao));
		}
		
		
		sc.close();
		
	
		
		
		
	}

}
