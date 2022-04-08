package Lecture_10;

import java.util.Scanner;

public class A3R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("0 : Rock, 1 : Paper, 2 : Scissor");
		
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();		
		int randomNumber = (int) (Math.random() * 3);
		
		yourCard(inputNum);
		comCard(randomNumber);
		result(inputNum, randomNumber);	
	}
	
	public static void yourCard(int inputNum) {
		if (inputNum == 0) {
			System.out.println("You : Rock");
		} else if (inputNum == 1) {
			System.out.println("You : Paper");
		} else if (inputNum == 2) {
			System.out.println("You : Scissor");
		} else {
			System.out.println("Error");
		}
	}
	
	public static void comCard(int randomNumber) {
		if (randomNumber == 0) {
			System.out.println("Computer : Rock");
		} else if (randomNumber == 1) {
			System.out.println("Computer : Paper");
		} else if (randomNumber == 2) {
			System.out.println("Computer : Scissor");
		} 
	}
	
	public static void result(int you, int com) {

		if (you == com) {
			System.out.println("DRAW");
		} else if (you == 0) {
			if (com == 1) {
				System.out.println("You Lose");
			} else if (com == 2) {
				System.out.println("You Win");
			}
		} else if (you == 1) {
			if (com == 0) {
				System.out.println("You win");
			} else if (com == 2) {
				System.out.println("You lose");
			}
		} else if (you == 2) {
			if (com == 0) {
				System.out.println("You lose");
			} else if (com == 1) {
				System.out.println("You win");
			}
		}

	}


}
