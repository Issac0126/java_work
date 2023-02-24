package basic.array;

public class enhancedForLoop {

	public static void main(String[] args) {
		/*
		 # 향상된 for문 (forEach)
		 - 제어변수(인덱스)의 사용 없이 배열 내부의 요소를
		 전체 참조할 수 있게 해 주는 반복문.
		
		 ex )
		 for(배열 요소를 받아줄 수 있는 변수 : 배열변수명){
		 	반복 실행문
		 }
		 */
		
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		
		/* 일반 for문을 이용한 코드
		for(int i =0; i<week.length; i++) {
			System.out.println(week[i]+"요일 좋아~");
		}*/ 
		
//		for(String day : week) { //인덱스0부터 한바퀴 돌 때마다 다음 요소로 가서 반복. 모든 요소를 반복시키고 나면 for이 종료됨.
//			System.out.println(day+"요일 좋아~");
//		}
		
		
		System.out.println("---------------------");
		
		int[] scores = {96, 88, 74, 63, 100, 55};
		int sum=0;
		
		for(int ham : scores) {
			sum += ham;
		}

		System.out.printf("총점: %d \n평균: %.2f", sum, sum/(double)scores.length);
		
		
		
		
	}

}
