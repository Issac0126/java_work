package basic.iiipractice;

import java.util.Scanner;

public class MegaCafeMain {

	static String drickOrder (int rd) { //메뉴 정하기~~
		String order=null;
		switch(rd){
		case 0 : 	order = "허니자몽블랙티/ICE";	break;
		case 1 : 	order = "복숭아티/ICE";		break;
		case 2 : 	order = "메가초코/HOT";		break;
		case 3 :	order = "아무튼맛있는음료수/ICE";	break;
		case 4 : 	order = "얼그레이티/HOT";		break;
		}
		return order;
	}
	
	static String[] right (int rd) {
		String[] rightOrder = new String[50];
		switch(rd){
		case 0 : break;
		}
		return rightOrder;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("감사합니다. 메가커피입니다.");
		System.out.println("주문 도와드릴까요?");
		sc.nextLine();
	
		int ra = (int) (Math.random()*5);
		
		System.out.println(drickOrder(ra)+" 하나 주세요!");
		System.out.println("\n───── 금방 만들어드리겠습니다 ♬ ─────\n");
		
		
		String[] answer = new String[50];
		int i=0;
		
		System.out.println("메뉴 입력을 종료하려면 '끝'을 입력해주세요.");
		while(true) {
			
			System.out.print((i+1)+". ");
			answer[i] = sc.nextLine();
			
			if(answer[i].equals("끝") || answer[i].equals("Rmx")) {
				System.out.println("\n메뉴 입력을 종료합니다.");
				break;
			} //메뉴 입력 종료!
			
			i++;
		}//while true end
		
		System.out.println("     * * *     ");
		System.out.println("\n\n정답 \t\t답안");
		System.out.println("────────────────────────────────");
		
		for(int j=0; j<i; j++) {
			if(right(ra)[j]==null) {
				right(ra)[j]= " ";
			}
			System.out.printf("%s\t\t%s\n", right(ra)[j], answer[j]);
			
		}
		
		
	}//main end
}
