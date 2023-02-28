package basic.array;

import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		//실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수. 카운트가 100이 넘으면 입력 자체를 막기 위해.
		int count = 0; 

//		for(int p=0; p<99;p++) {
//			userNums[p] = String.valueOf(p);
//			names[p] = String.valueOf(p);
//			ages[p] = p;
//			departments[p] = String.valueOf(p);
//			count++;
//		}
		
		//사원 신규 등록, 목록, 정보 수정, 삭제, 프로그램 종료
		while(true) {
			System.out.println("\n=================사원 관리 프로그램=================");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");
			System.out.println("===============================================");

//			System.out.println(count);
			System.out.println("\n[메뉴이동]");
			System.out.print(" > ");
			int menu = sc.nextInt();
			System.out.println();

			if(menu==1) {
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)
				if(count==100) {
					System.out.println("사원 정보는 100명까지만 등록이 가능합니다.");
					continue;
				} //100명을 넘기면 작동하지 않음.
				
				System.out.println("신규 사원 정보를 입력합니다.");

				while(true) {
					System.out.print("사번: ");
					userNums[count] = sc.next();
					boolean flag = false;

					for(int j=0; j<count; j++) { //중복된 사번
						if(userNums[count].equals(userNums[j])) {
							System.out.println("중복된 사원번호입니다.");
							System.out.println("다시 입력해주십시오.\n");
							flag = true;
							break;
						} //중복될 경우 깃발 올리기.
					}
					if(!flag) { //중복이 아닐 경우에만 출력
						System.out.print("이름: ");
						names[count] = sc.next();
						System.out.print("나이: ");
						ages[count] = sc.nextInt();
						System.out.print("부서: ");
						departments[count] = sc.next();
						System.out.println("\n입력이 완료되었습니다.");
						System.out.printf("등록된 정보: %s. %s %d세 %s \n\n", userNums[count], names[count], ages[count], departments[count]);
						count += 1; //입력 완료되면 숫자 올리기.
						break;
					}
				}  //menu 1 while end

			} else if(menu==2) {
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.

				if(count==0) {
					System.out.println("등록된 사원 정보가 없습니다.");
					continue;
				} //등록된 정보가 없으면 그냥 내쫓음.
				
				System.out.println("┌───────────────전체 사원 정보────────────────┐");
				System.out.println("│   \t사원번호\t이름\t나이\t부서명\t   │");
				for(int i=0; i<count; i++) {
					System.out.printf("│ %d │\t%s\t%s\t%d세\t%s\t   │\n", i+1, userNums[i], names[i], ages[i], departments[i]);
				} 
				System.out.println("└──────────────────────────────────────────┘");
				System.out.println("\n사원 정보가 모두 출력되었습니다.\n");


			} else if(menu==3) {
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				if(count==0) {
					System.out.println("등록된 사원 정보가 없습니다.");
					continue;
				} //등록된 정보가 없으면 그냥 내쫓음.

				System.out.println("검색할 사원의 사번을 입력해주세요.");
				System.out.printf("> ");
				String anUserNums = sc.next();
				boolean flag = false;
				
				
				for(int j=0; j<count; j++) {
					if(userNums[j].equals(anUserNums)) {
						System.out.println("\n-----------해당 사원 정보-----------");
						System.out.println("사원번호\t이름\t나이\t부서명");
						System.out.printf("%s\t%s\t%d세\t%s\n", userNums[j], names[j], ages[j], departments[j]);
						System.out.println("---------------------------------");
						System.out.println("검색한 사원의 정보가 모두 출력되었습니다.\n");
						flag=true;
						break;
					} 
				}
				if(!flag){
					System.out.println("검색하신 사원번호는 등록되지 않은 번호입니다.");
					System.out.println("다시 입력해 주십시오.");
					continue;
				}


			} else if(menu==4) {
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.

				if(count==0) {
					System.out.println("등록된 사원 정보가 없습니다.");
					continue;
				} //등록된 정보가 없으면 그냥 내쫓음.

				boolean flag = false;
				System.out.println("수정할 사원의 사원번호를 입력해주세요.");
				System.out.printf("> ");
				String anChange1 = sc.next();

				chan : for (int j=0; j<count; j++) {
					if(userNums[j].equals(anChange1)) {
						flag=true;
						System.out.printf("\n사원번호: %s. %s님의 정보를 변경합니다.", userNums[j], names[j]);
						System.out.println("\n1. 나이변경 | 2. 부서변경 | 3.취소");
						System.out.printf("> ");
						int anChange2 = sc.nextInt();

						if(anChange2 == 1) {
							System.out.println("\n"+names[j]+"님의 나이 정보를 변경합니다.");
							System.out.println("현재 등록되어있는 나이는 "+ages[j]+"세 입니다.");
							System.out.print("새로 등록할 나이: ");
							int anChanAges = sc.nextInt();
							ages[j] = anChanAges;
							System.out.println("\n"+names[j]+"님의 나이가 "+ages[j]+"세로 수정이 완료되었습니다.\n");
							break chan;
						} else if(anChange2 == 2) {
							System.out.println("\n"+names[j]+"사원의 부서 정보를 변경합니다.");
							System.out.println("현재 등록되어있는 부서는 "+departments[j]+"입니다.");
							System.out.print("새로 등록할 부서: ");
							String anChanDepart = sc.next();
							departments[j] = anChanDepart;
							System.out.println("\n"+names[j]+"님의 부서가 "+departments[j]+"로 수정이 완료되었습니다.\n");
							break chan;
						} else {
							System.out.println("사원 정보 수정을 취소합니다.");
							break chan;
						}//else의 마지막
					} 
				}// end chan for
				if(!flag){
					System.out.println("검색하신 사원번호는 등록되지 않은 번호입니다.");
					System.out.println("다시 입력해 주십시오.");
					continue;
				}//없는 사번입니다 내쫓기.

			} else if(menu==5) {
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.

				if(count==0) {
					System.out.println("등록된 사원 정보가 없습니다.");
					continue;
				} //등록된 정보가 없으면 그냥 내쫓음.

				boolean flag = false;
				
				menu5 : while(true) {
					System.out.println("삭제할 사원의 사원번호를 입력해주세요.");
					System.out.printf("> ");
					String anDelete = sc.next();
					
					for (int j=0; j<count; j++) {
						if(userNums[j].equals(anDelete)) {
							flag=true;
							System.out.println("\n정말로 삭제하시겠습니까? Y/N");
							System.out.printf("> ");
							String anDeleteChoice = sc.next();
							
							if(anDeleteChoice.equals("Y") || anDeleteChoice.equals("y") || anDeleteChoice.equals("ㅛ")) {
								System.out.println(userNums[j]+"사원의 정보를 삭제합니다.");
								for(int d=j; d<count; d++) {
									if(d==userNums.length-1) {
										userNums[d] = null; 
										names[d] = null;
										ages[d] = 0;
										departments[d] = null;
										break menu5;
									} else {
										userNums[d] = userNums[d+1]; 
										names[d] = names[d+1];
										ages[d] = ages[d+1];
										departments[d] = departments[d+1];
									}
								} //삭제 완료
								System.out.println("삭제가 완료되었습니다.\n");
								count -= 1;
								break menu5;
							} else if(anDeleteChoice.equals("N") || anDeleteChoice.equals("n") || anDeleteChoice.equals("ㅜ")){
								System.out.println("삭제를 취소합니다.");
								System.out.println("메인메뉴로 돌아갑니다.\n");
								break menu5; //삭제 취소
							} else {
								System.out.println("\n잘못된 입력입니다.");
								continue;//이상한 답변
							} // Yes or No에 대한 대답 끝
						} 
					}//for문 끝		
					
					if(!flag) {
						System.out.println("검색하신 사원번호는 등록되지 않은 번호입니다.");
						System.out.println("다시 입력해 주십시오.\n");
						continue;
					} 
				}//menu5 while문 끝
				
				
			} else if(menu==6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; //while true break
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주십시오.\n");
			}

			
		
		} // end while true

		

	} //end main

}
