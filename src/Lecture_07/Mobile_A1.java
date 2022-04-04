package Lecture_07;

import java.util.Arrays;
import java.util.Scanner;

public class Mobile_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int inputNum1 = scan.nextInt();
		int inputNum2 = scan.nextInt();
		int[] array1 = new int[inputNum1];
		int[] array2 = new int[inputNum2];

		for (int i = 0; i < inputNum1; i++) {
			array1[i] = (i + 1);
		}
		for (int i = 0; i < inputNum2; i++) {
			array2[i] = (i + 1);
		}

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				System.out.println(array1[i] + ", " + array2[j]);
			}
		}
		System.out.println();

	}
}