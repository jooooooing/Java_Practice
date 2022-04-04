package Lecture_06;

import java.util.Scanner;

public class A3_Class {

	public void A3_Class() {
		Scanner scan = new Scanner(System.in);
		String inputNum = scan.next();
		char[] charArr = inputNum.toCharArray();

		for (int i = 0; i <= (charArr.length - 1); i++) {
			charArr[i] = inputNum.charAt(i);
		}

		for (int i = charArr.length - 1; i >= 0; i--) {
			System.out.print(charArr[i]);
		}
	}

}
