package Lecture_05;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		int row = inputNum;

		for (int i = 0; i < inputNum; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

	public static int fibonacci(int inputNum) {

		if (inputNum == 0) {
			return 0;
		} else if (inputNum == 1) {
			return 1;
		} else {
			return fibonacci(inputNum - 2) + fibonacci(inputNum - 1);
		}

	}

}
