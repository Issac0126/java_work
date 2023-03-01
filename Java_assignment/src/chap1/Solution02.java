package chap1;

public class Solution02 {

	public static void main(String[] args) {
		
	// nums 배열에 저장된 요소의 개수만큼 ★을 출력하는 프로그램을 구현합니다.
		
		int[] nums = {4,2,6,1,3};
		
		for(int i=0; i<nums.length;i++) { //별의 세로개수 
			for(int j=0; j<nums[i];j++) { //별의 가로개수
				System.out.print("★");
			}
			System.out.println(); //가로개수 출력 후 줄갱 
		}
		
		
	} //main 끝

}
