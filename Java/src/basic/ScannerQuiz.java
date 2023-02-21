package basic;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해 주세요: ");
		String name = sc.next();
		
		System.out.print("나이를 입력해 주세요: ");
		int age = sc.nextInt();
		int year = 2023 - age;
		
		System.out.printf("\n이름: %s \n나이: %d세 \n출생년도: %d년 "
				, name, age, year);
		
		
		sc.close();
		

	}

}
