package Lecture_10;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A3 call = new A3();
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();

		System.out.println("User : " + inputResult(inputNum));
		System.out.println("Computer : " + rpsResult());

		whoWin();

	}

	public static String inputResult(int inputNum) {
		String input = "";
		if (inputNum == 0) {
			input = "Rock";
		} else if (inputNum == 1) {
			input = "Paper";
		} else if (inputNum == 2) {
			input = "Scissor";
		} else {
			input = "Error";
		}
		return input;
	}

	public static String rpsResult() {
		String ret = "";
		int randomNumber = (int) (Math.random() * 3);
		if (randomNumber == 0) {
			ret = "Rock";
		} else if (randomNumber == 1) {
			ret = "Paper";
		} else {
			ret = "Scissor";
		}
		return ret;
	}

	public static void whoWin() {
		int inputNum = 0;
		if (inputResult(inputNum) == rpsResult()) {
			System.out.println("Draw");
		} else if (inputResult(inputNum) == "Rock") {
			if (rpsResult() == "Paper") {
				System.out.println("YOU LOSE");
			} else if (rpsResult() == "Scissor") {
				System.out.println("YOU WIN");
			}
		} else if (inputResult(inputNum) == "Paper") {
			if (rpsResult() == "Scissor") {
				System.out.println("YOU LOSE");
			} else if (rpsResult() == "Rock") {
				System.out.println("YOU WIN");
			}
		} else if (inputResult(inputNum) == "Scissor") {
			if (rpsResult() == "Rock") {
				System.out.println("YOU LOSE");
			} else if (rpsResult() == "Paper") {
				System.out.println("YOU WIN");
			}
		} else {
			System.out.println("Error");
		}
	}

}
