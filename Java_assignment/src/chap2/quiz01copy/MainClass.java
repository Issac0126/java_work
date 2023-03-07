package chap2.quiz01copy;

public class MainClass {

	public static void main(String[] args) {
		
		Student st = new Student();
		Teacher te = new Teacher();
		Employee em = new Employee();
		
		System.out.println(st.info("홍길동", 30, "a001"));
		System.out.println(te.info("김철수", 50, "수학"));
		System.out.println(st.info("박영희", 25, "영업부"));
		
	}

}
