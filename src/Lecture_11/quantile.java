package Lecture_11;

import java.util.Arrays;
import java.util.Scanner;

public class quantile {

	static double percentile;
	static int quart1, half, quart3, full;
	static int[] lowerHalf, upperHalf;

	public static void main(String[] args) {

		int[] priceArr = { 59500, 60000, 67000, 61000, 72250, 73500, 76500, 80000, 67500, 54000, 62000 };
		
		Arrays.sort(priceArr);

		if (priceArr.length % 2 == 0) {
			lowerHalf = Arrays.copyOfRange(priceArr, 0, (priceArr.length / 2));
			upperHalf = Arrays.copyOfRange(priceArr, (priceArr.length / 2), (priceArr.length));

		} else if (priceArr.length % 2 == 1) {
			lowerHalf = Arrays.copyOfRange(priceArr, 0, (priceArr.length / 2));
			upperHalf = Arrays.copyOfRange(priceArr, (priceArr.length / 2) + 1, (priceArr.length));
		}
		
		quart1 = median(lowerHalf);
		half = median(priceArr);
		quart3 = median(upperHalf);
		full = priceArr[priceArr.length-1];
		
		System.out.print("[");
		for (int i = 0; i < priceArr.length; i++) {
			System.out.print(priceArr[i] + " ");
		}
		System.out.print("]");
		System.out.println("");
		
		System.out.println("1분위값 : " + quart1);
		System.out.println("2분위값 : " + half);
		System.out.println("3분위값 : " + quart3);
		System.out.println("4분위값 : " + full);
	}

	public static int median(int[] arr) {
		int arrLength = arr.length;
		if (arrLength % 2 == 1) {
			return arr[arrLength / 2];
		} else {
			return (arr[arrLength / 2 - 1] + arr[arrLength / 2]) / 2;
		}
	}


//	public static void calQuartile(int[] priceArr, double percentile) {
//		Arrays.sort(priceArr);
//		double index = percentile * (priceArr.length - 1);
//		double result = 0;
//		
//		System.out.println(index);
//		System.out.println((int) Math.floor(index));
//		int lower = (int) Math.floor(index);
//		System.out.println(lower);
//
//		if (lower < 0) {
//			result = priceArr[0];
//		} else if (lower >= priceArr.length - 1) {
//			result = priceArr[priceArr.length - 1];
//		}
//
//		double fraction = index - lower;
//		result = priceArr[lower] + fraction * (priceArr[lower + 1] - priceArr[lower]);
//		System.out.println(result);
//	}

}
