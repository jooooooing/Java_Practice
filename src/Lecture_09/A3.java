package Lecture_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);

		int count = 0, sum = 0;
		float mean = 0;

		while (true) {
			System.out.println("Please input number");

			int num = scan.nextInt();
			list.add(num);

			count++;
			sum += num;
			mean = sum / count;

			int max = Collections.max(list);
			int min = Collections.min(list);

			System.out.print("Result: " + count + ", ");
			System.out.print("mean: " + mean + ", ");
			System.out.print("max: " + max + ", ");
			System.out.print("min: " + min);
			System.out.println();
		}
	}
}
