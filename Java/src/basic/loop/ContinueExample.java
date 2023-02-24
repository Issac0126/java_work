package basic.loop;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) continue;
			
			System.out.print(i + " ");
		}
			System.out.println("\n반복문이 종료되었습니다.");
		
		
	}

}
