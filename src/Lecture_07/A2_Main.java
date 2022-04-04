package Lecture_07;

import java.util.Scanner;

public class A2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		int findNum = scan.nextInt();
		String[] strArray = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			strArray[i] = Integer.toString(numbers[i]);
		}

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].contains(Integer.toString(findNum)) == true) {
				System.out.print(strArray[i] + "  ");
			}
		}

	}

}
