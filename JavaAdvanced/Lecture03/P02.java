package Lecture03;

import java.util.Calendar;

public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int k31_iWeekDay = 6;
		int [] k31_iEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int k31_startDay =0;
		int k31_endDay =0;
		
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		
		for (int k31_iMon = 0; k31_iMon < 12; k31_iMon++) {
//			start.set(2022, k31_iMon+1, 1);
//			end.set(2022, k31_iMon+2, 1);
//			end.add(Calendar.DATE, -1);
//						
//			k31_startDay = start.get(Calendar.DAY_OF_WEEK);
//			k31_endDay = end.get(Calendar.DATE);
//			
//			System.out.println(k31_iMon+1 + "start" + k31_startDay);
//			System.out.println(k31_iMon+2 + "end" + k31_endDay);
			
			System.out.printf("\n\n\t\t %d월\n", k31_iMon+1);
			System.out.println("=======================");
			System.out.println("일 월 화 수 목 금 토");
			
			for (int i = 1; i <k31_startDay; i ++) {
				System.out.print("v");
			}
			
			int k31_iWeekDay = k31_startDay - 1;
			for (int i = 1; i <= k31_iEnd[k31_iMon]; i ++) {
				System.out.print(i + " ");
				if (i < 10) {
					System.out.print(" ");
				}
				k31_iWeekDay ++;
				if (k31_iWeekDay == 7) {
					System.out.println();
					k31_iWeekDay = 0;
					
				}				
			}
		}

	}

}
