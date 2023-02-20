package basic;

public class CastingExample1 {

	public static void main(String[] args) {
		
		byte b = 10;
		int i = b;
		System.out.println(i);
		//이 식에서 i는 int, b는 byte로 타입이 다름. 
		//그러나 int가 byte보다 크기 때문에
		//byte를 int로 올려 문제없이 출력함.
		
		char c = 'A';
		int j = c;
		System.out.println("A의 문자 번호: " + j);
		
		int k = 500;
		double d = k;
		System.out.println(d);
		
		/*
		 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		 자바 가상 머신(JVM)이 자동으로 타입을 올려서 변환해줌.
		 (파일의 Promotion, 혹은 UpCasting이라고 부름.)
		 */
		
//		byte < short < char < int < long < float < double 
		
	}

}
