package Lecture_04;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		/*
		 * ���� 1 : 10���� �̻��̾�� �Ѵ�.
		 * ���� 2 : 12���� �̳��̾�� �Ѵ�. 
		 * ���� 3 : ���� 1�� �����Ѵ�.
		 * ���� 4: ���ĺ� �빮�� A�� �����Ѵ�.
		 * ���� 5 : Ư������ # ��� �Ұ�.
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
