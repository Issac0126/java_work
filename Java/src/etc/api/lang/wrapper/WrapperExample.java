package etc.api.lang.wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		
		int a = 100;
//		Integer a = new Integer(100);  이 두 개가 같은 뜻... 
		boolean b = false;
		char c = 'A';
		double d = 3.14;
		
		//boxing 기본 데이터타입을 객체타입으로 변환하는 과정 (권장X)
		Integer v1 = new Integer(100);
		Boolean v2 = new Boolean(b);
		Character v3 = new Character(c);
		Double v4 = new Double(3.14);
		
		//autoboxing: 기본 타입을 자동으로 객체형으로 변환.
		Integer x1 = a;
		Boolean x2 = b;
		Character x3 = 'A';
		Double x4 = 3.14;
		
		//autounboxing: 객체 타입을 기본형으로 해제.
		int i = x1;
		double d2 = x4;
		
		//AutoBoxing 이후에 wrapper 클래스는 문자열을 기본형으로
		//변환하는 데 많이 사용된다.
		
		//해당 타입으로 변환할 수 없는 문자열을 시도했을 경우
		//NumberFormatException 예외가 발생한다.
		
		
	}

}
