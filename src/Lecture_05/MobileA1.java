package Lecture_05;

import java.util.Scanner;

public class MobileA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		meanMed(10);

	}
	
	public static int meanMed (int inputNum) {
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		double mean = 0;
		double med = 0;
		double sum = 0;

		for (int i = inputNumber; i > 0; i--) {
			System.out.println(i);
		}
		
		for (int j = 1; j <= inputNumber; j++) {
			sum += j;
			mean = (sum / j);
		}

		if (inputNumber % 2 == 1) {
			med = (double) (inputNumber / 2);
		} else if (inputNumber % 2 == 0) {
			med =  (((double)inputNumber+1) / 2);
		}		

		System.out.print("Mean : " + mean);
		System.out.print(" Median : " + med);
		return inputNumber;
	}

}
