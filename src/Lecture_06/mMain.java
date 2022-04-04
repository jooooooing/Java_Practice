package Lecture_06;

import java.util.Scanner;

public class mMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mClass call = new mClass();
		Scanner scan = new Scanner(System.in);
		double inputNum = scan.nextDouble();
		
		call.numArray(inputNum);
		
		
		System.out.println(call.standardDeviation(call.numArray(), 1));


	}
}