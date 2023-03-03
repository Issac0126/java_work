package oop.constructor;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class BreadMain {
	
	
	
	public static void main(String[] args) {
	
		/*
		 - 객체를 생성하지 않았을 때의 예시를 보고
		 빵 객체를 생성할 수 있는 클래스(설계도)를 작성해 보세요.
		 클래스 이름은 Bread로 통일하겠습니다.
		 
		 - BreadMain에서 똑같이 피자빵, 초코케이크의 정보를
		 호출해 보세요. (생성자는 마음대로!)
		 */
		
		System.out.println("==============================");
		
		Bread pizzaBread = new Bread("피자빵", 500, "밀가루");
		pizzaBread.info();
		
		System.out.println();
		
		Bread chocoCake = new Bread("초코케이크", 1500, "초콜릿");
		chocoCake.info();
		
		
		System.out.println("\n==============================\n\n");
		
		Scanner sc = new Scanner(System.in);
				
		
		System.out.println("입력을 중지하려면 '끝'을 입력해주세요.");
		
		
		String name[] = new String[51];
		int price[] = new int[51];
		String ingredient[] = new String[51];
		int i=0;
		
		
		while(true) {
			System.out.print("\n*********\n등록할 제품의 이름: ");
			name[i] = sc.next();
			if(i==name.length-1 || name[i].equals("끝") || name[i].equals("Rmx") ) {
				name[i] = null;
				break;
			}

			System.out.print("등록할 제품의 가격: ");
			price[i] = sc.nextInt();
			System.out.print("등록할 제품의 주 재료: ");
			ingredient[i] = sc.next();
			
			
			System.out.println();
			Bread breadName = new Bread(name[i], price[i], ingredient[i]);
			breadName.info();
			i++;
		}
		
		System.out.println("\n입력을 종료합니다.\n");
		System.out.println("┌──────[등록된 목록]───────┐");
		System.out.println("│ 제품명\t 가격\t 주 재료\t │");
		System.out.println("│                        │");
		

		for(int j=0; j<name.length; j++) {
			if(i<=j) {
				break;
			}
			System.out.printf("│ %s\t│ %d원\t│ %s\t │\n",name[j], price[j], ingredient[j]);
		}
		System.out.println("└────────────────────────┘");
		
		
//		System.err.println("입력을 종료합니다.");
//		System.err.println();
		
//		Bread breadbbb = new Bread(bbb[], 1500, "초콜릿");
//		breadbbb.info();
		
		
		
		
		
		
		
		
		
		
		
	}

}
