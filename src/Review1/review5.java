package Review1;

import java.util.Scanner;

public class review5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println(num1 + " X " + num2 + " = " + num1 * num2);

		int sum = (100 - num1) + (100 - num2);
		int multi = (100 - num1) * (100 - num2);

		int[] numArr = { (100 - num1), (100 - num2), sum, multi };

		System.out.println("First two digits : " + "100 - " + sum + " = " + (100 - sum));
		System.out.println("Last two digits : " + multi);

		System.out.println("Result : " + (((100 - sum) * 100) + multi));
	}

}
