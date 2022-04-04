package Lecture_07;

import java.util.Scanner;

public class A1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Input the Sentence");
		String sentence = scan.nextLine();

		System.out.println("Input a Character");

		String target = scan.next();
		System.out.println(sentence.indexOf(target) + 1);

	}

}
