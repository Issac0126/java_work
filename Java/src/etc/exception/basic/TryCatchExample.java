package etc.exception.basic;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		
		/*
		 # 예외 처리
		 - 개발자가 코드를 통해 처리할 수 있는 에러를 다루는 것. (=마일드 에러)
		 - 예외 처리는 오류 발생 가능성이 있는 부분에 대한 처리를
		 미리 준비하는 것이다. (시스템 스스로 오류 복구X)
		 - 시스템의 비정상적 종료를 막고 코드의 흐름이 계속될 수 있도록
		 사전에 준비하는 행위를 말한다.
		 */
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("정수1: ");
		int i = sc.nextInt();
		System.out.print("정수2: ");
		int j = sc.nextInt();
		
		System.out.println("\n나눗셈 시작!");
		try {
			//try 블록에는 예외 발생 가능성이 있는 코드를 작성한다.
			//try는 단독사용이 불가능하다!
			System.out.printf("%d ÷ %d = %d\n", i, j, i/j);
		}catch(Exception e) {
			//catch 블록에는 try 블록에서 실제 예외가 발생했을 경우에
			//실행할 코드를 작성한다.
			System.out.println("0으로 나누지 마세요~~~");
		}
		
		sc.close();
		
		System.out.println("프로그램 정상 종료!");
		
	}

}
