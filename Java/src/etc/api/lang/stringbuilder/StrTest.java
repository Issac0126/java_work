package etc.api.lang.stringbuilder;

public class StrTest {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		/*		
		//String test
		String str = "a";
		for(int i=1; i<=500000; i++) {
			str +="a"; //a가 추가될 때마다 계속 가져다 버림.
		}
		 */
		
		StringBuilder sb = new StringBuilder("a");
		for(int i=1; i<=500000; i++) {
			sb.append("a"); //버리지 않고 바로 생성해줌.
		}
		
		
		long end = System.currentTimeMillis();
		System.out.println("실행 결과: "+(end-start)*0.001+"초");

		
		
		
		
		
	}

}
