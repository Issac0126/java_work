package basic.iiipractice;

import java.util.Scanner;

public class iii022701 {

	public static void main(String[] args) {
		String[] hello = new String[6];
		System.out.println(hello.length);
		Scanner sc = new Scanner (System.in);


		int i = 0;
		for(i=0; i<hello.length; i++ ) {

			System.out.print("입력하시오: ");
			String answer = sc.next();

			if("파이팅".equals(answer)) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			hello[i] = answer;

		}

		for(String h : hello) {
			if(h.equals("파이팅")) break;
			System.out.print(h+" ");
		}
		
		sc.close();

	}

}
