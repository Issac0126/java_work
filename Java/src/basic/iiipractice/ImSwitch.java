package basic.iiipractice;

import java.util.Scanner;

public class ImSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출석번호를 입력해주세요: ");
		int bun = sc.nextInt();
		if(bun>25) {
			System.out.println("우리 반은 24번까지 있습니다. 다시 입력해주세요.");
		} else {
			switch(bun % 5) {
			case 0: 
				System.out.println("1조입니다.");		break;
			case 1: 
				System.out.println("2조입니다."); 	break;
			case 2: 
				System.out.println("3조입니다."); 	break;
			case 3:	
				System.out.println("4조입니다."); 	break;
			case 4:
				System.out.println("5조입니다."); 	break;
			}
			
			switch(bun % 5){
			case 0: case 1:
				System.out.println("앞분단입니다.");   break;
			case 2: case 3: case 4:
				System.out.println("뒷분단입니다.");   break;
			
		}
			switch(bun % 5){
			case 0: case 1:
				System.out.println("앞분단입니다.");   break;
			case 2: case 3: case 4:
				System.out.println("뒷분단입니다.");   break;
			
		}

	}
		
	}
	
}
