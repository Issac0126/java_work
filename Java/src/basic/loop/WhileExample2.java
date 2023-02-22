package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		// 48~ 150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		// 48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 된다!

		int i = 48; //

		while(i <= 150) {
			if((i % 8) == 0) {
				System.out.print(i+" ");
			}	
			i++;//
		}

		System.out.println();
		System.out.println();

		//1~100까지의 정수 중 4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력해 보세요.

		int x = 1; //비긴

		while(x <= 100) {  //엔드
			if(x % 4 ==0 && (x % 8) != 0) {
					System.out.print(x + " ");
			}
			x++; //스텝
		}












	}

}
