package Lecture03;

import java.util.Calendar;

public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k31_iWeekDay = 5; //1월 시작일 설정 일월화수목금토 = 0,1,2,3,4,5,6
		int [] k31_iEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //월 별 마지막일 배열 설정
		int k31_startDay =0; // 시작일자 변수 선언 및 초기화
		int k31_endDay =0; // 시작일자 변수 선언 및 초기화		
		
		for (int k31_iMon = 0; k31_iMon < 12; k31_iMon++) { // 변수 i 는 월, i가 0부터 11까지 1씩 증가하면서 반복
			
			System.out.printf("\n\n\t\t %d월\n", k31_iMon+1); // 월 출력 i는 0부터 시작하므로 +1더해야 실제 월 결과 값
			System.out.println("=============================");
			System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","일","월","화","수","목","금","토"); 
			
			for (int i = 1; i <= k31_iWeekDay; i ++) { //시작일까지 공백을 찍기위한 반복문. i 는 1부터 iWeekDay까지, 1씩 증가하며 반복
				 System.out.printf("%4s"," "); // 공백 출력
			}			
			
			for (int i = 1; i <= k31_iEnd[k31_iMon]; i ++) { //i는 1부터 마지막일[배열] 숫자까지, 1씩 증가하며 반복
				System.out.printf("%4d", i);	// i를 출력 1 ~ 마지막일
				k31_iWeekDay ++; // 1씩 증가
				if (k31_iWeekDay % 7 == 0) { // iWeekDay가 1씩 증가하다가 7의 배수가 되면 한 줄 띄우기 
					System.out.println();					
				}				
			} // iWeekDay 36으로 종료 < -iWeekDay가 5로 시작 했기 때문에
			k31_iWeekDay %= 7; 
			// iWeekDay %7 => 1 -> 월요일
			//  마지막 weekDay를 7로 나눈 나머지값이 다음달 시작 weekDay가 되게 초기화
        	//weekDay는 7을 초과할 수 없다.
		} 	

	}

}