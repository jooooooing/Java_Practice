package Lecture_06;

import java.util.Scanner;

public class A2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String inputNum = scan.next();
		char[] charArr = inputNum.toCharArray();

		System.out.println(charArr);
		

		for (int i = 0; i <=  charArr.length-1; i++) {			
			charArr[i] = charArr[charArr.length - i -1];					
		}

		System.out.println(charArr);

	}

}
