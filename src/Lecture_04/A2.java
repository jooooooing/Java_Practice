package Lecture_04;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		

		int balance = 0;

		while (true) {
			System.out.println("#Menu\n1. Deposit\n2. Withdrawal\n3. Exit");
			System.out.println("Balance :" + balance);
			int inputMenu = scan.nextInt();
			int inputMoney = scan.nextInt();
			if (inputMenu == 1) {
				balance += inputMoney;
				System.out.println("Balance :" + balance);
			} else if (inputMenu == 2) {
				balance -= inputMoney;
				System.out.println("Balance :" + balance);
			} else if (inputMenu == 3) {
				System.out.println("Thank you");
				break;
			}
			System.out.println("");
		}
	}

}
