package basic.method;

import java.util.Arrays;

/*
 # 반환값, 반환 유형 (return value, return type)
 
 1. 반환값이란 메서드의 실행 결과값을 의미한다.

 2. 매개변수는 여러 개 존재할 수 있지만, 반환값은 오직 한 개만 존재한다.
 
 3. 전달되는 값의 타입을 반환 유형이라고 하며, 메서드를 선언할 때
 메서드 이름 앞에 반드시 반환 유형을 명시해야 한다. =반환유형: String, int 등의 데이터타입
 
 4. return 이라는 키워드를 사용하며 return 뒤에 전달할 값을
 지정한다. (변수, 상수)
 
 5. 반환값이 있는 메서드는 호출문 자체가 하나의 값으로 처리될 수 있기 때문에
 반환값을 다른 변수에 대입할 수도 있고, 다른 메서드의 매개값으로도 처리될 수 있다.
 
 6. 모든 메서드에 반환값이 필요하지는 않다. 메서드 실행 후에
 반환할 값이 딱히 없다면 return을 생략해도 무관함. 
 
 7. 이 떄, 메서드 선언할 때 반환유형을 비워두는 대신 
 void라는 키워드를 작성해야한다.
 
 8. 모든 메서드는 return을 만나면 강제로 메서드가 종료된다.
 따라서 조건문 없이는 return문 아래에 코드를 작성할 수 없다.
 void 메서드에서는 return 키워드를 탈출 기능으로 사용할 수 있다.
 
 */

public class MethodExample3 {

	static int add(int n1, int n2) { //반환값 5번 예시
		System.out.println("야~~");
		return n1+n2;
	}

	static int[] operateTotal(int n1, int n2){ //반환값 1번 예시
		return new int[] {add(n1,n2), n1-n2, n1*n2, n1/n2};
//		return n1-n2;  //return은 호출할 값을 고르는 동시에 메서드를 끝내는 역할도 함. break;마냥...
//		return n1*n2;  //때문에 return은 두개일 수가 없다. 
//		return n1/n2;
	}
	
	/*
	 1. 메서드 이름은 calcArrayTotal. 
	 2. 정수 배열을 하나 전달받아서 해당 배열 내부에 있는
	 모든 정수의 합계(int)와 평균(double)을 '배열'에 담아서
	 return 하는 메서드.
	 3. 2번에 정의한 조건대로 메서드를 선언하고, main에서 호출해서
	 합계와 평균(소수점 둘쨰 자리까지)을 출력해보기.
	 정수 배열: {57,89,78,91,93,47}
	 */
	
	//예제 풀어보기~~~~~
	static double[] calcArrayTotal(double...number) { // = double[] number

		double[] total= new double[2];//정답 넣을 배열
		for(int i=0;i<number.length;i++) { //= for(int n : number)
			total[0] += number[i]; //합계 구하는 for문
		}
		total[1] = (double)total[0]/number.length; //평균 구하기. 
//		return total;
		return new double[] {total[0], total[1]}; 
	}
	
	static void multi(int n1, int n2) {//나누기
		int result = n1*n2;
		System.out.printf("%d x %d = %d\n", n1, n2, result);
	}
	
	static void divide (int n1, int n2) { //나누기22 인데 0으로 나누기를 막음.
		if(n2==0) {
			System.out.println("0으로 나누면 안됩니다...");
			return;
		}
		int result = n1/n2;
		System.out.printf("%d / %d = %d\n", n1, n2, result);
	}
	
	

	public static void main(String[] args) {
		double[] number = {57,89,78,91,93,47}; //정수 배열 선언부터!!
		double[] right = calcArrayTotal(number); //정수배열->메서드를 통해 구한 값을 right 배열에 넣음. 

		System.out.printf("합계: %d\n평균: %.2f", (int)right[0], right[1]);
		//예제 끝~~

		System.out.println("\n====================================");

		/*
		 - 반환값이 없는 void 타입의 메서드는 값이 돌아오지 않기 떄문에
		 실행 결과를 변수에 저장할 수 없고, 다른 메서드의 매개값으로도
		 사용이 불가능하다.
		 - 반드시 단독 호출하여 사용해야 한다.
		 - void 메서드는 단순히 동작을 지시하는 역할을 수행한다.
		 */
		
		multi(10,7);  //void는 무조건 단일로만 쓰인다. 
//		int r4 = multi(10,7); (x) 
//		System.out.println(multi(10,7)); (x)
		multi((add(3,4)),(add(4,7)));
//		add(multi(4,4),multi5,6); (x)
		
		
		divide(20,0);
		
		
		
		System.out.println("\n====================================");
		int r1 = add(3,7);    // = int r1 = 10; 똑같다.
		int r2 = add(10,15);  // = int r2 = 25;
		int r3 = add(add(4,6), add(7,8));  // = int r3 = add(10,15);
		System.out.println(r3);

		int[] totalResult = operateTotal(30, add(2,4));
		System.out.println("30+6= "+totalResult[0]);
		System.out.println("30-6= "+totalResult[1]);
		System.out.println("30*6= "+totalResult[2]);
		System.out.println("30/6= "+totalResult[3]);
		
	
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
