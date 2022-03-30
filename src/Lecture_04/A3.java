package Lecture_04;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int sum = 0;

		while (true) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();

			for (int i = 1; i <= num1; i++) {
				if (i % num2 == 0) {
					sum += i;
					System.out.print(i + " ");
				}
			}
			if (num2 > num1) {
				System.out.println("입력 오류 다시 입력해주세요");
			}
			System.out.println(" ");
			System.out.println("SUM : " + sum);
		}
	}
}
