package Lecture_08;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		String[] strArray = new String[inputStr.length()];
		char[] chArry = inputStr.toCharArray();

		if (inputStr.length() % 2 == 1) {
			System.out.println(chArry[inputStr.length() / 2]);
		} else if (inputStr.length() % 2 == 0) {
			System.out.print(chArry[inputStr.length() / 2 - 1] + "" + chArry[inputStr.length() / 2]);
		}

	}

}
