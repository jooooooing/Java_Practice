package Lecture_11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int Bigger = num1;

		if (num1 < num2) {
			Bigger = num2;
			System.out.println(Bigger);
		} else {
			System.out.println(Bigger);
		}

	}

}
