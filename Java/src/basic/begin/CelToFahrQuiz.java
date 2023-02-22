package basic.begin;

import java.util.Scanner;

public class CelToFahrQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 섭씨온도: ");
		double c0 = sc.nextDouble();
		
		double f0 = c0*1.8+32;
		System.out.printf("\n 현재 섭씨온도는 %.1f℃이고, 화씨온도는 %.1f℉입니다.", c0, f0);
		
		sc.close();
		
	}

}
