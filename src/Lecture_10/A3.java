package Lecture_10;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A3 call = new A3();
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		
		System.out.println("0 : Rock, 1 : Paper, 3 : Scissor");

		System.out.println("User : " + inputResult(inputNum));
		System.out.println("Computer : " + rpsResult());
		
		
		whoWin(inputResult(inputNum));

	}

	public static int inputResult(int inputNum) {
		int input = 0;
		if (inputNum == 0) {
			input = 0;
		} else if (inputNum == 1) {
			input = 1;
		} else if (inputNum == 2) {
			input = 2;
		} else {
			System.out.println("Error");
		}
		return input;
	}

	public static int rpsResult() {
		int ret = 0;
		int randomNumber = (int) (Math.random() * 3);
		if (randomNumber == 0) {
			ret = 0;
		} else if (randomNumber == 1) {
			ret = 1;
		} else {
			ret = 2;
		}
		return ret;
	}

	public static void whoWin(int inputNum) {
		
		if (inputResult(inputNum) == rpsResult()) {
			System.out.println("Draw");
		} else if (inputResult(inputNum) == 0) {
			if (rpsResult() == 1) {
				System.out.println("YOU LOSE");
			} else if (rpsResult() == 2) {
				System.out.println("YOU WIN");
			}
		} else if (inputResult(inputNum) == 1) {
			if (rpsResult() == 2) {
				System.out.println("YOU LOSE");
			} else if (rpsResult() == 0) {
				System.out.println("YOU WIN");
			}
		} else if (inputResult(inputNum) == 2) {
			if (rpsResult() == 0) {
				System.out.println("YOU LOSE");
			} else if (rpsResult() == 1) {
				System.out.println("YOU WIN");
			}
		} else {
			System.out.println("Error");
		}
	}

}
