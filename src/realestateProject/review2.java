package realestateProject;

import java.util.Scanner;

public class review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("please input three values");
		double value1 = scan.nextDouble();
		double value2 = scan.nextDouble();
		double value3 = scan.nextDouble();

		double oneToKm = value1 * 3.6;
		double twoToKm = value2 * 1;
		double threeToKm = value3 * 3600;

		double max = 0;

		for (int i = 0; i < 3; i++) {
			if (oneToKm > max) {
				max = oneToKm;
			} else if (twoToKm > oneToKm) {
				max = twoToKm;
			} else if (threeToKm > twoToKm) {
				max = threeToKm;
			}
		}

		if (max == oneToKm) {
			System.out.println((int)value1 + "m/s");
		} else if (max == twoToKm) {
			System.out.println((int)value2 + "km/h");			
		} else if (max == threeToKm) {
			System.out.println((int)value3 + "m/ms");
		}

	}

}
