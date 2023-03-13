package etc.api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		 
		Random r = new Random();
		
		//실수 난수: 0.0 <= ~ < 1.0  이상 이하. 0점 대만 옴. 1점 이상은 안옴.
		double d = r.nextDouble();
		System.out.println(d);
		
		//정수 난수: nextInt();
		int i = r.nextInt(); //범위 안정해주면 int의 전범위
		System.out.println(i);
		
		//0~5 까지의 정수 난수 생성
		int j = r.nextInt(6); //6미만.
		System.out.println(j);
		
		//10~100까지의 정수 난수
		int l = r.nextInt(91)+10; //0~91 -> 10~101
		System.out.println(l);
		
		boolean flag = r.nextBoolean();
		System.out.println(flag);
		
		
	}

}
