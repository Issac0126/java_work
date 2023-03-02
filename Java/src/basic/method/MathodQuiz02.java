package basic.method;

import java.util.Arrays;

public class MathodQuiz02 {

	static String[] foods = {"떡볶이", "치킨", "파스타"};
	
	//배열의 맨 마지막 위치에 데이터를 추가하는 함수
	//기존 배열보다 크기가 하나 큰 배열을 선언해서 값 그대로 내리기
	// -> 매개값으로 온 값을 마지막에 채우기.
	static void push (String newFood) { 
		
		String[] temp = new String[foods.length+1];
		for(int i=0;i<foods.length; i++) {
			temp[i]=foods[i];
		}	
		temp[temp.length-1] = newFood;
		foods=temp;
		return;
	}//push end~~
	
	
	//배열 내부 데이터 단순 출력 함수
	static void printFood() {
		System.out.println(Arrays.toString(foods));
	}//printFood end~~
	
	
	//배열 내 특정 음식의 위치를 찾아주는 함수 (존재하지 않는다면 -1)
	//반복문 이용해서 돌리면 됩니다.
	static int indexOf(String targetName) {
		for(int i=0; i<foods.length; i++) {
			if(foods[i].equals(targetName)) {
				return i;
			} 
		}//for문 끝~~
		return -1;
	}//indexOf end~~~
	
	
	
	//특정 음식의 배열 포함 여부 (참/거짓)
	//indexOf의 리턴값으로 판단하여 리턴. (한줄짜리ㅇㅇ)
	static boolean include(String targetName) {
		return indexOf(targetName) != -1; // 온 값이 -1이 아니다 -> 맞으면 true, 틀리면 false
//		if(indexOf(targetName)==-1) {
//			return false;
//		} else {
//			return true;
//		}
	}//include end~~~
	
	
	//특정 음식 제거 함수
	//앞에서 진행한 배열의 삭제 로직.
	static void remove(String targetName) {
		String[] temp = new String[foods.length-1];
		
		if(indexOf(targetName)==-1) {//존재여부판단
			System.out.println("\n"+targetName+"은(는) 목록에 없는 음식입니다.");
		} else { //존재한다! -1이 아니다!!
			for(int j=indexOf(targetName); j<foods.length-1;j++) {
				foods[j]=foods[j+1];
			}
			for(int n=0; n<foods.length-1; n++) {
				temp[n]=foods[n];
			}
			foods=temp;
		}
	}//remove end~~
	
	
	//특정 음식 수정 메서드
	//한줄짜리~~
	static void modify(int targetIdx, String newFood) { //타겟인덱스 지정하고 뉴푸드로 수정하기
		foods[targetIdx]=newFood;
	}
	
	
	
	public static void main(String[] args) {
		
		printFood(); //라면과 김치찌개 추가하기~~
		push("라면");
		push("김치찌개");
		push("돈까스");
		printFood();
		System.out.println("\n * * * \n");
		
		
		//파스타와 김치찌개의 인덱스를 알아내세요.
		System.out.println("파스타의 인덱스 번호: "+indexOf("파스타")); 
		System.out.println("파스타의 인덱스 번호: "+indexOf("김치찌개"));

		indexOf("짜장면"); //짜장면의 인덱스를 알아내세요. -> -1(배열에 없다는 뜻)을 리턴하기. 
		System.out.println("짜장면의 인덱스 번호: "+indexOf("짜장면"));
		System.out.println("\n * * * \n");
		
		
		remove("김치찌개");  //김치찌개 삭제
		printFood();
		remove("망고"); //망고 삭제 -> 존재하지 않는 음식명입니다.
		printFood();
		System.out.println("\n * * * \n");

		
		//라면과 양념치킨의 존재 여부
		System.out.println("라면의 존재 여부: "+include("라면"));
		System.out.println("양념치킨의 존재 여부: "+include("양념치킨"));
		System.out.println("\n * * * \n");
		
		
		//2번 인덱스 데이터를 닭갈비로 수정
		modify(2, "닭갈비");
		printFood();
		
		//뭐라도 쓰고 있어야지 졸리다 .. 뭐라도 쓰고 있어야지 
		/*
		 졸리다 뭐라도써야지아야어여오요우유 각자의 이름이 있을 ㅓㄳ이고 가갖의 나이가 있을 것이고 
		 스마트폰의 유무도 체크할 수 있다. 
		 그 외 더 넣어도 된다.ㅏ 모든 것은 설계하기 나름.
		 이런 정보를 가진 사람을 꽝꽝 도장찎듯 찍어낼 것이다. 
		 개념설명인드.ㅅ 
		 자주 사용한다면 
		  클래스 선언. =모두가 저런 집을 가진다.
		  이따 같이 만들어본대영
		  설계용 클래스는 메인 메소드가 없다. 어?? 진짜??? main 컨트롤 스페이스바
		  할 필요가 없다 . ㅇㅇ . 
		  메인 메소드는 하나 이상 필요하다. 그래야 실행이 된다. 
		  new 모시기 로 객체를 생성할 수 있다. 
		  new Scanner? ? new int[] ?? 
		  new 클래스이름
		  
		  
		 */
		
		
		
		
		
	}

}
