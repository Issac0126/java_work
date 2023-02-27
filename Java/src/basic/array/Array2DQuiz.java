package basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {

		int[][] score = {
				{79,80,99}, // A학생
				{95,85,89}, // B학생
				{90,65,56}, // C학생
				{69,78,77}  // D학생
				//과목: 국어, 영어, 수학: 3과목
		};

		String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
		String[] subName = {"국어", "영어", "수학"};

		/*
		 1. 각 학생의 평균을 소수점 첫째 자리까지 출력해보세요.
		 2. 각 과목의 평균을 출력해보세요.
		 3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
		 */
		
		double[] sum = {0, 0, 0, 0};
		
		for (int i=0; i<stuName.length; i++) {
			for(int n=0; n<subName.length ;n++) {
				sum[i] += score[i][n];
			}	}
		
		for(int i=0; i<subName.length+1; i++) {
			System.out.printf("\n%s의 평균: %.1f점", stuName[i], ((double)sum[i]/subName.length));	
		}
		

		System.out.println();
		
		double[] total3 = {0,0,0};

		for(int n=0; n<score.length; n++) {
			for(int i=0; i<total3.length ;i++) {
				total3[i] += score[n][i];
			}	}
		
		for(int i=0; i<subName.length; i++) {
			System.out.printf("\n%s 과목의 평균: %.1f점", subName[i], (total3[i]/stuName.length));
		}

		
		System.out.println();
		double total = (sum[0]/3) + (sum[1]/3) + (sum[2]/3) + (sum[3]/3);
		System.out.printf("\n반 전체 평균: %.1f점", total/4);
		

		
		
		
		
		System.out.println("\n\n---이하부터 선생님이 쓰신 식----\n");
		
		double totalAvg = 0.0;
		int idx = 0; //다음 학생으로 넘어가기 위한 변수
		for(int[] stu : score) { //score를 {79, 80, 99} / 여러 묶음으로 나눠줌. 
			int totals = 0;
			for(int s : stu) {  // 나눠진 묶음에서 또 낱개를 꺼내옴. 
				totals += s; //토탈에 a학생의 점수가 하나씩 쌓임. 더하고 더하고 더하고 더한 뒤 나가지면
			}
			double avg = (double) totals/subName.length;
			totalAvg += avg;
			System.out.printf("%s 평균: %.1f점\n", stuName[idx], avg);
			idx++; //다음 학생으로 넘어가기 위해서.
		}
		
		System.out.println();
		
		for(int i=0; i<subName.length; i++) {
			int totals =0;
			for(int j=0; j<stuName.length; j++) {
				totals += score[j][i];
			}
			double avg = (double) totals / stuName.length;
			System.out.printf("%s 평균점수: %.1f점\n", subName[i], avg);
		}
		
		System.out.println();
		
		double classAvg = totalAvg/stuName.length;
		System.out.printf("\n반 전체 평균: %.1f점", classAvg);

	}

}
