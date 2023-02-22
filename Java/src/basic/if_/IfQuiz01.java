package basic.if_;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.print("키(Cm): ");
		double h0 = sc.nextDouble();
		
		
		if(190 >= h0 && h0 >= 140 && 69 >= age && age >= 8) {
			System.out.printf("\n%d세, %.1fcm로 놀이기구 탑승이 가능합니다. :D", age, h0);
		}
		else {
			System.out.printf("\n죄송합니다. %d세, %.1fcm로 놀이기구 탑승이 불가합니다.", age, h0);
		}
		System.out.println("\n오늘 하루 즐거운 시간 되세요!");
		
		
	sc.close();	
	}

}
