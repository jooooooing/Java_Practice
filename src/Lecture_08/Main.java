package Lecture_08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String inputNums1 = scan.nextLine();
		String inputNums2 = scan.nextLine();

		String[] firstSet = inputNums1.split(" ");
		String[] secondSet = inputNums2.split(" ");

		float[] floatSet1 = new float[firstSet.length];
		float[] floatSet2 = new float[secondSet.length];

		for (int i = 0; i < firstSet.length; i++) {
			floatSet1[i] = Float.parseFloat(firstSet[i]);
		}
		for (int i = 0; i < secondSet.length; i++) {
			floatSet2[i] = Float.parseFloat(secondSet[i]);
		}

		for (int i = 0; i < floatSet1.length; i++) {
			for (int j = 0; j < floatSet2.length; j++) {
				if (floatSet1[i] == floatSet2[j]) {
					System.out.print(floatSet1[i]);
				}
			}
		}

	}
}
