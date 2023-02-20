package basic;

public class VariableExample {

	public static void main(String[] args) {
		/*
		 변수 (Variable)
		 
		 1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
		 (pit에서의 별칭개념과 유사함.)
		 2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
		 적당한 데이터 타입을 선언해야 합니다.
		 int: 4바이트의 정수, String: 문자열(문장)
		 3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
		 4. 변수 내부의 값은 언제든지 변경이 가능합니다.
		  */

		//변수의 선언: [자료형(데이터 타입)] [변수명];
		int age; 
		
		//변수의 초기화: [변수명] = [값];  (여기서 초기화란, 리셋이 아닌 초기 상태 지정을 뜻함.)
		age = 40;
		
		
		//변수의 값 참조(사용)
		
		System.out.println(age);
		
		//변수는 선언과 초기화를 동시에 할 수 있습니다.
		//(단, 처음 만드는 한번만 가능합니다.)
		int score = 90; 
		//    int score = 90; int score = 95; 중복선언 불가능.
		//단,  int score = 90; score = 95; 는 가능. (공간이 아닌 값만을 지정해 바꾸는 것이기 때문에.)
		// 변수 하나당 값을 하나밖에 대입할 수 없기 때문에 기존 값이 소멸하고 새로운 값이 할당됩니다.
		System.out.println(score);
		
		String hi = "good morning";
		hi = "안녕";
		System.out.println(hi);
		
		int myScore = score+1;
		System.out.println(myScore);
		
		//변수의 자료형에 맞지 않는 데이터는 저장이 불가능합니다.
//		int count = "한번"; (x)  문자라서 안됨.
//		int count = 23.5; (x)  소수점이라서 안됨.
//		String str = 100; (x) 숫자라서 안됨. 
		
		//변수는 자료형(데이터 타입)이 달라도 이름이 동일하다면 중복 선언할 수 없습니다.
		String name = "홍길동";
		
		//선언 및 초기화하지 않은 변수는 사용이 불가능합니다.
//		int result = myScore + num;(x) 
	}

}
