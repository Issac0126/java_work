package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FoodManager {

	public static void main(String[] args) {
		
		Map<String, Integer> foods = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 음식점 메뉴판 관리 프로그램 ***");
		
		back : while(true) {
			
			System.out.println("\n\n# 1. 메뉴 등록");
			System.out.println("# 2. 메뉴 전체보기");
			System.out.println("# 3. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();
			
			System.out.println("--------------------------------");
			
			if(menu == 1) {
				/*
				 - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다.
				  이미 존재하는 메뉴명이 들어왔다면 '이미 존재하는 메뉴입니다.'
				  를 출력하시고 메인 메뉴로 돌아와 주세요.
				 - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
				 */
				System.out.print("\n등록할 메뉴를 입력해주세요: ");
				String foodName = sc.next();
				System.out.print(foodName+"의 가격을 입력해주세요: ");
				int foodPrice = sc.nextInt();
				
				if(foods.containsKey(foodName)) {
					System.out.println("이미 존재하는 메뉴입니다.");
					continue;
				}
				foods.put(foodName, foodPrice);
				System.out.println(foodName+" 메뉴가 등록되었습니다.");
				
				
			} else if(menu == 2) {
				/*
				 - 만약 메뉴가 하나도 등록되어 있지 않다면
				  '메뉴부터 먼저 등록해 주세요!' 출력 후 메인 메뉴로 이동시켜
				  주세요. 
				 
				 - Map의 모든 요소를 반복문을 이용하여 출력해 주세요.
				 ex)
				    메뉴명 : 가격
				    메뉴명 : 가격
				    메뉴명 : 가격....
				  
				  메뉴를 모두 출력 후에 선택지를 제공하세요.
				  (1. 수정 | 2. 삭제 | 3. 취소)
				  - 수정: 수정할 메뉴명을 입력받아서 가격 수정을 진행하세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				   
				  - 삭제: 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				   
				  - 취소: 메인 메뉴로 이동
				 */
				
				if(foods.isEmpty()) {
					System.out.println("메뉴를 먼저 등록해 주세요!");
					continue;
				}
				
				Set<String> keyfood = new HashSet<String>();
				keyfood = foods.keySet();
				for(String f : keyfood) {
					 System.out.println(f+" : "+foods.get(f));
				}
				System.out.println("\n메뉴 출력이 모두 완료되었습니다.\n");
				System.out.print("1. 가격 수정 | 2. 삭제 | 3. 취소\n> ");
				int answer = sc.nextInt();
				
				switch(answer) {
				case 1 : 
					System.out.print("\n수정할 메뉴의 이름을 입력해주세요: ");
					String change = sc.next();
					if(!foods.containsKey(change)) {
						System.out.println("해당 메뉴는 등록되지 않은 메뉴입니다.");
						break;
					}
					System.out.print("\n가격을 입력해주세요: ");
					int changePrice = sc.nextInt();
					
					foods.put(change, changePrice);
					System.out.printf("%s의 가격이 %d원으로 수정되었습니다!", change, changePrice);
					break;
				case 2 :
					System.out.print("\n삭제할 메뉴의 이름을 입력해주세요: ");
					String remove = sc.next();
					if(!foods.containsKey(remove)) {
						System.out.println("해당 메뉴는 등록되지 않은 메뉴입니다.");
						break;
					}
					foods.remove(remove);
					System.out.print(remove+" 메뉴가 삭제되었습니다! ");
					break;
				default : 
					System.out.println("메인 메뉴로 이동합니다.");
					break;
				}

			} else if(menu == 3) {
				/*
				  - Y / N를 입력받아서 Y가 입력되면 프로그램 종료.
				   그 이외의 값은 종료 취소를 진행해 주세요.
				 */
				outer: while(true) {
					System.out.print("프로그램을 종료하시겠습니까? [Y/N]\n>");
					String yn = sc.next();
					
					switch (yn) {
					case "y": case "Y": case "ㅛ":
						System.out.println("\n프로그램이 종료되었습니다.");
						sc.close();
						break back;
					case "n": case "N": case "ㅜ":
						System.out.println("메인 메뉴로 돌아갑니다.");
						break outer;
					default:
						System.out.println("\n유효한 답변이 아닙니다. ");
						continue;
					}
				}
			} else {
				System.out.println("유효한 값을 입력해주세요.");
			}
		} //while end
		
		

	}

}
















