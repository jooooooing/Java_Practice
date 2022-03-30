package Lecture_04;

import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String replace = str.replaceAll("  ", ""); //공백 제거 시 오류
		String lowerStr = replace.toLowerCase();
		
		char[] charArr = lowerStr.toCharArray();
		int consonant = 0, vowels = 0;

		for (int i = 0; i < charArr.length; i++) {
			char[] arraySave = new char[charArr.length];
			arraySave[i] = (char) (charArr[i]);

			if ((char) arraySave[i] == 'a' || (char) arraySave[i] == 'e' ||
				(char) arraySave[i] == 'i' || (char) arraySave[i] == 'o' ||
				(char) arraySave[i] == 'u') {
				vowels++;
			} else {
				consonant++;
			}
		}
		System.out.println("Num. of Consonant : " + consonant);
		System.out.println("Num. of Vowels : " + vowels);
	}
}
