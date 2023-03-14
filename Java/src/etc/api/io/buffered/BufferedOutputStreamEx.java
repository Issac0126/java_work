package etc.api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {

	
	//대용량을 정리할 때는 버퍼드가 권장된다. 
	public static void main(String[] args) {
		
		System.out.println("시작!");
		
		//dummy data
		StringBuilder text = new StringBuilder(); 
		
		for(int i=1; i<=1000000; i++) {
			text.append(i+". 안녕하세요~\n");
		}//100만줄의 문자를 만듬. 
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		long start = System.currentTimeMillis();
		
		try {
			fos = new FileOutputStream("C:\\work\\file\\fout.txt"); //86.781초 :하나하나 나눠줌.
			bos = new BufferedOutputStream(fos); //0.559초  :버퍼에 담아서 한번에 던져줌.
			byte[] data = new String(text).getBytes(); //o0o? 
			
			for(Byte b: data) {
				bos.write(b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		long end = System.currentTimeMillis();
		System.out.println("소요시간: "+(end-start)*0.001+"초");
		
		
		
		
	}

}
