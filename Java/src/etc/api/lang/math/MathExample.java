package etc.api.lang.math;

public class MathExample {

	public static void main(String[] args) {
		
		//올림
		int i = (int) Math.ceil(1.1);
		System.out.println(i);
		
		//내림
		double d = Math.floor(1.6);
		System.out.println(d);
		
		//반올림 반올림은 무조건 소수점 첫째자리에서 반올림한다.
		double d2 = Math.round(3.141592);
		System.out.println(d2);
		//셋째자리에서 반올림하고 싶으면 밑의 방식대로 온점 옮기고 옮긴만큼 나누기.
		double d3 = Math.round(3141.592);
		System.out.println(d3/1000.0);
		
		//제곱  //더블로 주는거 잊지말기!
		double d4 = Math.pow(3.0, 4.0);
		System.out.println(d4);
		
		//최대값
		int max = Math.max(2, 10);
		System.out.println(max);
		
		//최소값
		int min = Math.min(24, 33);
		System.out.println(min);
	}

}
