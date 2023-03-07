package chap2.quiz02;

public class MainClass {

	public static void main(String[] args) {
		/*
		 1. Main 메서드에서 Car 객체를 적절한 모델명과 함께 생성합니다.
		2. 시동을 걸지 않은 상태에서 속도를 올려 봅니다.
		3. 그 후 시동을 걸고 변속기를 D 모드로 지정한 후 속도를 100까지 올립니다.
		4. 속도가 100인 상태에서 시동을 한 번 꺼 봅니다. 
		5. 속도를 완전히 줄인 후 변속기를 P 모드로 지정하고 시동을 끕니다.
		 */
		
		System.out.println("1. ");
		Car car = new Car("붕붕카"); //1. 생성
		
		System.out.println("\n2. ");
		car.setSpeed(50); //속도 올려보기
		
		System.out.println("\n3. ");
		car.engineStart(); //시동을 걸고
		car.setMode('D'); //변속기 D 설정
		car.setSpeed(100); //속도 100까지 올려보기
		
		System.out.println("\n4. ");
		car.engineStop(); //시동을 꺼보자
		
		System.out.println("\n5. ");
		car.setSpeed(0); //속도를 완전히 줄인 후
		car.setMode('P'); //변속기를 P 모드로 지정하고
		car.engineStop(); //시동을 끄자
		
	}
}
