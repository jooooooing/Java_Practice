package Lecture_04;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		/*
		 * 조건 1 : 10글자 이상이어야 한다.
		 * 조건 2 : 12글자 이내이어야 한다. 
		 * 조건 3 : 숫자 1을 포함한다.
		 * 조건 4: 알파벳 대문자 A를 포함한다.
		 * 조건 5 : 특수문자 # 사용 불가.
		 */

		System.out.println("Please type your Password");
		String inputStr = scan.next();
		char[] charArr = inputStr.toCharArray();

		if (charArr.length < 10) {
			System.out.println("FAIL");
		} else if (charArr.length > 9) {
			if (charArr.length > 12) {
				System.out.println("FAIL");
			} else if (charArr.length < 13) {
				if (inputStr.contains("1")) {
				} else {
					System.out.println("FAIL");
				}
				if (inputStr.contains("A")) {
				} else {
					System.out.println("FAIL");
				}
				if (inputStr.contains("#")) {
					System.out.println("FAIL");
				} else {
					System.out.println("PASS");
				}
			}
		}
	}

}
