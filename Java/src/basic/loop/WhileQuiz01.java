package basic.loop;

public class WhileQuiz01 {
	public static void main(String[] args) {
		
		int i = 1; //
		int itotal = 0;
		
		while(i <= 30000) { //
			if(i % 258 == 0) {
				itotal++;
			} i++; //
			
		}
		System.out.println("1~30000까지의 수 중 258의 배수의 개수: " + itotal+"개");
		System.out.println();

		
		int x = 1, total = 0;  
		
		while(x <= 1000) {			
			if (1000 % x == 0) {
				total++;
			} x++;
		}
		
		System.out.println("1000의 약수의 개수: "+total+"개");

		
	}
}
