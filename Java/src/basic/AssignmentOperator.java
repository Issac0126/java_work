package basic;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		/* 
		 # 대입 연산자 (=)
		 # 복합 대입 연산자 (+=, -=, *=, /=, %=)
		 - 변수에 값을 대입할 때 사용하는 연산자.
		 - 복합 대입 연산자는 대입 연산자에 산술 연산자가
		 결합되어있는 형태.
		 
		 	/ = 나눗셈 중 몫
		 	% = 나눗셈 중 나머지 
				예제) 7 % 3=1  20 % 5=0
		*/
		
		int a = 5;
		int b = 5;
		
		a += 3;  //a = a+3 와......; 기존 값을 누적해서 연산하고 싶을때 대입함.
		System.out.println(a);  // =8
		
		System.out.println("-----------------------------------");
		
		//a는 8인 상황
		
		a -= 4; // 8-4 4
		System.out.println(a);
		
		a *= 6; // 4*6 = 24
		System.out.println(a);
		
		a /= 5; // 24/5 = 4
		System.out.println(a);
		
		a %= 3; // 4%3 = 1
		System.out.println(a);
		
		
		
	}
}
