package basic.operator;

import java.util.Scanner;

public class ConOperatorQuiz {

	public static void main(String[] args) {

		//		int rd = (int) ((Math.random()*355)+42);
		//		System.out.println("발생한 난수값은 "+rd+" 입니다.");
		//		
		//		String sni = ((rd % 2)!=0) ? "홀수입니다." : "짝수입니다.";
		//		System.out.println(sni);
		//		
		//		System.out.println("----------------------------------");

		//		스캐너 만들어서 숫자 입력받고, 몇 개 일치하는지 출력되는 코드를 만들자!

		Scanner sc = new Scanner(System.in);

		int rn1, rn2, rn3, rn4, rn5, rn6;
		int total = 0;
		int ben1 = 0, ben2 = 0, ben3 = 0, ben4 = 0, ben5 = 0, ben6 = 0;


		System.out.println("자동입력(0) / 수동입력(1) 중 선택해주십시오.");
		System.out.print("> ");

		int coi = sc.nextInt();

		if(coi == 0) {
			ben1 = (int) ((Math.random()*45)+1);

			do {
				ben2 = (int) ((Math.random()*45)+1);
			} while(ben2 == ben1);

			do {
				ben3 = (int) ((Math.random()*45)+1);
			} while(ben3 == ben1 || ben3 == ben2);

			do {
				ben4 = (int) ((Math.random()*45)+1);
			} while(ben4 == ben1 || ben4 == ben2 || ben4 == ben3);

			do {
				ben5 = (int) ((Math.random()*45)+1);
			} while(ben5 == ben1 || ben5 == ben2 || ben5 == ben3 || ben5 == ben4);

			do {
				ben6 = (int) ((Math.random()*45)+1);
			} while(ben6 == ben1 || ben6 == ben2 || ben6 == ben3 || ben6 == ben4 || ben6 == ben5);

			System.out.printf("\n 자동 숫자는 %d, %d, %d, %d, %d, %d 입니다."
					, ben1, ben2, ben3, ben4, ben5, ben6);
		} 
		else if (coi == 1) {
			System.out.println();
			do {
				System.out.print("첫번째 번호를 입력하십시오: ");
				ben1 = sc.nextInt();
			} while(ben1 > 45 || ben1 < 1);

			do {
				System.out.print("두번째 번호를 입력하십시오: ");
				ben2 = sc.nextInt();
			} while(ben2 > 45 || ben2 < 1 || ben2 == ben1);

			do {
				System.out.print("세번째 번호를 입력하십시오: ");
				ben3 = sc.nextInt();
			} while(ben2 > 45 || ben2 < 1 || ben3 == ben1 || ben3 == ben2);

			do {
				System.out.print("네번째 번호를 입력하십시오: ");
				ben4 = sc.nextInt();
			} while(ben2 > 45 || ben2 < 1 || ben4 == ben1 || ben4 == ben2 || ben4 == ben3);

			do {
				System.out.print("다섯번째 번호를 입력하십시오: ");
				ben5 = sc.nextInt();
			} while(ben2 > 45 || ben2 < 1 || ben5 == ben1 || ben5 == ben2 || ben5 == ben3 || ben5 == ben4);

			do {
				System.out.print("여섯번째 번호를 입력하십시오: ");
				ben6 = sc.nextInt();
			} while(ben2 > 45 || ben2 < 1 || ben6 == ben1 || ben6 == ben2 || ben6 == ben3 || ben6 == ben4 || ben6 == ben5);

		} else {
			System.out.println("당신에게는 판매하지 않습니다.");
		}


		rn1 = (int) ((Math.random()*45)+1);
		do {
			rn2 = (int) ((Math.random()*45)+1);
		} while(rn2 == rn1);

		do {
			rn3 = (int) ((Math.random()*45)+1);
		} while(rn3 == rn1 && rn3 == rn2);

		do {
			rn4 = (int) ((Math.random()*45)+1);
		} while(rn4 == rn1 && rn4 == rn2 && rn4 == rn3);

		do {
			rn5 = (int) ((Math.random()*45)+1);
		} while(rn5 == rn1 && rn5 == rn2 && rn5 == rn3 && rn5 == rn4);

		do {
			rn6 = (int) ((Math.random()*45)+1);
		} while(rn6 == rn1 && rn6 == rn2 && rn6 == rn3 && rn6 == rn4 && rn6 == rn5);

		System.out.printf("\n 당첨된 숫자는 %d, %d, %d, %d, %d, %d 입니다."
				, rn1, rn2, rn3, rn4, rn5, rn6);

		if (ben1 == rn1 || ben1 == rn2 || ben1 == rn3 || ben1 == rn4 || ben1 == rn5 || ben1 == rn6) {
			total++;
		} 
		if (ben2 == rn1 || ben2 == rn2 || ben2 == rn3 || ben2 == rn4 || ben2 == rn5 || ben2 == rn6) {
			total++;
		}
		if (ben3 == rn1 || ben3 == rn2 || ben3 == rn3 || ben3 == rn4 || ben3 == rn5 || ben3 == rn6) {
			total++;
		}
		if (ben4 == rn1 || ben4 == rn2 || ben4 == rn3 || ben4 == rn4 || ben4 == rn5 || ben4 == rn6) {
			total++;
		}
		if (ben5 == rn1 || ben5 == rn2 || ben5 == rn3 || ben5 == rn4 || ben5 == rn5 || ben5 == rn6) {
			total++;
		}
		if (ben6 == rn1 || ben6 == rn2 || ben6 == rn3 || ben6 == rn4 || ben6 == rn5 || ben6 == rn6) {
			total++;
		}

		
		System.out.printf("\n 당신이 맞춘 숫자는 %d개 입니다.", total);
		System.out.println();


		switch(total) {
		case 6 :
			System.out.println(" 1등입니다! 당신은 짱입니다.");  break;

		case 5 :
			System.out.println(" 2등");  break;

		case 4 :
			System.out.println(" 3등");  break;

		case 3 :
			System.out.println(" 4등");  break;

		case 2 :
			System.out.println(" 5등");  break;

		default : 
			System.out.println(" 꼴등은 아무것도 없습니다."); break;

		}

		sc.close();
	}
}
