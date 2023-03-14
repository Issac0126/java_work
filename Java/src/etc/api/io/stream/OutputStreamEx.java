package etc.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {
		
	/*
	 1. 파일을 쓸 때 (작성) 사용하는 클래스는 FileOutputStream 입니다. 
	 2. 생성자의 매개값으로 파일을 쓸 전체 경로를 지정합니다. 
	 3. io패키지의 모든 클래스들은 생성자에 throws 키워드가 있기 때문에	
	 try-catch 블록을 항상 작성해야 한다. 
	 */
		
		
		Scanner sc = new Scanner (System.in);
		System.out.print("파일명: "); //동일한 파일명을 써도 에러는 나지 않지만 덮어쓰기당한다. 
		String fileName = sc.next();
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(
					"C:\\work\\file\\"+fileName+".txt");
			System.out.print("문장을 입력하세요: ");
			sc.nextLine();
			String str = sc.nextLine();
			
			byte[] arr = str.getBytes(); //문자열 데이터를 byte 단위로 변환
			
			fos.write(arr); //파일을 바이트 단위로 써 내림.
			//빨간 줄 생긴 이유: 얘도 thouws 포함되어있음.
			System.out.println("파일이 정상적으로 저장되었다.");
			
			
		} catch (Exception e) { //경로가 존재하지 않으면 에러가 난다.
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				sc.close();
				//try 밖이라서 닫지를 못함. 
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
		
		
		
		
		 // 백슬레시가 두번인 
		
		
		
		
		
		
		
		
		
	}

}































