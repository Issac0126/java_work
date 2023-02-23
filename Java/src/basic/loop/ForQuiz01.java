package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {


		int ran = (int) ((Math.random()*18)+2);

		System.out.println("*** 구구단 "+ran+"단을 외우자! ***");
		
		for(int i=1 ; i<=19 ; i++) {
			if(i<10) {
				System.out.printf("\n %d × %d  = %d", ran, i, (ran*i));
			} else {
				System.out.printf("\n %d × %d = %d", ran, i, (ran*i));
			}
		}
		

	}
}
