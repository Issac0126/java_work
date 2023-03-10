package etc.api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		//lang은 import가 필요없지만 util 패키지 클래스는 import가 필요하다. 
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("----------------------------");
		
		//현재 날짜 정보 얻기 (연, 월, 일)
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//현재 시간 정보 얻기 (시, 분, 초)
		LocalTime nowtime = LocalTime.now();
		System.out.println(nowtime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		

		//특정 날짜와 시간 정보 얻기
		LocalDateTime beginDate
					= LocalDateTime.of(2022, 7, 1, 9, 0, 0); 
									// 연도, 달, 일, 시, 분, 초
		System.out.println(beginDate);
		
		//연도 추출
		int year = localDateTime.getYear();
		System.out.println("year: "+year);
		int monthValue = localDateTime.getMonthValue();
		System.out.println("monthValue: "+monthValue);
		Month month = localDateTime.getMonth();
		System.out.println("month: "+month);
		
	}

}



























