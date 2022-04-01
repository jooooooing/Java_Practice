package Lecture_05;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();

		multiTable(inputNum, 2);

	}

	public static void multiTable(int inputNum, int depth) {
		if (depth > 9) {
			return;
		}
		System.out.println(inputNum + "*" + depth + "=" + inputNum * depth);
		multiTable(inputNum, depth + 1);

	}

}
