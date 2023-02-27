package basic.loop;

import java.util.Iterator;

public class BreakExample1 {

	public static void main(String[] args) {
		

		for(int i =1; i<=10;i++) {
			
			
			if(i>7) {
				break;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("\n반복문이 종료되었습니다.");
		
		System.out.println("-------------------");
		
		/*
		 - 내부 반복문에 포함된 break로 바깥쪽 반복문까지 한번에
		 종료시키고 싶다면 바깥쪽 반복문에 label을 붙입니다.
		 그리고, break 선언 시 label까지 함께 선언한다.
		 */
		
		
		outer: for (int i=0 ; i<=2 ; i++) {
			
			for(int j = 0 ; j<=1 ; j++) {
				if(i==j) {
					break outer;
				}
				
				System.out.println(i + "-" +j);
			}
		}
		
		
	}

}