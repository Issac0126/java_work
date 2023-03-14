package etc.api.io.rw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		
		/*
		 - 문자기반으로 읽어들이는 클래스는 FileReader 이다. 
		 - 2바이트 단위로 읽기 떄문에 문자를 읽어들이기 적합하다.
		 */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\work\\file\\hello0314.txt");
			
		char[] arr = new char[100];
		
		int result = fr.read(arr); //문자를 하나씩 
		System.out.println("문자의 개수: "+result);
		for(char c : arr) {
			System.out.print(c);
			if(c==0) break;
		}
		
		} catch (Exception e) {
			try {
				fr.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}







































