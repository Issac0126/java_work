package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopy {
//사진의 복사
	
	public static void main(String[] args) {
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		try {
			oldFile = new FileInputStream("C:\\work\\file\\coffieClock.jpg"); //읽어들이기
			newFile = new FileOutputStream("C:\\Users\\ict03-17\\Desktop\\copy.png"); //복붙
			
			byte[] arr = new byte[100];
			
			while(true) {
				//읽어들인 데이터가 있다면 읽은 데이터 길이 반환, 없다면 -1을 반환.
				int result = oldFile.read(arr); //읽다
				if(result==-1) break;
				
				//바이트 단위로 0에서부터 읽은 크기까지의 파일을 작성.
				newFile.write(arr, 0, result); //써내리다
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
