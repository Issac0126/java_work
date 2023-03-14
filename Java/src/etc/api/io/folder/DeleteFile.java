package etc.api.io.folder;

import java.io.File;
import java.util.Arrays;

public class DeleteFile {

	public static void main(String[] args) {
		
		File file = new File("C:\\work\\folder_test\\test");
		
		/*
		if(file.exists()) {
			if(file.delete()){
				System.out.println("삭제 완료!");
				//delete 성공 시 true, 실패 시 false를 리턴.
			}
		} else {
			System.out.println("파일 삭제에 실패하거나 존재하지 않는 파일입니다.");
		}
		*/
		
		if(file.exists()) { //한꺼번에 삭제 진행하는 방법... 이나 굳이? 싶을 정도로 
			if(file.isDirectory()){ //파일이 디렉토리인지 확인
				File[] files = file.listFiles(); //파일 목록을 배열로 불러와줌.
				for(int i=0; i<files.length; i++) {
					if(files[i].delete()) {
						System.out.println(files[i].getName()+" 폴더 삭제 성공!");
					} else {
						System.out.println(files[i].getName()+"파일 삭제에 실패했습니다. ");
					}
				}
			}
		} 
		if(file.delete()) {
			System.out.println("삭제 성공!");
		} else {
			System.out.println("삭제 실패!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
