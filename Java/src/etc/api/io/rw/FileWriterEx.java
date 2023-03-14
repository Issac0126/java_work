package etc.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		
		/*
		 - 문자를 써서 저장할 때 사용하는 클래스 FileWriter.
		 - 기본적으로 2바이트 단위로 처리하기 때문에 문자 쓰기에 적합하다.
		 */
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\work\\file\\hello0314.txt");
			
			// \r -> 캐리지 리턴: 커서를 맨 앞으로 땡기는 동작.
			// \n -> 줄 개행(줄바꿈) :
			String str= "당신은 사랑받기 위해 태어난 사람 당신의 삶 속에서 그 사랑 받고 있지요\r\n졸리다..하지만참아볼게...";
			
			fw.write(str);
			
			System.out.println("파일이 정상적으로 저장되었습니다.");
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
