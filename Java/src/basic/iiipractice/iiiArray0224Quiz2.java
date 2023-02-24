package basic.iiipractice;

import java.util.Arrays;
import java.util.Scanner;

public class iiiArray0224Quiz2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		String[] foods = new String[50];

		System.out.println("먹고싶은 음식 이름을 입력해주세요. (입력이 끝나면 '배불러'를 입력해주세요.)");

		out : for(int i=0; i<foods.length; i++) {
			System.out.print("> ");
			String answer = sc.nextLine();

			if("배불러".equals(answer)) break;

			for(int j=0; j<i; j++) {
				if(answer.equals(foods[j])) {
					System.out.println("이미 존재하는 음식입니다.");
					i -= i;
					continue out;
				}
			}
			foods[i] = answer;
		}

		System.out.print("\n당신이 먹고싶은 음식: ");

		for(String f : foods) {
			if(f == null) continue;
			System.out.print(f + " ");
		}


	}
}
