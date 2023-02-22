package basic.begin;

public class Identifier {

	public static void main(String[] args) {
		
		// 꼭 지켜야 할 규칙 (안 지킬 시 에러가 발생할 수 있습니다.)
		// 1. 식별자의 이름은 중복을 허용하지 않는다. 
		// 대/소문자를 철저하게*** 구분함.
		
		int age = 35;
//		int age = 40; (x) _ age로 이름이 중복됨.
		int Age = 40;
		// age와 Age로 이름이 중복되지 않음.
		
		System.out.println(age);
		System.out.println(Age);
		
		
		// 2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하면 안된다.
//		int 7hello = 365; (x)
		int hello700 = 7;
		int ho7ho = 50;
		
		
		// 3. 식별자 이름에 공백을 포함 불가.
//		int my birth day = 0126 (x)
		int myBirthDay = 0126;
//		int my_birth_day = 0126; _가능은 하나... 특수문자는 권장하지 않음.
		// 띄어쓰기를 못하는 대신, 연결자의 첫글자만 대문자로 표기하는 암묵적 룰이 있음. 
//		    =camel case 표기법. ^ㅁ^ 
		
		
		// 4.식별자 이름에 쓸 수 있는 특수문자는 언더바(_), 달러기호($)만 가능.
		// 단, 사용을 권장하지는 않는데, 해당 특수문자들은 사용처가 따로 있기 때문.
		String $hello_ = "안녕";
		
		
		// 5. 키워드(예약어)는 식별자 이름으로 사용 불가능.
		// 키워드는 이미 어떠한 기능을 내포하고 있는 지정 문자이기 때문.
//		int int = 21; (x)
//		String class = "클래스"; (x)
//		String Class = "클래스"; (권장X) 가능은 하나... 헷갈리니 권장X.
		String classname = "클래스";
		
		
		// 6. 한글이나 한자 같은 식별자 이름도 지정이 가능하다.
		// 하지만 권장하지는 않는다... 가독성이 떨어지고, UTF-8이 아닌 환경으로 들어가면 한글이 깨짐.
		int 숫자 = 10; 
		String 名 = "홍길동";
		System.out.println(숫자);
		System.out.println(名);
		
		double sosu = 6-2.5; 
		System.out.println(sosu);
		
	}

}
