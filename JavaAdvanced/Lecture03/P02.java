package Lecture03;

import java.util.Calendar;

public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k31_iWeekDay = 6;
		int [] k31_iEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int k31_startDay =0;
		int k31_endDay =0;
		
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		
		for (int k31_iMon = 0; k31_iMon < 12; k31_iMon++) {
			
			System.out.printf("\n\n\t\t %d월\n", k31_iMon+1);
			System.out.println("=============================");
			System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","일","월","화","수","목","금","토");
			
			for (int i = 1; i <= k31_iWeekDay; i ++) {
				 System.out.printf("%4s"," ");
			}			
			
			for (int i = 1; i <= k31_iEnd[k31_iMon]; i ++) {
				System.out.printf("%4d", i);			
				k31_iWeekDay ++;
				if (k31_iWeekDay % 7 == 0) {
					System.out.println();									
				}				
			} k31_iWeekDay %= 7;
		} 	

	}

}
