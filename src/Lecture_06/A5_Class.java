package Lecture_06;

import java.util.Scanner;

public class A5_Class {

	public void printMenu() {
		// TODO Auto-generated method stub
		
		System.out.println("# Unit\r\n"
				+ " 1. cm\r\n"
				+ " 2. m\r\n"
				+ " 3. mm\r\n"
				+ " 4. km\r\n"
				+ " 5. mile\r\n"
				+ "");
		
	}

	public void calData() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int selectUnit1 = scan.nextInt();
		int selectUnit2 = scan.nextInt();
		double number = scan.nextInt();
		double result = 0;
		
		if (selectUnit1 == 1) {
			if (selectUnit1 == 1) {
				result = number;
			}else if (selectUnit2 == 2) {
				result = number * 0.01 ;
			} else if (selectUnit2 == 3) {
				result = number * 10;
			} else if (selectUnit2 == 4) {
				result = number * 0.00001;
			} else if (selectUnit2 == 5) {
				result = number * 0.0000062;
			}
		} else if(selectUnit1 == 2) {
			if (selectUnit2 == 1) {
				result = number * 100;
			} else if (selectUnit2 == 2) {
				result = number;
			} else if (selectUnit2 == 3) {
				result = number * 1000;
			} else if (selectUnit2 == 4) {
				result = number * 0.001;
			} else if (selectUnit2 == 5) {
				result = number * 0.000621;
			}
		} else if(selectUnit1 == 3) {
			if (selectUnit2 == 1) {
				result = number * 0.1;
			} else if (selectUnit2 == 2) {
				result = number * 0.001;
			} else if (selectUnit2 == 3) {
				result = number;
			} else if (selectUnit2 == 4) {
				result = number * 0.000001;
			} else if (selectUnit2 == 5) {
				result = number * 0.00000621;
			}
		} else if(selectUnit1 == 4) {
			if (selectUnit2 == 1) {
				result = number * 10000;
			} else if (selectUnit2 == 2) {
				result = number * 1000;
			} else if (selectUnit2 == 3) {
				result = number * 1000000;
			} else if (selectUnit2 == 4) {
				result = number;
			} else if (selectUnit2 == 5) {
				result = number * 0.621371;
			}
		} else if(selectUnit1 == 5) {
			if (selectUnit2 == 1) {
				result = number * (160934.4);
			} else if (selectUnit2 == 2) {
				result = number * (1609.344);
			} else if (selectUnit2 == 3) {
				result = number * 1609344;
			} else if (selectUnit2 == 4) {
				result = number * 1.609344;
			} else if (selectUnit2 == 5) {
				result = number;
			}
		}
		System.out.print((float)result);	
	}

}
