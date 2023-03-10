package oop.obj_arr;

/*230309_8
- 이름, 국어, 영어, 수학, 총점, 평균(double)을
 담을 수 있는 객체를 디자인하세요.
 
- 학생의 모든 정보를 한 눈에 확인할 수 있게
 scoreInfo() 메서드를 선언해 주세요. (void)
 메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
 
- 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
*/

public class Score { 
	
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	
	public void set(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	} //메서드 만들어도 되는데 생성자로 처리해도 됨!
	//  생성자 제작이 새로 만들자마자 값 넣기 가능해서 걔가 더 좋긴 함. 
	// 예시) score[i] = new new s.set(name, kor, eng, mat);

	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}
	
	public int getMat() {
		return mat;
	}
	
	void scoreInfo() {
		System.out.printf("%s\t%d점   %d점   %d점   %d점   %.1f점"
				, name, kor, eng, mat, kor+eng+mat, (double)(kor+eng+mat)/3);
	}
	
	
	
	
	
	
	
}
