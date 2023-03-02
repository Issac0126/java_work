package basic.method;

public class MethodQuiz01 {

	static int calcDivisor (int x) {
		System.out.print(x+"의 약수: ");
		int count=0;
		
		for(int i=1; i<=x; i++) {
			if(x % i == 0) {
				System.out.print(i+" ");
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		System.out.println("\n72의 약수는 총 "+calcDivisor(72)+"개 입니다.\n");
		System.out.println("\n10의 약수는 총 "+calcDivisor(10)+"개 입니다.");
		
	}

}
