package basic.if_;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		// if 안에 if 넣기 배우고와서 수정함.
		if(age >= 20) {
			if(age < 40) {
				System.out.println("청년층입니다.");
			} if(age < 70) {
				System.out.println("중년층입니다.");
			} if (age >= 70) {
				System.out.println("노년층입니다.");
			}
		} else if(age >= 17) {
			System.out.println("고등학생입니다.");
		} else if(age >= 14) {
			System.out.println("중학생입니다.");
		} else if(age >= 8) {
			System.out.println("초등학생입니다.");
		} else {
			System.out.println("미취학아동입니다.");
		}
		

	}

}
