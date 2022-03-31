package Lecture_05;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("#Printing a Name");
		System.out.println("1. Father\n2. Mother\n3. Son\n4. Daughter");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		System.out.println("-> " + num);

		if (num == 1) {
			print("Smith");
		} else if (num == 2) {
			print("Kelly");
		} else if (num == 3) {
			print("Piter");
		} else if (num == 4) {
			print("Sally");
		}

	}

	public static void print(String text) {
		System.out.println(text);
	}

}
