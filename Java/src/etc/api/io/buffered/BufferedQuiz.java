package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {
		
		/*
        1. Date클래스를 이용해서 file폴더 내에 하위 경로로
         오늘 날짜 20211111file 이라는 이름으로 폴더를 생성하세요.  ok
        2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.  ok
        3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
         파일을 작성합니다. 
         (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
          연결해 주시면 됩니다.)
        4. '그만'으로 파일이 작성되었다면, 아무방법으로나 
         파일을 읽어서 콘솔에 출력해 보세요.
        */
		
		
		Scanner sc = new Scanner(System.in);
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd"); 
		//양식용이기 때문에 변수를 새로 만들어야된다. today 활용 불가능!
		String todayFormat = today.format(dtf);
		//String으로 받아주어야 함. 
		
		File newFile = new File("C:\\work\\file\\"+todayFormat+"file");
		
		System.out.println("폴더를 생성합니다.");
		if(!newFile.exists()) {
			newFile.mkdir();
			System.out.println(".\n.\n! 폴더 생성 완료 !");
		} else {
			System.out.println("이미 생성된 파일입니다.");
			System.out.println("해당 단계를 건너뜁니다.");
		} //1번 완료!
		
		
		BufferedWriter bw = null;
		String str = "";
		
		System.out.print("\n파일명: ");
		String fileName = sc.next();
		sc.nextLine();
		
		try { //파일명 제작
			bw = new BufferedWriter( //파일제작 
				new FileWriter("C:\\work\\file\\"+todayFormat+"file\\"+fileName+".txt"));
			
			while(true) { //열심히 속내용 작성하자
				System.out.print("내용: ");
				String text = sc.nextLine();
				
				if(text.equals("그만")) {
					System.out.println("입력을 종료합니다.");
					break;
				}
			str += (text+"\r\n");
			}
			
			bw.write(str);
			System.out.println("파일 작성 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		///////////////////////////////////////////////////////////
		
		FileReader fr = null;
		BufferedReader br = null;
		
			try {	
				fr =new FileReader("C:\\work\\file\\"+todayFormat+"file\\"+fileName+".txt");
				br = new BufferedReader(fr);
				
				System.out.println("\n\n입력한 메모를 불러옵니다.");
				String read;
				while((read = br.readLine()) != null) {
					System.out.println(read);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
					fr.close();
					sc.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
					
	
		
		
	}

}
