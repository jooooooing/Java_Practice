package Lecture_06;

import java.util.Scanner;

public class mClass {

	public static void numArray(double inputNum) {

		double[] reverseArray = new double[(int) inputNum - 1];

		for (double i = inputNum - 1; i > 0; i--) {
			reverseArray[(int) (i - 1)] = i;
			System.out.println(reverseArray[(int) i]);

		}
	}

	public static double mean(double[] array) {
		double sum = 0.0;

		for (int i = 0; i < array.length; i++)
			sum += array[i];

		return sum / array.length;
	}

	public static double standardDeviation(double[] array, int option) {
		if (array.length < 2)
			return Double.NaN;

		double sum = 0.0;
		double sd = 0.0;
		double diff;
		double meanValue = mean(array);

		for (int i = 0; i < array.length; i++) {
			diff = array[i] - meanValue;
			sum += diff * diff;
		}
		sd = Math.sqrt(sum / (array.length - option));

		return sd;
	}

}
