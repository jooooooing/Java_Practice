package Lecture_08;

import java.util.Scanner;

public class inputString {
	
	public static Scanner scan = new Scanner(System.in);		
	public static String inputStr = scan.nextLine();
	public static String[] strArray = new String[inputStr.length()];
	public static char[] chArry = inputStr.toCharArray();
	
	public static void printResult() {
		if (inputStr.length() % 2 == 1) {
			System.out.println(chArry[inputStr.length() / 2]);
		} else if (inputStr.length() % 2 == 0) {
			System.out.print(chArry[inputStr.length() / 2 - 1] + "" + chArry[inputStr.length() / 2]);
		}
	}
}




