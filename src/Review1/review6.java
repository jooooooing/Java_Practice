package Review1;

import java.util.Scanner;

public class review6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String num1 = scan.nextLine();
		String num2 = scan.nextLine();

		System.out.println(num1 + " X " + num2 + " = " + Integer.parseInt(num1) * Integer.parseInt(num2));

		String sum = Integer.toString((100 - Integer.parseInt(num1)) + (100 - Integer.parseInt(num2)));

		String multi = Integer.toString((100 - Integer.parseInt(num1)) * (100 - Integer.parseInt(num2)));

		String[] numArr = { Integer.toString(100 - Integer.parseInt(num1)),
				Integer.toString(100 - Integer.parseInt(num2)), sum, multi };

		System.out.println("First two digits : " + "100 - " + sum + " = " + (100 - Integer.parseInt(sum)));
		System.out.println("Last two digits : " + Integer.parseInt(multi));

		System.out.println("Result : " + (((100 - Integer.parseInt(sum)) * 100) + Integer.parseInt(multi)));
	}

}
